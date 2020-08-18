package tp.kits3.livedinner.dao.IDaoImpl;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import tp.kits3.livedinner.dao.IDao.IUser;
import tp.kits3.livedinner.vo.User;

public class UserImpl implements IUser {
	private static SqlSessionFactory factory = null;

	// need static method to factory field
	public static SqlSessionFactory getInstance() {
		if (factory == null) {
			// create Factory
			try {
				// read text from file xml
				Reader resource = Resources.getResourceAsReader("mybatis/mybatis-config.xml");
				factory = new SqlSessionFactoryBuilder().build(resource);
				resource.close();
			} catch (Exception e) {
				// if failed
				e.printStackTrace();
			}
		}
		return factory;
	}// end get instance

	@Override
	public List<User> selectAll() {
		SqlSession session = getInstance().openSession(); // connection
		return session.selectList("mappers.userMapper.selectAll");
	}

	@Override
	public User selectOne(String userName) {
		SqlSession session = getInstance().openSession(); // connection
		return session.selectOne("mappers.userMapper.selectOne", userName); // #id
	}

	@Override
	public void insert(User user) {
		SqlSession session = getInstance().openSession(); // connection
		session.insert("mappers.userMapper.insert", user);
		session.commit();
	}

	@Override
	public void update(User user) {
		SqlSession session = getInstance().openSession(); // connection
		session.update("mappers.userMapper.update", user);
		session.commit();
	}

	@Override
	public void delete(int id) {
		SqlSession session = getInstance().openSession(); // connection
		session.delete("mappers.userMapper.delete", id);
		session.commit();
	}

}

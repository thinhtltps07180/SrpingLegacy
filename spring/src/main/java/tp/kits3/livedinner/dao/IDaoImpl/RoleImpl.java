package tp.kits3.livedinner.dao.IDaoImpl;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import tp.kits3.livedinner.dao.IDao.IRole;
import tp.kits3.livedinner.vo.Role;

public class RoleImpl implements IRole {
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
	public List<Role> selectAll() {
		SqlSession session = getInstance().openSession(); // connection
		return session.selectList("mappers.roleMapper.selectAll");
	}

	@Override
	public Role selectOne(Integer id) {
		SqlSession session = getInstance().openSession(); // connection
		return session.selectOne("mappers.roleMapper.selectOne", id); // #id
	}

	@Override
	public void insert(Role Role) {
		SqlSession session = getInstance().openSession(); // connection
		session.insert("mappers.roleMapper.insert", Role);
		session.commit();
	}

	@Override
	public void update(Role Role) {
		SqlSession session = getInstance().openSession(); // connection
		session.update("mappers.roleMapper.update", Role);
		session.commit();
	}

	@Override
	public void delete(int id) {
		SqlSession session = getInstance().openSession(); // connection
		session.delete("mappers.roleMapper.delete", id);
		session.commit();
	}

}

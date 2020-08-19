package tp.kits3.livedinner.dao.IDaoImpl;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import tp.kits3.livedinner.dao.IDao.ITag;
import tp.kits3.livedinner.vo.Tag;

public class TagImpl implements ITag {
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
	public List<Tag> selectAll() {
		SqlSession session = getInstance().openSession(); // connection
		return session.selectList("mappers.tagMapper.selectAll");
	}

	@Override
	public Tag selectOne(Integer tagId) {
		SqlSession session = getInstance().openSession(); // connection
		return session.selectOne("mappers.tagMapper.selectOne", tagId); // #id
	}

	@Override
	public void insert(Tag tag) {
		SqlSession session = getInstance().openSession(); // connection
		session.insert("mappers.tagMapper.insert", tag);
		session.commit();
	}

	@Override
	public void update(Tag tag) {
		SqlSession session = getInstance().openSession(); // connection
		session.update("mappers.tagMapper.update", tag);
		session.commit();
	}

	@Override
	public void delete(int tag) {
		SqlSession session = getInstance().openSession(); // connection
		session.delete("mappers.tagMapper.delete", tag);
		session.commit();
	}

}

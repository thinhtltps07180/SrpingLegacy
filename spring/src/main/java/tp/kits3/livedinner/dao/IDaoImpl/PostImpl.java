package tp.kits3.livedinner.dao.IDaoImpl;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import tp.kits3.livedinner.dao.IDao.IPost;
import tp.kits3.livedinner.vo.Post;

public class PostImpl implements IPost {
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
	public List<Post> selectAll() {
		SqlSession session = getInstance().openSession(); // connection
		return session.selectList("mappers.postMapper.selectAll");
	}

	@Override
	public Post selectOne(int postId) {
		SqlSession session = getInstance().openSession(); // connection
		return session.selectOne("mappers.postMapper.selectOne", postId); // #id
	}

	@Override
	public void insert(Post post) {
		SqlSession session = getInstance().openSession(); // connection
		session.insert("mappers.postMapper.insert", post);
		session.commit();
	}

	@Override
	public void update(Post post) {
		SqlSession session = getInstance().openSession(); // connection
		session.update("mappers.postMapper.update", post);
		session.commit();
	}

	@Override
	public void delete(int postId) {
		SqlSession session = getInstance().openSession(); // connection
		session.delete("mappers.postMapper.delete", postId);
		session.commit();
	}

}

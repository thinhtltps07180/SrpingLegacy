package tp.kits3.livedinner.dao.IDaoImpl;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import tp.kits3.livedinner.dao.IDao.IBook;
import tp.kits3.livedinner.vo.Book;

public class BookImpl implements IBook {
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
	public List<Book> selectAll() {
		SqlSession session = getInstance().openSession(); // connection
		return session.selectList("mappers.bookMapper.selectAll");
	}

	@Override
	public Book selectOne(int id) {
		SqlSession session = getInstance().openSession(); // connection
		return session.selectOne("mappers.bookMapper.selectOne", id); // #id
	}

	@Override
	public void insert(Book book) {
		SqlSession session = getInstance().openSession(); // connection
		session.insert("mappers.bookMapper.insert", book);
	}

	@Override
	public void update(Book book) {
		SqlSession session = getInstance().openSession(); // connection
		session.update("mappers.bookMapper.update", book);

	}

	@Override
	public void delete(int id) {
		SqlSession session = getInstance().openSession(); // connection
		session.delete("mappers.bookMapper.delete", id);

	}

}

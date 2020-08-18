package tp.kits3.livedinner.dao.IDaoImpl;

import java.awt.print.Book;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 1. connection db { Mysql/MariaDB Connector jar extends Driver implement JDBC } 
 *  so importance mariadb-client.jar
 * 2. ask data to DB  -> SQL API as Text { "select" }  -> send -> get data 
 * 3. Statement / PreparedStatement -> send -> get data
 * 		-ResultSet <-
 * 		-our type is Book
 * 		-convert ResultSet to Book
 * 4. type is different Model <- DB's type -> need converting
 * 
 * 
 * use Mybatis lib 
 * dont know our table name and column
 * SqlSessionFactory <- db connection info { mybastis-config.xml } 
 * SqlSession open -> send sql
 * stament DB { mapper.xml }
 */

public class BookDao {
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

	public List<Book> selectAll() {
		// conection db -> make sql -> send .executeQuery() -> get data
		// your choice return factory
		// factory = getInstance();
		SqlSession session = getInstance().openSession(); // connection
		return session.selectList("mappers.bookMapper.selectAll");
	}
	
	public Book selectOne(int id) {
		// conection db -> make sql -> send .executeQuery() -> get data
		// your choice return factory
		// factory = getInstance();
		SqlSession session = getInstance().openSession(); // connection
		return session.selectOne("mappers.bookMapper.selectOne" , id); // #id
	}
	
	public void insert(Book param) {
		// conection db -> make sql -> send .executeQuery() -> get data
		// your choice return factory
		// factory = getInstance();
		SqlSession session = getInstance().openSession(); // connection
		 session.insert("mappers.bookMapper.insert" , param); 
	}
	
	public void update(Book param) {
		// conection db -> make sql -> send .executeQuery() -> get data
		// your choice return factory
		// factory = getInstance();
		SqlSession session = getInstance().openSession(); // connection
		 session.update("mappers.bookMapper.update" , param); 
	}
	
	public void delete(int id) {
		// conection db -> make sql -> send .executeQuery() -> get data
		// your choice return factory
		// factory = getInstance();
		SqlSession session = getInstance().openSession(); // connection
		 session.delete("mappers.bookMapper.delete" , id); 
	}}

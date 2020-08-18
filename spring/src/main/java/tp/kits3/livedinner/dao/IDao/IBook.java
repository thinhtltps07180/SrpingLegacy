package tp.kits3.livedinner.dao.IDao;

import java.util.List;

import tp.kits3.livedinner.vo.Book;

public interface IBook {
	List<Book> selectAll();
	Book selectOne(int id);
	void insert(Book book);
	void update(Book book);
	void delete(int id);
}

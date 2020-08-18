package tp.kits3.livedinner.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tp.kits3.livedinner.dao.IDao.IBook;
import tp.kits3.livedinner.dao.IDaoImpl.BookImpl;
import tp.kits3.livedinner.vo.Book;

@Service
public class BookService {

	private IBook book;

	public BookService() {
		book = new BookImpl();
	}

	public List<Book> findAll() {
		return book.selectAll();
	}

}

package tp.kits3.livedinner.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tp.kits3.livedinner.dao.IDao.IUser;
import tp.kits3.livedinner.dao.IDaoImpl.UserImpl;
import tp.kits3.livedinner.vo.User;

@Service
public class UserService {

	private IUser userImpl;

	public UserService() {
		userImpl = new UserImpl();
	}

	public List<User> findAll() {
		return userImpl.selectAll();
	}

	public User selectOne(String userName) {
		return userImpl.selectOne(userName);
	}

	public void insert(User user) {
		userImpl.insert(user);
	}

	public void update(User user) {
		userImpl.update(user);
	}

	public void delete(int id) {
		userImpl.delete(id);
	}

}

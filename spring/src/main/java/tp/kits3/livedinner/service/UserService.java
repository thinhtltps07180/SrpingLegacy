package tp.kits3.livedinner.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tp.kits3.livedinner.dao.IDao.IUser;
import tp.kits3.livedinner.dao.IDaoImpl.UserImpl;
import tp.kits3.livedinner.vo.User;

@Service
public class UserService {

	private IUser userDto;

	public UserService() {
		userDto = new UserImpl();
	}

	public List<User> findAll() {
		return userDto.selectAll();
	}

	public User selectOne(String userName) {
		return userDto.selectOne(userName);
	}

	public void insert(User user) {
		userDto.insert(user);
	}

	public void update(User user) {
		userDto.update(user);
	}

	public void delete(int id) {
		userDto.delete(id);
	}

}

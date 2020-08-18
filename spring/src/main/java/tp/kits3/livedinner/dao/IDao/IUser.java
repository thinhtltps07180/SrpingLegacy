package tp.kits3.livedinner.dao.IDao;

import java.util.List;

import tp.kits3.livedinner.vo.User;

public interface IUser {
	List<User> selectAll();
	User selectOne(String userName);
	void insert(User user);
	void update(User user);
	void delete(int id);
}

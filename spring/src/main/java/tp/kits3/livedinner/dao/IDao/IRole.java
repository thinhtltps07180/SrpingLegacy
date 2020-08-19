package tp.kits3.livedinner.dao.IDao;

import java.util.List;

import tp.kits3.livedinner.vo.Role;


public interface IRole {
	List<Role> selectAll();
	Role selectOne(Integer id);
	void insert(Role role);
	void update(Role role);
	void delete(int id);
}

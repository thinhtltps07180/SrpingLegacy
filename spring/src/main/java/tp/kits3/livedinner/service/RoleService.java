package tp.kits3.livedinner.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tp.kits3.livedinner.dao.IDao.IRole;
import tp.kits3.livedinner.dao.IDaoImpl.RoleImpl;
import tp.kits3.livedinner.vo.Role;

@Service
public class RoleService {

	private IRole roleImpl;

	public RoleService() {
		roleImpl = new RoleImpl();
	}

	public List<Role> findAll() {
		return roleImpl.selectAll();
	}

	public Role selectOne(Integer roleId) {
		return roleImpl.selectOne(roleId);
	}

	public void insert(Role role) {
		roleImpl.insert(role);
	}

	public void update(Role role) {
		roleImpl.update(role);
	}

	public void delete(int roleId) {
		roleImpl.delete(roleId);
	}

}

package tp.kits3.livedinner.dao.IDao;

import java.util.List;

import tp.kits3.livedinner.vo.Tag;


public interface ITag {
	List<Tag> selectAll();
	Tag selectOne(Integer id);
	void insert(Tag Tag);
	void update(Tag Tag);
	void delete(int id);
}

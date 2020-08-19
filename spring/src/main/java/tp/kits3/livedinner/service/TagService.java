package tp.kits3.livedinner.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tp.kits3.livedinner.dao.IDao.ITag;
import tp.kits3.livedinner.dao.IDaoImpl.TagImpl;
import tp.kits3.livedinner.vo.Tag;

@Service
public class TagService {

	private ITag service;

	public TagService() {
		service = new TagImpl();
	}

	public List<Tag> findAll() {
		return service.selectAll();
	}

	public Tag selectOne(Integer id) {
		return service.selectOne(id);
	}

	public void insert(Tag tag) {
		service.insert(tag);
	}

	public void update(Tag tag) {
		service.update(tag);
	}

	public void delete(int tagId) {
		service.delete(tagId);
	}

}

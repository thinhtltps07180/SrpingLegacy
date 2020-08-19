package tp.kits3.livedinner.dao.IDao;

import java.util.List;

import tp.kits3.livedinner.vo.Post;

public interface IPost {
	List<Post> selectAll();
	Post selectOne(int postId);
	void insert(Post post);
	void update(Post post);
	void delete(int postId);
}

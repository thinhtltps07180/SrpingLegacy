package tp.kits3.livedinner.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tp.kits3.livedinner.dao.IDao.IPost;
import tp.kits3.livedinner.dao.IDaoImpl.PostImpl;
import tp.kits3.livedinner.vo.Post;

@Service
public class PostService {

	private IPost postImpl;

	public PostService() {
		postImpl = new PostImpl();
	}

	public List<Post> findAll() {
		return postImpl.selectAll();
	}

	public Post selectOne(Integer postId) {
		return postImpl.selectOne(postId);
	}

	public void insert(Post post) {
		postImpl.insert(post);
	}

	public void update(Post post) {
		postImpl.update(post);
	}

	public void delete(int postId) {
		postImpl.delete(postId);
	}

}

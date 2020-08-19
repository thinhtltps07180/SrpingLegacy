package tp.kits3.livedinner.controller;

import java.io.File;
import java.sql.Timestamp;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import tp.kits3.livedinner.service.PostService;
import tp.kits3.livedinner.service.TagService;
import tp.kits3.livedinner.vo.Post;
import tp.kits3.livedinner.vo.Tag;

@Controller
public class PostController {

	@Autowired
	ServletContext app;

	@Autowired
	PostService postService;

	@Autowired
	TagService tagService;

	@GetMapping(value = { "/post" })
	public String getFormPost(Model model) {
		List<Tag> listTag = tagService.findAll();
		model.addAttribute("postAtb", new Post());
		model.addAttribute("ListTag", listTag);

		return "FormPost";
	}

	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver multipartResolver() {
		CommonsMultipartResolver multi = new CommonsMultipartResolver();
		multi.setMaxUploadSize(100000);

		return multi;
	}

	@PostMapping(value = { "/createPost" })
	public String createPost(Model model, @ModelAttribute("postAtb") Post post,
			@RequestParam("up_photo") MultipartFile file, HttpServletRequest request) {

		try {
			if (file.isEmpty()) {
				post.setImg("default.jpg");
			} else {
				post.setImg(file.getOriginalFilename());

				try {

					String getContext = request.getContextPath();
					System.out.println("getContextPath" + getContext);
					System.out.println("getContextPath" + getContext);
					String getPath = app.getRealPath(getContext + "/resources/upload/" + post.getImg());
					file.transferTo(new File(getPath));
					System.out.println("get RealPath:" + getPath);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//			 Date getRegdate=new Date(timestamp.getTime()); 
			post.setRegdate(timestamp);

			post.setVisible(false);
			postService.insert(post);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}

	@GetMapping(value = { "/blog" })

	public String getListPost(Model model) {
		List<Post> listPost = postService.findAll();
		model.addAttribute("ListPost", listPost);
		return "client/blog";
	}

	/*
	 * @RequestMapping(value = "blog-detail/{pid}")
	 * 
	 * public String getBlogDetails(Model model , @PathVariable("pid") Integer id) {
	 * Post singlePost = postService.selectOne(id); model.addAttribute("SinglePost",
	 * singlePost); return "client/blog-details"; }
	 */

	@GetMapping(value = "blog/{pid}")
	public String getBlogDetails(Model model, @PathVariable("pid") Integer id) {
		Post singlePost = postService.selectOne(id);
		model.addAttribute("SinglePost", singlePost);
		return "client/blog-details";
	}

	@GetMapping(value = "blog/update/{pid}")
	public String getUpdatePost(Model model, @PathVariable("pid") Integer id) {
		List<Tag> listTag = tagService.findAll();
		Post singlePost = postService.selectOne(id);
		model.addAttribute("sendData", singlePost);
		model.addAttribute("ListTag", listTag);
		return "blog-update";
	}

	@PostMapping(value = "updatePost")
	public String updatePost(Model model, @ModelAttribute("sendData") Post post,
			@RequestParam("up_photo") MultipartFile file, HttpServletRequest request) {
		try {
			if (file.isEmpty()) {
				post.setImg("default.jpg");
			} else {
				post.setImg(file.getOriginalFilename());

				try {

					String getContext = request.getContextPath();
					System.out.println("getContextPath" + getContext);
					System.out.println("getContextPath" + getContext);
					String getPath = app.getRealPath(getContext + "/resources/upload/" + post.getImg());
					file.transferTo(new File(getPath));
					System.out.println("get RealPath:" + getPath);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//			 Date getRegdate=new Date(timestamp.getTime()); 
			post.setRegdate(timestamp);

			post.setVisible(false);
			postService.update(post);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "client/blog";
	}

}

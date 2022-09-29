package SecondApiProject.Blogging_Api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import SecondApiProject.Blogging_Api.entities.Category;
import SecondApiProject.Blogging_Api.entities.Post;
import SecondApiProject.Blogging_Api.entities.User;

public interface PostRepo  extends JpaRepository<Post, Integer>{

	List<Post> findByUser(User user);  //these are custom finder method
	List<Post> findByCategory(Category category);
	
	List<Post> findByTitleContaining(String title); //this method is used for searching with title
	//whatever we pass as a title it gonna compare with the title keyword and based on the search we get List of post
	
}

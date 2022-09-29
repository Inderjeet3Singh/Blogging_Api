package SecondApiProject.Blogging_Api.services;

import java.util.List;


import SecondApiProject.Blogging_Api.entities.Post;
import SecondApiProject.Blogging_Api.payload.PostDto;
import SecondApiProject.Blogging_Api.payload.PostResponse;

public interface PostService {

	// create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

	// update
	PostDto updatePost(PostDto postDto, Integer postId);

	// get all posts
	//List<PostDto> getAllPost(Integer pageNumber, Integer pageSize);
    
	//for pagination we have to return PostResponse
	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy,String sortDir );
	
	// getById
	PostDto getPostById(Integer postId);

	// delete
	void deletePost(Integer postId);
	
	//get all post by category
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	//get all post by user
	List<PostDto> getPostsByUser(Integer userId);
	
	
	//Search posts by keyword
	List<PostDto> searchPosts(String keyword);
}

package SecondApiProject.Blogging_Api.services;

import java.util.List;

import SecondApiProject.Blogging_Api.payload.CategoryDto;

public interface CategoryService {
	
	//create
	
	public CategoryDto createCategory (CategoryDto categoryDto); 
	
	//update
	
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer CategoryId);
	//get
	
	public List<CategoryDto> getCategories ();
	//getById
	
	public CategoryDto getByCategoryId (Integer CategoryId);
	
	//delete
	
	public void deleteCategory(Integer CategoryId);

}

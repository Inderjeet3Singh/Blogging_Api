package SecondApiProject.Blogging_Api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import SecondApiProject.Blogging_Api.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}

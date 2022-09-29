package SecondApiProject.Blogging_Api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import SecondApiProject.Blogging_Api.entities.User;

public interface UserRepo extends JpaRepository< User, Integer>{

}

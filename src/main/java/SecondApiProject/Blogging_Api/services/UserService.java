package SecondApiProject.Blogging_Api.services;

import java.util.List;

import SecondApiProject.Blogging_Api.payload.UserDto;

public interface UserService {
	
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user, Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUsers();
	void deleteUser(Integer userId);
	

}

package admin_user.service;

import java.util.List;

import admin_user.dto.UserDto;
import admin_user.model.User;

public interface UserService {
	 
	User save(UserDto userDto);
	List<User> getDetails();
	//List<User> getDetails(UserDto userDto);

}

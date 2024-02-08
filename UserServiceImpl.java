package admin_user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import admin_user.dto.UserDto;
import admin_user.model.User;
import admin_user.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {

	
	private UserRepository userRepository;
	@Override
	public User save(UserDto userDto) {
		User user = new User(null, userDto.getEmail(),userDto.getPassword(), userDto.getRole(),userDto.getFullname());
		return userRepository.save(user);
	}
	
	@Override
	public List<User> getDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}

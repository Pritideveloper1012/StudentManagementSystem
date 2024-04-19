package admin_user.service;

import org.springframework.stereotype.Service;

import admin_user.dto.UserDto;
import admin_user.model.User;
import admin_user.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	private UserRepository userRepository;

	@Override
	public User save(UserDto userDto) {
    User user = new User(userDto.getId(), userDto.getEmail(),userDto.getPassword(),userDto.getRole(),userDto.getFullName());
		
		return userRepository.save(user);
		
	}
   

	
	

}

package ru.gmyrkin.springboot.spring_boot_new_bali_3_1_1.service;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.gmyrkin.springboot.spring_boot_new_bali_3_1_1.model.Role;
import ru.gmyrkin.springboot.spring_boot_new_bali_3_1_1.model.User;
import ru.gmyrkin.springboot.spring_boot_new_bali_3_1_1.repository.RoleRepository;
import ru.gmyrkin.springboot.spring_boot_new_bali_3_1_1.repository.UserRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service // данный класс компонент Spring
public class UserService {

    private final RoleRepository roleRepository;
    private final UserRepository userRepository;

    public UserService(RoleRepository roleRepository, UserRepository userRepository) {
        this.roleRepository = roleRepository;
        this.userRepository = userRepository;
    }

    public User findById (Long id){
        return userRepository.getOne(id);

    }

    public List<User> findAll(){
        return userRepository.findAll();

    }

    public User saveUser(User user){
      return userRepository.save(user);

    }

    public void deleteById (Long id){
        userRepository.deleteById(id);

    }

}

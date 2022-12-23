package ru.gmyrkin.springboot.spring_boot_new_bali_3_1_1.service;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.gmyrkin.springboot.spring_boot_new_bali_3_1_1.model.Role;
import ru.gmyrkin.springboot.spring_boot_new_bali_3_1_1.model.User;
import ru.gmyrkin.springboot.spring_boot_new_bali_3_1_1.repository.RoleRepository;
import ru.gmyrkin.springboot.spring_boot_new_bali_3_1_1.repository.UserRepository;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Service // данный класс компонент Spring
public class UserService {

    private final RoleRepository roleRepository;

    //инициализация (старый способ @Autowired)
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
        Role role = roleRepository.findById(2L).orElseThrow(() -> new UsernameNotFoundException("Role not found"));
        user.setRoles(new HashSet<>(List.of(role)));
      return userRepository.save(user);

    }

    public void deleteById (Long id){
        userRepository.deleteById(id);

    }



}

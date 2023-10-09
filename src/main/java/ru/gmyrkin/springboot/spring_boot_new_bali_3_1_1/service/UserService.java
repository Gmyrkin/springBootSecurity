package ru.gmyrkin.springboot.spring_boot_new_bali_3_1_1.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.gmyrkin.springboot.spring_boot_new_bali_3_1_1.model.User;
import ru.gmyrkin.springboot.spring_boot_new_bali_3_1_1.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service // данный класс компонент Spring
@Transactional
public class UserService {

    //инициализация (старый способ @Autowired)
    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> findById (Long id){
        return userRepository.findById(id);

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

    public User findByUsername(String username) {
        return userRepository.findByFirstName(username);
    }

}

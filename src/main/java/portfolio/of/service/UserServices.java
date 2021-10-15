package portfolio.of.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.of.Entity.User;
import portfolio.of.Repository.UserRepository;
import portfolio.of.serviceInterface.IUserService;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices implements IUserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findUserbyId(long id) {
        return userRepository.findById(id);
    }

    @Override
    public void deleteUserbyId(long id) {
        userRepository.deleteById(id);
    }
    @Override
    public void deleteUser(User user){
        userRepository.delete(user);
    }
}

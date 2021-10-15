package portfolio.of.serviceInterface;

import portfolio.of.Entity.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    List<User> findAllUser();

    Optional<User> findUserbyId(long id);

    void deleteUserbyId(long id);

    void deleteUser(User user);
}

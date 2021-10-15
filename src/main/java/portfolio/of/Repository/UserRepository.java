package portfolio.of.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portfolio.of.Entity.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}

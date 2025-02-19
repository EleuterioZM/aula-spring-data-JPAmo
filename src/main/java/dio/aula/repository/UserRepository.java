package dio.aula.repository;

import dio.aula.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("SELECT u from User u where u.name like %:name%")
    List<User> findByName(@Param("name") String name);

}

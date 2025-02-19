package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StarApp implements CommandLineRunner {
   @Autowired
    private  UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
 User user = new User();

 user.setName("Eleuterio Zacarias");
 user.setUsername("Eleuterio Zacarias");
 user.setPassword("Eleuterio");
 userRepository.save(user);

 for (User u : userRepository.findAll()) {
     System.out.println(u);
 }
    }
}

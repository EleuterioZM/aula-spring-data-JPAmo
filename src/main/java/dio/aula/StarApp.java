package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StarApp implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        // Buscar usuários por nome
        List<User> users = userRepository.findByName("Eleuterio");
        for (User user : users) {
            System.out.println(user);
        }

        // Inserir um novo usuário
        insertUser();
    }


    private void insertUser() {
            User user = new User();

            user.setName("Zacarias ");
            user.setUsername("Zacarias ");
            user.setPassword("Eleuterio");
            userRepository.save(user);

            for (User u : userRepository.findAll()) {
                System.out.println(u);
            }
        }
    }

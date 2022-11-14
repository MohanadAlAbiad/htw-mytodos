package de.webtech.mytodos;


import de.webtech.mytodos.entity.Todo;
import de.webtech.mytodos.entity.User;
import de.webtech.mytodos.repository.TodoRepository;
import de.webtech.mytodos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MytodosApplication implements CommandLineRunner  {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(MytodosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user = new User();
		Todo todo  = new Todo();
		user.getTodoList().add(todo);
		userRepository.save(user);
	}
}
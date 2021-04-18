package br.tec.orz.helpdesk;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import br.tec.orz.helpdesk.api.repository.UserRepository;
import br.tec.orz.helpdesk.api.security.entity.User;
import br.tec.orz.helpdesk.api.security.enums.ProfileEnum;

@SpringBootApplication
public class HelpDeskApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelpDeskApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		return args -> {
			initUsers(userRepository, passwordEncoder);
		};

	}

	private void initUsers(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		
		User find = userRepository.findByEmail("admin@helpdesk.com");

		if (find == null) {
			User admin = new User();
			admin.setEmail("admin@helpdesk.com");
			admin.setPassword(passwordEncoder.encode("123456"));
			admin.setProfile(ProfileEnum.ROLE_ADMIN);
			userRepository.save(admin);
		}
	}

}

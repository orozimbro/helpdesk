package br.tec.orz.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.tec.orz.helpdesk.api.security.entity.User;

public interface UserRepository extends MongoRepository<User, String>{
	
	User findByEmail(String email);
}

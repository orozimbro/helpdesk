package br.tec.orz.helpdesk.api.service;

import org.springframework.data.domain.Page;

import br.tec.orz.helpdesk.api.security.entity.User;

public interface UserService {
	
	User findByEmail(String email);
	
	User createOrUpdate(User user);
	
	User findById(String id);
	
	void delete(String id);
	
	Page<User> findAll(int page, int count);
	
}

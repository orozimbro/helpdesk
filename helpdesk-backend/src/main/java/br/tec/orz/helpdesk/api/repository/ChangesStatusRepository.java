package br.tec.orz.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.tec.orz.helpdesk.api.security.entity.ChangeStatus;

public interface ChangesStatusRepository extends MongoRepository<ChangeStatus, String>{
	
	Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc(String ticketId);
	
}

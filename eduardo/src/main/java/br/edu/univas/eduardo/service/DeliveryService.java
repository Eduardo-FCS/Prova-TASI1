package br.edu.univas.eduardo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.univas.eduardo.entities.DeliveryEntity;
import br.edu.univas.eduardo.repositories.DeliveryRepository;

@Service
public class DeliveryService {
	
	private DeliveryRepository repo;
	
	@Autowired
	public DeliveryService(DeliveryRepository del) {
		this.repo = del;
	}
	
	public void createProduct(DeliveryEntity delivery) {
		repo.save(delivery);
	}
	
	public DeliveryEntity findById(long code) {
		Optional<DeliveryEntity> obj = repo.findById(code);
		DeliveryEntity entity = obj.orElseThrow(() -> new RuntimeException());
		return entity;
	}
}

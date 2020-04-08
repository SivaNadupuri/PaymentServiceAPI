/**
 * 
 */
package com.fora.ps.api.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fora.ps.api.entity.Payment;
import com.fora.ps.api.repository.PaymentRepository;

/**
 * @author siva
 *
 */
@Service
public class PaymentService {

	@Autowired
	private PaymentRepository repository;

	public Payment doPayment(Payment payment) {
		payment.setTranscationId(UUID.randomUUID().toString());
		return repository.save(payment);
	}

}

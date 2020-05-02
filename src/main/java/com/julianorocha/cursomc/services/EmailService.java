package com.julianorocha.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.julianorocha.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
package com.codinger.manyToMany;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CodingerSender2 {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void send(int i) {
		String context = "spirng boot codinger queue"+" ****** "+i;
		System.out.println("Sender2 : " + context);
		this.rabbitTemplate.convertAndSend("codinger", context);
	}

}
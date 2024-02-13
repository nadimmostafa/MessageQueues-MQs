package org.nadim.messageService;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerApp {
	
	@JmsListener(destination = "${my.app.desti-name}")
	public void readMsg(String msg) {
		System.out.println(msg);
	}
}

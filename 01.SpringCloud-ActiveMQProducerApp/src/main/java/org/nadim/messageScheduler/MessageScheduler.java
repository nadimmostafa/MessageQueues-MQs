package org.nadim.messageScheduler;

import java.util.Date;

import org.nadim.messageService.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MessageScheduler {
	
	@Autowired
	private ProducerService service;
	
	@Scheduled(cron = "*/10 * * * * *")
	public void sentMSg() {
		service.sendMessage("Hello "+ new Date());
	}
}

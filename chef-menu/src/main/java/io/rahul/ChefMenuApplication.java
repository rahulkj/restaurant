package io.rahul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class ChefMenuApplication {
	
	@Autowired
	ChefMenuGenerator chefMenuGenerator;

	public static void main(String[] args) {
		SpringApplication.run(ChefMenuApplication.class, args);
	}
	
	@Scheduled(cron = "*/5 * * * * *")
	private void generateMenu() {
		chefMenuGenerator.generate();
	}

}

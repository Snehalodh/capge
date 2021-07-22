package com.capg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.capg.entities.ContactsMasterEntity;
import com.capg.repository.ContactsMasterRepo;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SpringDataJpa1Application.class, args);
		ContactsMasterRepo bean=context.getBean(ContactsMasterRepo.class);
		ContactsMasterEntity entity= new ContactsMasterEntity();
		entity.setContactId(2);
		entity.setContactName("Sreya");
		entity.setContactNumber(2564785500L);
		ContactsMasterEntity save= bean.save(entity);
		System.out.println(save);
	}

}

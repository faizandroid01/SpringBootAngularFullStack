package com.faiz.learn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackageClasses = { ProductRepo.class })
public class MongoDBConfig {

	@Bean
	CommandLineRunner commandLineRunner(ProductRepo repo) {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {

				repo.save(new Product(1, "MAGGI", "PRO-1", "Maggi World", "For Eating", "Maggi.jpg", 10.00));

			}
		};

	}
}

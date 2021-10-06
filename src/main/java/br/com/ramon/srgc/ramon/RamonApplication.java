package br.com.ramon.srgc.ramon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@SpringBootApplication
public class RamonApplication {

	public static void main(String[] args) {
		SpringApplication.run(RamonApplication.class, args);
	}
}

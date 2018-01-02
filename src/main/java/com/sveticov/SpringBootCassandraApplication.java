package com.sveticov;

import com.sveticov.model.Customer;
import com.sveticov.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringBootCassandraApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCassandraApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		repository.deleteAll();

		Customer cust_1 = new Customer(1, "Peter", "Smith", 20);
		Customer cust_2 = new Customer(2, "Mary", "Taylor", 25);
		Customer cust_3 = new Customer(3, "Peter", "Brown", 30);
		Customer cust_4 = new Customer(4, "Lauren", "Taylor", 20);
		Customer cust_5 = new Customer(5, "Lauren", "Flores", 45);
		Customer cust_6 = new Customer(6, "Peter", "Williams", 20);


		repository.save(cust_1);
		repository.save(cust_2);
		repository.save(cust_3);
		repository.save(cust_4);
		repository.save(cust_5);
		repository.save(cust_6);


		repository.findAll().forEach(System.out::println);
		System.out.printf("-----------------------------------------------------------------");
		List<Customer> peters = repository.findByFirstname("Peter");
		peters.forEach(System.out::println);
		System.out.printf("-----------------------------------------------------------------");

		List<Customer> peters2=	repository.findByAgeGreaterThan(20);
		peters2.forEach(System.out::println);


	}
}

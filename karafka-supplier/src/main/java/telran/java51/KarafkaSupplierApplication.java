package telran.java51;

import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KarafkaSupplierApplication {

	public static void main(String[] args) {
		SpringApplication.run(KarafkaSupplierApplication.class, args);
	}
	
	@Bean
	Supplier<String> log() {
		return () -> new String("42");
	}

}

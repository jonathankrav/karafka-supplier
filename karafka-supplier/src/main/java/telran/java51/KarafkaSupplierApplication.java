package telran.java51;

import java.util.function.Supplier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@SpringBootApplication
public class KarafkaSupplierApplication {

	public static void main(String[] args) {
		SpringApplication.run(KarafkaSupplierApplication.class, args);
	}
	
//	@Bean
//	Supplier<String> log() {
//		return () -> new String("42");
//	}
	
	@Bean
	Supplier<Mono<String>> log() {
	    return () -> Mono.just("Hello from Supplier2")
	                    .subscribeOn(Schedulers.boundedElastic());
	}

}

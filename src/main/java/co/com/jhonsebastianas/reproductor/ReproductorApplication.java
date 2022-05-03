package co.com.jhonsebastianas.reproductor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import org.springframework.context.annotation.Bean;
//import co.com.jhonsebastianas.reproductor.services.AlbumService;

@SpringBootApplication
public class ReproductorApplication {
	
//	@Bean
//	AlbumService buillMessageService() {
//		return new AlbumService();
//	}

	public static void main(String[] args) {
		SpringApplication.run(ReproductorApplication.class, args);
	}

}

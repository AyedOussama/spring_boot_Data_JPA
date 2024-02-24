package com.ayed.jpa_docker_alibouali;

import com.ayed.jpa_docker_alibouali.Model.Author;
import com.ayed.jpa_docker_alibouali.Model.Video;
import com.ayed.jpa_docker_alibouali.Repositories.AuthorRepository;
import com.ayed.jpa_docker_alibouali.Repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaDockerAlIboualiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaDockerAlIboualiApplication.class, args);
	}

	//@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository authorRepository) {
		return args -> {
			var author1 = Author.builder()
					.firstName("Ali")
					.lastName("Bouali")
					.email("ayedoussama22@gmail.com")
					.age(22)
					.createdAt(java.time.LocalDateTime.now())
					.build();
			authorRepository.save(author1);
		};
	}


	@Bean
	public CommandLineRunner commandLineRunner(VideoRepository videoRepository) {
		return args -> {
			var video1 = Video.builder()
					.name("Video 1")
					.url("https://www.youtube.com/watch?v=1")
					.length(120)
					.build();
			videoRepository.save(video1);
		};
	}


}

package guru.springframework.guruspringbootjokesapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Configuration
public class ChuckNorrisConfiguration {

	@Bean
	public ChuckNorrisQuotes chuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}
}

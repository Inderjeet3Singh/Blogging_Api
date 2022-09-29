package SecondApiProject.Blogging_Api;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BloggingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloggingApiApplication.class, args);
	}
	
	@Bean  //by this we are informing our spring to remember this class to make object
	public ModelMapper modelMapper()
	{
		return new ModelMapper();
	}

}

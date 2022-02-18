package nvc.it.icefactoryapichawanwit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class IceFactoryApiChawanwitApplication {

	public static void main(String[] args) {
		SpringApplication.run(IceFactoryApiChawanwitApplication.class, args);
	}

}

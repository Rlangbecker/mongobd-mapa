package mongobdmapa.br.com.mongobdmapa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
//@EnableMongoRepositories
public class MongobdMapaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongobdMapaApplication.class, args);

	}

}

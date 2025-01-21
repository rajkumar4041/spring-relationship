package dataJpa.relationship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RelationshipApplication {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(RelationshipApplication.class, args);


  }

}

package be.heh.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@ImportResource({"classpath*:be/heh/petclinic/config.xml","classpath*:be/heh/petclinic/**/component.xml"})
//@ImportResource("classpath*:be/heh/petclinic/config.xml")

public class PetClinicApplication {

	public static void main(String[] args) {
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SpringApplication.run(PetClinicApplication.class, args);
	}
}
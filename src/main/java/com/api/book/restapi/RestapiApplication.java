package com.api.book.restapi;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RestapiApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context=SpringApplication.run(RestapiApplication.class, args);

		//  StudentRepo strepo=context.getBean(StudentRepo.class);

		//  Student st=new Student();
		 
		//  st.setName("Himi Saran");
		//  st.setClasss("B.A III Year");
		//  st.setStream("Web Development");
		
		//  Student std=strepo.save(st);

		//  System.out.println(std);
            
	}

}

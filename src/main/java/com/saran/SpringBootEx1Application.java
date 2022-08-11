package com.saran;

 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.saran.config.StudentConfig;
import com.saran.model.Employee;
import com.saran.model.Student;

@SpringBootApplication
public class SpringBootEx1Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context =
				 SpringApplication.run(SpringBootEx1Application.class, args);
		 Employee emp = context.getBean(Employee.class);
		    emp.setEid(100);
		    emp.setEname("Dylan");
		    emp.showEployeeDetails();//this will not work if its not autowired
		 ApplicationContext ctx=new AnnotationConfigApplicationContext(StudentConfig.class);
	      Student st=ctx.getBean("studentBean",Student.class);
	      st.call();
	
	}
	
	
	

}

package springboot.VerizonSpringBoot;

import javax.persistence.Entity;

@Entity
public class Employee {
	//private @Id @GeneratedValue Long id;
    private String name;
    Employee(){}


    Employee(String name) {
    	this.name = name;

    }
    public void test()
     {
    	System.out.println("Test  Method");    
     }

}

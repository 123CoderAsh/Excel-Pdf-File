package in.ashokit;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepository;

@SpringBootApplication
public class Application implements CommandLineRunner{
     @Autowired  EmployeeRepository repository;
     
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
     
    @Override
    public void run(String... args) throws Exception {
 
        if (repository.count() == 0) {
            // save a list of Employees
            repository.saveAll(Arrays.asList(
                    new Employee("ashish", "shejwal", "Team-lead", "1234567890"),
                    new Employee("Atul", "Borse", "Admin", "09876556789"),
                    new Employee("amar", "police", "Finance", "543310987"),
                    new Employee("somnath", "sahoo", "Security", "23456789098"),
                    new Employee("suraj", "More", "Technology", "67892345"),
                    new Employee("shubham", "Bhopale", "Infra", "98765234"),
                    new Employee("swapnil", "mehetre", "Science", "3456776543")));
        }
 
    }
 
}

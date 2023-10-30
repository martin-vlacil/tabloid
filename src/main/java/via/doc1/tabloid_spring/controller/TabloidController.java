package via.doc1.tabloid_spring.controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import via.doc1.tabloid_spring.model.Department;
import via.doc1.tabloid_spring.service.TabloidService;

@SpringBootApplication
@RestController
public class TabloidController {

	private TabloidService tabloidService;

	public TabloidController(TabloidService tabloidService) {
		this.tabloidService = tabloidService;
	}

	@RequestMapping("/")
	public String index() {
		return "<body><h1>DevOps and Cloud</h1> " +
				"<h2>Dockerizing Spring Boot Backend Application.</h2>" +
				"<p>With Docker, we can containerize SEP4 back-end and front-end applications.</p></body>";
	}

	@GetMapping("/departments/{departmentId}")
	public Department getStoryDetails(@PathVariable int departmentId) {
		return tabloidService.getDepartment(departmentId);
	}

	public static void main(String[] args) {
		SpringApplication.run(TabloidController.class, args);
	}

}
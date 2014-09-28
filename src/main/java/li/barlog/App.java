package li.barlog;

import li.barlog.domain.Foo;
import li.barlog.repository.FooRepository;
import li.barlog.service.CurrentUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class App implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Autowired
	private FooRepository fooRepository;

	@Autowired
	private CurrentUserService currentUserService;

	@Override
	public void run(String... args) {
		Foo o = new Foo();
		o.setData("test data");
		fooRepository.save(o);

		fooRepository.findAll().forEach(System.out::println);

		currentUserService.setCurrentUserToDoe();

		o.setData("New test data");
		fooRepository.save(o);

		fooRepository.findAll().forEach(System.out::println);
	}
}

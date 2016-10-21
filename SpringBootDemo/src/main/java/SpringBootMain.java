import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"in.co.sdrc"})
public class SpringBootMain {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMain.class,args);
	}
}

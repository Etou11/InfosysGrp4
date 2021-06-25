package hsesslingen.group4.jumbleShare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class JumbleShareApplication {

	//TODO: Replace with an actual authentication system - use for development only! Replace any occurrences (Ctrl + Shift + F) of this id when changing!
	public static String currentlyActiveUser = "D568817B-A8D2-43AA-A4BD-DC92378CB6DE";
	public static UUID _currentlyActiveUser = UUID.fromString(currentlyActiveUser);

	public static void main(String[] args) {
		SpringApplication.run(JumbleShareApplication.class, args);
	}

}

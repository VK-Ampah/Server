// This is the main class for the server. It is responsible for starting the server and running the application.

package keyinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class Server {
    public static void main(String[] args) {
        SpringApplication.run(Server.class, args);
    }
}


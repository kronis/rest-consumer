package restconsumer;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by kronis on 06/04/2017.
 */
@Service
public class GreetingService {
    @HystrixCommand(fallbackMethod = "defaultGreeting")
    public String getGreeting(String username) {
        return new RestTemplate()
                .getForObject("http://producer:8080/my-dummy-api/greeting/{username}",
                        String.class, username);
    }

    private String defaultGreeting(String username) {
        return "Hello User!";
    }
}
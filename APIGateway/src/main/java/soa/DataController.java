
package soa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DataController {

    @GetMapping("/api/data")
    public String getData() {

        RestTemplate restTemplate = new RestTemplate();

        String response = restTemplate.getForObject(
            "http://localhost:8081/data",
            String.class
        );

        return "Gateway received response: " + response;
    }
}

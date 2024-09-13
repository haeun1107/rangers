package farm.rangers.global;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/health")
    public String healthCheck() {
        return "I'm healthy!";
    }

    @GetMapping("/haeun")
    public String haeunCheck() {
        return "haeun!";
    }
}


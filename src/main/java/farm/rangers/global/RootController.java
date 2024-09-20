package farm.rangers.global;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/health")
    public String hc() {
        return "success!";
    }

    @GetMapping("/haeun")
    public String haeun() {
        return "haeun입니다!";
    }

    @GetMapping("/cocofarm")
    public String cocofarm() {
        return "cocofarm이다!!";
    }
}


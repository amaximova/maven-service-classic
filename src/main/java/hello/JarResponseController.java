package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JarResponseController {

    @RequestMapping("/testjar")
    public JarResponse jarResponse() {
        return new JarResponse();
    }
}

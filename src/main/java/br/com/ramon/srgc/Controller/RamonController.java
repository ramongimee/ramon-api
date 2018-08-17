package br.com.ramon.srgc.Controller;

import br.com.ramon.srgc.Model.Ramon;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class RamonController {

    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/ramon")
    public Ramon ramon (@RequestParam(value = "nome" ,defaultValue = "World") String name){
        return new Ramon(counter.incrementAndGet(),
                         String.format(template,name));
    }

}

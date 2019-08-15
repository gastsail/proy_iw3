import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import org.json.*;

@RestController
@EnableAutoConfiguration
public class HelloWorld {

@RequestMapping("/")
String home() {
    JSONObject json = new JSONObject();
    json.put("nombre","gaston");
return json.toString();
}

public static void main(String[] args) {
SpringApplication.run(HelloWorld.class, args);
}

}
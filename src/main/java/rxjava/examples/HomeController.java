package rxjava.examples;

import org.springframework.stereotype.Controller;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

import java.util.Date;

@Controller
public class HomeController {

  @MessageMapping("/hello")
  @SendTo("/topic/time")
  public TimeAPI time() {
    TimeAPI timeAPI = new TimeAPI(new Date());
    return timeAPI;
  }

}
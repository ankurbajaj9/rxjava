package rxjava.examples;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
  @GetMapping(value = "/rest/")
  public ResponseEntity appName(){
      return new ResponseEntity(new AppInfo("Hello World","1.0-SNAPSHOT"), HttpStatus.OK);
  }
}

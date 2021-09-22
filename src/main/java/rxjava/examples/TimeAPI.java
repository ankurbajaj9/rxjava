package rxjava.examples;

import java.util.Date;

public class TimeAPI {

  private String content;

  public TimeAPI() {
  }

  public TimeAPI(String content) {
    this.content = content;
  }

  public TimeAPI(Date content) {
    this.content = String.valueOf(content.getTime());
  }

  public String getContent() {
    return content;
  }
}

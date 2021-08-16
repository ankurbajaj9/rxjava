package rxjava.examples;

import org.springframework.http.HttpStatus;

public class AppInfo {
  String appName;
  String version;

  public AppInfo(String appName, String version) {
    this.appName = appName;
    this.version = version;
  }

  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }
}

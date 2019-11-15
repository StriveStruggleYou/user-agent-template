package io.github.ssy.user.agent.template;

import eu.bitwalker.useragentutils.OperatingSystem;
import eu.bitwalker.useragentutils.UserAgent;

public class UserAgentTemplateApplication {

  public static void main(String args[]) {
    UserAgent userAgent = new UserAgent(
      "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36");
    System.out.println(userAgent.getBrowser());

    System.out.println(userAgent.getBrowserVersion());

    OperatingSystem operatingSystem = userAgent.getOperatingSystem();
    System.out.println(operatingSystem);


  }

}

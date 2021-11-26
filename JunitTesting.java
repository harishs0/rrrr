package org.Junit;



import java.time.Instant;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class JunitTesting extends BaseClass {
@BeforeClass

public static void tco1 () {
	getDriver();
launchbrowser("https://www.facebook.com/");
}

@Before
public void tco2 () {
Date u = new Date();
System.out.println(u);
}

@Test
public void tco3 () {
WebElement user= xpath("//*[@id=\"email\"]");
textsender(user,"hari43@gmail.com");
String attribute = user.getAttribute("value");
System.out.println(attribute);

}

@After
public void tco4 () {
Date u = new Date();
System.out.println(u);
}

@AfterClass
public static void  tco5 () {
WebElement login= xpath("//button");

login.click();

}

@Test
public void tco6 () {
WebElement pass= xpath("//*[@id=\"pass\"]");
textsender(pass,"12345678");
String attribute1=pass.getAttribute("value");
System.out.println(attribute1);

}
}





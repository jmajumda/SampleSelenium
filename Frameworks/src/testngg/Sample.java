package testngg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Sample {
  @Test
  public void f() {System.out.println("This is test");
  }
  @Test
  public void f2(){
    System.out.println("This is added via GitHub");
  }
  @BeforeClass
  public void beforeClass() {System.out.println("This is beforeclass 1");
  }

  @AfterClass
  public void afterClass() {System.out.println("This is afterclass 1");
  }

}

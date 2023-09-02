package com.testpng;
import org.testng.annotations.Test;
public class SecondTest {
	@Test (priority=0,invocationCount=8,threadPoolSize=2)
    
	  public void log() {

	      System.out.println("login method");
	      System.out.println("thread id:"+Thread.currentThread().getId());
	      

	  }

	  @Test(priority=1)

	  public void search() {

	      System.out.println("search method");

	  }

	  @Test(priority=2)

	  public void addtocart() {

	      System.out.println("add to cart method");

	  }

	  @Test(priority=3)

	  public void checkout() {

	      System.out.println("checkout method");

	  }
	
	
	
	
	

}

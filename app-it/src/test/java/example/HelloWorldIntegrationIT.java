package example;

import junit.framework.TestCase;

import org.junit.Test;

public class HelloWorldIntegrationIT extends TestCase {

    @Test
    public void test() {
        new HelloWorld().coveredByIntegrationTest();
    }
	
}

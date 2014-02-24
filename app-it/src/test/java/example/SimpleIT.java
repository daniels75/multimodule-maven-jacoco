package example;

import org.junit.Test;

import example.daniels.Simple;
import junit.framework.TestCase;

public class SimpleIT extends TestCase {

    @Test
    public void  testPathName(){
        new Simple().pathName();
        
    }
}

package example.daniels;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class SimpleTest extends TestCase{

    private Simple simple;
    
    @Before
    public void setUp(){
        simple = new Simple();
    }
    
    @Test
    public void testAdd(){
        simple.add("Test");
    }
}

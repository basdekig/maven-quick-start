package clinic.programming.training;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class ApplicationTest {
    private Application app;
    
    @Before
    public void setup() {
        app = new Application();
    }
    
    
    @Test
    public void testWordCountString() {
        int count = app.countwords("this is a test");
        assertTrue(count == 4);
    }

    @Test
    public void testWordCountEmpty() {
        int count = app.countwords("");
        assertTrue(count == 0);
    }

    @Test
    public void testWordCountNull() {
        int count = app.countwords(null);
        assertTrue(count == 0);
    }

    @Test
    @Ignore
    public void testWordCountMore() {
        int count = app.countwords("this will be skipped");
        assertTrue(count == 3);
    }

    @Test
    public void testWordCountSingle() {
        int count = app.countwords("test");
        assertTrue(count == 1);
    }
}
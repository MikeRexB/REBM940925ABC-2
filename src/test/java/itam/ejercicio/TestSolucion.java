package itam.adsi.examen;

import static org.junit.Assert.assertEquals;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSolucion {

    

    
    private Solucion s = new Solucion();

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @Before
    public void before() {
        System.out.println("Before Test Case");
    }

    @Test
    public void problemaTest() {
        assertEquals(true,s.problema("abab"));
	assertEquals(true,s.problema("cccccc"));
	assertEquals(true,s.problema("mojomojo"));
	assertEquals(true,s.problema("bububu"));
	assertEquals(true,s.problema("aaaaaaaa"));
	assertEquals(true,s.problema("afafafaf"));
	assertEquals(true,s.problema("aaaabaaaab"));
	assertEquals(true,s.problema("bubububu"));
	assertEquals(true,s.problema("buffabuffa"));
	assertEquals(true,s.problema("bolobolo"));
	assertEquals(false,s.problema("aaaaaaaaaaaf"));
	assertEquals(false,s.problema("aaf"));
	assertEquals(false,s.problema("buffabuffaf"));
	assertEquals(false,s.problema("abba"));
	assertEquals(false,s.problema("queen"));
	assertEquals(false,s.problema("tuc"));
	assertEquals(false,s.problema("tavo"));
	assertEquals(false,s.problema("miguel"));
	assertEquals(false,s.problema("geo"));
	assertEquals(false,s.problema(""));
        
    }

    @After
    public void after() {
        System.out.println("After Test Case");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }
}

package com.ecommerce;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.BeforeMethod;


public class StandardTestClass {

    @BeforeClass
    static void initAll() {
        System.out.println("initAll()");
    }

    @BeforeMethod
    void init() {
        System.out.println("init()");

    }
    

    @org.junit.Test
    void succeedingTest() {
        System.out.println("succeedingTest()");

    }

    @Test
    void failingTest() {
        System.out.println("failingTest()");

        fail("a failing test");
    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
    }

    @Test
    void abortedTest() {
        System.out.println("abortedTest()");

        assumeTrue("abc".contains("Z"));
        fail("test should have been aborted");
    }

    private void fail(String string) {
		// TODO Auto-generated method stub
		
	}

	private void assumeTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("restriction")
	@After 
    void tearDown() {
        System.out.println("tearDown()");

    }

    @SuppressWarnings("restriction")
	@AfterClass
    static void tearDownAll() {
        System.out.println("tearDownAll()");

    }

}
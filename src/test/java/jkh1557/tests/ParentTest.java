package jkh1557.tests;

import jkh1557.appManager.ApplicationManager;
import org.junit.After;
import org.junit.Before;



public class ParentTest {


    protected  ApplicationManager app = new ApplicationManager();



    @Before
    public void setUp() throws Exception {
        app.init();
    }

    @After
    public void tearDown() throws Exception {
        app.stop();

    }

}

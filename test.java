

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class test
{
    private Alumno alumno1;
    private Alumno alumno2;
    private Alumno alumno3;
    private Alumno alumno4;
    private Alumno alumno5;

    /**
     * Default constructor for test class test
     */
    public test()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        alumno1 = new Alumno("Dario Garcia Cuevas", "2412", 21);
        alumno2 = new Alumno("Roberto Fernández López", "3123", 19);
        alumno3 = new Alumno("Antonio López", "1324", 22);
        alumno4 = new Alumno("Guillermo Alonso", "1552", 19);
        alumno5 = new Alumno("Adrián García", "8652", 20);
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}

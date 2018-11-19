package Test;

import org.junit.After;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CerradaStateTest
{
    CerradaStateTestFixture1 fixture=new CerradaStateTestFixture1();
    public CerradaStateTest()
    {
    }

    @Before
    public void setUp() throws Exception
    {
        this.fixture.setUp();
    }

    @After
    public void tearDown() throws Exception
    {
    }

    /**
     * @see CerradaState#abrir()
     */
    @Test
    public void testAbrir()
    {
        fail("Unimplemented");
    }

    /**
     * @see CerradaState#pausado()
     */
    @Test
    public void testPausado()
    {
        fail("Unimplemented");
    }

    /**
     * @see CerradaState#cerrar()
     */
    @Test
    public void testCerrar()
    {
        fail("Unimplemented");
    }

    /**
     * @see CerradaState#devolverestado()
     */
    @Test
    public void testDevolverestado()
        {
            try
            {
                Assert.assertEquals("Deberia tenes este msj", this.fixture.t1.getEstado().devolverestado(),"cerrada");
            }
            catch(Exception e)
            {
                fail("Crear una tarea nueva dispara excepcion");
            }
            
        }
}

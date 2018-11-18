package Test;

import modelo.UsuarioNoEncontradoException;
import modelo.Utilidad;

import org.junit.After;
import org.junit.Assert;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;

public class UtilidadTest
{
    UtilidadTestFixture1 fixture=new UtilidadTestFixture1();
    public UtilidadTest()
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
     * @see modelo.Utilidad#getInstance()
     * Probando con una intancia existente
     */
    @Test
    public void testGetUtilidad()
    {
        try{
        Utilidad utilidad=Utilidad.getUtilidad();
                Assert.assertEquals("Deberian ser igualies las intancias utilidad",utilidad,this.fixture.utilidad);     
            }
        catch(Exception e){
        fail("Unimplemented");
        }
    }
    /**
     * @see modelo.Utilidad#verificarUsuario(String,String)
     * Testeando buscar un colaborador
     */
    @Test
    public void testVerificarUsuario1() {
        try {
            String resp=  this.fixture
                .utilidad
                .verificarUsuario("id", "123");
            Assert.assertEquals("Encontro un colaborador ", Utilidad.esColaborador,resp);
        } catch (UsuarioNoEncontradoException e) {
            fail("Fallo la busqueda de colaborador");
        }
    }
    /**
     * @see modelo.Utilidad#verificarUsuario(String,String)
     * Testeando un admin
     */
    @Test
    public void testVerificarUsuario2() {
        try {
            String resp=  this.fixture
                .utilidad
                .verificarUsuario("admin", "123");
            Assert.assertEquals("Encontro un colaborador ", Utilidad.esAdministrador,resp);
        } catch (UsuarioNoEncontradoException e) {
            fail("Fallo la busqueda de Admin");
        }
    }
    /**
     * @see modelo.Utilidad#verificarUsuario(String,String)
     * Testeo un con datos incorrectos
     */
    @Test
    public void testVerificarUsuario3() {
        try {
            String resp=  this.fixture
                .utilidad
                .verificarUsuario("asdass", "a");
                fail("No tira excpecion");
        } catch (UsuarioNoEncontradoException e) {
            
        }
    }
    /**
     * @see modelo.Utilidad#verificarUsuario(String,String)
     * Testeando un admin
     */
    @Test
    public void testVerificarUsuario4() {
        try {
            String resp=  this.fixture
                .utilidad
                .verificarUsuario(null, null);
            Assert.assertNull("Encontro un colaborador ",resp);
        } catch (UsuarioNoEncontradoException e) {
            fail("Fallo la busqueda de Admin");
        }
    }
    
}

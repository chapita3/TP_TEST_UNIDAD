package Test;

import java.util.Date;

import modelo.Cliente;

import modelo.Colaborador;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AdministradorTest3
{
    AdministradorTestFixture3 fixture1= new AdministradorTestFixture3();
    
    public AdministradorTest3()
    {
    }

    @Before
    public void setUp() throws Exception
    {
        fixture1.setUp();
    }

    @After
    public void tearDown() throws Exception
    {
        fixture1.tearDown();
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception
    {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception
    {
    }

    /**
     * @see modelo.Administrador#solicitarInformeCliente(modelo.Cliente,java.util.Date,java.util.Date)
     */
    @Test
    public void testSolicitarInformeCliente()
    {
        try
        {
            Cliente c1= new Cliente("Juan","juan@gmail.com","4324234","2121321312","123","grupo1");
            Date d1= new Date(118,10,1);
            Date d2= new Date(118,10,20);
            String resultado= fixture1.admin.solicitarInformeCliente(c1, d1, d2);
            String mensaje= "Tarea de Servicio | Total horas  | Importe \n";
            assertEquals("Informe incorrecto",mensaje,resultado);
        }
        catch( final Exception e )
        {
            fail("solicitarInformeCliente dispara excepcion");
        }
    }

    /**
     * @see modelo.Administrador#solicitarInformeColaboradorIntervalo(modelo.Colaborador,java.util.Date,java.util.Date)
     */
    @Test
    public void testSolicitarInformeColaboradorIntervalo()
    {
        try
        {
            Colaborador col1= new Colaborador("Pilar","pili@gmail.com","111111111","111A","1234","Colaborador");
            Date d1= new Date(118,10,1);
            Date d2= new Date(118,10,30);
            String resultado= fixture1.admin.solicitarInformeColaboradorIntervalo(col1, d1, d2);
            String mensaje= "Cliente  |  Tarea de servicio  | Total horas\n";
            assertEquals("Informe incorrecto",mensaje,resultado);
        }
        catch( final Exception e )
        {
            fail("solicitarInformeColaboradorIntervalo dispara excepcion");
        }
    }

    /**
     * @see modelo.Administrador#solicitarTareasEnCursoColaboradores()
     */
    @Test
    public void testSolicitarTareasEnCursoColaboradores()
    {
        try
        {
            String resultado= fixture1.admin.solicitarTareasEnCursoColaboradores();
            String mensaje= " Colaborador   |   Cliente  | Servicio  | Inicio    | Estado    | Horas accumuladas | \n";
            assertEquals("Informe incorrecto",mensaje,resultado);
        }
        catch( final Exception e )
        {
            fail("solicitarTareasEnCursoColaboradores dispara excepcion");
        }
    }
}

package Test;

import java.util.Date;

import modelo.Cliente;

import modelo.Colaborador;

import modelo.Servicio;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AdministradorTest2
{
    AdministradorTestFixture2 fixture1= new AdministradorTestFixture2();
    
    public AdministradorTest2()
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
    public void testSolicitarInformeCliente1()
    {
        try
        {
            Cliente c1= new Cliente("Juan","juan@gmail.com","4324234","2121321312","123","grupo1");
            Date d1= new Date(2018,10,1);
            Date d2= new Date(2018,10,20);
            String resultado= fixture1.admin.solicitarInformeCliente(c1, d1, d2);
            String mensaje= "Tarea de Servicio | Total horas  | Importe \n";
            assertEquals("Informe incorrecto",resultado,mensaje);
        }
        catch( final Exception e )
        {
            fail("solicitarInformeCliente dispara excepcion");
        }
    }
    
    /**
     * @see modelo.Administrador#solicitarInformeCliente(modelo.Cliente,java.util.Date,java.util.Date)
     */
    @Test
    public void testSolicitarInformeCliente2()
    {
        try
        {
            String resultado= fixture1.admin.solicitarInformeCliente(null, null, null);
            String mensaje= "Tarea de Servicio | Total horas  | Importe \n";
            assertEquals("Informe incorrecto",resultado,mensaje);
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
    public void testSolicitarInformeColaboradorIntervalo1()
    {
        try
        {
            Colaborador col1= new Colaborador("Pilar","pili@gmail.com","111111111","111A","1234","Colaborador");
            Date d1= new Date(2018,10,1);
            Date d2= new Date(2018,10,30);
            String resultado= fixture1.admin.solicitarInformeColaboradorIntervalo(col1, d1, d2);
            String mensaje= "Cliente  |  Tarea de servicio  | Total horas\n";
            assertEquals("Informe incorrecto",resultado,mensaje);
        }
        catch( final Exception e )
        {
            fail("solicitarInformeColaboradorIntervalo dispara excepcion");
        }
    }
    
    /**
     * @see modelo.Administrador#solicitarInformeColaboradorIntervalo(modelo.Colaborador,java.util.Date,java.util.Date)
     */
    @Test
    public void testSolicitarInformeColaboradorIntervalo2()
    {
        try
        {
            String resultado= fixture1.admin.solicitarInformeColaboradorIntervalo(null, null, null);
            String mensaje= "Cliente  |  Tarea de servicio  | Total horas\n";
            assertEquals("Informe incorrecto",resultado,mensaje);
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
            assertEquals("Informe incorrecto",resultado,mensaje);
        }
        catch( final Exception e )
        {
            fail("solicitarTareasEnCursoColaboradores dispara excepcion");
        }
    }

    /**
     * @see modelo.Administrador#crearCliente(String,String,String,String,String,String)
     */
    @Test
    public void testCrearCliente1()
    {
        try
        {
            int old= fixture1.admin.getBdd().getClientes().size();
            fixture1.admin.crearCliente("sandra", "sandra@gmail.com", "1", "2", "234", "grupo1");
            assertTrue("No se crea el cliente",fixture1.admin.getBdd().getClientes().size()==old+1);
        }
        catch( final Exception e )
        {
            fail("crearCliente lanza excepcion");
        }
    }
    
    /**
     * @see modelo.Administrador#crearCliente(String,String,String,String,String,String)
     */
    @Test
    public void testCrearCliente2()
    {
        try
        {
            int old= fixture1.admin.getBdd().getClientes().size();
            fixture1.admin.crearCliente(null, "sandra@gmail.com", "1", "2", "234", "grupo1");
            assertTrue("Se creo un cliente con nombre null",fixture1.admin.getBdd().getClientes().size()==old);
        }
        catch( final Exception e )
        {
            fail("crearCliente dispara excepcion");
        }
    }

     /**
      * @see modelo.Administrador#crearServicio(String,String,int)
      */
     @Test
     public void testCrearServicio1()
     {
         try
         {
             int old= fixture1.admin.getBdd().getServicios().size();
             fixture1.admin.crearServicio("Planchar", "Fijo", 20);
             assertTrue("No se crea el servicio",fixture1.admin.getBdd().getServicios().size()==old+1);
         }
         catch( final Exception e )
         {
             fail("crearServicio lanza excepcion");
         }
     }
     
     /**
      * @see modelo.Administrador#crearServicio(String,String,int)
      */
     @Test
     public void testCrearServicio2()
     {
         try
         {
             int old= fixture1.admin.getBdd().getServicios().size();
             fixture1.admin.crearServicio(null, "Fijo", -1);
             assertTrue("Se crea el servicio con nombre null y costo negativo",fixture1.admin.getBdd().getServicios().size()==old);
         }
         catch( final Exception e )
         {
             fail("crearServicio lanza excepcion");
         }
     }

     /**
      * @see modelo.Administrador#crearColaborador(String,String,String,String,String,String)
      */
     @Test
     public void testCrearColaborador1()
     {
         try
         {
             int old= fixture1.admin.getBdd().getColaboradores().size();
             fixture1.admin.crearColaborador("Leo", "leon@gmail.com", "1", "ASC", "qwe", "Colaborador");
             assertTrue("No se crea el colaborador",fixture1.admin.getBdd().getColaboradores().size()==old+1);
         }
         catch( final Exception e )
         {
             fail("crearColaborador lanza excepcion");
         }
     }
     
     /**
      * @see modelo.Administrador#crearColaborador(String,String,String,String,String,String)
      */
     @Test
     public void testCrearColaborador2()
     {
         try
         {
             int old= fixture1.admin.getBdd().getColaboradores().size();
             fixture1.admin.crearColaborador(null, "leon@gmail.com", "1", "ASC", "qwe", "Colaborador");
             assertTrue("Crea el colaborador con nombre null",fixture1.admin.getBdd().getColaboradores().size()==old);
         }
         catch( final Exception e )
         {
             fail("crearColaborador lanza excepcion");
         }
     }

    /**
     * @see modelo.Administrador#eliminarCliente(modelo.Cliente)
     */
    @Test
    public void testEliminarCliente1()
    {
        fixture1.setUp();
        try
        {
            int old= fixture1.admin.getBdd().getClientes().size();
            fixture1.admin.eliminarCliente(null);
            assertTrue("Elimina cliente null",fixture1.admin.getBdd().getClientes().size()==old);
        }
        catch( final Exception e )
        {
            fail("eliminarCliente lanza excepcion");
        }
    }
    
    /**
     * @see modelo.Administrador#eliminarCliente(modelo.Cliente)
     */
    @Test
    public void testEliminarCliente2()
    {
        try
        {
            fixture1.admin.eliminarCliente(new Cliente("Pepe","pepe@gmail.com","155555555","202020200","123","grupo2"));
            fail("No lanza excepcion por cliente no registrado en bdd");
        }
        catch( final Exception e )
        {
            fail("eliminarCliente no contempla la excepcion por cliente no registrado en bdd");
        }
    }

    /**
     * @see modelo.Administrador#eliminarServicio(modelo.Servicio)
     */
    @Test
    public void testEliminarServicio1()
    {
        try
        {
            int old= fixture1.admin.getBdd().getServicios().size();
            fixture1.admin.eliminarServicio(null);
            assertTrue("Elimina servicio null",fixture1.admin.getBdd().getServicios().size()==old);
        }
        catch( final Exception e )
        {
            fail("eliminarServicio lanza excepcion");
        }
    }
    
    /**
     * @see modelo.Administrador#eliminarServicio(modelo.Servicio)
     */
    @Test
    public void testEliminarServicio2()
    {
        try
        {
            fixture1.admin.eliminarServicio(new Servicio("Barrer","Fijo",10));
            fail("No lanza excepcion por servicio no registrado en bdd");
        }
        catch( final Exception e )
        {
            fail("eliminarServicio no contempla la excepcion de cliente no registrado en bdd");
        }
    }

    /**
     * @see modelo.Administrador#eliminarColaborador(modelo.Colaborador)
     */
    @Test
    public void testEliminarColaborador1()
    {
        try
        {
            int old= fixture1.admin.getBdd().getColaboradores().size();
            fixture1.admin.eliminarColaborador(null);
            assertTrue("Elimina colaborador null",fixture1.admin.getBdd().getColaboradores().size()==old);
        }
        catch( final Exception e )
        {
            fail("eliminarColaborador lanza excepcion");
        }
    }
    
    /**
     * @see modelo.Administrador#eliminarColaborador(modelo.Colaborador)
     */
    @Test
    public void testEliminarColaborador2()
    {
        try
        {
            fixture1.admin.eliminarColaborador(new Colaborador("Francisco","f@gmail.com","111111111","111A","1234","Colaborador"));
            fail("No lanza excepcion por colaborador no registrado en bdd");
        }
        catch( final Exception e )
        {
            fail("eliminarColaborador no contempla excepcion de colaborador no registrado en bdd");
        }
    }

    /**
     * @see modelo.Administrador#crearTarea(modelo.Servicio,modelo.Cliente,modelo.Colaborador)
     */
    @Test
    public void testCrearTarea()
    {
        
    }

    /**
     * @see modelo.Administrador#eliminarTarea(modelo.Tarea,modelo.Colaborador)
     */
    @Test
    public void testEliminarTarea()
    {
        fail("Unimplemented");
    }

    /**
     * @see modelo.Administrador#cerrarTarea(modelo.Tarea,modelo.Colaborador)
     */
    @Test
    public void testCerrarTarea()
    {
        fail("Unimplemented");
    }

    /**
     * @see modelo.Administrador#pausarTarea(modelo.Tarea,modelo.Colaborador)
     */
    @Test
    public void testPausarTarea()
    {
        fail("Unimplemented");
    }

    /**
     * @see modelo.Administrador#reanudarTarea(modelo.Tarea,modelo.Colaborador)
     */
    @Test
    public void testReanudarTarea()
    {
        fail("Unimplemented");
    }
}

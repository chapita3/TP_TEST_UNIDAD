package Test;

import java.util.Date;

import modelo.Cliente;

import modelo.Colaborador;

import modelo.Servicio;

import modelo.Tarea;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AdministradorTest1
{
    AdministradorTestFixture1 fixture1= new AdministradorTestFixture1();
    
    public AdministradorTest1()
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
            long horas= (d2.getTime() - d1.getTime())/3600000;
            String resultado= fixture1.admin.solicitarInformeCliente(c1, d1, d2);
            String mensaje= "Tarea de Servicio | Total horas  | Importe \n" + "Limpiar"+ " " + horas + " " + 100 + "\n";
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
            Cliente c2= new Cliente("Fran","fran@gmail.com","1234234","2134536546","222","grupo1");
            Date d1= new Date(2018,10,1);
            Date d2= new Date(2018,10,10);
            long horas= (d2.getTime() - d1.getTime())/3600000;
            double costo= (double) horas * 25;
            String resultado= fixture1.admin.solicitarInformeCliente(c2, d1, d2);
            String mensaje= "Tarea de Servicio | Total horas  | Importe \n" + "Cocinar"+ " " + horas + " " + costo + "\n";
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
    public void testSolicitarInformeCliente3()
    {
        try
        {
            Cliente c3= new Cliente("Pedro","pedro@gmail.com","1124234","0123212","443","grupo2");
            Date d1= new Date(2018,11,1);
            Date d2= new Date();
            long horas= (d2.getTime() - d1.getTime())/3600000;
            double costo= (double) horas * 50;
            String resultado= fixture1.admin.solicitarInformeCliente(c3, d1, d2);
            String mensaje= "Tarea de Servicio | Total horas  | Importe \n" + "Cocinar"+ " " + horas + " " + costo + "\n";
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
    public void testSolicitarInformeCliente4()
    {
        try
        {
            Cliente c1= new Cliente("Peter","peter@gmail.com","4324234","2121321312","123","grupo1");
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
    public void testSolicitarInformeCliente5()
    {
        try
        {
            Cliente c1= new Cliente("Juan","juan@gmail.com","4324234","2121321312","123","grupo1");
            Date d1= new Date(2018,9,1);
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
    public void testSolicitarInformeCliente6()
    {
        try
        {
            Cliente c1= null;
            Date d1= new Date(2018,10,1);
            Date d2= new Date(2018,10,20);
            String resultado= fixture1.admin.solicitarInformeCliente(c1, d1, d2);
            fail("No dispara excepcion por cliente null");
        }
        catch( final Exception e )
        {
           fail("solicitarInformeCliente no contempla la excepcion cliente nulo");
        }
    }
    
    /**
     * @see modelo.Administrador#solicitarInformeCliente(modelo.Cliente,java.util.Date,java.util.Date)
     */
    @Test
    public void testSolicitarInformeCliente7()
    {
        try
        {
            Cliente c1= new Cliente("Juan","juan@gmail.com","4324234","2121321312","123","grupo1");
            Date d1= null;
            Date d2= null;
            String resultado= fixture1.admin.solicitarInformeCliente(c1, d1, d2);
            fail("No dispara excepcion por fecha null");
        }
        catch( final Exception e )
        {
            fail("solicitarInformeCliente no contempla la excepcion por fechas nulas");
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
            long horas= (d2.getTime() - d1.getTime())/3600000;
            String resultado= fixture1.admin.solicitarInformeColaboradorIntervalo(col1, d1, d2);
            String mensaje= "Cliente  |  Tarea de servicio  | Total horas\n" + "Juan" + " " + "Limpiar" + " " + horas + "\n";
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
            Colaborador col1= new Colaborador("Peter","peter@gmail.com","111111111","111A","1234","Colaborador");
            Date d1= new Date(2018,10,1);
            Date d2= new Date(2018,10,20);
            long horas= (d2.getTime() - d1.getTime())/3600000;
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
    public void testSolicitarInformeColaboradorIntervalo3()
    {
        try
        {
            Colaborador col1= new Colaborador("Pilar","pili@gmail.com","111111111","111A","1234","Colaborador");
            Date d1= new Date(2018,9,1);
            Date d2= new Date(2018,10,20);
            long horas= (d2.getTime() - d1.getTime())/3600000;
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
    public void testSolicitarInformeColaboradorIntervalo4()
    {
        try
        {
            Colaborador col1= null;
            Date d1= new Date(2018,9,1);
            Date d2= new Date(2018,10,20);
            long horas= (d2.getTime() - d1.getTime())/3600000;
            String resultado= fixture1.admin.solicitarInformeColaboradorIntervalo(col1, d1, d2);
            fail("No dispara excepcion por colaborador null");
        }
        catch( final Exception e )
        {
            fail("solicitarInformeColaboradorIntervalo no contempla excepcion por colaborador null");
        }
    }
    
    /**
     * @see modelo.Administrador#solicitarInformeColaboradorIntervalo(modelo.Colaborador,java.util.Date,java.util.Date)
     */
    @Test
    public void testSolicitarInformeColaboradorIntervalo5()
    {
        try
        {
            Colaborador col1= new Colaborador("Peter","peter@gmail.com","111111111","111A","1234","Colaborador");
            Date d1= null;
            Date d2= null;
            long horas= (d2.getTime() - d1.getTime())/3600000;
            String resultado= fixture1.admin.solicitarInformeColaboradorIntervalo(col1, d1, d2);
            fail("No dispara excepcion por fecha null");
        }
        catch( final Exception e )
        {
            fail("solicitarInformeColaboradorIntervalo no contempla excepcion por fecha null");
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
            Date d1= new Date(2018,11,1);
            Date d2= new Date();
            long horas= (d2.getTime() - d1.getTime())/3600000;
            String resultado= fixture1.admin.solicitarTareasEnCursoColaboradores();
            String m1= "Guille" + " " + "Pedro" + " " + "Ordenar" + " " + d1 + " " + "abierta" + " " + horas + "\n";
            String mensaje= " Colaborador   |   Cliente  | Servicio  | Inicio    | Estado    | Horas accumuladas | \n" + m1;
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
        try
        {
            int old= fixture1.admin.getBdd().getClientes().size();
            fixture1.admin.eliminarCliente(fixture1.clientes.get(0));
            assertTrue("No elimina cliente",fixture1.admin.getBdd().getClientes().size()==old-1);
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
    public void testEliminarCliente3()
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
            fixture1.admin.eliminarServicio(fixture1.admin.getBdd().getServicios().get(0));
            assertTrue("No elimina servicio",fixture1.admin.getBdd().getServicios().size()==old-1);
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
    public void testEliminarServicio3()
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
            fixture1.admin.eliminarColaborador(fixture1.colaboradores.get(0));
            assertTrue("No elimina colaborador",fixture1.admin.getBdd().getColaboradores().size()==old-1);
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
    public void testEliminarColaborador3()
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
    public void testCrearTarea1()
    {
        try
        {
            int old=fixture1.colaboradores.get(3).getTareas().size();
            fixture1.admin.crearTarea(fixture1.admin.getBdd().getServicios().get(0), fixture1.clientes.get(3), fixture1.colaboradores.get(3));
            assertTrue("No se crea la tarea",fixture1.admin.getBdd().getColaboradores().get(2).getTareas().size()==old+1);
        }
        catch( final Exception e )
        {
            fail("crearTarea lanza excepcion");
        }
    }
    
    /**
     * @see modelo.Administrador#crearTarea(modelo.Servicio,modelo.Cliente,modelo.Colaborador)
     */
    @Test
    public void testCrearTarea2()
    {
        int old=fixture1.admin.getBdd().getColaboradores().get(1).getTareas().size();
        try
        {
            fixture1.admin.crearTarea(fixture1.admin.getBdd().getServicios().get(0), fixture1.admin.getBdd().getClientes().get(2), fixture1.admin.getBdd().getColaboradores().get(1));
            fail("No lanza excepcion por tarea abierta existente");
        }
        catch( final Exception e )
        {
            assertTrue("No lanza excepcion correcta",fixture1.admin.getBdd().getColaboradores().get(1).getTareas().size()==old);
        }
    }
    
    /**
     * @see modelo.Administrador#crearTarea(modelo.Servicio,modelo.Cliente,modelo.Colaborador)
     */
    @Test
    public void testCrearTarea3()
    {
        try
        {
            fixture1.admin.crearTarea(fixture1.admin.getBdd().getServicios().get(0), fixture1.clientes.get(3), null);
            fail("No lanza excepcion por colaborador null");
        }
        catch( final Exception e )
        {
            fail("crearTarea no contempla excepcion por colaborador null");
        }
    }
    
    /**
     * @see modelo.Administrador#crearTarea(modelo.Servicio,modelo.Cliente,modelo.Colaborador)
     */
    @Test
    public void testCrearTarea4()
    {
        try
        {
            fixture1.admin.crearTarea(fixture1.admin.getBdd().getServicios().get(0), fixture1.clientes.get(3), new Colaborador());
            fail("No lanza excepcion por colaborador no registrado en bdd");
        }
        catch( final Exception e )
        {
            fail("crearTarea no contempla excepcion por colaborador no registrado en bdd");
        }
    }

    /**
     * @see modelo.Administrador#eliminarTarea(modelo.Tarea,modelo.Colaborador)
     */
    @Test
    public void testEliminarTarea1()
    {
        try
        {
            Colaborador c=fixture1.colaboradores.get(1);
            int old= c.getTareas().size();
            fixture1.admin.eliminarTarea(c.getTareas().get(fixture1.clientes.get(1)), c);
            assertTrue("No se elimina la tarea",c.getTareas().size()==old-1);
        }
        catch( final Exception e )
        {
            fail("eliminarTarea lanza excepcion");
        }
    }
    
    /**
     * @see modelo.Administrador#eliminarTarea(modelo.Tarea,modelo.Colaborador)
     */
    @Test
    public void testEliminarTarea2()
    {
        try
        {
            fixture1.admin.eliminarTarea(new Tarea(new Servicio(),new Cliente(),new Colaborador()), null);
            fail("No lanza excepcion por colaborador null");
        }
        catch( final Exception e )
        {
            fail("eliminarTarea no contempla excepcion por colaborador null");
        }
    }
    
    /**
     * @see modelo.Administrador#eliminarTarea(modelo.Tarea,modelo.Colaborador)
     */
    @Test
    public void testEliminarTarea3()
    {
        try
        {
            fixture1.admin.eliminarTarea(new Tarea(new Servicio(),new Cliente(),new Colaborador()), new Colaborador());
            fail("No lanza excepcion por colaborador no registrado en bdd");
        }
        catch( final Exception e )
        {
            fail("eliminarTarea no contempla excepcion por colaborador no registrado en bdd");
        }
    }
    

    /**
     * @see modelo.Administrador#cerrarTarea(modelo.Tarea,modelo.Colaborador)
     */
    @Test
    public void testCerrarTarea1()
    {
        try
        {
            fixture1.admin.cerrarTarea(fixture1.tareas.get(2), fixture1.colaboradores.get(2));
            assertEquals("No se cierra la tarea","cerrada",fixture1.tareas.get(2).getEstado().devolverestado());
        }
        catch( final Exception e )
        {
            fail("cerrarTarea lanza excepcion");
        }
    }
    
    /**
     * @see modelo.Administrador#cerrarTarea(modelo.Tarea,modelo.Colaborador)
     */
    @Test
    public void testCerrarTarea2()
    {
        try
        {
            fixture1.admin.cerrarTarea(fixture1.tareas.get(0), null);
            fail("No lanza excepcion por colaborador null");
        }
        catch( final Exception e )
        {
            fail("cerrarTarea no contempla excepcion por colaborador null");
        }
    }
    
    /**
     * @see modelo.Administrador#cerrarTarea(modelo.Tarea,modelo.Colaborador)
     */
    @Test
    public void testCerrarTarea3()
    {
        try
        {
            fixture1.admin.cerrarTarea(fixture1.tareas.get(0), new Colaborador());
            fail("No lanza excepcion por colaborador no registrado en bdd");
        }
        catch( final Exception e )
        {
            fail("cerrarTarea no contempla excepcion por colaborador no registrado en bdd");
        }
    }

    /**
     * @see modelo.Administrador#pausarTarea(modelo.Tarea,modelo.Colaborador)
     */
    @Test
    public void testPausarTarea1()
    {
        try
        {
            fixture1.admin.pausarTarea(fixture1.tareas.get(3), fixture1.colaboradores.get(3));
            assertEquals("No se pausa la tarea","pausada",fixture1.tareas.get(3).getEstado().devolverestado());
        }
        catch( final Exception e )
        {
            fail("pausarTarea lanza excepcion");
        }
    }
    
    /**
     * @see modelo.Administrador#pausarTarea(modelo.Tarea,modelo.Colaborador)
     */
    @Test
    public void testPausarTarea2()
    {
        try
        {
            fixture1.admin.pausarTarea(fixture1.tareas.get(0), null);
            fail("No lanza excepcion por colaborador null");
        }
        catch( final Exception e )
        {
            fail("pausarTarea no contempla excepcion por colaborador null");
        }
    }
    
    /**
     * @see modelo.Administrador#pausarTarea(modelo.Tarea,modelo.Colaborador)
     */
    @Test
    public void testPausarTarea3()
    {
        try
        {
            fixture1.admin.pausarTarea(fixture1.tareas.get(0), new Colaborador());
            fail("No lanza excepcion por colaborador no registrado en bdd");
        }
        catch( final Exception e )
        {
            fail("pausarTarea no contempla excepcion por colaborador no registrado en bdd");
        }
    }

    /**
     * @see modelo.Administrador#reanudarTarea(modelo.Tarea,modelo.Colaborador)
     */
    @Test
    public void testReanudarTarea1()
    {
        try
        {
            fixture1.admin.reanudarTarea(fixture1.tareas.get(3), fixture1.colaboradores.get(3));
            assertEquals("No se reaunda la tarea","abierta",fixture1.tareas.get(3).getEstado().devolverestado());
        }
        catch( final Exception e )
        {
            fail("reanudarTarea lanza excepcion");
        }
    }
    
    /**
     * @see modelo.Administrador#reanudarTarea(modelo.Tarea,modelo.Colaborador)
     */
    @Test
    public void testReanudarTarea2()
    {
        try
        {
            fixture1.admin.reanudarTarea(fixture1.tareas.get(0), null);
            fail("No lanza excepcion por colaborador null");
        }
        catch( final Exception e )
        {
            fail("reanudarTarea no contempla excepcion por colaborador null");
        }
    }
    
    /**
     * @see modelo.Administrador#reanudarTarea(modelo.Tarea,modelo.Colaborador)
     */
    @Test
    public void testReanudarTarea3()
    {
        try
        {
            fixture1.admin.reanudarTarea(fixture1.tareas.get(0), new Colaborador());
            fail("No lanza excepcion por colaborador no registrado en bdd");
        }
        catch( final Exception e )
        {
            fail("reanudarTarea no contempla excepcion por colaborador no registrado en bdd");
        }
    }
}

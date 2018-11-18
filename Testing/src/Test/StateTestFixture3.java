package Test;

import modelo.CerradaState;
import modelo.Cliente;
import modelo.Colaborador;
import modelo.PausadaState;
import modelo.Servicio;
import modelo.State;
import modelo.Tarea;

public class StateTestFixture3
{
    Colaborador colab=new Colaborador();
    State t1;
    State t2;
    public StateTestFixture3()
    {
    }

    public void setUp()
    {
        Tarea t1=new Tarea(new Servicio("Investigar","Fijo",5200),new Cliente("Watson","Watson@gmail.com","34567","43902","52c52","grupo1"),colab);
        t1.setEstado(new CerradaState(t1));
    }

    public void tearDown()
    {
    }
}

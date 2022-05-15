package InterfacesImp;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import Interfaces.Multiplicacion;

public class ClienteImp {
    public void ConnectorServer() {
        try {
            int resultado;
            Registry registry = LocateRegistry.getRegistry("192.168.202.230", 9090);
            Multiplicacion multiplicacion = (Multiplicacion) registry.lookup("Multiplicacion");
            resultado = multiplicacion.multiplicacion(20, 100);
            System.out.println(resultado);
        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }
    }
}

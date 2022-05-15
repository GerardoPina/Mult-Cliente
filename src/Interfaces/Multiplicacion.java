package Interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Multiplicacion extends Remote {
    public int multiplicacion(int a, int b) throws RemoteException;

}

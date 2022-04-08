import java.rmi.*;
 
public interface Hello extends Remote {
   public int soma(int a, int b) throws RemoteException;
}


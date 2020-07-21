package remote;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl implements MyRemote {
  public MyRemoteImpl() {}

  public String sayHello() {
    return "Server says, 'Hey'";
  }

  public static void main(String[] args) {
    try {
      MyRemoteImpl obj = new MyRemoteImpl();
      MyRemote stub = (MyRemote) UnicastRemoteObject.exportObject(obj, 0);

      Registry registry = LocateRegistry.getRegistry("127.0.0.1",63411);
      registry.bind("sayHello", stub);
      
      System.out.println("Server is ready!");
    } catch (Exception e) {
      System.err.println("Server exception: " + e.toString());
      e.printStackTrace();
    }
  }
  
}
package remote;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyRemoteClient {

  private MyRemoteClient() {}

  public static void main(String[] args) {
    try {
      Registry registry = LocateRegistry.getRegistry("172.29.14.241", );
      System.out.println(registry);
      MyRemote stub = (MyRemote) registry.lookup("sayHello");
      String response = stub.sayHello();
      System.out.println("response: " + response);
    } catch (Exception e) {
      System.err.println("Clinet exception: " + e.toString());
      e.printStackTrace();
    }

  }
  
}
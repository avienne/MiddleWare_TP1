package client;

public class Client{
 	public static void main (String [] arg) throws Exception{
		service.FiboIfc s= (service.FiboIfc) java.rmi.Naming.lookup("rmi://134.214.202.121/"+service.FiboIfc.class.getName());
		System.out.println("Résultat : "+s.calcul(Integer.parseInt(arg[0])));
	}
}

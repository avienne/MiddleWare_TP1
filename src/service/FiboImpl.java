package service;

public class FiboImpl implements service.FiboIfc {

	public FiboImpl() throws java.rmi.RemoteException{
	
	} 
	public int calcul(int val)throws java.rmi.RemoteException{
		int val1=0,val2=1,val3=0;
		for (int i=0; i<val; i++){
			val3=val1+val2;
			val1=val2;
			val2=val3;
			System.out.println("val "+val3);
		}
		return val3;
	}

	public static void main(String arg[])throws Exception{
 		FiboIfc f = new FiboImpl();
 		FiboIfc stub=(FiboIfc) java.rmi.server.UnicastRemoteObject.exportObject(f,0);
		java.rmi.Naming.bind(FiboIfc.class.getName(), stub);
	}
}

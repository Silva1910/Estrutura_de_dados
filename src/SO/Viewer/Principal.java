package SO.Viewer;

import SO.Controller.*;

public class Principal {

	public static void main(String[] args) {
		Controller op = new Controller();
		
		int[] vetor1 =  new int[1000];
		int[] vetor2 = new int[10000];
		int[] vetor3 = new int[100000];
		
	op.vt1(vetor1); 
	op.vt2(vetor2);
	op.vt3(vetor3);
		
	
	}


}

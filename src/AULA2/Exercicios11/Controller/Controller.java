package AULA2.Exercicios11.Controller;

public class Controller {

	public Controller() {
		super ();
	}
	public int Controller(int n){
		   if (n == 1) {
	            return 1;
	        } else {
	            return n *Controller(n - 1);
	        }
	    }

	    public double serie(int n) {
	        if (n == 1) {
	            return 1.0;
	        } else {
	            return 1.0/Controller(n) + serie(n-1);
	        }
	    }
	}
	

		



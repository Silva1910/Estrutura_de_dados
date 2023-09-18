package Aula6.Exercicio3.Controller;

import javax.swing.JOptionPane;

import model.PilhaInteiros;

public class NPRController {

	

	public static void InsereValor (PilhaInteiros P, int valor1, int valor2) { 
		
		P.push(valor1);
		P.push(valor2);
		
	} 
public static void Operacao(String Sinal, PilhaInteiros P, int valor1, int valor2) throws Exception{
		int resultado;

		if (P.size() >= 2) {
			switch (Sinal) {
			case "+":

				resultado = P.top();
				P.pop();
				resultado += P.top();
				P.pop();
				P.push(resultado);
				JOptionPane.showMessageDialog(null, " o resultado da operacao   " + resultado);
				break;
			case "-":
			    valor2 = P.top();
			    P.pop();
			    valor1 = P.top();
			    P.pop();
			    P.push(valor1 - valor2);
			    JOptionPane.showMessageDialog(null, "O resultado da operação é: " + P.top());
			    break;
			    case "*":
				

				resultado = P.top();
				P.pop();
				resultado *= P.top();
				P.pop();
				P.push(resultado);
				JOptionPane.showMessageDialog(null, " o resultado da operacao  " + resultado);

				break;
			case "/":
			    int divisor = P.top();
			    P.pop();
			    int dividendo = P.top();
			    P.pop();
			    if (divisor == 0) {
			        JOptionPane.showMessageDialog(null, "Erro: Divisão por zero!");
			        System.exit(0);
			    } else {
			        P.push(dividendo / divisor);
			        JOptionPane.showMessageDialog(null, "O resultado da operação é: " + P.top());
			    }
			    
                 break;
			
			default:
				JOptionPane.showMessageDialog(null, "Operação inválida.");
				
			}
		}else {
			JOptionPane.showMessageDialog(null, "numeros para operacao insufucientes");
			System.exit(0);
		}

	}
 
	
}

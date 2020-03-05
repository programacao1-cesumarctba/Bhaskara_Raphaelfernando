package com.fernando.raphael.Bhaskara;
 //O delta é B ao quadrado - quatro *  A * C//
public class Bhaskara {
	public Bhaskara(int ValA, int ValB, int ValC){
		float Delta  = caclDelta(ValA, ValB, ValC);
		Float CalcX1 = calcX(ValA, ValB, ValC, Delta);
		Float CalcX2 = calcX2(ValA, ValB, ValC, Delta);
		
		if(Delta > 0) {
			System.out.print("o valor de X1 é: ");
			System.out.println(CalcX1);
			System.out.print("o valor de X2 é: ");
			System.out.println(CalcX2);
			
		}else {
			System.out.println("Delta Negativo.");
		}
	}
	
	private float caclDelta(int ValA, int ValB, int ValC){
		return ((ValB * ValB) - 4 * (ValA * ValC));
	}
	private Float calcX (int ValA, int ValB, int ValC, float Delta) {
		return (+ ValB + Delta / (2 * ValA));
		
	}
	private Float calcX2 (int ValA, int ValB, int ValC, float Delta) {
		return (- ValB + Delta / (2 * ValA));
		
	}
	private String classificacao(float Delta) {
		if (Delta < 0) {
			return "A equação do segundo grau não possui raízes reais";
		}else if(Delta == 0){
			return " A equação do segundo grau possui uma raiz real.";
		}else if(Delta > 0) {
			return "A equação do segundo grau possui duas raízes reais.";
		}
		return "Indefinido";
	}
}

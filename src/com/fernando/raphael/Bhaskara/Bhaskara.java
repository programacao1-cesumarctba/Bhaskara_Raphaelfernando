package com.fernando.raphael.Bhaskara;
 //O delta � B ao quadrado - quatro *  A * C//
public class Bhaskara {
	public Bhaskara(int ValA, int ValB, int ValC){
		float Delta  = caclDelta(ValA, ValB, ValC);
		Float CalcX1 = calcX(ValA, ValB, ValC, Delta);
		Float CalcX2 = calcX2(ValA, ValB, ValC, Delta);
		
		if(Delta > 0) {
			System.out.print("o valor de X1 �: ");
			System.out.println(CalcX1);
			System.out.print("o valor de X2 �: ");
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
			return "A equa��o do segundo grau n�o possui ra�zes reais";
		}else if(Delta == 0){
			return " A equa��o do segundo grau possui uma raiz real.";
		}else if(Delta > 0) {
			return "A equa��o do segundo grau possui duas ra�zes reais.";
		}
		return "Indefinido";
	}
}

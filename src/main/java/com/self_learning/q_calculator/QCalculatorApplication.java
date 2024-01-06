package com.self_learning.q_calculator;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QCalculatorApplication {

	public String getGreeting() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		// System.out.println(new App().getGreeting());
		// StandardCalculator calc = new StandardCalculator();
		// calc.add(Double.MAX_VALUE, Double.MAX_VALUE);
		// calc.subtract(13, 11);
		// calc.multiply(10.0, 20.5);
		// calc.divide(17.0, 3.0);
		// calc.getResult();
		try {
			System.out.println(new QCalculatorApplication().getGreeting());
			StandardCalculator calc = new StandardCalculator();
			calc.add(Double.MAX_VALUE, Double.MAX_VALUE);
			calc.add(2, 3);
			// calc.subtract(13, 11);
			calc.subtract(-Double.MAX_VALUE, Double.MAX_VALUE);
			calc.multiply(10.0, 20.5);
			calc.divide(17.0, 3.8);
			calc.getResult();
		} catch (ArithmeticException e) {
			System.out.print(e);
		}
	}
}

package com.self_learning.q_calculator;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QCalculatorApplication {

	public static void main(String[] args) {
		// SpringApplication.run(QCalculatorApplication.class, args);
		// System.err.println("QCalculatorApplication");

		StandardCalculator calc = new StandardCalculator();
		calc.add(34, 7);
		calc.subtract(13, 11);
		calc.multiply(10, 20);
		calc.divide(17, 3);
		calc.getResult();
	}
}

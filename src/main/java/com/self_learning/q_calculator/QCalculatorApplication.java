package com.self_learning.q_calculator;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QCalculatorApplication {

	public String getGreeting() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		System.out.println(new QCalculatorApplication().getGreeting());
		StandardCalculator calc = new StandardCalculator();
		calc.add(13, 11);
		calc.subtract(13, 11);
		calc.multiply(10.0, 20.5);
		calc.divide(17.0, 3.0);
		calc.getResult();
	}
}

package quiz05;

public class Computer extends Calculator {


	double circle(int a) {

	   
	   System.out.println("컴퓨터의 원넓이 구하기? ");
		
		return a * a *Math.PI ;
	}

	double rect(double a) {
		
		System.out.println("정사각형의 넓이는? ");
		return a*a;
	}

	double rect(double a, double b) {
		
		System.out.println("직사각형의 넓이는? ");
		return a*b;
	}

	double rect(double a, double b, double c) {
		
		System.out.println("직육면체의 부피는? ");
		return a*b*c;
	}

}

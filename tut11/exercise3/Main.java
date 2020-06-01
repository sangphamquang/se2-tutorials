package tut11.exercise3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stdn = sc.nextLine();
		String wk = sc.nextLine();
		String[] students = stdn.split(" ");
		String[] workers = wk.split(" ");
		
		Student  s = new Student(students[0], students[1], students[2]);
		Worker w = new Worker(workers[0], workers[0], Double.parseDouble(workers[0]), Double.parseDouble(workers[0]));
		System.out.println(s.toString());
		System.out.println(w.toString());
	}

}

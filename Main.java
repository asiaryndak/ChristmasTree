package pl.pgs.tree;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner odczyt = new Scanner(System.in);
		
		System.out.println("Podaj wysokosc choinki: ");
		int height = odczyt.nextInt();
		
		System.out.println("Wprowadz znak do zbudowania choinki: ");
		String sign = odczyt.next();
				
		System.out.println("Podaj kierunek :\nup\ndown\nright\nleft\n");
		String direction = odczyt.next();
		
		
		
		TreeCreator tree=new TreeCreator();
	
		System.out.println(tree.tree(height,sign, direction));
		
		odczyt.close();
		

	}

}
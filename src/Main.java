//Para ler texto at� quebra de linha

//import java.util.Scanner;

//public class Main {

//public static void main(String[] args) {

//Scanner sc = new Scanner(System.in);

//String s1, s2, s3;

//s1 = sc.nextLine();
//s2 = sc.nextLine();
//s3 = sc.nextLine();

//System.out.println("DADOS DIGITADOS:");
//System.out.println(s1);
//System.out.println(s2);
//System.out.println(s3);

//sc.close();
//}
//}

//______________________________________________________
//Aten��o: quebra de linha pendente com resolu��o

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}
}

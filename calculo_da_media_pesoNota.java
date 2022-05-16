import java.util.Scanner;
public class calculo_da_media_pesoNota{ 
	
		public static void main(String[] args)
	    {
	    Scanner ler = new Scanner(System.in);
	    float AC1,AC2,AG,AF; //Criado 4 variaveis referetes as 4 avaliacoes

	      System.out.printf("Digite sua nota na AC1 "); // Pedi para o usuario digitar a nota dele na AC1
	        AC1 = ler.nextFloat(); // pedi para ele ler AC1
	     System.out.printf("Digite sua nota na AC2 "); // Pedi para o usuario digitar a nota dele na AC2  
	        AC2 = ler.nextFloat(); // pedi para ele ler AC2
	      System.out.printf("Digite sua nota na AG "); // Pedi para o usuario digitar a nota dele na AG  
	        AG = ler.nextFloat(); // pedi para ele ler AG
	     System.out.printf("Digite sua nota na AF "); // Pedi para o usuario digitar a nota dele na AF  
	        AF = ler.nextFloat();  // pedi para ele ler AF

	    double media = ((AC1 * 0.15)  + (AC2 *  0.3) + (AG * 0.1 ) + (AF * 0.45)); //Calculei a media de acordo com o peso de cada nota
	    System.out.printf("Sua media e: %f\n",media); // exibi a media do usuario
	    if (media > 5) // Se a media for maior que 5 
	    {
	    System.out.println("Voce foi aprovado!!!"); // Se a media for maior que 5 exibir esta menssagem
	    }
	    else
	    System.out.println("Voce foi reprovado:("); // Se a media for menor que 5 exibir esta menssagem

	    System.out.println("\n (AC1 = 1.5 pontos - AC2 = 3.0 pontos - AG = 1.0 pontos - AF = 4.5 pontos)");

	    }
	}



import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        System.out.println("CALCULADORA");

        int opcao;
        do {
            System.out.println("1-Somar");
            System.out.println("2-Subtrair");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("O que voce deseja fazer? (0 para sair): ");

            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();

            processar(opcao);
        } while (opcao != 0);        
    }
    public static void processar(int opcao) {
        Scanner scanner = new Scanner(System.in);

        switch(opcao) {
            case 1: {                
                System.out.println("SOMANDO DOIS NUMEROS");

                System.out.println("Digite o primeiro numero: ");
                int numero1 = scanner.nextInt();

                System.out.println("Digite o segundo numero: ");
                int numero2 = scanner.nextInt();
                int soma = numero1 + numero2;

                System.out.println("A soma dos dois numeros é: " + soma);                
                break;
            }
            case 2: {               
                System.out.println("SUBTRAINDO DOIS NUMEROS");

                System.out.println("Digite o primeiro numero: ");
                int numero1 = scanner.nextInt();

                System.out.println("Digite o segundo numero: ");
                int numero2 = scanner.nextInt();

                int subtracao = numero1 - numero2;
                System.out.println("A subtraçao dos dois numeros é: " + subtracao);
                break;
            }
            case 3: {
                
                System.out.println("MULTIPLICANDO DOIS NUMEROS");

                System.out.println("Digite o primeiro numero: ");
                int numero1 = scanner.nextInt();

                System.out.println("Digite o segundo numero: ");
                int numero2 = scanner.nextInt();

                int multi = numero1 * numero2;
                System.out.println("A o resultado da multipliçao é: " + multi);
                break;
            }
            case 4: {
               
                System.out.println("DIVIDINDO DOIS NUMEROS");

                System.out.println("Digite o primeiro numero: ");
                float numero1 = scanner.nextFloat();

                System.out.println("Digite o segundo numero");
                float numero2 = scanner.nextFloat();

                if (numero2 == 0){
                    System.out.println("Em uma divisao o denominador nao pode ser 0");
                }else {
                    Float divi = numero1 / numero2;
                    System.out.println("O resultado da divisao é: " + divi);
                    break;
                }
                
            }
        }
    }
}

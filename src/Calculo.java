import java.util.Scanner;

public class Calculo {

    public static void main(String[] args) {

        Scanner primeiroDigito = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int primeiroNumero = primeiroDigito.nextInt();

        Scanner segundoDigito = new Scanner(System.in);
        System.out.println("Digite o segundo numero");
        int segundoNumero = segundoDigito.nextInt();

        Scanner operador = new Scanner(System.in);
        System.out.println("digite a operacao matematica que dejesa fazer: ");
        String operacaoMatematica = operador.next();


        switch (operacaoMatematica) {
            case "+" :
                int resultadoSoma = primeiroNumero + segundoNumero;
                System.out.println("O valor da soma e "+resultadoSoma);
                break;
            case "-":
                float resultadoSubtracao = primeiroNumero - segundoNumero;
                System.out.println("O valor da subtracao e "+resultadoSubtracao);
                break;
            case "/":
                double resultadoDivisao = primeiroNumero / segundoNumero;
                System.out.println("O valor da divisao e "+resultadoDivisao);
                break;
            case "*" :
                int resultadoMultiplicacao = primeiroNumero * segundoNumero;
                System.out.println("O valor da multiplicacao e "+resultadoMultiplicacao);
                break;
        }
    }

}

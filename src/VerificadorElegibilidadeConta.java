import java.util.Scanner;

public class VerificadorElegibilidadeConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();

        // TODO: Verificar se a idade do cliente
        if(idade >=18){
            // TODO: Se >= 18, imprimir "Voce esta elegivel para criar uma conta bancaria."
            System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        }else{
            // TODO: Caso contrário, imprimir "Voce nao esta elegivel para criar uma conta bancaria."
            System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
        }



        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
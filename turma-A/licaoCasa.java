import java.util.Scanner;
public class licaoCasa {
    public static void main(String[] args) {


        // DESAFIO PROPOSTO EM CASA.
        // DDD = só capitais!
        /* 
        int DDD;
        Scanner entrada = new Scanner(System.in);
        System.out.println("DDD: ");
        DDD = entrada.nextInt();

        switch (DDD){

            case 68:
            System.out.println("Acriano.");
            break;

            case 82:
            System.out.println("Alagoano.");
            break;

            case 96:
            System.out.println("Amapaense.");
            break;

            case 92:
            System.out.println("Amazonense.");
            break;

            case 71:
            System.out.println("Baiano.");
            break;

            case 85:
            System.out.println("Cearense.");
            break;

            case 61:
            System.out.println("Brasiliense.");
            break;

            case 27:
            System.out.println("Capixaba.");
            break;

            case 62:
            System.out.println("Goiano.");
            break;

            case 98:
            System.out.println("Maranhense.");
            break;

            case 65:
            System.out.println("Mato-Grossense.");
            break;

            case 67:
            System.out.println("Sul-Mato-Grossense.");
            break;

            case 31:
            System.out.println("Mineiro.");
            break;

            case 91:
            System.out.println("Paraense.");
            break;

            case 83:
            System.out.println("Paraibano.");
            break;

            case 41:
            System.out.println("Paranaense.");
            break;

            case 81:
            System.out.println("Pernambucano.");
            break;

            case 86:
            System.out.println("Piauiense.");
            break;

            case 21:
            System.out.println("Fluminense.");
            break;

            case 84:
            System.out.println("Potiguar.");
            break;

            case 51:
            System.out.println("Gaúcho.");
            break;

            case 69:
            System.out.println("Rondoniano.");
            break;

            case 95:
            System.out.println("Roraimense.");
            break;

            case 47:
            System.out.println("Catarinense.");
            break;

            case 11:
            System.out.println("Paulista.");
            break;

            case 79:
            System.out.println("Sergipano.");
            break;

            case 63:
            System.out.println("Tocantinense.");
            break;

            default:
            System.out.println("Este DDD não está configurado.");
        }
    }
    */

    int numDirecao;
    int i = 1;

    System.out.println("Digite 1 para direita, 2 para esquerda, 3 para passar o viaduto a frente, 4 para esperar o sinal, 5 para continuar indo reto.");

    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite qual direção você deseja começar.");
    numDirecao  = entrada.nextInt();  

    while (i < 6)
        if (numDirecao == 1) {
            System.out.println("Pra já!");
            numDirecao  = entrada.nextInt();  
        }else if (numDirecao == 2) {
            System.out.println("Esquerdei e agora?");
            numDirecao  = entrada.nextInt(); 
        }else if (numDirecao == 3) {
            System.out.println("Eita pipoco. Zummm!");
            numDirecao  = entrada.nextInt(); 
        }else if (numDirecao == 4) {
            System.out.println("Ok!");
            numDirecao  = entrada.nextInt(); 
        }else if (numDirecao == 5) {
            System.out.println("Pronto e agora!");
            numDirecao  = entrada.nextInt(); 
        }else {
            System.out.println("Entrada inválida.");
            bre
        }

    }
}

    
import java.util.Scanner;
public class aula01 {
    public static void main(String[] args) {

        /* double abacaxi = 7.30;
        double maca = 2;
        double pera = 3;
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite quanto abacaxis você deseja: ");
        abacaxi *= entrada.nextInt();
        System.out.println("Digite quanto maçãs você deseja: ");
        maca *= entrada.nextInt();
        System.out.println("Digite quanto pêras você deseja: ");
        pera *= entrada.nextInt();

         double resultado = abacaxi + maca + pera;
         System.out.println("O valor total é:" + resultado);
         */

         // COMPARAÇÕES LÓGICAS
        
         /* Scanner entrada = new Scanner(System.in);

         int a, b;
         System.out.println("Digite o primeiro valor: ");
         a = entrada.nextInt();
         System.out.println("Digite o segundo valor: ");
         b = entrada.nextInt();
        
         if(a == b) {
            System.out.println("Os valores são iguais.");
         } else {
            System.out.println("Os valores não são iguais.");
         }
        
         -------------------------------------------------------------
        Scanner entrada = new Scanner(System.in);

        int a;
         System.out.println("Digite a sua idade: ");
         a = entrada.nextInt();
        
         if(a >= 18) {
            System.out.println("É maior de idade.");
         } else {
            System.out.println("É menor de idade.");
         }
        
         -------------------------------------------------------

          Scanner entrada = new Scanner(System.in);

         int a, b;
         System.out.println("Digite a primeira idade: ");
         a = entrada.nextInt();
         System.out.println("Digite a segunda idade: ");
         b = entrada.nextInt();
        
         if(a == b) {
            System.out.println("Idades iguais.");
         } else if( a > b) {
            System.out.println("O primeiro é mais velho");
         } else {
            System.out.println("O segundo é mais velho.");
         }
    ----------------------------------------------------------
       boolean chuva;
       boolean nublado;
       boolean sol;
       Scanner entrada = new Scanner(System.in);

       System.out.println("Está chovendo? ");
       chuva = entrada.nextBoolean();
       System.out.println("Está nublado? ");
       nublado = entrada.nextBoolean();
       System.out.println("Está ensolarado?");
       sol = entrada.nextBoolean();

       if(chuva == true || nublado == true) {
        System.out.println("Está chovendo ou nublado.");
       }else {
        System.out.println("Está ensolarado.");
       }
       */

       // ?????????
       /* Scanner entrada = new Scanner(System.in);

       String tempo;
       System.out.println("Como está o clima? ");
       tempo = entrada.nextLine();

       if(tempo.equals("chuva") == 0){
        System.out.println("Está chovendo.");
       }else if(tempo.equals("nublado") == 0){
        System.out.println("Está nublado.");
       }
       
       -------------------------------------------------

       Scanner entrada = new Scanner(System.in);

       boolean chuva;
       boolean guardaChuva;

       System.out.println("Está chovendo? ");
       chuva = entrada.nextBoolean();
       System.out.println("Trouxe guarda-chuva? ");
       guardaChuva = entrada.nextBoolean();


       if(chuva == true && guardaChuva == true) {
        System.out.println("Está chovendo/ Trouxe guarda-chuva.");
       }else if(chuva == true && guardaChuva == false) {
        System.out.println("Está chovendo/ Não trouxe guarda-chuva.");
       }
    
    ------------------------------------------------------------------------------

    String opcao;
    Scanner entrada = new Scanner(System.in);

    System.out.println("Qual operação você deseja fazer?");
    System.out.println("||| A - DEPOSITO /n B - SAQUE /n C - EMPRÉSTIMO|||");
    opcao = entrada.nextLine();

    switch (opcao) {
        case "a":
        System.out.println("Você escolheu a opção Deposito, siga...");
        break;
        case "b":
        System.out.println("Você escolheu a opção Saque, siga...");
        break;
        case "c":
        System.out.println("Você escolheu a opção Empréstimo, siga...");
        break;
        default:
        System.out.println("Digite uma opção válida.");

    }

    ----------------------------------------------------------------------------

    int num ;

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite um número: ");
    num = entrada.nextInt();

    if(num%3 == 0 || num%5 == 0) {
        System.out.println("VERDADEIRO.");
    }else {
        System.out.println("FALSO.");
    }
    */


    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valorfck = 0;
        double ValorTotal = 0;
        double preco;
        int a = 99;
        Scanner leitor = new Scanner(System.in);  
        
 for ( int i = 0;  a != -666 ; i++ ) {
     System.out.println("Escreva a estrutura desejada:");
     System.out.println("digite 1 para Baldrame");
     System.out.println("digite 2 para Pilar");
     System.out.println("digite 3 para Calcada");
     System.out.println("digite 0 para finalizar");   
	 a = leitor.nextInt();
        switch (a) {
            case 1: // inicio Baldrame
                System.out.println("voce escolheu Baldrame: ");             
                //Armazenar valor do FCK escolhido
                System.out.println("Escolha a Resistencia do Concreto: \n 1 - Fck 15 Mpa \n 2 - Fck 18 Mpa \n 3 - Fck 20 Mpa \n 4 - Fck 25 Mpa");
                Scanner leitorfckb = new Scanner(System.in);
                int b = leitorfckb.nextInt();               
                switch (b) {
                    case 1:
                        valorfck = 454.78;
                        break;
                    case 2:
                        valorfck = 471.61;
                        break;
                    case 3:
                        valorfck = 543.02;
                        break;
                    case 4:
                        valorfck = 578.87;
                        break;
                    default:
                        System.out.println("opcao invalida");
                        break;      
                } 
                
                Baldrame baldrame = new Baldrame();
                
                //Entrada dos Dados
                Scanner scan = new Scanner(System.in);
                System.out.println("escreva a largura: (cm)");
                baldrame.largura = scan.nextDouble();
                System.out.println("escreva a altura: (cm)");
                baldrame.altura = scan.nextDouble();
                System.out.println("escreva o comprimento (metros)");
                baldrame.comprimento = scan.nextDouble();
                System.out.println("Consumo de Concreto em m(cubicos):");
                
                //Calculo e Saidas
                System.out.println(baldrame.calculo());                
                preco = baldrame.calculo() * valorfck;    
                System.out.println("Valor da Estrutura R$ "  + preco + "\n");  
                
              //Somatorio do valor das estuturas
                ValorTotal = ValorTotal + preco;              
                break; // fim Baldrame
                
                
                

            case 2: // Pilar
                System.out.println("voce escolheu Pilar");
                System.out.println("Escolha a Resistencia do Concreto: \n 1 - Fck 15 Mpa \n 2 - Fck 18 Mpa \n 3 - Fck 20 Mpa \n 4 - Fck 25 Mpa");
                Scanner leitorfckp = new Scanner(System.in);
                int p = leitorfckp.nextInt();
                switch (p) {
                    case 1:
                        valorfck = 454.78;
                        break;
                    case 2:
                        valorfck = 471.61;
                        break;
                    case 3:
                        valorfck = 543.02;
                        break;
                    case 4:
                        valorfck = 578.87;
                        break;
                    default:
                        System.out.println("opcao invalida");
                        break;
                } //Valor de cada fck

                    Pilar pilar = new Pilar();

                    //Entrada dos Dados
                    Scanner scanp = new Scanner(System.in);
                    System.out.println("escreva a largura: (cm)");
                    pilar.largura = scanp.nextDouble();
                    System.out.println("escreva a altura: (cm)");
                    pilar.altura = scanp.nextDouble();
                    System.out.println("escreva o comprimento (metros)");
                    pilar.comprimento = scanp.nextDouble();
                    System.out.println("Consumo de Concreto em m(cubicos):");

                    //Calculo e Saidas
                    System.out.println(pilar.calculo());
                    preco = pilar.calculo() * valorfck;
                    System.out.println("Valor da Estrutura R$ " + preco + "\n");

                    //Somatorio do valor das estuturas
                    ValorTotal = ValorTotal + preco;
                    break; // fim Pilar

                case 3: // Calcada
                    System.out.println("voce escolheu Calcada");
                    System.out.println("Escolha a Resistencia do Concreto: \n 1 - Fck 15 Mpa \n 2 - Fck 18 Mpa \n 3 - Fck 20 Mpa \n 4 - Fck 25 Mpa");
                    Scanner leitorfckc = new Scanner(System.in);
                    int c = leitorfckc.nextInt();
                    switch (c) {
                        case 1:
                            valorfck = 454.78;
                            break;
                        case 2:
                            valorfck = 471.61;
                            break;
                        case 3:
                            valorfck = 543.02;
                            break;
                        case 4:
                            valorfck = 578.87;
                            break;
                        default:
                            System.out.println("opcao invalida");
                            break;
                    }

                    Calcada calcada = new Calcada();

                    //Entrada dos Dados
                    Scanner scanc = new Scanner(System.in);
                    System.out.println("escreva a area m(quadrados)");
                    calcada.area = scanc.nextDouble();
                    System.out.println("escreva a altura: (cm)");
                    calcada.altura = scanc.nextDouble();
                    System.out.println("Consumo de Concreto em m(cubicos):");

                    //Calculo e Saidas
                    System.out.println(calcada.calculo());
                    preco = calcada.calculo() * valorfck;
                    System.out.println("Valor da Estrutura R$ " + preco + "\n");

                    //Somatorio do valor das estuturas
                    ValorTotal = ValorTotal + preco;
                    break; // fim Calcada

                case 0: // Finalizar + Calculo do Total
                    System.out.println("Valor Total das Estruturas:");
                    System.out.println("R$ " + ValorTotal);
                    System.exit(0);

                    //Caso outra
                default:
                    System.out.println("opcao invalida");
                    break;


            }//Fim Switch Global
        }//Fim estrutura de repetição
        leitor.close();
    }//Fim Main
}

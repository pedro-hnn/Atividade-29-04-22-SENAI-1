import java.util.Scanner;

public class Main {

    public static int SelecaoTexto(){
        int selecao;
        while(true){
            try{
                System.out.println("1\t\t=>\t\tLer 5 Numeros\n" +
                        "2\t\t=>\t\tRecebe 4 notas e envia média do aluno\n" +
                        "3\t\t=>\t\tRecebe uma lista de 20 digitos e separa os pares dos impares\n" +
                        "0\t\t=>\t\tFECHA O PROGRAMA\n\n");

                System.out.print("Digite sua opção: ");
                selecao = new Scanner(System.in).nextInt();

                if (selecao < 0) {
                    System.out.println("\n\nDigite uma opção VÁLIDA!\n\n");
                    continue;
                } else if (selecao > 3) {
                    System.out.println("\n\nDigite uma opção VÁLIDA!\n\n");
                    continue;
                }else{
                    break;
                }


            } catch (Exception e) {
                System.out.println("\n\nDigite uma opção VÁLIDA!\n\n");
                continue;
            }
        }
        return selecao;

    }

    public static void main(String[] args) {
        System.out.println("Atividade SENAI 29/4/2022 - Tarefa de Arrays/vetores - Curso: Desenvolvedor Java Vespertino\n\n");

        int num1,num2,num3,num4,num5;
        Double num1_double,num2_double,num3_double,num4_double;

        Boolean run = true;
        while(run){
            int selecionado = SelecaoTexto();

            switch (selecionado) {
                case 1:
                    System.out.print("\n\nDigite o primeiro número = ");
                    num1 = new Scanner(System.in).nextInt();
                    System.out.print("\n\nDigite o segundo número = ");
                    num2 = new Scanner(System.in).nextInt();
                    System.out.print("\n\nDigite o terceiro número = ");
                    num3 = new Scanner(System.in).nextInt();
                    System.out.print("\n\nDigite o quarto número = ");
                    num4 = new Scanner(System.in).nextInt();
                    System.out.print("\n\nDigite o quinta número = ");
                    num5 = new Scanner(System.in).nextInt();

                    System.out.println("\n\n");
                    Funcoes.Ler5Numeros(num1,num2,num3,num4,num5);
                    System.out.println("\n\n");
                    continue;

                case 2:
                    System.out.println("\n\nDigite quatro números:");
                    System.out.print("\n\nPrimeira Nota: ");
                    num1_double = new Scanner(System.in).nextDouble();
                    System.out.print("\n\nSegunda Nota: ");
                    num2_double = new Scanner(System.in).nextDouble();
                    System.out.print("\n\nTerceira Nota: ");
                    num3_double = new Scanner(System.in).nextDouble();
                    System.out.print("\n\nQuarta Nota: ");
                    num4_double = new Scanner(System.in).nextDouble();
                    System.out.println("\n\n" + Funcoes.EnviaMedia(num1_double,num2_double,num3_double,num4_double) + "\n\n");
                    continue;

                case 3:
                    System.out.println("\n\nDigite os 20 digitos da lista:");
                    Integer[] lista = new Integer[20];
                    for(int i = 0; i < 20; i++){
                        System.out.print("Num"+(i+1)+" = ");
                        lista[i] = new Scanner(System.in).nextInt();
                    }

                    System.out.println("\n\nLista de números pares = "+ Funcoes.RetornaPares(lista));
                    System.out.println("Lista de números impares = "+ Funcoes.RetornaImpares(lista)+"\n\n");
                    continue;

                case 0:
                    run = false;
                    break;
            }
        }
    }
}

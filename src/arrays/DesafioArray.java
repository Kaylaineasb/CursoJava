package arrays;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        double soma=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Quantas notas você deseja informar? ");
        int qtdnotas = input.nextInt();
        double[] notas = new double[qtdnotas];
        for (int i=0;i<notas.length;i++){
            System.out.println("Informe a "+(i+1)+" nota");
            notas[i]= input.nextDouble();
            soma+=notas[i];
        }
        /*for (double nota:notas) {
            //soma+=nota;
        }*/
        double media = soma/notas.length;
        System.out.println("A média foi: "+media);
        input.close();
    }
}

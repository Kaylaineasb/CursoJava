package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notaAlunoA = new double[3];
        notaAlunoA[0]=7.9;
        notaAlunoA[1]=8;
        notaAlunoA[2]=6.7;

        System.out.println(Arrays.toString(notaAlunoA));
        System.out.println(notaAlunoA[0]);
        System.out.println(notaAlunoA[notaAlunoA.length-1]);
        double totalA=0;
        for (int i=0;i< notaAlunoA.length;i++){
            totalA+=notaAlunoA[i];
        }
        System.out.println(totalA/ notaAlunoA.length);

        double[] notasAlunoB = {6.9,8.9,5.5,10};
        double totalB=0;
        for (int i=0;i< notasAlunoB.length;i++){
            totalB+=notasAlunoB[i];
        }
        System.out.println(totalB/ notasAlunoB.length);
    }
}

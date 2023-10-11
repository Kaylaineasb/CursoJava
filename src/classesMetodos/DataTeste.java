package classesMetodos;

public class DataTeste {
    public static void main(String[] args) {
        Data data1 = new Data();

        data1.mes= 2;
        data1.dia=22;
        data1.ano=2004;

        Data data2 = new Data(22,02,2004);

        System.out.println(data1.obterDataFormatada());
        System.out.printf("%d/%d/%d",data1.dia,data1.mes,data1.ano);

    }
}

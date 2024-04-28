package TratamentoDeErros;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) throws Exception {
        try{
            geraErro1();
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        geraErro2();
        System.out.println("Fim :)");
    }
    //não checada ou não verificada
    static void geraErro1(){
        throw new RuntimeException("Ocorreu um erro aqui");
    }
    //Exceção checada ou verificada
    static void geraErro2() throws  Exception{
        throw new Exception("Ocorreu outro erro aq");
    }
}

package TratamentoDeErros;

public class MinhasExcecoes {
    public static class NumeroNegativoException extends Exception{
        public NumeroNegativoException(){
            super("Número negativo não é permitido");
        }
    }

    public static class DivisaoPorZeroException extends Exception{
        public DivisaoPorZeroException(){
            super("Divisão por zero não é permitida");
        }
    }

    public static class EntradaInvalidaException extends Exception{
        public EntradaInvalidaException(){
            super("Entrada inválida");
        }
    }

    public static void main(String[] args) {
        try{
            int x=10;
            int y=0;
            if (y==0){
                throw new DivisaoPorZeroException();
            }
            if (x<0){
                throw new NumeroNegativoException();
            }
        }catch (DivisaoPorZeroException | NumeroNegativoException e){
            System.out.println(e.getMessage());
        }
    }
}

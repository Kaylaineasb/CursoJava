package OO.heranca.Desafio;

public class Carro {
    final int VELOCIDADEMAX;
    int velAtual;
    Carro(int velocidadeMax){
        VELOCIDADEMAX = velocidadeMax;
    }
    void acelerar(){
        if (velAtual+5>VELOCIDADEMAX){
            velAtual = VELOCIDADEMAX;
        }else{
            velAtual+=5;
        }
    }
    void frear(){
        if (velAtual>=5){
            velAtual-=5;
        }else{
            velAtual=0;
        }
    }
    public String toString(){
        return "Velocidade atual "+velAtual+ "Km";
    }
}

package OO.heranca.Desafio;

public class Ferrari extends Carro{
    Ferrari(){
        super(200);
    }
    Ferrari(int velocidadeMax){
        super(velocidadeMax);
    }
    @Override
    void acelerar(){
        velAtual+=15;
    }
}

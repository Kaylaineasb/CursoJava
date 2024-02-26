package OO.heranca;

public class Jogo {
    public static void main(String[] args) {
        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y =10;
    
        Heroi heroi = new Heroi(10,11);

        /***
         *  monstro.andar(Direcao.NORTE);
         *         monstro.andar(Direcao.LESTE);
         *         monstro.andar(Direcao.NORTE);
         *         monstro.andar(Direcao.LESTE);
         *         System.out.println(monstro.y);
         */
        System.out.println(monstro.vida);
        System.out.println(heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);
        System.out.println("Monstro em =>"+monstro.vida);
        System.out.println("Heroi em =>"+heroi.vida);

    }
}




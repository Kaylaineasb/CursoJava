package estruturasControle;

public class Continue {
    public static void main(String[] args) {
        //pula uma determinada acao
        //ignora os impares:
        for (int i=0;i<10;i++){
            if(i%2==1){
                continue;
            }
        }
    }
}

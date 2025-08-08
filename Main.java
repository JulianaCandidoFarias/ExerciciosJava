
public class Main{

    public static void MaiorNumero(int numero1, int numero2){
        if(numero1 > numero2){
            System.out.println(numero1 + " é maior que " + numero2);
        }
        else if(numero1 == numero2){
            System.out.println(numero1  + " e " + numero2 + " sao iguais");
        }
        else{
            System.out.println(numero1 + " é menor que " + numero2);
        }
    }

    public static void NumeroDescrecente(int numero){
        if(numero > 0){
            for(int i = numero; i > 0; i--){
                System.out.println("numero: " + i);
            }
        }
        else{
            System.out.println("Insira um numero maior");
        }
    }

    public static void SomaDeImparesMultiplicacaoDePares(){
        for(int i = 0; i <= 30; i++){
            if(i % 2 == 0){
                System.out.println("Multiplicacao de pares ate 30: " + (i * i));
            }
            else{
                System.out.println("Soma de impares ate 30: " + (i + i));
            }
        }
    }

    public static void main(String[] args) {
        SomaDeImparesMultiplicacaoDePares();
    }
}


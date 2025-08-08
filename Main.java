
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

    public static void main(String[] args) {
        MaiorNumero(5, 5);
    }
}


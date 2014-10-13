
package boletin0.pkg5;
/**@author mpereirasalgado*/
public class Boletin05 
{
    public static void main(String[] args) 
    {
        int x=4;
        //visualizar valor de x
        //chamar o metodo mudarDatoValor(x)
        //visualizar valor de x
        System.out.println("valor de x = " + x);
        PasoPorValor dato=new PasoPorValor();
        dato.mudarDatoValor(x);
        System.out.println("valor de x = " + x);
    }
    
}

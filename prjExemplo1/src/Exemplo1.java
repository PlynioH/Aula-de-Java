public class Exemplo1 {

    public static void main(String[] args) {
        int num, cont;
        
        num=(int)(Math.random()*1000);
        System.out.println("\t\t\tTabuada do "+num);
        
        for(cont=1;cont<=10;cont++){
            System.out.println(num+" x "+cont+" = "+cont*num);
        }
            
    }
}

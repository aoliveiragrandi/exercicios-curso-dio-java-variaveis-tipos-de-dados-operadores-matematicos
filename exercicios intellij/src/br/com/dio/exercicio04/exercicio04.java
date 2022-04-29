package exercicio04;
// conversões (casting) - 

public class exercicio04 {
    public static void main(String[] args) {

        byte b1;
        short s1 = 1000; // downcast (diminuiçao da capacidade/perda de informação)
        b1 = (byte) s1;

        long l1;
        int i1 = 10;  // uppcast (não houve perda de informação)
        l1 = i1;

        int i2;
        long l2 = 10000000000000L; // downcast (houve perda de informação)
        i2 = (int) l2;

        int i3;
        long l3 = 10000L; // downcast (nao ocasionou efeitos colaterais)
        i3 = (int) l3;

        double d1;
        float f1 = 10.5f; // upcast 
        d1 = f1;

        float f2;
        float f3;
        double d2 = 10000.58d; // downcast SEM DANOS COLATERAIS (arredondamento que nao influenciou)
        double d3 = 10000.58888888888888888888888888888888888d; // downcast  com danos colaterais
        f3 = (float) d3;

        int i4;
        float f4 = 11.5697f; // TUNCAR (ignorar a parte fracionada e so usar o valor inteiro)
        i4 = (int) f4;


        System.out.println(" b1: " + b1);
        System.out.println("l1: " + l1);
        System.out.println("i2: " + i2);
        System.out.println("i3: " + i3);
        System.out.println("f3: " + f3);
        System.out.println("i4: " + i4);

        b1 = (byte) d3; 

        System.out.println("b1: " + b1);


        // downcast é sempre explicito 
        // upcast é automatico







    }

    
}

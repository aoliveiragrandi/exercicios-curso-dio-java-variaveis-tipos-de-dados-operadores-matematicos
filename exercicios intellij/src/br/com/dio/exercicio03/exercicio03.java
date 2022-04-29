package br.com.dio.exercicio03;
//exercicio de operadores atirmeticos
public class exercicio03 {
    public static void main(String[] args) {
    
        System.out.println("PrePos");
        prePos(); //metodos auxiliares
        System.out.println("Aritmétoco");
        aritmetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();

    }
    

    private static void prePos() {
        
        int k =  10;

        int i = ++k; //atribuição pré fixada  primeiro soma uma unidade e depois usa a expressao
        int j = k--; //atribuição pós fixada  primeiro usou expressão a expressão para depois subtrair uma unidade
        int x = k;

        System.out.println ("i:" + i);
        System.out.println ("j:" + j);
        System.out.println ("x: " + x);
    }

     private static void aritmetico() {

         int a = 10;
         int b = 20;
         int c = 30;
         int d = 40;
         int e = 50;

         // variaveis de resultado

         int r1 = a + b;
         int r2 = c - a;
         int r3 = d * b;
         int r4 = e / a;
         int r5 = c % b;

         System.out.println("a + b " + r1);
         System.out.println("c - a " + r2);
         System.out.println("d * b " + r3);
         System.out.println("e / a " + r4);
         System.out.println("c % b " + r5);

     }
    private static void atribuicao() {
      //atribuições simples:  
        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f;
        
    //atribuições        

        System.out.println("d: " + d);

        i += 5;    // i = 1 + 5
        j -= 3;    // j = j - 3
        d /= 2.7d;    // d = d / 2.7d
        l *= 3;    // l = l * 3
        k %= 2;    // k = k % 2

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("d: " + d);
        System.out.println("l: " + l);
        System.out.println("k: " + k);

        i = k = j;

        System.out.println("k"+ k);
        System.out.println("i" + i);

    }   

     private static void precedencia() {

        int i = 10;
        int j = 20;
        int k = 30;

        int a = j++ + --j * k ; // 10 + 19 * 30 -> 10 + 578 -> 580

        System.out.println("i++ + --j * k: " + a );
        System.out.println("i: "); //10

        int c = 2;

        c *= i += 5; // c = 2 * i; i = i + 5 -> c = 2 * i; i = 10 +; -> c = 2 * 15; -> c 2 * 15; c = 30

        System.out.println("c *= i += 5 " + c);
     



        }

    


    }
    


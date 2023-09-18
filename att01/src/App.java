import java.util.Scanner;


public class App {
    /**
     * @param args
     * @throws Exception
     */

     /* scanner perguntando a quantidade de patos que irao passear */
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite quantos patos irão passear de 1 a 5:");
        int n = input.nextInt();
        int p;
        p = n;
        int i;
        i = 1;
    /*limitador da quantidade de patos */
        if (n>5 || n<=0) {
            System.out.println("Até 5 por favor");
            System.exit(0);
        }
        else {
            System.out.println("Historia dos Patinhos.");
        }
    /*laço com a musica */
        while (n>0) {
            if (n != 1) {
            
                if (n==2) {
                    System.out.println( (n) + " Patinhos foram passear\r\n" + " Além das montanhas\r\n" + " Para brincar\r\n" + " A mamae gritou: qua, qua, qua, qua\r\n"+" Mas apenas 1 patinho voltou de lá.");
                }
                else {
                    System.out.println( (n) + " Patinhos foram passear\r\n" + " Além das montanhas\r\n" + " Para brincar\r\n" + " A mamae gritou: qua, qua, qua, qua\r\n"+" Mas apenas "+(n-1)+" patinhos voltaram de lá.");
                }
            }
            else {
            System.out.println( (n) + " Patinho foi passear\r\n" + " Além das montanhas\r\n" + " Para brincar\r\n" + " A mamae gritou: qua, qua, qua, qua\r\n"+ " Mas nenhum patinho voltou de lá.");
            }
            n = n - 1;
        }
        
        if (n==0) {
            System.out.println("A mamae patinha foi procurar\r\n"+" Alem das montanhas\r\n"+" Na beira do mar\r\n"+" A mamae gritou: qua, qua, qua, qua\r\n"+" E o patinho voltou de lá.\r\n");
        }
        else {
            System.out.println("A mamae patinha foi procurar\r\n"+" Alem das montanhas\r\n"+" Na beira do mar\r\n"+" A mamae gritou: qua, qua, qua, qua\r\n"+" E os "+(p)+" patinhos voltaram de lá.\r\n");
        }
            
    }
}

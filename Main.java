import java.util.Scanner;

public class Main {

public static void main(String[] args) {

int mesEsc = 13;
int anoEsc;
int [] dias = {31,28,31,30,31,30,31,31,30,31,30,31};

while (mesEsc > 12){
             Scanner inm = new Scanner(System.in);
             System.out.println("Escolha um mês: ");
             mesEsc = inm.nextInt();
             };
if (mesEsc == 2)   {
            Scanner inm = new Scanner(System.in);
            System.out.println("Digite o ano com 4 digitos: ");
            anoEsc = inm.nextInt();
if ((anoEsc % 400 == 0 ) || (( anoEsc % 4 ==0) && (anoEsc % 100 != 0))) {
       dias[1] = 29;
        
}
}   
System.out.printf("O mês escolhido tem %d dias \n", dias[mesEsc-1]);

}

};
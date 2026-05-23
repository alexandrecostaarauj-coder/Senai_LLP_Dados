package atividade003;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();
        String dados[] = new String[7];
        dados[1]= "_____________\n"
                + "|           |\n"
                + "|           |\n"
                + "|     0     |\n"
                + "|           |\n"
                + "|___________|\n";
        dados[2]= "_____________\n"
                + "|           |\n"
                + "|       0   |\n"
                + "|           |\n"
                + "|   0       |\n"
                + "|___________|\n";   
        dados[3]= "_____________\n"
                + "|           |\n"
                + "|       0   |\n"
                + "|     0     |\n"
                + "|   0       |\n"
                + "|___________|\n";
        dados[4]= "_____________\n"
                + "|           |\n"
                + "|   0   0   |\n"
                + "|           |\n"
                + "|   0   0   |\n"
                + "|___________|\n";
        dados[5]= "_____________\n"
                + "|           |\n"
                + "|   0   0   |\n"
                + "|     0     |\n"
                + "|   0   0   |\n"
                + "|___________|\n";
        dados[6]= "_____________\n"
                + "|           |\n"
                + "|   0   0   |\n"
                + "|   0   0   |\n"
                + "|   0   0   |\n"
                + "|___________|\n";
        System.out.println("Quantos dados deseja sortear? ");
        int quantidadededadossorteados = ler.nextInt();
        for(int i = 0; i < quantidadededadossorteados; i++){      
            System.out.print(dados[random.nextInt(6) + 1]);
        }
    }
}

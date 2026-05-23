public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Informe um texto como argumento.");
            return;
        }

        int qtdPalavras = args.length;
        int par = 0, impar = 0;
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (String palavra : args) {
            if (palavra.length() % 2 == 0) par++;
            else impar++;

            for (char letra : palavra.toLowerCase().toCharArray()) {
                switch (letra) {
                    case 'a': a++; break;
                    case 'e': e++; break;
                    case 'i': i++; break;
                    case 'o': o++; break;
                    case 'u': u++; break;
                }
            }
        }

        System.out.println("=== Relatorio ===");
        System.out.println("Quantidade de palavras: " + qtdPalavras);
        System.out.println("Palavras com letras pares: " + par);
        System.out.println("Palavras com letras impares: " + impar);
        System.out.println("Vogais - a:" + a + " e:" + e + " i:" + i + " o:" + o + " u:" + u);
    }
}
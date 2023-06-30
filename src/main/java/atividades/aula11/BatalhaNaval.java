package atividades.aula11;

import java.util.Scanner;
import java.util.Random;

public class BatalhaNaval {

    //public char[][] campo = new char[10][10];
    //public char[][] campo2 = new char[10][10];
    public char navio1 = 0;
    public char navio2 = 0;
    public char navio3 = 0;
    public char navio4 = 0;

    public int alocar;
    public int posicionar;
    public int lugar = 0;
    public int coluna = 0;
    public int c = 0;

    public int l = 0;
    public boolean alocado = false;
    public boolean espaco = true;

    public static void Printfield(String printcampo) {
        String[][] campo = new String[10][10];
        //campo
        System.out.println(" |A   B   C   D   E   F   G   H   I   J ");

        for (int i = 0; i < campo.length; i++) {
            System.out.println(" |--------------------------------------|");
            System.out.printf("%d", i);
            for (int j = 0; j < campo.length; j++) {
                campo[i][j] = " ";

                System.out.printf("|  |");

            }
            System.out.println(" ");
        }
        //campo
    }

    //metodo para alocar barcos de tamanho 1
    public static void Alocador1(float alocar) {
        Scanner ler = new Scanner(System.in);
        int navio1;
        boolean alocado = false;
        String[][] campo = new String[10][10];
        char coluna = 0;
        int linha = 0;

        do {
            for (navio1 = 0; navio1 < 4; navio1++) {
                System.out.println("Escolha o número da linha de 0 a 9:");
                linha = ler.nextInt();
                System.out.println("Escolha a letra da coluna de 'a' a 'j':");
                coluna = ler.next().charAt(0);
                int c = 0;
                boolean espaco = true;

                if (coluna == 'a') {
                    c = 0;
                } else if (coluna == 'b') {
                    c = 1;
                } else if (coluna == 'c') {
                    c = 2;
                } else if (coluna == 'd') {
                    c = 3;
                } else if (coluna == 'e') {
                    c = 4;
                } else if (coluna == 'f') {
                    c = 5;
                } else if (coluna == 'g') {
                    c = 6;
                } else if (coluna == 'h') {
                    c = 7;
                } else if (coluna == 'i') {
                    c = 8;
                } else if (coluna == 'j') {
                    c = 9;
                }

                if (linha >= 0 && coluna >= 0 && linha + navio1 < 4 && coluna < 4) {
                    for (int aux = linha; aux < 4; aux++) {
                        if (campo[aux][c] != " ") {
                            espaco = false;
                        }
                    }
                    if (espaco) {
                        for (int aux = linha; aux < 4; aux++) {
                            campo[aux][c] = " ";
                        }
                        alocado = true;
                    }
                }

                if (coluna >= 0 && linha >= 0 && coluna + navio1 < 4 && linha < 4) {
                    for (int aux = coluna; aux < 4; aux++) {
                        if (campo[aux][c] != " ") {
                            espaco = false;
                        }
                    }
                    if (espaco) {
                        for (int aux = coluna; aux < 4; aux++) {
                            campo[aux][c] = "!";
                        }
                        alocado = true;
                    }
                }
            }

            if (alocado) {
                for (int ver1 = 0; ver1 == 1; ver1++) {
                    for (ver1 = 0; ver1 == 1; ver1++) {
                        System.out.println(" " + campo[linha][coluna]);
                        ver1--;
                    }
                }

            } else {
                System.out.printf("Não foi possível alocar o navio.");
            }
        } while (alocado == true);
    }
//metodo para alocar barcos de tamanho 1    

//metodo para alocar barcos de tamanho 2
    public static void Alocador2(float alocar) {
        Scanner ler = new Scanner(System.in);
        int navio2;
        boolean alocado = false;
        String[][] campo = new String[10][10];
        char coluna = 0;
        int linha = 0;
        char verify = 0;
        boolean test = true;
        char posicao = 0;
        boolean espaco = true;
        boolean test2 = true;
        int l = 0;
        do {
            for (navio2 = 0; navio2 < 3; navio2++) {
                System.out.println("Escolha o número da linha de 0 a 9:");
                linha = ler.nextInt();
                System.out.println("Escolha a letra da coluna de 'a' a 'j':");
                coluna = ler.next().charAt(0);
                int c = 0;

                if (coluna == 'a') {
                    c = 0;
                } else if (coluna == 'b') {
                    c = 1;
                } else if (coluna == 'c') {
                    c = 2;
                } else if (coluna == 'd') {
                    c = 3;
                } else if (coluna == 'e') {
                    c = 4;
                } else if (coluna == 'f') {
                    c = 5;
                } else if (coluna == 'g') {
                    c = 6;
                } else if (coluna == 'h') {
                    c = 7;
                } else if (coluna == 'i') {
                    c = 8;
                } else if (coluna == 'j') {
                    c = 9;
                }
                //alocação 
                if (linha >= 0 && coluna >= 0 && linha + navio2 < 3 && coluna < 3) {
                    for (int aux = linha; aux < 3; aux++) {
                        if (campo[aux][c] != " ") {
                            espaco = false;
                        }
                    }
                    if (espaco) {
                        for (int aux = linha; aux < 3; aux++) {
                            campo[aux][c] = "!";
                        }
                        alocado = true;
                    }
                }

                if (coluna >= 0 && linha >= 0 && coluna + navio2 < 3 && linha < 3) {
                    for (int aux = coluna; aux < 3; aux++) {
                        if (campo[linha][aux] != " ") {
                            espaco = false;
                        }
                    }
                    if (espaco) {
                        for (int aux = coluna; aux < 3; aux++) {
                            campo[linha][aux] = "!";
                        }
                        alocado = true;
                    }
                }
            }

            if (linha >= 0 && coluna >= 0 && linha + navio2 < 3 && coluna < 3) {
                for (int aux = coluna; aux < 3; aux++) {
                    if (campo[l][aux] != " ") {
                        espaco = false;
                    }
                }
                if (espaco) {
                    for (int aux = coluna; aux < 3; aux++) {
                        campo[l][aux] = "!";
                    }
                    alocado = true;
                }
            }

            if (coluna >= 0 && linha >= 0 && coluna + navio2 < 3 && linha < 3) {
                for (int aux = linha; aux < 3; aux++) {
                    if (campo[aux][coluna] != " ") {
                        espaco = false;
                    }
                }
                if (espaco) {
                    for (int aux = linha; aux < 3; aux++) {
                        campo[aux][coluna] = "!";
                    }
                    alocado = true;
                }
            }
            System.out.printf("Alocar o barco na vertical ou horizontal?\n[1]vertical\n[2]horizontal");
            posicao = ler.next().charAt(0);
            switch (posicao) {
                case 1 -> {

                }
            }
            if (alocado) {
                for (int ver2 = 0; ver2 == 2; ver2++) {
                    for (ver2 = 0; ver2 == 2; ver2++) {
                        System.out.println(" " + campo[linha][coluna]);
                        ver2--;
                    }
                }
            } else {
                System.out.printf("Não foi possível alocar o navio.");
            }
        } while (alocado == true);
    } //metodo para alocar barcos de tamanho 2

    //metodo para alocar barcos de tamanho 3
    public static void Alocador3(float alocar) {
        Scanner ler = new Scanner(System.in);
        boolean alocado = false;
        int navio3;
        String[][] campo = new String[10][10];
        char coluna = 0;
        int linha = 0;
        int c = 0;
        boolean espaco = true;
        do {
            for (navio3 = 0; navio3 < 2; navio3++) {
                System.out.println("Escolha o número da linha de 0 a 9:");
                linha = ler.nextInt();
                System.out.println("Escolha a letra da coluna de 'a' a 'j':");
                coluna = ler.next().charAt(0);

                if (coluna == 'a') {
                    c = 0;
                } else if (coluna == 'b') {
                    c = 1;
                } else if (coluna == 'c') {
                    c = 2;
                } else if (coluna == 'd') {
                    c = 3;
                } else if (coluna == 'e') {
                    c = 4;
                } else if (coluna == 'f') {
                    c = 5;
                } else if (coluna == 'g') {
                    c = 6;
                } else if (coluna == 'h') {
                    c = 7;
                } else if (coluna == 'i') {
                    c = 8;
                } else if (coluna == 'j') {
                    c = 9;
                }

                if (linha >= 0 && coluna >= 0 && linha + navio3 < 2 && coluna < 2) {
                    for (int aux = linha; aux < 2; aux++) {
                        if (campo[aux][c] != " ") {
                            espaco = false;
                        }
                    }
                    if (espaco) {
                        for (int aux = linha; aux < 2; aux++) {
                            campo[aux][c] = "!";
                        }
                        alocado = true;
                    }
                }

                if (coluna >= 0 && linha >= 0 && coluna + navio3 < 2 && linha < 2) {
                    for (int aux = coluna; aux < 2; aux++) {
                        if (campo[linha][aux] != " ") {
                            espaco = false;
                        }
                    }
                    if (espaco) {
                        for (int aux = coluna; aux < 2; aux++) {
                            campo[linha][aux] = "!";
                        }
                        alocado = true;
                    }
                }
            }

            if (alocado) {
                for (int ver2 = 0; ver2 == 2; ver2++) {
                    for (ver2 = 0; ver2 == 2; ver2++) {
                        System.out.println(" " + campo[linha][coluna]);
                        ver2--;
                    }
                }
                System.out.println("Navio alocado com sucesso!");
            } else {
                System.out.println("Não foi possível alocar o navio.");
            }
        } while (alocado == true);
    }
    //metodo para alocar barcos de tamanho 3

    //metodo para alocar barcos de tamanho 4
    public static void Alocador4(float alocar) {
        Scanner ler = new Scanner(System.in);
        int navio4;
        boolean alocado = false;
        String[][] campo = new String[10][10];
        char posicao;
        for (navio4 = 0; navio4 < 1; navio4++) {
            System.out.println("Escolha o número da linha de 0 a 9:");
            int linha = ler.nextInt();
            System.out.println("Escolha a letra da coluna de 'a' a 'j':");
            char coluna = ler.next().charAt(0);
            int c = 0;
            boolean espaco = true;
            do {
                if (coluna == 'a') {
                    c = 0;
                } else if (coluna == 'b') {
                    c = 1;
                } else if (coluna == 'c') {
                    c = 2;
                } else if (coluna == 'd') {
                    c = 3;
                } else if (coluna == 'e') {
                    c = 4;
                } else if (coluna == 'f') {
                    c = 5;
                } else if (coluna == 'g') {
                    c = 6;
                } else if (coluna == 'h') {
                    c = 7;
                } else if (coluna == 'i') {
                    c = 8;
                } else if (coluna == 'j') {
                    c = 9;
                }

                if (linha >= 0 && coluna >= 0 && linha + navio4 < 1 && coluna < 1) {
                    for (int aux = linha; aux < 1; aux++) {
                        if (campo[aux][c] != " ") {
                            espaco = false;
                        }
                    }
                    if (espaco) {
                        for (int aux = linha; aux < 1; aux++) {
                            campo[aux][c] = "!";
                        }
                        alocado = true;
                    }
                }

                if (coluna >= 0 && linha >= 0 && coluna + navio4 < 1 && linha < 1) {
                    for (int aux = coluna; aux < 1; aux++) {
                        String tst = campo[linha][aux];
                        if (campo[linha][aux].equals(" ")) {
                            espaco = false;
                        }
                    }
                    if (espaco) {
                        for (int aux = coluna; aux < 1; aux++) {
                            campo[linha][aux] = "!";
                        }
                        alocado = true;
                    }
                }

                if (alocado) {
                    System.out.println("Navio alocado com sucesso!");
                } else {
                    System.out.println("Não foi possível alocar o navio.");
                }
            } while (alocado == true);

        }
        //metodo para alocar barcos de tamanho 4 
}
    
 public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int modo;
        char onda = '~';
        char[][] campo = new char[10][10];
        char[][] campo2 = new char[10][10];
        int i, j;
        String printcampo = null;
        float alocar = 0;
        int escolher = 0;
        int navio1 = 0;
        int navio2 = 0;
        int navio3 = 0;
        int navio4 = 0;
        
        for (int k = 0; k < 10; k++) {
            for (int l = 0; l < 10; l++) {
                campo[k][l] = onda;
                campo2[k][l] = onda;
            }
        }

        System.out.println("Choose your mode: \n [1]Player vs CPU \n [2]Player vs Player");
        modo = ler.nextInt();

        switch (modo) {
            case 1 -> {
                Printfield(printcampo);

                System.out.println("Escolha o modo de alocação do barco:[1]Manual[2]Automatico");//escolhe o tipo de alocação
                modo = ler.nextInt();

                switch (modo) {
                    //modo manual de alocar os barcos
                    case 1 -> {
                        do {
                            System.out.println("Escolha o barco para alocar \n[1]barco pequeno\n [2]barco pequeno\n [3]barco pequeno\n [4]barco gigante");
                            escolher = ler.nextInt();
                            switch (escolher) {
                                case 1 -> {
                                    //aloca o primeiro barco
                                    Alocador1(alocar);
                                    //aloca o primeiro barco
                                }

                                case 2 -> {
                                    //aloca o segundo barco
                                    Alocador2(alocar);
                                    //aloca o segundo barco
                                }

                                case 3 -> {
                                    //aloca o terceiro barco
                                    Alocador3(alocar);
                                    //aloca o terceiro barco
                                }
                                case 4 -> {
                                    //aloca o quarto barco
                                    Alocador4(alocar);
                                    //aloca o quarto barco
                                }
                            }
                        } while (navio1 != 0 && navio2 != 0 && navio3 != 0 && navio4 != 0);

                    }//modo manual de alocar os barcos
                    case 2 -> {
                           
                    }

                }//escolhe o tipo de alocação

            }
        }
    }
 }

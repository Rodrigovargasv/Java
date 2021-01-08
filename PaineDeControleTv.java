package Projetos;

import java.util.Scanner;

public class PaineDeControleTv {
    ControleTv controle = new ControleTv();

    void verificarTvLigada() {
        if (controle.ligadoDeligado == true) {
            System.out.println("A TV está ligada.\n" +
                    "---------------------------");
        } else {
            System.out.println("A TV está desligada.");

        }
    }

    void PainelDeControle() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("---------------------------\n" +
                "lista de comando TV:\n" +
                "(1) ligar.\n" +
                "(2) Desligar.\n" +
                "(3) Mudar de Canal.\n" +
                "(4) Voltar Canal.\n" +
                "(5) Aumenta Volume.\n" +
                "(6) Diminuir volume.\n" +
                "---------------------------");
        boolean exit = true;
        int contador = 0;
        while (exit) {
            System.out.print("Digite:\n" +
                    "(1) Para ligar.\n" +
                    "(2) Para Desligar.\n" +
                    "(3) Para Mudar de Canal.\n" +
                    "(4) Para Voltar Canal.\n" +
                    "(5) Para Aumenta Volume.\n" +
                    "(6) Para Diminuir volume.\n" +
                    "DIGITE AQUI:  ");
            int funcaoTv = entrada.nextInt();
            if (funcaoTv == 1) {
                controle.ligarTv();
                System.out.println("Tv ligada\n" +
                        "---------------------------");
                contador += 1;
                if (contador == 2) {
                    System.out.println("Desculpe sua TV já esta ligada.\n" +
                            "---------------------------");
                }
            }
            if (controle.ligadoDeligado == true) {
                if (funcaoTv == 2) {
                    controle.deligarTv();
                    verificarTvLigada();
                    exit = false;
                } else if (funcaoTv == 3) {
                    controle.trocarCanal();

                } else if (funcaoTv == 4) {
                    controle.voltarCanal();
                } else if (funcaoTv == 5) {
                    if (controle.vomule > 100) {
                        System.out.println("--------------------------\n" +
                                "Volume já esta no maximo.\n" +
                                "--------------------------");
                    } else {
                        controle.aumentaVolume();
                    }

                } else if (funcaoTv == 6) {
                    if (controle.vomule == 0) {
                        System.out.println("--------------------------\n" +
                                "Volume já está no minimo.\n" +
                                "--------------------------");
                    } else {
                        controle.diminuirVolume();
                    }

                }

            }
        }
        System.out.println("Até mais...");
    }
}

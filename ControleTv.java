package Projetos;

public class ControleTv {
    boolean ligadoDeligado = false;
    int canalTv = 11;
    int vomule = 0;

    void ligarTv() {
        ligadoDeligado = true;
        System.out.println("Ligando Tv...\n" +
                "--------------------------------");

    }

    void deligarTv() {
        ligadoDeligado = false;
        System.out.println("--------------------------------\n" +
                "Desligando Tv...\n" +
                "--------------------------------");
    }

    void trocarCanal() {
        canalTv += 1;
        System.out.printf("--------------------------------\n" +
                "Você está no canal: %d\n" +
                "--------------------------------\n", canalTv);
    }

    void voltarCanal() {
        canalTv -= 1;
        System.out.printf("--------------------------------\n" +
                "Você está no canal: %d\n" +
                "--------------------------------\n", canalTv);

    }

    void aumentaVolume() {
        vomule += 1;
        System.out.printf("--------------------------------\n" +
                "volume: %d\n" +
                "--------------------------------\n", vomule);

    }

    void diminuirVolume() {
        vomule -= 1;
        System.out.printf("--------------------------------\n" +
                "volume: %d\n" +
                "--------------------------------\n", vomule);

    }

}

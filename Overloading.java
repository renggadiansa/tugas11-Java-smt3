class Hewan {
    void suaraKucing(String suara) {
        System.out.println("Kucing berbunyi " + suara);
    }
}

class Kucing extends Hewan {
    void suara() {
        System.out.println("Kucing mengeong");
    }

    void suara(int jumlah) {
        System.out.println("Kucing mengeong " + jumlah + " kali");
    }
}

public class Overloading {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        
        kucing.suara();

        kucing.suaraKucing("dengan suara keras");

        kucing.suara(3);
    }
}

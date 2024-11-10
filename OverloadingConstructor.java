class Kendaraan {
    String jenis;

    Kendaraan() {
        this.jenis = "Kendaraan umum";
    }

    Kendaraan(String jenis) {
        this.jenis = jenis;
    }
}

class Mobil extends Kendaraan {
    int jumlahRoda;

    Mobil() {
        super();
        this.jumlahRoda = 4;
    }

    Mobil(String jenis, int jumlahRoda) {
        super(jenis);
        this.jumlahRoda = jumlahRoda;
    }
}

public class OverloadingConstructor {
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Kendaraan();
        System.out.println("Jenis: " + kendaraan1.jenis);

        Mobil mobil1 = new Mobil();
        System.out.println("Jumlah Roda: " + mobil1.jumlahRoda);

        Kendaraan kendaraan2 = new Kendaraan("Bus");
        System.out.println("Jenis: " + kendaraan2.jenis);

        Mobil mobil2 = new Mobil("Sedan", 4);
        System.out.println("Jumlah Roda: " + mobil2.jumlahRoda);
    }
}

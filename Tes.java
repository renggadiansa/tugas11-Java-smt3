class User {
    private String phone;
    private String username;
    private String password;

    public User(String username, String password, String phone, String id) {
        this.username = username;
        this.password = password;
        this.phone = phone;
    }

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public boolean loginWithPhone(String phone, String password) {
        return this.phone.equals(phone) && this.password.equals(password);
    }
}

class Mahasiswa extends User {

    public Mahasiswa(String username, String password, String phone, String id, Dosen dosenWali, String kelas) {
        super(username, password, phone, id);
    }

}

class Dosen extends User {

    private String key;

    public Dosen(String username, String password, String phone, String id, String pangkat, String golongan, String key) {
        super(username, password, phone, id);

        this.key = key;
    }

    public boolean login(String username, String password, String key) {
        return super.login(username, password) && this.key.equals(key);
    }
}

public class Tes {
    public static void main(String[] args) {
        Dosen dosenWali = new Dosen("dosenWali", "passWali", "081234567890", "D001", "Lektor", "III", "keyWali");
        Mahasiswa fadilah = new Mahasiswa("fadilah", "123456", "083853501388", "M001", dosenWali, "IF-45-08");

        boolean result = fadilah.login("083853501388", "123456");
        if (result) {
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal");
        }

        Dosen fahrul = new Dosen("fahrul", "123456", "089876543210", "D002", "Profesor", "IV", "19990129");

        result = fahrul.login("fahrul", "123456", "19990129");
        if (result) {
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal");
        }
    }
}

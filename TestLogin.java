class User {
    private String id;
    private String phone;
    private String username;
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

}

class Mahasiswa extends User {
    public Mahasiswa() {
    }
}

class Dosen extends User {
    private String key;

    public Dosen(String username, String password) {
        super(username, password);
    }

    public void setKey(String key) {
        this.key = key;
    }

    public boolean login(String username, String password, String key) {
        return super.login(username, password) && this.key.equals(key);
    }
}

public class TestLogin {
    public static void main(String[] args) {
        Mahasiswa fadilah = new Mahasiswa();
        fadilah.setUsername("fadilah");
        fadilah.setPassword("123456");
        fadilah.setPhone("083853501388");

        boolean result = fadilah.login("083853501388", "123456");
        if (result) {
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal");
        }

        Dosen fahrul = new Dosen("fahrul", "123456");
        fahrul.setKey("19990129");

        result = fahrul.login("fahrul", "123456", "19990129");
        if (result) {
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal");
        }
    }
}

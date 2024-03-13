public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Bumi", "Tere Liye");
        User pustakawan1 = new User("Ronald", "Pustakawan");
        User pengunjung1 = new User("Berry", "Pengunjung");
        User pengunjung2 = new User("Neta", "Pengunjung");

        System.out.println(buku1.isBukuDipinjam());
        buku1.pinjam(pustakawan1, pengunjung1, 7);
    }
}
package BaiTap6;

public class Main {
	public static void main(String[] args) {
        Account acc1 = new Account(72354, "Ted Murphy", 102.56);
        Account acc2 = new Account(69713, "Jane Smith", 40.00);
        Account acc3 = new Account(93757, "Edward Demsey", 759.32);

        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
        System.out.println(acc3.toString());
    }
}

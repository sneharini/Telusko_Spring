package LLD.Singleton;

public class Main {
    public static void main(String[] args) {
        DbConnection dbConnection1 = DbConnection.getInstance();
        DbConnection dbConnection2 = DbConnection.getInstance();

        System.out.println("Debug");

    }
}

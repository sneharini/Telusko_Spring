package LLD.Singleton;

public class DbConnection {
    private static DbConnection instance = null;
    String url;
    String userName;
    String password;

    private DbConnection(){

    }

    public static DbConnection getInstance(){
        if(instance == null){
            synchronized (DbConnection.class){
                if(instance == null){
                    instance =  new DbConnection();
                }
            }
        }
        return instance;
    }
}

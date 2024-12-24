package CreationalDesignPattern.Singleton;

public class DBConnection {
    //Eager way
    //It creates an object irrespective user want or not
    // Performance can go down in big projects
    // But good if you need thread safety

    private static final DBConnection db = new DBConnection();

    private DBConnection() {
    }

    public static DBConnection getDb() {
        return db;
    }
}

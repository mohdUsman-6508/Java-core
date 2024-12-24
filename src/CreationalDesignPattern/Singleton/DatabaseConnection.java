package CreationalDesignPattern.Singleton;

public class DatabaseConnection {
    //Lazy way
    //Do not provide Thread Safety
    private static DatabaseConnection db;

    private DatabaseConnection() {
    }

    public static DatabaseConnection getDBConnection() {
        if (db == null) {
            //Improvement to handle Multiple Thread
            synchronized (DatabaseConnection.class) {
                if (db == null) {
                    db = new DatabaseConnection();
                    System.out.println("Connected to Database");
                }
            }
        } else {
            System.out.println("Already Connected to DB");
        }
        return db;
    }

}

/*
1. Make 'Constructor private'
2. Make getter to get one and only instance of Class
3. Make them static
 */

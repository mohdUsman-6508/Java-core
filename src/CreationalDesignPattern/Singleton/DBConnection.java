//package CreationalDesignPattern.Singleton;

/// / 1(b) enum
//public enum DBConnection {
//    INSTANCE;
//}
//

package CreationalDesignPattern.Singleton;

import java.io.Serializable;

// 2. Serialization
//public class DBConnection implements Serializable {

//3. clone
public class DBConnection implements Cloneable {
//public class DBConnection {
    //Eager way
    //It creates an object irrespective user want or not
    // Performance can go down in big projects
    // But good if you need thread safety

    private static final DBConnection db = new DBConnection();

    private DBConnection() {
        if (db != null) {
            throw new RuntimeException("You are trying to break singleton pattern");
            //solution to 1.(a)
        }
    }


    public static DBConnection getDb() {
        return db;
    }

    // 2. solution
    public Object readResolve() {
        return db;
    }

    // 3. clone
    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
        //3. return same object
        return db;
    }
}

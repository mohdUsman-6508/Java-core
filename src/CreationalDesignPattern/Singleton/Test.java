package CreationalDesignPattern.Singleton;

public class Test {
    public static void main(String[] args) throws Exception {

//        DatabaseConnection.getDBConnection();
//        DatabaseConnection db=DatabaseConnection.getDBConnection();
//        DatabaseConnection db1=DatabaseConnection.getDBConnection();
//        System.out.println(db.hashCode()+" "+db1.hashCode());

//        DBConnection db = DBConnection.getDb();
//        DBConnection db2 = DBConnection.getDb();
//        System.out.println(db.hashCode() + " " + db2.hashCode());
        // Reflection API
//        DBConnection db1=DBConnection.getDb()
//        System.out.println(db1.hashCode());
//
//        Constructor<DBConnection> constructor=DBConnection.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        DBConnection db2=constructor.newInstance();
//        System.out.println(db2.hashCode());
        //enum
//        DBConnection db1=DBConnection.INSTANCE;
//        System.out.println(db1.hashCode());
//
//        Constructor<DBConnection> constructor=DBConnection.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        DBConnection db2=constructor.newInstance();
//        System.out.println(db2.hashCode()
// Deserialization
//        DBConnection db4=DBConnection.getDb();
//        System.out.println(db4.hashCode());
//        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("abc.ob"));
//        oos.writeObject(db4);
//        System.out.println("Serialization done...");
//
//        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.ob"));
//        DBConnection db5=(DBConnection) ois.readObject();
//        System.out.println(db5.hashCode());

        //3. clone
        DBConnection db8=DBConnection.getDb();
        DBConnection db7=(DBConnection) db8.clone();

        System.out.println(db8.hashCode());
        System.out.println(db7.hashCode());

    }

    /*  3 Ways to break Singleton Pattern and their solutions
      *
      * 1. Reflection API:
      *   Solution: a). if object is there ==> throw exception from inside constructor
      *             b). use enum
      *
      * 2. Deserialization
      *    Solution: implement readResolveMethod();
      *
      * 3. Cloning
      *    Solution: return same object from clone method
      *
     */
}

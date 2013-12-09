// Notice, do not import com.mysql.jdbc.*
// or you will have problems!
public class mysqlconnect {
    public static void main(String[] args) {
        try {
            // The newInstance() call is a work around for some
            // broken Java implementations
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Connected bro!! It works");
        } catch (Exception ex) {
            // handle the error
            System.out.println(ex);
            
        }
    }
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class DataConLMS {
    private Connection con;
    private Statement stat;
    
    public DataConLMS() throws ClassNotFoundException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");                                           //driver class name
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","123456");  // drivr manager acts interface b/w uaer and driver
            stat=con.createStatement();                                                          //& helps establishing connection b/w DB nd driver
        }catch(Exception ex){                                                                    //Connection interface is the session b/w JApps and DB.
            ex.printStackTrace();                                                                //statment interface provides methods to exccutes queries with DM
        }
    }
    public Statement getStat(){
        return stat;
    }

}

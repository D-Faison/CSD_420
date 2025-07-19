
import java.sql.Connection;
import java.sql.DriverManager;

/*DeJanae Faison
 * M10: View and Update fan database
 * Due: 7.20.25
 */




public class Faison10Fan{

    //Connector Variable
    Connection con;

    @SuppressWarnings("UseSpecificCatch")
    public Faison10Fan () {
        //Try Connection
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/databasedb";
            String user = "student1";
            String password = "pass";

            //Establish Connection
            con = DriverManager.getConnection(url,user,password);

            System.out.println("==|**Connection Successful**|==");
            System.out.println("Horray!");

        }catch(Exception e){
            System.err.println("!!!!Error to connect to database!!!");
        }

        //Close the connection
        try {
            con.close();
            System.out.println("==|Connection Closed|==");
        } catch (Exception e) {
            System.out.println("==!!!Connection Close Failed!!!==");
        }
    }

    public static void main(String[] args) {
        
        Faison10Fan connectionTest = new Faison10Fan();
        System.out.println(connectionTest);
    }

}
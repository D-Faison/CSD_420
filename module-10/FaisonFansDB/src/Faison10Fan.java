
import java.sql.*;

/*DeJanae Faison
 * M10: View and Update fan database
 * Due: 7.20.25
 */




public class Faison10Fan{

    //Connector Variable
    @SuppressWarnings("unused")
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
    }

    public Records getFanById(int id) {
        Records fan = null;
        try {
            String query = "SELECT * FROM fans WHERE id = ?";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                fan = new Records();
                fan.setId(resultSet.getInt("id"));
                fan.setFirstName(resultSet.getString("firstname"));
                fan.setLastName(resultSet.getString("lastname"));
                fan.setFavoriteTeam(resultSet.getString("favoriteTeam"));
            }
        } catch (SQLException e) {
            System.err.println("Error fetching fan by ID: " + e.getMessage());
        }
        return fan;
    }

    public static void main(String[] args) {
        
        Faison10Fan connectionTest = new Faison10Fan();
        System.out.println(connectionTest);
    }

}
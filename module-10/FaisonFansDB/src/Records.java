/*Setters and Getters */
public class Records {

    private int id;
    private String firstName;
    private String lastName;
    private String favoriteTeam;

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFavoriteTeam(String favoriteTeam) {
        this.favoriteTeam = favoriteTeam;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFavoriteTeam() {
        return favoriteTeam;
    }

    @SuppressWarnings({"RedundantStringToString", "RedundantStringConstructorCall"})
    @Override
    public String toString() {
       return new String(favoriteTeam.toString().trim()+","+
               firstName.toString().trim()+","+lastName.toString().trim()+","+id);
    }
}

package model;
import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable{

  String email;
  String name;
  String password;
  String gender;
  String favouriteColour;

  public User() {
  }

  public User(String email, String name, String password, String gender, String favouriteColour) {
    this.email = email;
    this.name = name;
    this.password = password;
    this.gender = gender;
    this.favouriteColour = favouriteColour;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getGender() {
    return this.gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getFavouriteColour() {
    return this.favouriteColour;
  }

  public void setFavouriteColour(String favouriteColour) {
    this.favouriteColour = favouriteColour;
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(email, user.email) && Objects.equals(name, user.name) && Objects.equals(password, user.password) && Objects.equals(gender, user.gender) && Objects.equals(favouriteColour, user.favouriteColour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, name, password, gender, favouriteColour);
  }

  @Override
  public String toString() {
    return "{" +
      " email='" + getEmail() + "'" +
      ", name='" + getName() + "'" +
      ", password='" + getPassword() + "'" +
      ", gender='" + getGender() + "'" +
      ", favouriteColour='" + getFavouriteColour() + "'" +
      "}";
  }
  

}

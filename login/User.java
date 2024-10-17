package login;

public class User{
  private String name,password;
  public User(String user,String password){
    this.name=user;
    this.password=password;  
  }
  public Boolean verify(String user,String key){
    return (this.name.equals(user)&&this.password.equals(key));
  }
}
package me.amvse.qpro.forms;

public class SignupForm {
  private String name;
  private String email;
  private String password;
  private String passwordConfirm;

  public String getName () { return this.name; }
  public void setName (String name) { this.name = name; }

  public String getEmail () { return this.email; }
  public void setEmail (String email) { this.email = email; }

  public String getPassword () { return this.password; }
  public void setPassword (String password) { this.password = password; }

  public String getPasswordConfirm () { return this.passwordConfirm; }
  public void setPasswordConfirm (String passwordConfirm) { this.passwordConfirm = passwordConfirm; }
}

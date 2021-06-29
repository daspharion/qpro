package me.amvse.qpro.models;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "rank", nullable = false)
  private Byte rank;

  @Column(name = "name", nullable = false, length = 64)
  private String name;

  @Column(name = "email", nullable = false, length = 128, unique = true)
  private String email;

  @Column(name = "hmac", nullable = false, length = 44)
  private String hmac;

  public User () {}
  public User (String name, String email, String hmac) {
    this.name = name;
    this.email = email;
    this.rank = 2;
    this.hmac = hmac;
  }

  public Long getId () { return this.id; }

  public Byte getRank () { return this.rank; }
  public void setRank (Byte rank) { this.rank = rank; }

  public String getName () { return this.name; }
  public void setName (String name) { this.name = name; }

  public String getEmail () { return this.email; }
  public void setEmail (String email) { this.email = email; }

  public String getHmac () { return this.hmac; }
  public void setHmac (String hmac) { this.hmac = hmac; }
}

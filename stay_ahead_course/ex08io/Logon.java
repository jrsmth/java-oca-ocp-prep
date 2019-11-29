package ex08io;

import java.io.*;

public class Logon implements Serializable {
  private String username;
  private transient String password;

  public Logon(String name, String pwd) {
    username = name;
    password = pwd;
  }

  public String toString() {
    String pwd = password;
    return "username: " + username +
      "\n" + "password: " + pwd;
  }

  public static void main(String[] args) throws Exception {
    Logon logonData = new Logon("Fred", "dragon");
    System.out.println("User details entered:");
    System.out.println(logonData);
    ObjectOutputStream o = new ObjectOutputStream(
      new FileOutputStream("Logon.out"));
    o.writeObject(logonData);
    o.close();
    ObjectInputStream in = new ObjectInputStream(
      new FileInputStream("Logon.out"));
    System.out.println("User details retrieved:");
    logonData = (Logon)in.readObject();
    System.out.println(logonData);
  }
}
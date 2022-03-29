package com.example;

public class Customer {

  private Integer id;
  private String name;
  private String email;

  public Customer(Integer id, String name, String email) {
    this.id = id;
    this.name = name;
    this.email = email;
  }

  public void print() {
    System.out.printf("\tid    = %d\n", id);
    System.out.printf("\tname  = %s\n", name);
    System.out.printf("\temail = %s\n", email);
    
  }
  public String toString() {
    String s = "";
    s += String.format("\tid    = %d\n", id);
    s += String.format("\tname  = %s\n", name);
    s += String.format("\temail = %s\n", email);

    return s;
  }

}

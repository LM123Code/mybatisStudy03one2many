package com.mybatisStudy03one2many.domain;


import java.util.List;

public class User {

  private long id;
  private String username;
  private java.sql.Timestamp birthday;
  private String sex;
  private String address;
  private List<Account> accounts;//一对多关系映射：主表实体应包含从表实体的集合引用

  public List<Account> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<Account> accounts) {
    this.accounts = accounts;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public java.sql.Timestamp getBirthday() {
    return birthday;
  }

  public void setBirthday(java.sql.Timestamp birthday) {
    this.birthday = birthday;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", username='" + username + '\'' +
            ", birthday=" + birthday +
            ", sex='" + sex + '\'' +
            ", address='" + address + '\'' +
            '}';
  }
}

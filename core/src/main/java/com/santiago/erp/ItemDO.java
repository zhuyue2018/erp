package com.santiago.erp;

import javax.persistence.*;

@Entity(name = "item") // This tells Hibernate to make a table out of this class
public class ItemDO {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
  @Column(nullable = false)
  private String name;
  @Column(nullable = false)
  private Long createAt;

  private Long updateAt;

  private String type;

  @Column(length = 511)
  private String tag;

  private String position;
  private String brand;
  @Column(length = 511)
  private String description;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Long createAt) {
    this.createAt = createAt;
  }

  public Long getUpdateAt() {
    return updateAt;
  }

  public void setUpdateAt(Long updateAt) {
    this.updateAt = updateAt;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getBrand() {
    return brand;
  }

  public void setDescription(String desc) {
    this.description = desc;
  }

  public String getDescription() {
    return description;
  }
}
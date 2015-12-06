package com.centennial.comp303.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlTransient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Entity
@Table(name = "games")
public class Game implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Game.class);

    // Raw attributes
    private Long id;
    private String name;
    private String description;
    private String type;
    private String console;
    private Integer year;
    private Double price;
    private String picture;

    // -- [id] ------------------------

    @Column(name = "id", precision = 10)
    @GeneratedValue
    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Game id(Long id) {
        setId(id);
        return this;
    }

    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return id != null;
    }

    // -- [name] ------------------------

    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Game name(String name) {
        setName(name);
        return this;
    }

    // -- [description] ------------------------

    @Column(name = "description", nullable = false, length = 1000)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Game description(String description) {
        setDescription(description);
        return this;
    }

    // -- [type] ------------------------

    @Column(name = "`type`", nullable = false, length = 25)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Game type(String type) {
        setType(type);
        return this;
    }

    // -- [console] ------------------------

    @Column(name = "console", nullable = false, length = 25)
    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public Game console(String console) {
        setConsole(console);
        return this;
    }

    // -- [year] ------------------------

    @Column(name = "`year`", nullable = false, precision = 10)
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Game year(Integer year) {
        setYear(year);
        return this;
    }

    // -- [price] ------------------------

    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Game price(Double price) {
        setPrice(price);
        return this;
    }

    // -- [picture] ------------------------

    @Column(name = "picture", nullable = false, length = 100)
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Game picture(String picture) {
        setPicture(picture);
        return this;
    }

    /**
     * Apply the default values.
     */
    public Game withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof Game && hashCode() == other.hashCode());
    }

    
}
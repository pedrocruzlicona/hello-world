package com.example.dto;

import java.util.List;

/**
 * @author Pedro Cruz
 */

public class UserInformation{
    private String name;
    private Integer age;
    private String country;
    private List<ListToDo> toDo;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the toDo
     */
    public List<ListToDo> getToDo() {
        return toDo;
    }

    /**
     * @param toDo the toDo to set
     */
    public void setToDo(List<ListToDo> toDo) {
        this.toDo = toDo;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
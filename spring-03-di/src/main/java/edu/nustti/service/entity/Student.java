package edu.nustti.service.entity;

import java.util.*;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/12  9:45
 */
public class Student {
    private String name;
    private Address address;
    private String[] hobby;
    private List<String> teachers;
    private Map<String, String> courses;
    private Set<String> games;
    private Properties props;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public List<String> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<String> teachers) {
        this.teachers = teachers;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", hobby=" + Arrays.toString(hobby) +
                ", teachers=" + teachers +
                ", courses=" + courses +
                ", games=" + games +
                ", props=" + props +
                '}';
    }
}

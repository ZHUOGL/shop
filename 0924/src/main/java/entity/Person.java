package entity;

import java.util.List;
import java.util.Map;

public class Person {
    //    i.需求——输出Person 类中普通属性，数组属性。list 集合属性和map 集合属性。
    private String name;

    private String[] phones;

    private List<String> cities;

    private Map<String, Object> map;

    public int getAge() {
        return 18;
    }

    public String getName() {
        return name;
    }

    public String[] getPhones() {
        return phones;
    }

    public List<String> getCities() {
        return cities;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}

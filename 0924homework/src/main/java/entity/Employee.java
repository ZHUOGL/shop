package entity;

public class Employee {
    private String name;
    private String gender;
//省略getter setter

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Employee(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
}

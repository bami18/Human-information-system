package HumanBasicInfoSystem.model;

import HumanBasicInfoSystem.enums.Religion;
import HumanBasicInfoSystem.enums.Sex;

public class Person {
    private String name;
    private int age;
    private String phoneNumber;
    private Sex sex;
    private Religion religion;


    public Person(String name, int age, String phoneNumber, Sex sex, Religion religion) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.religion = religion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Religion getReligion() {
        return religion;
    }

    public void setReligion(Religion religion) {
        this.religion = religion;
    }
    public String greetings(){
        return "Hello my name is " + getName();
    }
    public String introduce(){
        return "I am " + getAge() + " years old " + " I identify as " + getSex() + " and my religion is " + getReligion();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", sex=" + sex +
                ", religion=" + religion +
                '}';
    }
}

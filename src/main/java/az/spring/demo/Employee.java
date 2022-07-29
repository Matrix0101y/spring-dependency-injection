package az.spring.demo;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Component
public class Employee {

    private String name;
    private String surname;
    private int age;
    private double salary;

    private Set<Device> devices;

    private Map<String, Device> deviceMap;

    private Properties databaseProperties;

    public Properties getDatabaseProperties() {
        return databaseProperties;
    }

    public void setDatabaseProperties(Properties databaseProperties) {
        this.databaseProperties = databaseProperties;
    }

    public Map<String, Device> getDeviceMap() {
        return deviceMap;
    }

    public void setDeviceMap(Map<String, Device> deviceMap) {
        this.deviceMap = deviceMap;
    }

    public Set<Device> getDevices() {
        return devices;
    }

    public void setDevices(Set<Device> devices) {
        this.devices = devices;
    }

    public Employee() {
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(int age, double salary) {
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", devices=" + devices +
                ", deviceMap=" + deviceMap +
                ", databaseProperties=" + databaseProperties +
                '}';
    }
}

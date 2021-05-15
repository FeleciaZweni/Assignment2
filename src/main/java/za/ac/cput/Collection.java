package za.ac.cput;

/**
 * This is a Collection program
 * Felecia Zweni 218330189
 * 15 May 2021
 *
 */

import java.util.Objects;


public class Collection {
    private String firstName, lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public boolean equals (Object o){
    if (this == o ) return true;
    if (!(o instanceof Collection )) return false;
    Collection that = (Collection) o;
    return getAge() == that.getAge();
    }

    @Override
    public int hashCode(){
        return Objects.hash(getAge());
    }
}
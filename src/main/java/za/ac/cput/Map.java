package za.ac.cput;

import java.util.Objects;

public class Map {

    private String employeeName, employeeId;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public boolean equals (Object o){
        if (this == o ) return true;
        if(! (o instanceof Map)) return false;
        Map map = (Map) o;
        return getEmployeeId().equals(map.getEmployeeId());
    }

    @Override
    public int hashCode(){
        return Objects.hash(getEmployeeId());
    }
}

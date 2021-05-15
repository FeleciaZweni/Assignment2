package za.ac.cput;

import java.util.Objects;

public class List {

    private  String name, lName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
@Override
    public boolean equals (Object o){
        if (this == o) return true;
        if(!(o instanceof List)) return false;
        List list = (List) o;
        return getName().equals(list.getName());
    }

    @Override
    public int hashCode(){
        return Objects.hash(getName());
    }

}

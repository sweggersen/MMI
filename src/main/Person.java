package main;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Person {

    public static final String NAME_PROPERTY = "name_property";
    public static final String AGE_PROPERTY = "age_property";

    private PropertyChangeSupport change;

    private String name;
    private Integer age;

    public Person() {
        change = new PropertyChangeSupport(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String newValue) {
        String oldValue = name;
        name = newValue;
        change.firePropertyChange(NAME_PROPERTY, oldValue, newValue);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer newValue) {
        Integer oldValue = age;
        age = newValue;
        change.firePropertyChange(AGE_PROPERTY, oldValue, newValue);
    }

    public void addListener(PropertyChangeListener listener) {
        change.addPropertyChangeListener(listener);
    }

    public void removeListener(PropertyChangeListener listener) {
        change.removePropertyChangeListener(listener);
    }
}

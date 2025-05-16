package se.Agnes.model;

import se.Agnes.Exception.InvalidFriendException;

public class Friend {
    //fields
    private int id;
    private String name;

    //constructor with id
    public Friend(int id, String name) {
        setId(id);
        setName(name);

    }

    //constructor without id
    public Friend(String name) {
        setId(id);
        setName(name);

    }

    //getter for id
    public int getId() {
        return id;

    }

    //setter for id
    public void setId(int id) {
        if (id < 0)
            throw new InvalidFriendException("ID cannot be null or negative");
        this.id = id;
    }

    //getter for name
    public String getName() {
        return name;

    }

    //setter for name
    public void setName(String name) {
        if (name == null || name.trim().isEmpty())
            throw new InvalidFriendException("Name cannot be Null or Empty");
        this.name = name;
    }
    //to string method

    @Override
    public String toString() {
        return "Friend{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

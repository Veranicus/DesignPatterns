package com.patrikpolacek.behavioral.mediator.example;
//colleague
public abstract class User {

    protected ChatMediator mediator;

    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (mediator != null ? !mediator.equals(user.mediator) : user.mediator != null) return false;
        return name != null ? name.equals(user.name) : user.name == null;
    }

    @Override
    public int hashCode() {
        int result = mediator != null ? mediator.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "mediator=" + mediator +
                ", name='" + name + '\'' +
                '}';
    }
}

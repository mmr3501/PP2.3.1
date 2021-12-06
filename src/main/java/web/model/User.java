package web.model;

import javax.persistence.*;


@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String firstName;

    @Column
    private String lastname;

    @Column
    private byte age;

    public User(String name, String lastname, byte age) {
        this.firstName = name;
        this.lastname = lastname;
        this.age = age;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public byte getAge() {
        return age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.firstName = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}

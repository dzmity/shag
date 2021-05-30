package jpa.model;

import java.util.Date;

public class Actor {

    private Long id;
    private String name;
    private String lastName;
    private Date dateOfBirth;

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Actor actor = (Actor) o;

        if (id != null ? !id.equals(actor.id) : actor.id != null) {
            return false;
        }
        if (name != null ? !name.equals(actor.name) : actor.name != null) {
            return false;
        }
        if (lastName != null ? !lastName.equals(actor.lastName) : actor.lastName != null) {
            return false;
        }
        return dateOfBirth != null ? dateOfBirth.equals(actor.dateOfBirth) : actor.dateOfBirth == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        return result;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}

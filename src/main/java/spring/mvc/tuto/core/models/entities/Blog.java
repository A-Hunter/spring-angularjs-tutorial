package spring.mvc.tuto.core.models.entities;

import javax.persistence.*;

/**
 * Created by Ghazi Naceur on 09/06/2017.
 */
@Entity
public class Blog {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private Account owner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Account getOwner() {
        return owner;
    }

    public void setOwner(Account owner) {
        this.owner = owner;
    }
}

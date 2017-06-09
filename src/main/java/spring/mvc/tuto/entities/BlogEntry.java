package spring.mvc.tuto.entities;

/**
 * Created by Ghazi Naceur on 08/06/2017.
 */
public class BlogEntry {

    private Long id;

    private String title;

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
}

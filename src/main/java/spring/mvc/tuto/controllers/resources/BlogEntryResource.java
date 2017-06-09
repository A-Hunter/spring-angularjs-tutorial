package spring.mvc.tuto.controllers.resources;

import org.springframework.hateoas.ResourceSupport;

/**
 * Created by Ghazi Naceur on 09/06/2017.
 */
public class BlogEntryResource extends ResourceSupport {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

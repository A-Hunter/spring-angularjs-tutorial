package spring.mvc.tuto.rest.resources;

import org.springframework.hateoas.ResourceSupport;
import spring.mvc.tuto.core.models.entities.BlogEntry;

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

    public BlogEntry toBlogEntry() {
        BlogEntry entry = new BlogEntry();
        entry.setTitle(title);
        return entry;
    }
}

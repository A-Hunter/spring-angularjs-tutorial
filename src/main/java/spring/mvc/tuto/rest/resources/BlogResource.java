package spring.mvc.tuto.rest.resources;

import org.springframework.hateoas.ResourceSupport;
import spring.mvc.tuto.core.models.entities.Blog;

/**
 * Created by Ghazi Naceur on 09/06/2017.
 */
public class BlogResource extends ResourceSupport {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Blog toBlog() {
        Blog blog = new Blog();
        blog.setTitle(title);
        return blog;
    }
}

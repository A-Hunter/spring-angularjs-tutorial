package spring.mvc.tuto.core.services.util;

import spring.mvc.tuto.core.models.entities.Blog;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ghazi Naceur on 09/06/2017.
 */
public class BlogList {

    private List<Blog> blogs = new ArrayList<Blog>();

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }
}

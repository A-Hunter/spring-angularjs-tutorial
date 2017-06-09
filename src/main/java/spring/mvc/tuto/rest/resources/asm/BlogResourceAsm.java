package spring.mvc.tuto.rest.resources.asm;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import spring.mvc.tuto.core.models.entities.Blog;
import spring.mvc.tuto.rest.mvc.AccountController;
import spring.mvc.tuto.rest.mvc.BlogController;
import spring.mvc.tuto.rest.resources.BlogResource;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

/**
 * Created by Ghazi Naceur on 09/06/2017.
 */
public class BlogResourceAsm extends ResourceAssemblerSupport<Blog, BlogResource> {
    public BlogResourceAsm() {
        super(BlogController.class, BlogResource.class);
    }

    @Override
    public BlogResource toResource(Blog blog) {
        BlogResource resource = new BlogResource();
        resource.setTitle(blog.getTitle());
        resource.add(linkTo(BlogController.class).slash(blog.getId()).withSelfRel());
        resource.add(linkTo(BlogController.class).slash(blog.getId()).slash("entries").withRel("entries"));
        if(blog.getOwner() != null)
            resource.add(linkTo(AccountController.class).slash(blog.getOwner().getId()).withRel("owner"));
        return resource;
    }
}

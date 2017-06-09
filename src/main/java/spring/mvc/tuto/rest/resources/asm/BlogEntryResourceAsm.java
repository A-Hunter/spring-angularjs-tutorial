package spring.mvc.tuto.rest.resources.asm;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import spring.mvc.tuto.core.models.entities.BlogEntry;
import spring.mvc.tuto.rest.mvc.BlogController;
import spring.mvc.tuto.rest.mvc.BlogEntryController;
import spring.mvc.tuto.rest.resources.BlogEntryResource;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

/**
 * Created by Ghazi Naceur on 09/06/2017.
 */
public class BlogEntryResourceAsm extends ResourceAssemblerSupport<BlogEntry, BlogEntryResource> {

    public BlogEntryResourceAsm()
    {
        super(BlogEntryController.class, BlogEntryResource.class);
    }

    @Override
    public BlogEntryResource toResource(BlogEntry blogEntry) {
        BlogEntryResource res = new BlogEntryResource();
        res.setTitle(blogEntry.getTitle());
        Link self = linkTo(BlogEntryController.class).slash(blogEntry.getId()).withSelfRel();
        res.add(self);
        if(blogEntry.getBlog() != null)
        {
            res.add((linkTo(BlogController.class).slash(blogEntry.getBlog().getId()).withRel("blog")));
        }
        return res;
    }
}

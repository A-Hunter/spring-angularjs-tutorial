package spring.mvc.tuto.controllers.resources;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import spring.mvc.tuto.controllers.BlogEntryController;
import spring.mvc.tuto.entities.BlogEntry;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;
/**
 * Created by Ghazi Naceur on 09/06/2017.
 */
public class BlogEntryResourceAssembler extends ResourceAssemblerSupport<BlogEntry,BlogEntryResource>{

    public BlogEntryResourceAssembler() {
        super(BlogEntryController.class, BlogEntryResource.class);
    }

    @Override
    public BlogEntryResource toResource(BlogEntry blogEntry) {
        BlogEntryResource resource = new BlogEntryResource();
        resource.setTitle(blogEntry.getTitle());
        Link link = linkTo(methodOn(BlogEntryController.class).getBlogEntry(blogEntry.getId())).withSelfRel();
        //another way :
        //Link link = linkTo(BlogEntryController.class).slash(blogEntry.getId()).withSelfRel();
        resource.add(link.withSelfRel());
        return resource;
    }
}

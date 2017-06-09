package spring.mvc.tuto.rest.resources.asm;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import spring.mvc.tuto.core.services.util.BlogEntryList;
import spring.mvc.tuto.rest.mvc.BlogController;
import spring.mvc.tuto.rest.resources.BlogEntryListResource;
import spring.mvc.tuto.rest.resources.BlogEntryResource;
import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

/**
 * Created by Ghazi Naceur on 09/06/2017.
 */
public class BlogEntryListResourceAsm extends ResourceAssemblerSupport<BlogEntryList, BlogEntryListResource> {
    public BlogEntryListResourceAsm() {
        super(BlogController.class, BlogEntryListResource.class);
    }

    @Override
    public BlogEntryListResource toResource(BlogEntryList list) {
        List<BlogEntryResource> resources = new BlogEntryResourceAsm().toResources(list.getEntries());
        BlogEntryListResource listResource = new BlogEntryListResource();
        listResource.setEntries(resources);
        listResource.add(linkTo(methodOn(BlogController.class).findAllBlogEntries(list.getBlogId())).withSelfRel());
        return listResource;
    }
}

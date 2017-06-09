package spring.mvc.tuto.rest.resources.asm;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import spring.mvc.tuto.core.services.util.BlogList;
import spring.mvc.tuto.rest.mvc.BlogController;
import spring.mvc.tuto.rest.resources.BlogListResource;

/**
 * Created by Ghazi Naceur on 09/06/2017.
 */
public class BlogListResourceAsm extends ResourceAssemblerSupport<BlogList, BlogListResource> {

    public BlogListResourceAsm()
    {
        super(BlogController.class, BlogListResource.class);
    }

    @Override
    public BlogListResource toResource(BlogList blogList) {
        BlogListResource res = new BlogListResource();
        res.setBlogs(new BlogResourceAsm().toResources(blogList.getBlogs()));
        return res;
    }
}

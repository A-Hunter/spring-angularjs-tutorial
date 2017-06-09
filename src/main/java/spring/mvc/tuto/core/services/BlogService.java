package spring.mvc.tuto.core.services;


import spring.mvc.tuto.core.models.entities.Blog;
import spring.mvc.tuto.core.models.entities.BlogEntry;
import spring.mvc.tuto.core.services.util.BlogEntryList;
import spring.mvc.tuto.core.services.util.BlogList;

/**
 * Created by Ghazi Naceur on 09/06/2017.
 */
public interface BlogService {
    /**
     * @param blogId the id of the blog to add this BlogEntry to
     * @param data the BlogEntry containing the data to be used for creating the new entity
     * @return the created BlogEntry with a generated ID
     * @throws spring.mvc.tuto.core.services.exceptions.BlogNotFoundException if the blog to add to cannot be found
     */
    public BlogEntry createBlogEntry(Long blogId, BlogEntry data);

    public BlogList findAllBlogs();

    public BlogEntryList findAllBlogEntries(Long blogId); // findBlog all associated blog entries

    public Blog findBlog(Long id);
}

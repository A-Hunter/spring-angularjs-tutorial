package tutorial.core.services.util;

import tutorial.core.models.entities.BlogEntry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ghazi Naceur on 09/06/2017.
 */
public class BlogEntryList {
    private List<BlogEntry> entries = new ArrayList<BlogEntry>();
    private Long blogId;

    public List<BlogEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<BlogEntry> entries) {
        this.entries = entries;
    }

    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }
}

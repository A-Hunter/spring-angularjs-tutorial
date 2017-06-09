package spring.mvc.tuto.services;

import spring.mvc.tuto.entities.BlogEntry;

/**
 * Created by Ghazi Naceur on 09/06/2017.
 */
public interface BlogEntryService {
    public BlogEntry find(Long id);
}

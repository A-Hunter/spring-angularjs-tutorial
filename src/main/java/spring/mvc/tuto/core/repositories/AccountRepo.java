package spring.mvc.tuto.core.repositories;

import spring.mvc.tuto.core.models.entities.Account;
import spring.mvc.tuto.core.models.entities.Blog;

/**
 * Created by Ghazi Naceur on 09/06/2017.
 */
public interface AccountRepo {

    public Account findAccount(Long id);
    public Account createAccount(Account data);
    public Blog createBlog(Long accountId, Blog data);
}
package spring.mvc.tuto.core.repositories.jpa;

import org.springframework.stereotype.Repository;
import spring.mvc.tuto.core.models.entities.Account;
import spring.mvc.tuto.core.models.entities.Blog;
import spring.mvc.tuto.core.repositories.AccountRepo;

/**
 * Created by Ghazi Naceur on 09/06/2017.
 */
@Repository
public class JpaAccountRepo implements AccountRepo{
    @Override
    public Account findAccount(Long id) {
        return null;
    }

    @Override
    public Account createAccount(Account data) {
        return null;
    }

    @Override
    public Blog createBlog(Long accountId, Blog data) {
        return null;
    }
}

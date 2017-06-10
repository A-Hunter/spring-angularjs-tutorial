package spring.mvc.tuto.core.repositories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tutorial.core.models.entities.Account;
import tutorial.core.repositories.AccountRepo;

/**
 * Created by Ghazi Naceur on 09/06/2017.
 */

/**
 * @RunWith(SpringJUnit4ClassRunner.class) used as a container for @Repository beans which will be injected
 * in this environment.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/business-config.xml")
public class AccountRepoTest {

    @Autowired
    private AccountRepo repo;

    private Account account;

    @Test
    public void test(){

    }
}

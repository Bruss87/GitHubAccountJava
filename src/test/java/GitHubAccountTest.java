import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GitHubAccountTest {
    private GitHubAccount gitHubAccount;
    private Repository repository1;

    @Before
    public void setUp(){
        gitHubAccount = new GitHubAccount("Zero44","JavaFan", AccountType.FREE);
        repository1 = new Repository("HotelJava", "practicing usage of multiple classes", RepositoryType.PUBLIC);
    }
    @Test
    public void hasUserName(){
        assertEquals("Zero44", gitHubAccount.getUserName());
    }
    @Test
    public void hasName(){
        assertEquals("JavaFan", gitHubAccount.getName());
    }
    @Test
    public void hasAccountType(){
        assertEquals(AccountType.FREE, gitHubAccount.getAccountType());
    }

    @Test
    public void collectionOfReposStartsAtZero(){
        assertEquals(0, gitHubAccount.countCollectionOfRepos());
    }

//    @Test
//    public void canAddRepoToCollectionOfRepos(){
//        gitHubAccount.addRepoToCollectionOfRepos(repository1);
//        assertEquals(1, gitHubAccount.countCollectionOfRepos());
//    }

}

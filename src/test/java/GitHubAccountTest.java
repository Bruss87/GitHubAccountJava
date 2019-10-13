import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GitHubAccountTest {
    private GitHubAccount gitHubAccount;
    private Repository repository1;
    private Repository repository2;


    @Before
    public void setUp(){
        gitHubAccount = new GitHubAccount("Zero44","JavaFan", AccountType.FREE);
        repository1 = new Repository("HotelJava", "practicing usage of multiple classes", RepositoryType.PUBLIC);
        repository2 = new Repository("WebAppVue", "creating web app using Vue", RepositoryType.PRIVATE);
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
    public void canChangeAccountType(){
        gitHubAccount.setAccountType(AccountType.PRO);
        assertEquals(AccountType.PRO, gitHubAccount.getAccountType());
    }

    @Test
    public void collectionOfReposStartsAtZero(){
        assertEquals(0, gitHubAccount.countCollectionOfRepos());
    }

    @Test
    public void canAddRepoToCollectionOfRepos(){
        gitHubAccount.addRepoToCollectionOfRepos("HotelJava", repository1);
        assertEquals(1, gitHubAccount.countCollectionOfRepos());
    }

    @Test
    public void canFindRepositoryByName(){
        gitHubAccount.addRepoToCollectionOfRepos("HotelJava", repository1);
        gitHubAccount.addRepoToCollectionOfRepos("WebAppVue", repository2);
        assertEquals(repository2, gitHubAccount.findRepositoryByName("WebAppVue"));
    }

}

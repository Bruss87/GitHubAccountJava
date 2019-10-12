import java.util.ArrayList;
import java.util.HashMap;

public class GitHubAccount {

    private String userName;
    private String name;
    private AccountType accountType;
    private HashMap<String, Repository> repositories;

    public GitHubAccount(String userName, String name, AccountType accountType) {
        this.userName = userName;
        this.name = name;
        this.accountType = accountType;
        this.repositories = new HashMap<String, Repository>();
    }

    public String getUserName() {

        return this.userName;
    }

    public String getName() {

        return this.name;
    }

    public AccountType getAccountType() {
        return this.accountType;
    }
    public int countCollectionOfRepos() {
        return this.repositories.size();
    }
//    public void addRepoToCollectionOfRepos(Repository, Repository repository) {
//        this.repositories.put(, "Repository" );
//    }




}

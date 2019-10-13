import java.util.HashMap;

public class GitHubAccount {

    private String userName;
    private String name;
    private AccountType accountType;
    private HashMap<String, Repository> repositories;

    public GitHubAccount(String userName, String name, AccountType accountType) {
        this.userName = userName;
        this.name = name;
        this.accountType = accountType.FREE;
        this.repositories = new HashMap<>();
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

    public void setAccountType(AccountType accountType){
        this.accountType = accountType;
    }


    public int countCollectionOfRepos() {
        return this.repositories.size();
    }

    public void addRepoToCollectionOfRepos(String name, Repository repository) {
        this.repositories.put(repository.name, repository );
    }

    public Repository findRepositoryByName(String name) {
        Repository repository = null;
        assert false;
        return this.repositories.get(repository.name);
    }

    public HashMap<String, Repository> getRepositories() {
        return repositories;
    }
}

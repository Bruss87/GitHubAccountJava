
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    private Repository repository;
    private Commit commit1;
    private Commit commit2;
    private Commit commit3;
    private Commit commit4;


    @Before
    public void setUp(){
        repository = new Repository ("HotelJava", "practicing usage of multiple classes", RepositoryType.PUBLIC);
        commit1 =  new Commit("fixed missing values bug", CommitType.BUGFIX, 4);
        commit2 =  new Commit("add new feature", CommitType.FEATURE, 3);
        commit3 =  new Commit("basic setup", CommitType.INITIAL, 1);
        commit4 =  new Commit("add new class ", CommitType.FEATURE, 2);

    }

    @Test
    public void hasName(){
        assertEquals("HotelJava", repository.getName());
    }

    @Test
    public void hasDescription(){
        assertEquals("practicing usage of multiple classes", repository.getDescription());
    }

    @Test
    public void hasRepositoryType(){
        assertEquals(RepositoryType.PUBLIC, repository.getRepositoryType());
    }

    @Test
    public void collectionOfCommitsBeginsAtZero(){
        assertEquals(0, repository.countCollectionOfCommits());
    }

    @Test
    public void canAddCommitsToCollectionOfCommits(){
        repository.addCommitToCollectionOfCommits(commit1);
        assertEquals(1, repository.countCollectionOfCommits());
    }

    @Test
    public void canFindCommitById(){
        repository.addCommitToCollectionOfCommits(commit1);
        repository.addCommitToCollectionOfCommits(commit2);
        repository.addCommitToCollectionOfCommits(commit4);
        Commit foundCommit = repository.findCommitById(4);
        assertEquals(commit1, foundCommit);
    }

    @Test
    public void canFindCommitByType(){
        repository.addCommitToCollectionOfCommits(commit1);
        repository.addCommitToCollectionOfCommits(commit2);
        repository.addCommitToCollectionOfCommits(commit4);
        Commit foundCommit = repository.findCommitByType(CommitType.FEATURE);
        assertEquals(commit4, foundCommit);
    }
}



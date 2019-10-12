
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    private Repository repository;
    private Commit commit1;

        @Before
        public void setUp(){
            repository = new Repository ("HotelJava", "practicing usage of multiple classes", RepositoryType.PUBLIC);
            commit1 =  new Commit("fixed missing values bug", CommitType.BUGFIX, 4);
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
    }



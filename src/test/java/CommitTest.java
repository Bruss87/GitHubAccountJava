import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommitTest {
    Commit commit;

    @Before
    public void setUp(){
        commit = new Commit("fixed missing values bug",commitType.BUGFIX, 4);
    }

    @Test
    public void hasDescription(){
        assertEquals("fixed missing values bug", commit.getDescription());
    }

    @Test
    public void hasCommitType(){
        assertEquals(commitType.BUGFIX, commit.getCommitType());
    }

    @Test
    public void commitHasId(){
        assertEquals(4, commit.getUniqueId());
    }
}

import org.junit.Before;

public class CommitTest {
    Commit commit1;

    @Before
    public void setUp(){
        commit1 = new Commit("fixed missing values bug",commitType.BUGFIX, 4);
    }

    @Test
}

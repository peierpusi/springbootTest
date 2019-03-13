import com.baizhi.Application;
import com.baizhi.dao.AlbumDao;
import com.baizhi.service.AlbumService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestSpringboot {
    @Autowired
    private AlbumDao albumDao;
    @Autowired
    private AlbumService albumService;

    @Test
    public void test1() {
        System.out.println(albumDao.selectAll());
    }

    @Test
    public void test2() {
        System.out.println(albumService.selectAll());
    }

}

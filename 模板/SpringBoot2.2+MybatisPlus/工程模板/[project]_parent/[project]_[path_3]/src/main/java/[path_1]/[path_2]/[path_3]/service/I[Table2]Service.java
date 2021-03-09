package [package].service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;
import [package].pojo.[Table2];
import java.util.Map;

/**
 * [comment]服务层
 * 
 * @author Administrator
 *
 */
@Service
public class I[Table2]Service extends IService<[Table2]>{
        /**
         * 分页+条件查询
         */
        IPage<[Table2]> findPage(int page, int size, Map searchMap);
}

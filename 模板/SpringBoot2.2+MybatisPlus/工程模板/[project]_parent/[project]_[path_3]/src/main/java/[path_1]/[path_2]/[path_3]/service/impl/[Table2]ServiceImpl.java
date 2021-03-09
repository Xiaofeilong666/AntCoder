package [package].service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import [package].mapper.[Table2]Mapper;
import [package].service.I[Table2]Service;
import [package].pojo.[Table2];

import java.util.Map;

/**
 * [comment]服务层
 * 
 * @author Administrator
 *
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class [Table2]ServiceImpl extends ServiceImpl<[Table2]Mapper, [Table2]> implements I[Table2]Service{



	/**
	 * 条件查询
	 * @param searchMap 查询条件
	 * @param page 页码
	 * @param size 每页的长度
	 * @return
	 */
	public IPage<[Table2]> findPage( int page, int size,Map searchMap){
		//构建查询条件
		QueryWrapper<[Table2]> wrapper = new QueryWrapper<>();
		//构建分页对象
		IPage<[Table2]> pages = new Page<>(page,size);
			if(searchMap!=null){
				<条件查询.String.txt>
			}
		return baseMapper.selectPage(pages,wrapper);
	}

}

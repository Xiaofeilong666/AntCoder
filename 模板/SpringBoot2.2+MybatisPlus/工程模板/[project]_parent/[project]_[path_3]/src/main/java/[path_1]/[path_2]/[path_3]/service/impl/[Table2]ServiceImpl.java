package [package].service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;

import [package].mapper.[Table2]Mapper;
import [package].pojo.[Table2];

/**
 * [comment]服务层
 * 
 * @author Administrator
 *
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class [Table2]ServiceImpl extends BaseServiceImpl<[Table2]Mapper, [Table2]> implements I[Table2]Service{

	@Autowired
	private [Table2]Mapper [table2]Mapper;
	/**
	 * 查询全部列表
	 * @return
	 */
	public List<[Table2]> findAll() {
		return [table2]Dao.findAll();
	}

	
	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<[Table2]> findSearch(Map whereMap, int page, int size) {
		Specification<[Table2]> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return [table2]Dao.findAll(specification, pageRequest);
	}

	
	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<[Table2]> findSearch(Map whereMap) {
		Specification<[Table2]> specification = createSpecification(whereMap);
		return [table2]Dao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param [key2]
	 * @return
	 */
	public [Table2] findById([keyType] [key2]) {
		return [table2]Dao.findById([key2]).get();
	}

	/**
	 * 增加
	 * @param [table2]
	 */
	public void add([Table2] [table2]) {
		// [table2].set[Key2]( idWorker.nextId()+"" ); 雪花分布式ID生成器
		[table2]Dao.save([table2]);
	}

	/**
	 * 修改
	 * @param [table2]
	 */
	public void update([Table2] [table2]) {
		[table2]Dao.save([table2]);
	}

	/**
	 * 删除
	 * @param [key2]
	 */
	public void deleteById([keyType] [key2]) {
		[table2]Dao.deleteById([key2]);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<[Table2]> createSpecification(Map searchMap) {

		return new Specification<[Table2]>() {

			@Override
			public Predicate toPredicate(Root<[Table2]> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
<条件查询.String.txt>				
				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}

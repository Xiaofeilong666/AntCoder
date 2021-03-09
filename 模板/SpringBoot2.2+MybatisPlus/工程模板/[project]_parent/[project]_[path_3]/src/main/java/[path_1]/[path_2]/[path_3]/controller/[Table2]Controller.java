package [package].controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import [package].pojo.[Table2];
import [package].service.[Table2]Service;

import com.aym.common.result.WebResult;
/**
 * [comment]控制器层
 * @author Administrator
 *
 */
@RestController
@CrossOrigin
@RequestMapping("/[table2]")
public class [Table2]Controller {

	@Autowired
	private I[Table2]Service [table2]Service;


	/**
	 * 查询所有
	 */
	@GetMapping("/findList")
	public WebResult findList(){
		return WebResult.success([table2]Service.list(),"查询成功");
	}


	/**
	 * 根据Id查询
	 */
	@GetMapping("/findById/{id}")
	public WebResult findById(@PathVariable Integer id){
		return WebResult.success([table2]Service.getById(id));
	}



/**
 * 分页+多条件查询
 * @param searchMap 查询条件封装
 * @param page 页码
 * @param size 页大小
 * @return 分页结果
 */
	@RequestMapping(value="/search/{page}/{size}",method=RequestMethod.POST)
	public WebResult findSearch(@RequestBody Map searchMap , @PathVariable int page, @PathVariable int size){
		Page<[Table2]> pageList = I[table2]Service.findSearch(searchMap, page, size);
		return  new Result(true,StatusCode.OK,"查询成功",  new PageResult<[Table2]>(pageList.getTotalElements(), pageList.getContent()) );
	}

	/**
     * 根据条件查询
     * @param searchMap
     * @return
     */
    @RequestMapping(value="/search",method = RequestMethod.POST)
    public WebResult findSearch( @RequestBody Map searchMap){
        return new Result(true,StatusCode.OK,"查询成功",[table2]Service.findSearch(searchMap));
    }
	
	/**
	 * 增加
	 * @param [table2]
	 */
	@RequestMapping(method=RequestMethod.POST)
	public Result add(@RequestBody [Table2] [table2]  ){
		[table2]Service.add([table2]);
		return new WebResult(true,StatusCode.OK,"增加成功");
	}
	
	/**
	 * 修改
	 * @param [table2]
	 */
	@RequestMapping(value="/{id}",method= RequestMethod.PUT)
	public Result update(@RequestBody [Table2] [table2], @PathVariable [keyType] [key2] ){
		[table2].set[Key2]([key2]);
		[table2]Service.update([table2]);
		return new WebResult(true,StatusCode.OK,"修改成功");
	}
	
	/**
	 * 删除
	 * @param [key2]
	 */
	@RequestMapping(value="/{id}",method= RequestMethod.DELETE)
	public Result delete(@PathVariable [keyType] [key2]){
		[table2]Service.deleteById([key2]);
		return new WebResult(true,StatusCode.OK,"删除成功");
	}
	
}

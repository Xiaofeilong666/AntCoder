package [package].controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import [package].pojo.[Table2];
import [package].service.I[Table2]Service;

import java.util.Map;

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
	 * 分页+条件查询
	 */
	@PostMapping("/findPage/{page}/{size}")
	public WebResult findPage(@PathVariable int page, @PathVariable int size, @RequestBody Map searchMap){
		return WebResult.success([table2]Service.findPage(page,size,searchMap));
	}


	/**
	 * 增加数据
	 */
	@PostMapping("/add")
	public WebResult add(@RequestBody [Table2] [table2]){
			[table2]Service.save([table2]);
			return WebResult.success("添加成功");
	}
	/**
	 *修改数据
	 */
	@PostMapping("/update")
	public WebResult update(@RequestBody [Table2] [table2]){
			[table2]Service.updateById([table2]);
			return WebResult.success("修改成功");
	}


	/**
	 * 删除数据
	 */
	@DeleteMapping("/deleteById/{id}")
	public WebResult delete(@PathVariable int id){
		[table2]Service.removeById(id);
		return WebResult.success("删除成功");
	}



}

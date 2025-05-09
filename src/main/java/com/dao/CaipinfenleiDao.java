package com.dao;

import com.entity.CaipinfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaipinfenleiVO;
import com.entity.view.CaipinfenleiView;


/**
 * 菜品分类
 * 
 * @author 
 * @email 
 * @date 2022-04-18 16:58:25
 */
public interface CaipinfenleiDao extends BaseMapper<CaipinfenleiEntity> {
	
	List<CaipinfenleiVO> selectListVO(@Param("ew") Wrapper<CaipinfenleiEntity> wrapper);
	
	CaipinfenleiVO selectVO(@Param("ew") Wrapper<CaipinfenleiEntity> wrapper);
	
	List<CaipinfenleiView> selectListView(@Param("ew") Wrapper<CaipinfenleiEntity> wrapper);

	List<CaipinfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<CaipinfenleiEntity> wrapper);
	
	CaipinfenleiView selectView(@Param("ew") Wrapper<CaipinfenleiEntity> wrapper);
	

}

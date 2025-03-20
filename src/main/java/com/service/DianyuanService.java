package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DianyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DianyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DianyuanView;


/**
 * 店员
 *
 * @author 
 * @email 
 * @date 2022-04-18 16:58:25
 */
public interface DianyuanService extends IService<DianyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DianyuanVO> selectListVO(Wrapper<DianyuanEntity> wrapper);
   	
   	DianyuanVO selectVO(@Param("ew") Wrapper<DianyuanEntity> wrapper);
   	
   	List<DianyuanView> selectListView(Wrapper<DianyuanEntity> wrapper);
   	
   	DianyuanView selectView(@Param("ew") Wrapper<DianyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DianyuanEntity> wrapper);
   	

}


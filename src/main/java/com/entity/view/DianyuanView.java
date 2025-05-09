package com.entity.view;

import com.entity.DianyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 店员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-18 16:58:25
 */
@TableName("dianyuan")
public class DianyuanView  extends DianyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DianyuanView(){
	}
 
 	public DianyuanView(DianyuanEntity dianyuanEntity){
 	try {
			BeanUtils.copyProperties(this, dianyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

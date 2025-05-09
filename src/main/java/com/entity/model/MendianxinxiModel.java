package com.entity.model;

import com.entity.MendianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 门店信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-18 16:58:25
 */
public class MendianxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 门店图片
	 */
	
	private String mendiantupian;
		
	/**
	 * 门店地址
	 */
	
	private String mendiandizhi;
		
	/**
	 * 营业时间
	 */
	
	private String yingyeshijian;
		
	/**
	 * 门店简介
	 */
	
	private String mendianjianjie;
				
	
	/**
	 * 设置：门店图片
	 */
	 
	public void setMendiantupian(String mendiantupian) {
		this.mendiantupian = mendiantupian;
	}
	
	/**
	 * 获取：门店图片
	 */
	public String getMendiantupian() {
		return mendiantupian;
	}
				
	
	/**
	 * 设置：门店地址
	 */
	 
	public void setMendiandizhi(String mendiandizhi) {
		this.mendiandizhi = mendiandizhi;
	}
	
	/**
	 * 获取：门店地址
	 */
	public String getMendiandizhi() {
		return mendiandizhi;
	}
				
	
	/**
	 * 设置：营业时间
	 */
	 
	public void setYingyeshijian(String yingyeshijian) {
		this.yingyeshijian = yingyeshijian;
	}
	
	/**
	 * 获取：营业时间
	 */
	public String getYingyeshijian() {
		return yingyeshijian;
	}
				
	
	/**
	 * 设置：门店简介
	 */
	 
	public void setMendianjianjie(String mendianjianjie) {
		this.mendianjianjie = mendianjianjie;
	}
	
	/**
	 * 获取：门店简介
	 */
	public String getMendianjianjie() {
		return mendianjianjie;
	}
			
}

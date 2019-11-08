package cn.yang.springmvc.service;

import java.util.List;

import cn.yang.springmvc.pojo.Items;


public interface ItemService {

	//查询商品列表
	public List<Items> selectItemsList();
	
}

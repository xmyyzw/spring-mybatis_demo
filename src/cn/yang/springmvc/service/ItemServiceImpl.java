package cn.yang.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yang.springmvc.dao.ItemsMapper;
import cn.yang.springmvc.pojo.Items;
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemsMapper itemsMapper;
	
	@Override
	public List<Items> selectItemsList() {
		List<Items> listItems = itemsMapper.selectByExampleWithBLOBs(null);
		return listItems;
		
	}

}

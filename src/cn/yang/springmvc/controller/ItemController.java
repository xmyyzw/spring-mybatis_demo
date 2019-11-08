package cn.yang.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.yang.springmvc.pojo.Items;
import cn.yang.springmvc.service.ItemService;

@Controller
@RequestMapping(value = "/test")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value = "itemlist.action")
	public ModelAndView itemList() {
		
		List<Items> listItems = itemService.selectItemsList();
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("itemList", listItems);
		mav.setViewName("itemList");
		return mav;
		
	}
	
}

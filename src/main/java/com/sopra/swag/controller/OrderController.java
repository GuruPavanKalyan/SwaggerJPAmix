package com.sopra.swag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sopra.swag.entity.Orders;
import com.sopra.swag.services.OrdService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrdService service;

	@GetMapping("/orders")
	public List<Orders>getAllOrders(){
		return service.getAllOrders();
	}
//	@GetMapping("/customer/{custid}")
	//public Customer getAllCustomer(@PathVariable Integer custid) {
	//	return this.service.getAllCustomer(custid);

	//}

	@PostMapping("/addorder")
	public void addOrders(@RequestBody Orders order) {
		this.service.addOrders(order);
	}

	@DeleteMapping("/delorder/{ordid}")
	public void delOrder(@PathVariable Integer ordid) {
		this.service.deleteOrder(ordid);
	}

	@PutMapping("/updateorder/{ordid}")
	public void updateOrder(@PathVariable Integer ordid,@RequestBody Orders order) {
		this.service.updateOrder(ordid, order);
	}
	

}

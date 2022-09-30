package com.sopra.swag.services;


	import java.util.ArrayList;
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.sopra.swag.entity.Orders;
import com.sopra.swag.repository.OrdRepo;
	@Service
	public class OrdService { 
		@Autowired
	private OrdRepo serviceRepo;
		public List<Orders> getAllOrders(){
			
		List<Orders> list = new ArrayList<Orders>();
		// method reference :: is 2 colon
		this.serviceRepo.findAll().forEach(list::add);
		return list;
	}
		//public Customer getAllCustomer
		public void addOrders(Orders order) {
			this.serviceRepo.save(order);
		}
		public void updateOrder(Integer id,Orders order) {
			this.serviceRepo.save(order);
		}
		public void deleteOrder(Integer id) {
			this.serviceRepo.deleteById(id);
		}
	}




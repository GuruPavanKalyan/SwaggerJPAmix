package com.sopra.swag.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orders {
	@Id
	private int oredreId;
	private String orderDate;
	private String orderQty;
	public int getOredreId() {
		return oredreId;
	}
	public void setOredreId(int oredreId) {
		this.oredreId = oredreId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderQty() {
		return orderQty;
	}
	public void setOrderQty(String orderQty) {
		this.orderQty = orderQty;
	}
	public Orders(int oredreId, String orderDate, String orderQty) {
		super();
		this.oredreId = oredreId;
		this.orderDate = orderDate;
		this.orderQty = orderQty;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Order [oredreId=" + oredreId + ", orderDate=" + orderDate + ", orderQty=" + orderQty + "]";
	}
	
	

}

package com.programacao.course.entities.enums;

public enum OrderStatus {
	PAID(0);

	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	public int getCode() {
		return code;
	}
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("invalid order status code");
	}
}

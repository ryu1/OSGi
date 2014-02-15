package order.client;

import order.OrderService;

public class OrderClient {

	private OrderService orderService;

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	public void removeService() {
		this.orderService = null;
	}

	public void start() {
		orderService.processOrder();
	}

	public void stop() {
		System.out.println("Bundle stopped");
    }

}

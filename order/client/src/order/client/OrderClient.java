package order.client;

import order.OrderService;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

public class OrderClient implements BundleActivator {

	private ServiceTracker orderTracker;
	private OrderService orderService;

	public void setService(OrderService orderService) {
		this.orderService = orderService;
	}

	public void removeService() {
		this.orderService = null;
	}

	public void start(BundleContext context) throws Exception {
		orderTracker = new ServiceTracker(context, OrderService.class.getName(), null);
		orderTracker.open();
		OrderService order = (OrderService) orderTracker.getService();

		if (order == null) {
			System.out.println("Order service not avaialable");
		} else {
			order.processOrder();
		}
	}

	public void stop(BundleContext context) {
		System.out.println("Bundle stopped");
		orderTracker.close();
    }

}

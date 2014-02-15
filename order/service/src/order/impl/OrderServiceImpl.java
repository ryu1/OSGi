package order.impl;

import order.OrderService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class OrderServiceImpl implements OrderService, BundleActivator {

	private ServiceRegistration registration;

	public void start(BundleContext context) {
		registration = context.registerService(OrderService.class.getName(), this, null);
		System.out.println("Order Service registered");
    }

	public void stop(BundleContext context) {
		System.out.println("Order Service stopped");
    }

	public void processOrder() {
		System.out.println("Order id: ORD123") ;
	}
}

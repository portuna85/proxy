package hello.proxy.app.v1;

public class OrderControllerV1Impl implements OrderControllerV1 {

    private final OrderServiceV1 orderservice;

    public OrderControllerV1Impl(OrderServiceV1 orderService) {
        this.orderservice = orderService;
    }

    @Override
    public String request(String itemId) {
        orderservice.orderItem(itemId);
        return "ok";
    }

    @Override
    public String noLog() {
        return "ok";
    }
}

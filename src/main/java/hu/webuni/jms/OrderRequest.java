package hu.webuni.jms;

import lombok.Data;

import java.util.List;

@Data
public class OrderRequest {

    private Long orderId;
    private String shippingAddress;
    private List<String> products;
    private String pickingUpAddress;
}


package food.delivery.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;
import java.util.List;


@FeignClient(name = "store", url = "${api.url.store}")
 
public interface StoreOrderService {
    @GetMapping(path="/storeOrders")
    public List<StoreOrder> getStoreOrder();

    @GetMapping(path="/storeOrders/{id}")
    public StoreOrder getStoreOrder(@PathVariable("id")  id);
}



package food.delivery.external;

import java.util.Date;
import lombok.Data;

@Data
public class StoreOrder {

    private Long id;
    private String foodId;
    private String preference;
    private Long orderId;
    private String status;
}

package food.delivery.infra;

import food.delivery.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "orderStatuses",
    path = "orderStatuses"
)
public interface OrderStatusRepository
    extends PagingAndSortingRepository<OrderStatus, Long> {
    List<OrderStatus> findByOrderId(Long orderId);
}

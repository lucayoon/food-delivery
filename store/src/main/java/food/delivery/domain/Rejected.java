package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class Rejected extends AbstractEvent {

    private Long id;

    public Rejected(StoreOrder aggregate) {
        super(aggregate);
    }

    public Rejected() {
        super();
    }
}
//>>> DDD / Domain Event

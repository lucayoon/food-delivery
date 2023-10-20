package food.delivery.domain;

import food.delivery.CustomerApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Log_table")
@Data
//<<< DDD / Aggregate Root
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String customerId;

    private String message;

    public static LogRepository repository() {
        LogRepository logRepository = CustomerApplication.applicationContext.getBean(
            LogRepository.class
        );
        return logRepository;
    }

    //<<< Clean Arch / Port Method
    public static void alertToUser(Accepted accepted) {
        //implement business logic here:

        /** Example 1:  new item 
        Log log = new Log();
        repository().save(log);

        */

        /** Example 2:  finding and process
        
        repository().findById(accepted.get???()).ifPresent(log->{
            
            log // do something
            repository().save(log);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void alertToUser(Rejected rejected) {
        //implement business logic here:

        /** Example 1:  new item 
        Log log = new Log();
        repository().save(log);

        */

        /** Example 2:  finding and process
        
        repository().findById(rejected.get???()).ifPresent(log->{
            
            log // do something
            repository().save(log);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void alertToUser(OrderPlaced orderPlaced) {
        //implement business logic here:

        /** Example 1:  new item 
        Log log = new Log();
        repository().save(log);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(log->{
            
            log // do something
            repository().save(log);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void alertToUser(DeliveryStarted deliveryStarted) {
        //implement business logic here:

        /** Example 1:  new item 
        Log log = new Log();
        repository().save(log);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryStarted.get???()).ifPresent(log->{
            
            log // do something
            repository().save(log);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root

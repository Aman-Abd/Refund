package Notify;

import com.example.refund.entities.RefundRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class Producer {
    private static final String TOPIC = "refund_requests";

    @Autowired
    private KafkaTemplate<String, RefundRequest> kafkaTemplate;

    public String bookRequestNotify(RefundRequest bookRequest) {
        System.out.println(String.format("#### -> Producing book request to notification service -> %s", bookRequest));
        this.kafkaTemplate.send(TOPIC, bookRequest);
        return "Successfully";
    }
}

package liz.kafkatutorial;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "example",
            groupId = "unique"
    )
    void listener(String data) {
        System.out.println("Listener received ---> " + data);
    }
}

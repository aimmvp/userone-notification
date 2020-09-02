package userone;

import userone.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    @StreamListener(KafkaProcessor.INPUT)
    public void onStringEventListener(@Payload String eventString){

    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverBookingCreated_SendNotification(@Payload BookingCreated bookingCreated){

        if(bookingCreated.isMe()){
            System.out.println("##### listener SendNotification : " + bookingCreated.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverBookingCreated_SendNotification(@Payload BookingCreated bookingCreated){

        if(bookingCreated.isMe()){
            System.out.println("##### listener SendNotification : " + bookingCreated.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverBookingChanged_SendNotification(@Payload BookingChanged bookingChanged){

        if(bookingChanged.isMe()){
            System.out.println("##### listener SendNotification : " + bookingChanged.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverBookingCancelled_SendNotification(@Payload BookingCancelled bookingCancelled){

        if(bookingCancelled.isMe()){
            System.out.println("##### listener SendNotification : " + bookingCancelled.toJson());
        }
    }

}

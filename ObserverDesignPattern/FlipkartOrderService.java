import java.util.ArrayList;
import java.util.List;

public class FlipkartOrderService {


    List<Consumer> consumers= new ArrayList<>();

    public void sendNotification(String message){
        for(Consumer consumer: consumers){
            System.out.println(consumer.getNofification(message));
        }
    }

    public void addConsumer(Consumer consumer){
        consumers.add(consumer);
    }

    public void removeConsumer(int index){
        consumers.remove(index);
    }

}

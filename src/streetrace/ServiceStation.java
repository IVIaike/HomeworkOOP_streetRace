package streetrace;

import java.util.Queue;

public class ServiceStation {
    private Queue<Transport>queue;

    public ServiceStation(Queue<Transport> queue) {
        this.queue = queue;
    }
    public void addTransport (Transport transport) {
        if (transport.checkNeedService()) {
            queue.add(transport);
        }
    }
    public void checkTransport (Transport transport) {
        if (!queue.isEmpty()) {
            transport = queue.poll();
            transport.repair();
        }
    }

    public void mechanicAssigment (Queue<Transport>queue){
                if (queue.isEmpty()){
            System.out.println("Мехвник не назначен");
        }else {
            for (int i=0; i< queue.size(); i++) {
                Transport transport = queue.poll();
                Mechanics mechanics = (Mechanics) transport.getMechanicList().get(0);
                mechanics.makeMaintenance();
            }
        }

    }



}

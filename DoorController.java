import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;

public class DoorController {
    private  HashMap<Integer, Door> doorMap;

    public HashMap<Integer, Door> clearDoorList(HashMap<Integer, Door> doorList) {
        return new HashMap<Integer, Door>();
    }


    public DoorController() {
        doorMap = new HashMap<Integer, Door>();
    }

    public Door chooseRandomDoor() {
        Random random = Random();
        int randomNumber = random.nextInt(4);
        switch()
    }
    
    public void removeRandomDoor() {
        Random random = 
    }

    public static void main(String[] args) {
        ArrayList<Integer> trials = new ArrayList<>();

        DoorController doorController = new DoorController();

        for (int i = 0; i < 50000; i++) {
            for (int j = 0; j < 3; j++) {
                Door newDoor = new Door(j);
                doorController.doorMap.put(j, newDoor);
            }
            removeRandomDoor();
            Door pickedDoor = chooseRandomDoor();
        }
    }

}

import java.util.Random;

import java.util.Random;

public class Door {
    private Entity entity;
    
    public Door(int i) {
        this.entity = makeEntity(i);
    }

    private Entity makeEntity(int i) {
        switch(i) {
            case 1: return new Goat();

            case 2: return new Goat();

            case 3: return new Prize();
        }
        return null;
    }

    public Entity getEntity() {
        return entity;
    }

}

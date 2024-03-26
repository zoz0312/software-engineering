package src.example3;

import java.util.ArrayList;

public class Director {
    private int actorNum;
    private ArrayList<Actor> actors;

    public Director() {
        this.actors = new ArrayList<>();
    }

    public void cast(Actor actor) {
        actors.add(actor);
    }

    public void cast(String actor) {
        actors.add(new Actor(actor));
    }

    public void cast(String name, String action) {
        actors.add(new ActionActor(name, action));
    }

    public void direct() {
        for (Actor actor : actors) {
//            actor.play();
            if (actor instanceof ActionActor) {
                ((ActionActor) actor).exercise();
            }

            actor.play();
        }
    }
}

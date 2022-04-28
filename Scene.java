/**
 * Responsibilities:
 * - Store scene status (model)
 */
import java.util.LinkedList;

public class Scene {
    // the cards on the board
    //have the nonextras
    String title;
    String description;
    int budget;
    LinkedList<Roles> parts;
    int shotcounter;
    LinkedList<Player> actors;
    int actorcapacity;
    public Scene(String title,String description,int budgets, LinkedList<Roles> parts,int shotcounter,int actcap){
        this.title=title;
        this.description=description;
        this.budget=budgets;
        this.parts=parts;
        this.shotcounter = shotcounter;
        this.actors = new LinkedList<Player>();
        this.actorcapacity=actcap;
    }
}

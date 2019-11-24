package main.java.fr.esgi.rpg.core;

import java.util.ArrayList;
import java.util.List;
import fr.esgi.rpg.core.Faction;

public class Alliance {
    List<Faction> allies;

    public Alliance(){
        this.allies = new ArrayList<Faction>();
    }
    public List<Faction> getAllies() {
        return allies;
    }

    public void setAllies(List<Faction> allies) {
        this.allies = allies;
    }

    public void addAlliance (Faction faction1, Faction faction2){

        if(!allies.contains(faction1)){
            addFaction(faction1);
        }
        if(!allies.contains(faction2)){
            addFaction(faction2);
        }
    }

    public  void addFaction(Faction faction){
        this.allies.add(faction);
    }
}

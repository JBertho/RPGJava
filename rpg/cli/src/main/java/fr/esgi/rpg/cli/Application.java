package fr.esgi.rpg.cli;

import fr.esgi.rpg.core.Character;
import fr.esgi.rpg.core.Entity;
import fr.esgi.rpg.core.Faction;
import fr.esgi.rpg.core.jobs.Mage;
import fr.esgi.rpg.core.jobs.Warrior;

public class Application {

    public static void main(String[] args) {
        Faction hunter = new Faction("Hunter");
        Faction monster = new Faction("monster");
        Character jeremy = new Warrior("tsst");
        Character gerard = new Mage("Gerard");
        Warrior lol = new Warrior("lol");
        Mage bibi = new Mage("bibi");
        Entity vache = new Entity("vache");

        jeremy.attack(vache);
        jeremy.join(hunter);
        gerard.join(monster);
        lol.join(hunter);

        jeremy.attack(gerard);
        jeremy.attack(lol);


        System.out.println(vache.getHealth());



    }
}

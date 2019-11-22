package fr.esgi.rpg.core.jobs;

import fr.esgi.rpg.core.Character;
import fr.esgi.rpg.core.Entity;

public class Mage extends Character {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void characterAttack(Entity target) {
        throw new IllegalArgumentException("Le mage ne peux pas taper");
    }

    @Override
    public void characterHeal(Character target) {
        int heal = (int) (5 + (Math.random() * 5));
        target.setHealth(target.getHealth() + heal);
        if (target.getHealth() > 100) {
            target.setHealth(100);

        }

    }
}

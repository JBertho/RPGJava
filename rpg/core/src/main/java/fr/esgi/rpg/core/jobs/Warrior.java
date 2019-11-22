package fr.esgi.rpg.core.jobs;

import fr.esgi.rpg.core.Character;
import fr.esgi.rpg.core.Entity;

public class Warrior extends Character {

    public Warrior(String value) {
        super(value);
    }

    @Override
    protected void characterAttack(Entity target) {
        int damage = (int) (Math.random() * 9);

        target.setHealth(target.getHealth() - damage);
    }

    @Override
    public void characterHeal(Character target) {
        target.setHealth(target.getHealth() + 1);
    }

}

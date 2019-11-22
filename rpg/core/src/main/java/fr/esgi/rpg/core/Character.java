package fr.esgi.rpg.core;

import java.util.Objects;

public abstract class Character extends Entity{
    private Faction faction;


    public Character(String name) {
        super(name);
    }
    public void attack(Character target) {

        if (sameFaction(target)){
            throw new IllegalArgumentException("On ne peux pas taper les allies");
        }
        if (target.isDead()){
            throw new IllegalArgumentException("On ne peux pas attaquer quelqu'un de déjà mort , cest pas gentil.");
        }
        characterAttack(target);

    }
    public void attack(Entity target){
        if (target.isDead()){
            throw new IllegalArgumentException("On ne peux pas attaquer quelqu'un de déjà mort , cest pas gentil.");
        }
        characterAttack(target);
    }

    protected void characterAttack(Entity target){
        if (this.equals(target)){
            throw new IllegalArgumentException("On ne peux pas s'attaquer soit même");
        }
        target.setHealth(target.getHealth() - 1);

    }
    public void heal(Character target){
        if (!sameFaction(target)){
            throw new IllegalArgumentException("On ne peux pas heal les ennemis");
        }
        if (target.isDead()){
            throw new IllegalArgumentException("On ne soigne pas les morts");
        }
        if (target.getHealth() >= 100){
            throw new IllegalArgumentException("Déjà full vie");
        }
        characterHeal(target);
    }

    public void characterHeal(Character target) {
            target.setHealth(target.getHealth() + 1);

    }


    public void join(Faction faction){
        this.faction = faction;
    }
    public void leave(){
        if (this.faction != null){
            this.faction = null;
        }
    }

    public Faction getFaction() {
        return faction;
    }

    public boolean sameFaction(Character character){
        return this.faction == character.getFaction() && this.faction != null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return getHealth() == character.getHealth() &&
                getName().equals(character.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getHealth());
    }
}

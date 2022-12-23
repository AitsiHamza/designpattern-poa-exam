package entityFaction.decorator;

import entityFaction.classFaction.Entity;

public abstract class Composant extends Entity {
    protected Entity entity;
    public Composant(Entity entity){
        this.entity=entity;
    }
    public abstract String getDescription();
}

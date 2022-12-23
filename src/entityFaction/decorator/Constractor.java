package entityFaction.decorator;

import entityFaction.classFaction.Entity;

public class Constractor extends Composant{

    public Constractor(Entity entity) {
        super(entity);
    }

    @Override
    public String getDescription() {
        return entity.getDescription()+", constructor";
    }
}

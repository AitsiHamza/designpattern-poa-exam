package entityFaction.decorator;

import entityFaction.classFaction.Entity;
import enums.Type;
import enums.Visibility;

public class Attribute extends Composant {
    private String name;
    private Visibility visibility;
    private boolean isStatic;
    private boolean isFinal;
    private Type type;

    public Attribute(Entity entity) {
        super(entity);
    }


    @Override
    public String getDescription() {
        return entity.getDescription()+", "+name;
    }
}

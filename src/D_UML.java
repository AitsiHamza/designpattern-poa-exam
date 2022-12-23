import diagramFactory.strategy.DiagramStrategy;
import entityFaction.classFaction.Entity;
import languageFaction.strategy.LanguageStrategy;

import java.util.ArrayList;
import java.util.List;

public class D_UML {
    private LanguageStrategy language;
    private DiagramStrategy diagram;
    private List<Entity> entities=new ArrayList<>();

    public void applyStrategies(){
        language.operationStrategy();
        diagram.operationStrategy();

    }
    public List<Entity> addEntity(Entity entity){
        entities.add(entity);
        return entities;
    }

    public D_UML() {
    }

    public void setLanguage(LanguageStrategy language) {
        this.language = language;
    }

    public void setDiagram(DiagramStrategy diagram) {
        this.diagram = diagram;
    }
}

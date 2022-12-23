package diagramFactory.strategy;

import diagramFactory.strategy.relationFactory.Relation;

import java.util.List;

public class ClassDiagram implements DiagramStrategy{
    private List<Relation> relations;
    @Override
    public void operationStrategy() {
        System.out.println("Using class diagram!");
    }

}

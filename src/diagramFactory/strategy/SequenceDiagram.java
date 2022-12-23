package diagramFactory.strategy;

public class SequenceDiagram implements DiagramStrategy{
    @Override
    public void operationStrategy() {
        System.out.println("Using sequence diagram!");
    }
}

import diagramFactory.strategy.ClassDiagram;
import entityFaction.classFaction.Class;
import enums.Visibility;
import languageFaction.strategy.JavaImpl;

public class Application {
    public static void main(String[] args) {
        D_UML diagram = new D_UML();
        diagram.setLanguage(new JavaImpl());
        diagram.setDiagram(new ClassDiagram());
        diagram.applyStrategies();


        Class aClass = new Class(Visibility.PRIVATE, false, false, false);
        //System.out.println(aClass.getDescription());
        diagram.addEntity(aClass);

        System.out.println("hello");
    }
}

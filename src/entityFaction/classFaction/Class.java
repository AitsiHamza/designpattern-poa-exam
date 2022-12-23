package entityFaction.classFaction;

import enums.Visibility;

public class Class extends Entity {
    private Visibility visibility;
    private boolean isStatic;
    private boolean isFinal;
    private boolean isAbstract;
    //private List<Composant> composants;

    public Class(Visibility visibility, boolean isStatic, boolean isFinal, boolean isAbstract) {
        this.visibility = visibility;
        this.isStatic = isStatic;
        this.isFinal = isFinal;
        this.isAbstract = isAbstract;
    }

    public Class(){name="class ";}
}

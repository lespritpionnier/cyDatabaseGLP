package mainStructures.toolsModule.makeAnalysis.comdAutomate;

import mainStructures.textExecutable.ExecutionTree;
import mainStructures.textExecutable.commands.CommandSelectionWHERE;

import java.util.ArrayList;

public class BoxWHERE extends AutoBoxArchetype {
    ArrayList<String> conditions = new ArrayList<>();

    public BoxWHERE(ArrayList<String> conditions) {
        this.conditions = conditions;
    }

    @Override
    public ExecutionTree makeNode() {
        return new CommandSelectionWHERE(conditions);
    }
}

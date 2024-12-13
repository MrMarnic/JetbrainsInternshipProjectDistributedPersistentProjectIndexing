package org.example;

import java.util.HashMap;
import java.util.Optional;

public class Scope {
    private Scope parent;

    private HashMap<String, Optional<Integer>> vars;

    public Scope(Scope parent) {
        this.parent = parent;
        this.vars = new HashMap<>();
    }

    /**
     * Creates new scope with current scope as parent
     * @return newly created scope
     */
    public Scope addScope() {
        return new Scope(this);
    }
    public void setVar(String varName, Optional<Integer> value) {
        this.vars.put(varName, value);
    }

    /**
     * Trys to get the variable value from the current scope or parent scopes
     * @param varName
     * @return variable value if it exists
     */
    public Optional<Integer> getVar(String varName) {
        if(this.vars.containsKey(varName)) return this.vars.get(varName);
        if(parent == null) return Optional.empty();
        return this.parent.getVar(varName);
    }

    public Scope getParent() {
        return parent;
    }
}

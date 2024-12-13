package org.example;

import java.util.Optional;

public class ProjectScopeListener extends ProjectParserBaseListener{

    private Scope scope;
    public ProjectScopeListener() {
        this.scope = new Scope(null);
    }

    @Override
    public void enterDocument(ProjectParser.DocumentContext ctx) {
        this.scope = this.scope.addScope();
    }

    @Override
    public void exitDocument(ProjectParser.DocumentContext ctx) {
        this.scope = this.scope.getParent();
    }

    @Override
    public void enterScope(ProjectParser.ScopeContext ctx) {
        this.scope = this.scope.addScope();
    }

    @Override
    public void exitScope(ProjectParser.ScopeContext ctx) {
        this.scope = this.scope.getParent();
    }

    @Override
    public void enterAssign(ProjectParser.AssignContext ctx) {
        String varName = ctx.TEXT(0).toString();
        String value = ctx.TEXT(1).toString();

        try {
            int n = Integer.parseInt(value);
            this.scope.setVar(varName, Optional.of(n));
        } catch (NumberFormatException e) {
            this.scope.setVar(varName, this.scope.getVar(value));
        }
    }

    @Override
    public void enterPrintExpr(ProjectParser.PrintExprContext ctx) {
        String varName = ctx.TEXT().toString();

        Optional<Integer> value = this.scope.getVar(varName);

        if(value.isEmpty()) {
            System.out.println("null");
        } else {
            System.out.println(value.get());
        }
    }
}

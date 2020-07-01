package com.patrikpolacek.structural.decorator;


import com.patrikpolacek.structural.decorator.component.Component;

abstract class AbstractDecorator extends com.patrikpolacek.structural.decorator.component.Component {
    private com.patrikpolacek.structural.decorator.component.Component com;

    public void SetTheComponent(Component c) {
        com = c;
    }

    public void doJob() {
        if (com != null) {
            com.doJob();
        }
    }
}


package com.rvplot.view;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

/**
 * Simple CDI-managed bean for your index.xhtml button.
 */
@Named("bean")
@RequestScoped
public class Bean {

    /**
     * Called when you click “Click Me.”
     * Returns null to stay on the same page.
     */
    public String action() {
        System.out.println("Button clicked!");
        return null;
    }
}
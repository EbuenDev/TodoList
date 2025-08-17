package com.devian.todolist.views;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.router.RouterLink;

@Route("about")
@Menu(title = "About", order = 1, icon = "vaadin:info")
public class About extends Main {


    public About() {

        // This is used to navigate from one view to another using a link
        var link = new RouterLink("Go to dashboard", Dashboard.class);
        add(link);


        // This is used to navigate from one view to another using a button
        var button = new Button("Go to dashboard");
        button.addClickListener(event ->
                UI.getCurrent().navigate(Dashboard.class)
        );
        add(button);
    }


}

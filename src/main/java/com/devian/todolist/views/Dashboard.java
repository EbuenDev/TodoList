package com.devian.todolist.views;

import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.Route;

@Route("")
@Menu(title = "Dashboard", order = 0, icon = "vaadin:dashboard")
public class Dashboard extends Main {

    public Dashboard() {
        setText("Dashboard");
    }
}

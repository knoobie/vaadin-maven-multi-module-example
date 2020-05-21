package com.example.demo.service.ui.view;

import com.example.demo.service.PersonService;
import com.example.demo.service.ui.MainLayout;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;
import org.springframework.beans.factory.annotation.Autowired;

@UIScope
@SpringComponent
@Route(value = "", layout = MainLayout.class)
public class DashboardView extends VerticalLayout {

  @Autowired
  public DashboardView(PersonService personService) {
    add(new H2("Dashboard"));
    // this is a demo - this should never be done like this in a real application!
    add(new Text("We currently have " + personService.findPersons(null).size() + " registered users."));
  }
}

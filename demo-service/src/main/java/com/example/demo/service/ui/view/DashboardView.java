package com.example.demo.service.ui.view;

import com.example.demo.service.ui.MainLayout;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;
import org.springframework.beans.factory.annotation.Autowired;

@UIScope
@SpringComponent
@Route(value = "secure/dashboard", layout = MainLayout.class)
public class DashboardView extends VerticalLayout {

  @Autowired
  public DashboardView() {
    add(new Html("<span class=\"red\">This should be red</span>"));
  }
}

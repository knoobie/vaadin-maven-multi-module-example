package com.example.demo.service.ui.view;

import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;
import org.springframework.beans.factory.annotation.Autowired;

@UIScope
@SpringComponent
@Route("login")
@CssImport("./styles/login.css")
public class LoginView extends Div {

  @Autowired
  public LoginView() {
    LoginForm component = new LoginForm();
    component.addLoginListener(e -> UI.getCurrent().navigate(DashboardView.class));
    add(component);
    add(new Html("<span class=\"green\">This should be green</span>"));
  }
}

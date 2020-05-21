package com.example.demo.service.ui;

import com.example.demo.service.ui.view.DashboardView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.html.Nav;
import com.vaadin.flow.component.html.UnorderedList;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.router.HighlightCondition;
import com.vaadin.flow.router.HighlightConditions;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

@UIScope
@SpringComponent
@Theme(value = Lumo.class)
@CssImport(value = "./styles/shared-styles.css")
@Viewport("width=device-width, minimum-scale=1, initial-scale=1, user-scalable=yes, viewport-fit=cover")
public class MainLayout extends AppLayout {

  public MainLayout() {
    initNavbar();
    initSidebar();
  }

  private void initNavbar() {
    DrawerToggle drawerToggle = new DrawerToggle();
    drawerToggle.getElement().setAttribute("aria-hidden", "true"); // Screenreader don't need to hide the toggle
    addToNavbar(false, drawerToggle, createHeading());
  }

  private Component createHeading() {
    H1 heading = new H1("Vaadin Multiple Module Demo");
    heading.addClassName("m-0");
    return heading;
  }

  private void initSidebar() {
    UnorderedList list = new UnorderedList();
    list.add(createNavEntry("Dashboard", DashboardView.class, HighlightConditions.sameLocation()));
    addToDrawer(new Nav(list));
  }

  private Component createNavEntry(String text, Class<? extends Component> clazz, HighlightCondition<RouterLink> highlightCondition) {
    RouterLink link = new RouterLink(text, clazz);
    link.setHighlightCondition(highlightCondition);
    return new ListItem(link);
  }
}

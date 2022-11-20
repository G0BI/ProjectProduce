package com.example.application.views.list;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.awt.*;
import java.util.Collection;

@PageTitle("Home - Project Produce")
@Route("seller")
public class SellerView extends VerticalLayout {

    public SellerView() {
//        setSpacing(false);

        MenuBar menuBar = new MenuBar();
        Text selected = new Text("");
        ComponentEventListener<ClickEvent<MenuItem>> listener = e -> selected
                .setText(e.getSource().getText());

        menuBar.addItem("Home", listener);
        menuBar.addItem("About", listener);

        MenuItem share = menuBar.addItem("Share");
        SubMenu shareSubMenu = share.getSubMenu();
        MenuItem onSocialMedia = shareSubMenu.addItem("On social media");
        SubMenu socialMediaSubMenu = onSocialMedia.getSubMenu();
        socialMediaSubMenu.addItem("Facebook", listener);
        socialMediaSubMenu.addItem("Twitter", listener);
        socialMediaSubMenu.addItem("Instagram", listener);
        shareSubMenu.addItem("By email", listener);
        shareSubMenu.addItem("Get Link", listener);

        menuBar.addItem("Contact", listener);

//        HorizontalLayout container = new HorizontalLayout();
//        container.addClassNames("items-center", "justify-between");
//        add(container);

        VerticalLayout headerContainer = new VerticalLayout();
//        H2 header = new H2("Project Produce");
//        Paragraph description = new Paragraph("The freshest and best products around");
//        headerContainer.add(header, description);

        HorizontalLayout layout = new HorizontalLayout();
        layout.add(menuBar);
//        layout.add(headerContainer);
        add(layout);

        VerticalLayout secondLayout = new VerticalLayout();
        H2 header = new H2("Project Produce");
        Paragraph description = new Paragraph("The freshest and best products around");
        secondLayout.add(header, description);
        secondLayout.add(new H2("Welcome back"));
        secondLayout.add(new Paragraph("your selling products"));

        Image img = new Image("https://media.istockphoto.com/id/184276818/photo/red-apple.jpg?s=612x612&w=0&k=20&c=NvO-bLsG0DJ_7Ii8SSVoKLurzjmV0Qi4eGfn6nW3l5w=", "honeyCrisp");
        img.setWidth("200px");
        secondLayout.add(img);

        secondLayout.add(new H2("HoneyCrisp Apple"));
        secondLayout.add(new Paragraph("delicious red apple"));

        Select<String> sortBy = new Select<>();
        sortBy.setLabel("Sort by");
        sortBy.setItems("Popularity", "Newest first", "Oldest first");
        sortBy.setValue("Popularity");
        secondLayout.add(sortBy);


        secondLayout.setAlignItems(Alignment.CENTER);
        add(secondLayout);

//        setSizeFull();
//        setJustifyContentMode(JustifyContentMode.CENTER);
//        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
//        getStyle().set("text-align", "center");
    }

}
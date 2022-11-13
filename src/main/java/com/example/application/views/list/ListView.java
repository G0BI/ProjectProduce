package com.example.application.views.list;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Home - Project Produce")
@Route(value = "")
public class ListView extends VerticalLayout {

    public ListView() {
//        add(new H1("Hello World!"));

//        Button button = new Button("Click Me");
//        TextField name = new TextField("Name");
        MenuBar menuBar = new MenuBar();
        Text selected = new Text("");
        ComponentEventListener<ClickEvent<MenuItem>> listener = e -> selected
                .setText(e.getSource().getText());
        Div message = new Div(new Text("Clicked item: "), selected);

        menuBar.addItem("Home", listener);
        menuBar.addItem("About", listener);

        MenuItem myAccount = menuBar.addItem("My Account");
        SubMenu myAccountSubMenu = myAccount.getSubMenu();
        myAccountSubMenu.addItem("Checkout", listener);
        myAccountSubMenu.addItem("Cart", listener);

        MenuItem shop = menuBar.addItem("Shop");
        SubMenu shopSubMenu = shop.getSubMenu();

        MenuItem fruits = shopSubMenu.addItem("Fruits");
        SubMenu fruitsSubMenu = fruits.getSubMenu();
        fruitsSubMenu.addItem("Apples", listener);
        fruitsSubMenu.addItem("Bananas", listener);
        fruitsSubMenu.addItem("Blueberries", listener);
        fruitsSubMenu.addItem("Grapes", listener);
        fruitsSubMenu.addItem("Oranges", listener);
        fruitsSubMenu.addItem("Mangoes", listener);
        fruitsSubMenu.addItem("Strawberries", listener);
        fruitsSubMenu.addItem("Watermelons", listener);

        MenuItem vegetables = shopSubMenu.addItem("Vegetables");
        SubMenu vegetablesSubMenu = vegetables.getSubMenu();
        vegetablesSubMenu.addItem("Broccoli", listener);
        vegetablesSubMenu.addItem("Carrots", listener);
        vegetablesSubMenu.addItem("Lettuces", listener);
        vegetablesSubMenu.addItem("Mushrooms", listener);
        vegetablesSubMenu.addItem("Onions", listener);
        vegetablesSubMenu.addItem("Potatoes", listener);
        vegetablesSubMenu.addItem("Tomatoes", listener);

        MenuItem dairy = shopSubMenu.addItem("Dairies");
        SubMenu dairySubMenu = dairy.getSubMenu();
        dairySubMenu.addItem("Butter", listener);
        dairySubMenu.addItem("Cheese", listener);
        dairySubMenu.addItem("Cream", listener);
        dairySubMenu.addItem("Yoghurt", listener);

        MenuItem meat = shopSubMenu.addItem("Meat");
        SubMenu meatSubMenu = meat.getSubMenu();
        meatSubMenu.addItem("Beef", listener);
        meatSubMenu.addItem("Chicken", listener);
        meatSubMenu.addItem("Duck", listener);
        meatSubMenu.addItem("Mutton", listener);
        meatSubMenu.addItem("Pork", listener);
        meatSubMenu.addItem("Turkey", listener);
        meatSubMenu.addItem("Venison", listener);


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

        MenuBar loginMenu = new MenuBar();
        MenuItem signUp = loginMenu.addItem("Sign Up");
        SubMenu signUpMenu = signUp.getSubMenu();
        signUpMenu.addItem("Sign Up", listener);
        signUpMenu.addItem("Login", listener);


        menuBar.setOpenOnHover(true);
        loginMenu.setOpenOnHover(true);

        HorizontalLayout hl = new HorizontalLayout();
        hl.add(menuBar);
        hl.add(new H1("Project Produce"));

        HorizontalLayout horizontalLogin = new HorizontalLayout();
        horizontalLogin.add(loginMenu);
        horizontalLogin.setDefaultVerticalComponentAlignment(Alignment.AUTO);

//        hl.setDefaultVerticalComponentAlignment(Alignment.END);

        add(hl);
        add(horizontalLogin);
        setHorizontalComponentAlignment(Alignment.END, horizontalLogin);


        Image img = new Image("https://operationfoodsearch.org/wp-content/uploads/2018/05/produce-image.png", "A collection of fruits");
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.add(img);
        verticalLayout.setSizeFull();
        verticalLayout.setAlignItems(Alignment.CENTER);
        add(verticalLayout);

//        button.addClickListener(click-> Notification.show("Hello, " + name.getValue()));
    }

}

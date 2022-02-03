package com.company;

import com.company.extention.UIViewController;
import com.company.menu.view.MenuViewController;


public class RootController {
    private UIViewController initialView = new UIViewController();
    private UIViewController rootView = new MenuViewController();
    public void start() {
        initialView.setInitial(rootView);
    }
}

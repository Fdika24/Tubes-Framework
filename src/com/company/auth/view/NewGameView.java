package com.company.auth.view;

import com.company.extention.UIViewController;

public class NewGameView extends UIViewController {

    @Override
    protected void viewDidLoad() {
        super.viewDidLoad();
        System.out.println("NewGame");
        this.popView();
    }
}

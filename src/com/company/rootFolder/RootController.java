package com.company.rootFolder;

import com.company.MainView;
import com.company.extention.UIViewController;


public class RootController {
    // this is the view controller
    private UIViewController viewController = new UIViewController();
    // This is the first view when you open the app
    private UIViewController rootView = new MainView(); // <-- change this if needed
    public void start() {
        viewController.setInitial(rootView);
    }
}

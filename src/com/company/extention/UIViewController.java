package com.company.extention;

import java.util.Stack;

public class UIViewController {
    private static Stack<UIViewController> views = new Stack<UIViewController>();

    protected void pushView(UIViewController view) {
        views.push(view);
        this.instantiateView();
    }
    public void setInitial(UIViewController view) {
        this.pushView(view);
    }
    protected void instantiateView() {
        views.peek().loadView();
        views.peek().viewDidLoad();
        views.peek().finnishLoadView();
    }
    protected void popView() {
        views.peek().viewDidFinnish();
        views.peek().deleteView();
        if (views.size() > 1) {
            views.pop();
            this.instantiateView();
        } else {
            /// dev log only
            System.out.println("This is the initial view, you cannot pop it");
        }
    }
    protected void popToRootView() {

    }
    protected void viewDidLoad() {

    }
    protected void loadView() {

    }
    protected void finnishLoadView() {

    }
    protected void viewDidFinnish() {

    }
    protected  void deleteView() {

    }
}

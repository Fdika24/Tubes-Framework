package com.company.menu.view;
import com.company.auth.view.NewGameView;
import com.company.extention.UIViewController;
import java.util.Scanner;

public final class MenuViewController extends UIViewController {

    @Override
    public void viewDidLoad() {
        super.viewDidLoad();
        System.out.println("Welcome to Ular Tangga!");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Option :");

        int pilihan = myObj.nextInt();
        if (pilihan == 1) {
            this.navigateToNewGame();
        } else {
            this.popView();
        }
    }
    @Override
    protected void viewDidFinnish() {
        super.viewDidFinnish();
        System.out.println("Goodbye!");
    }

    private void navigateToNewGame() {
        NewGameView newGameView = new NewGameView();
        this.pushView(newGameView);
    }
}

package com.lol768;


import com.google.inject.Guice;
import com.google.inject.Injector;
import com.lol768.bootstrap.Binder;
import com.lol768.controllers.HomeController;

public class App {
    public static void main(String[] args) {
        System.out.println("Initializing...");
        Injector injector = Guice.createInjector(new Binder());

        HomeController app = injector.getInstance(HomeController.class);

        app.doStuff();
    }
}

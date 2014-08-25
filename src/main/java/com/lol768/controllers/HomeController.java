package com.lol768.controllers;

import com.lol768.services.interfaces.IContactable;

import javax.inject.Inject;

/**
 * Created by lol768 on 25/08/14.
 */
public class HomeController {

    private IContactable contactable;

    @Inject
    public HomeController(IContactable contactable) {
        this.contactable = contactable;
    }

    public void doStuff() {
        System.out.println("We're going to say hi to " + contactable.getName());
        System.out.println("We will send an email to " + contactable.getEmail());
        System.out.println("We will send an SMS to " + contactable.getPhoneNumber());
    }
}

package com.lol768.services.implementations;

import com.lol768.services.interfaces.IContactable;

import javax.inject.Singleton;

/**
 * Created by lol768 on 25/08/14.
 */
@Singleton
public class DummyService implements IContactable {
    @Override
    public String getName() {
        return "lol768";
    }

    @Override
    public String getPhoneNumber() {
        return "127001";
    }

    @Override
    public String getEmail() {
        return "app@lol768.com";
    }
}

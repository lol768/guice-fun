package com.lol768.bootstrap;

import com.google.inject.AbstractModule;
import com.lol768.services.implementations.DummyService;
import com.lol768.services.interfaces.IContactable;

/**
 * Created by lol768 on 25/08/14.
 */
public class Binder extends AbstractModule {
    @Override
    protected void configure() {
        bind(IContactable.class).to(DummyService.class);
    }
}

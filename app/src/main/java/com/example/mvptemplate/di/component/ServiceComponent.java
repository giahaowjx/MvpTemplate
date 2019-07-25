package com.example.mvptemplate.di.component;

import com.example.mvptemplate.di.module.ServiceModule;
import com.example.mvptemplate.di.scope.PerService;

import dagger.Component;

@PerService
@Component(dependencies = ApplicationComponent.class, modules = ServiceModule.class)
public interface ServiceComponent {
}

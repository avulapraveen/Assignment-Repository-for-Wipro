import { Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { LoginComponent } from './auth/components/login/login.component';
import { SignupComponent } from './auth/components/signup/signup.component';
import { Component } from '@angular/core';  

export const routes: Routes = [

 
    {
        path:"",component:AppComponent
    },
    {
        path:"login",component:LoginComponent
    },
    {
        path:"signup",component:SignupComponent
    }
]

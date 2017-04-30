package com.softgroup.algoritms.clinik.cucumber.stepdefs;

import com.softgroup.algoritms.clinik.UaaApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = UaaApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}

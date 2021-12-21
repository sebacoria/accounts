package com.kirki.accounts.cucumber;

import com.kirki.accounts.AccountsApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = AccountsApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}

package com.JunitAccountService;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({AccountParameterizedTest.class,AccountServiceTest.class})
public class MySuite {
    // Do Not define any test case here..
}

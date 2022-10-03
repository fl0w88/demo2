/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project.calculator;


import com.example.project.Calculator;
import org.junit.jupiter.api.*;
import org.junit.runner.manipulation.Alphanumeric;

@Tag("fast")
public class CalculatorTest {

    // we define a variable ( or an object) of the type Calculator
    private Calculator myCalculator;

    // before we start, we must initialize our Calculator
    @BeforeEach
    public void init() {
        // this is how we 'create' a new Calculator
        myCalculator = new Calculator();
    }

    @Test
    @DisplayName("Another JUnit 5 test! 😎 - Calculator - Addition Test")
    public void additionTest() {
        // TO DO: try out the for loop
        Assertions.assertEquals(5, myCalculator.add(5, 0));
    }

}

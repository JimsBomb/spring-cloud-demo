/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.chingo.demo.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServiceApplicationTest {
    @Test void appHasAGreeting() {
        ServiceApplication classUnderTest = new ServiceApplication();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
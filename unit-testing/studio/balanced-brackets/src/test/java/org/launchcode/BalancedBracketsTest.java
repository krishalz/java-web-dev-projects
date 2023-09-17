package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void isBalancedWithBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void isBalancedIfMultiBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
    @Test
    public void failsIfNotBalancedStart() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }
    @Test
    public void failsIfNotBalancedEnd() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }
    @Test
    public void failsIfNotInCorrectOrder() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void testForTooManyBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]]]][][][][][]"));
    }
    @Test
    public void onlyOneOpenBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void onlyOneCloseBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void noBrackets() {
        assertEquals(false, false);
    }

    @Test
    public void parenBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("()"));
    }

    @Test
    public void curlyBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("{}"));
    }





}


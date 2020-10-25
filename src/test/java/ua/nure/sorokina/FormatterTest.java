package ua.nure.sorokina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormatterTest {

    @Test
    void encloseVowel() {
        assertEquals("e*ncl*o*s*u*r*e", Formatter.encloseVowel("enclosure"));
    }
}
package com.solutions.hackerrank.ps.basic.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EncryptionTest {

    @Test
    public void basic1() {
        Assertions.assertEquals("isieae fdtonf fotrga anoyec cttctt tfhhhs",
                Encryption.encryption("    iffactsdontfittotheorychangethefacts"));
    }

    @Test
    public void basic2() {
        Assertions.assertEquals("hae and via ecy",
                Encryption.encryption("haveaniceday"));
    }

    @Test
    public void basic3() {
        Assertions.assertEquals("fto ehg ee dd",
                Encryption.encryption("feedthedog"));
    }

    @Test
    public void basic4() {
        Assertions.assertEquals("clu hlt io",
                Encryption.encryption("chillout"));
    }
}


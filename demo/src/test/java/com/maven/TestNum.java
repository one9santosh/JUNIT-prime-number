package com.maven;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestNum {
@Test
public void test() {
	PrimeNum hr=new PrimeNum();
	assertEquals(true,hr.checkPrime(11));
}
}

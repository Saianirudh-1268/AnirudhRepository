package com.qualizeal.abstract;

import com.qualizeal.Abstract.program.App;
import com.qualizeal.Abstract.program.Laptop;
import com.qualizeal.Abstract.program.Mobile;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

class Abstraction{
	public static void main(String[] args) {
		App m = new Mobile();
		App l = new Laptop();
		
		m.run();
		l.run();
	}
}

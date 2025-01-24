package org.comp;

public class Desktop  extends Computer{
	public void desktopSize() {
		System.out.println("desktop size is:large");
	}
	public static void main(String[]args) {
		Desktop h2=new Desktop();
		h2.computerModel();
		h2.desktopSize();
		
	}

}

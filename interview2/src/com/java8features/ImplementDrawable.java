package com.java8features;

public class ImplementDrawable {

	public static void main(String[] args) {
		int no = 5;
		Drawable dr = new Drawable() {
			
		public void draw () {
			
			System.out.println(no);
		}
		};
		
		dr.draw();
		
	}
}

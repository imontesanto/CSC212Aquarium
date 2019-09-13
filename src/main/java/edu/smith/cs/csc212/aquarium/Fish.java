package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class Fish {
	// Things fish have! type/thing
	Color color;
	int x;
	int y;
	boolean isLittle;
	
	// Constructor!	
	public Fish (Color c, int startX, 
			int startY, boolean isLittle, 
			boolean isRight) {
		
		this.color = c;
		this.x = startX;
		this.y = startY;
		this.isLittle = isLittle;
		this.isRight = isRight
		
	}
	
	// Draw method
	public void draw(Graphics2D g) {
		if (this.isLittle) {
			DrawFish.smallFacingLeft(g,
					this.color,  this.x,  this.y);		
		} else {
			DrawFish.facingLeft(g,
				this.color,  this.x,  this.y);	
		}
		
		this.swim();
			
	}

	// Swim method
	public void swim() {
		this.x += 1;
		this.y += 1;
		
	}
}

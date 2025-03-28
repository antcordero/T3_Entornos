package projectRectangle;

public class Rectangle{
	
// State variables.
	private int height;
	private int width;
	
// Constructors
	Rectangle(){
		this.height=0;
		this.width =0;
	}
	
	Rectangle(int h,int w){
		this.height=h;
		this.width =w;
	}
	
// Readers
	public int getH(){
		return height;
	}
	
	public int getW(){
		return width;
	}
	
	public int getA(){
		return height* width;
	}
	
// Writers
	public void setH(int h){
		height=h;
	}
	public void setW(int w){
		width =w;
	}
	public String toString(){
		return "Rectangle: height="+height+"; width="+ width +"; area="+getA()+".";
	}

} // End of Rectangle class


public class Line {
	private int length;
	private int thick;
	private double startX;
	private double startY;
	private double endX;
	private double endY;
	
	public Line() {
		length = 1;
	}
	public Line(int length, int thick){
		this.length = length;
		this.thick = thick;
		startX = 0;
		startY = 0;
		endX = 0;
		endY = 0;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getThick() {
		return thick;
	}
	public void setThick(int thick) {
		this.thick = thick;
	}
	public void rotate(int speed){
		
	}

}

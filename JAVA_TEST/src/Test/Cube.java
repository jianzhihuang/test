package Test;



public class Cube {
	double length;
	 
	public Cube() {
		// TODO Auto-generated constructor stub
	}
	public Cube(double length) throws Cube_Exception{
		// TODO Auto-generated constructor stub
		setLength(length);
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) throws Cube_Exception {
		if (length <= 0) {
			throw new Cube_Exception("正立方體邊長不得為0或是負數");
		}else {
			this.length = length;
		}
		
		
	}
	public double print() {
	 return	Math.pow(getLength(), 3);
	}

}

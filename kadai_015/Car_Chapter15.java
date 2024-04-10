package kadai_015;

public class Car_Chapter15 {
	private int gear      = 1;
	private int speed     = 10;
	private int afterSpeed = 1;
	
	public Car_Chapter15 ( int gear, int speed ) {
		this.gear  = gear;
		this.speed = speed;
	}
	
	public void gearChange (final int afterGear) {
		afterSpeed = afterGear * 10;
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
	}
	
	public void run () {
		
		System.out.println("速度は時速" + afterSpeed + "kmです");
	}
}

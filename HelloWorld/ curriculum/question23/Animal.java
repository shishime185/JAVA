package question23;

class Animal {
	private String name;
	private double length;
	private double speed;
	
	public static void main(String[] args) {
		Animal lion = new Animal();
		lion.setName("ライオン");
		lion.setLength(2.1);
		lion.setSpeed(80.0);

		System.out.println("動物名：" + lion.getName());
		System.out.println("体長：" + lion.getLength() + "m");
		System.out.println("速度：" + lion.getSpeed() + "km/h");
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLength() {
		return this.length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getSpeed() {
		return this.speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;

	}

}


public class Bird {
	static int id;
	static float averageHeight;
	static double averageSpeed;
	static boolean hasWings;
	static String name;

	int idI;
	float averageHeightH;
	double averageSpeedS;
	boolean hasWingsW;
	String nameN;

	public void fly() {
		System.out.println("Bird : fly()");
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Bird.id = id;
	}

	public static float getAverageHeight() {
		return averageHeight;
	}

	public static void setAverageHeight(float averageHeight) {
		Bird.averageHeight = averageHeight;
	}

	public static double getAverageSpeed() {
		return averageSpeed;
	}

	public static void setAverageSpeed(double averageSpeed) {
		Bird.averageSpeed = averageSpeed;
	}

	public static boolean isHasWings() {
		return hasWings;
	}

	public static void setHasWings(boolean hasWings) {
		Bird.hasWings = hasWings;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Bird.name = name;
	}

	public int getIdI() {
		return idI;
	}

	public void setIdI(int idI) {
		this.idI = idI;
	}

	public float getAverageHeightH() {
		return averageHeightH;
	}

	public void setAverageHeightH(float averageHeightH) {
		this.averageHeightH = averageHeightH;
	}

	public double getAverageSpeedS() {
		return averageSpeedS;
	}

	public void setAverageSpeedS(double averageSpeedS) {
		this.averageSpeedS = averageSpeedS;
	}

	public boolean isHasWingsW() {
		return hasWingsW;
	}

	public void setHasWingsW(boolean hasWingsW) {
		this.hasWingsW = hasWingsW;
	}

	public String getNameN() {
		return nameN;
	}

	public void setNameN(String nameN) {
		this.nameN = nameN;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(averageHeightH);
		long temp;
		temp = Double.doubleToLongBits(averageSpeedS);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (hasWingsW ? 1231 : 1237);
		result = prime * result + idI;
		result = prime * result + ((nameN == null) ? 0 : nameN.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bird other = (Bird) obj;
		if (Float.floatToIntBits(averageHeightH) != Float.floatToIntBits(other.averageHeightH))
			return false;
		if (Double.doubleToLongBits(averageSpeedS) != Double.doubleToLongBits(other.averageSpeedS))
			return false;
		if (hasWingsW != other.hasWingsW)
			return false;
		if (idI != other.idI)
			return false;
		if (nameN == null) {
			if (other.nameN != null)
				return false;
		} else if (!nameN.equals(other.nameN))
			return false;
		return true;
	}

}

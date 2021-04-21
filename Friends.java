package mapInterface;

// IN CASE OF CUSTOM OBJECTS
public class Friends {
	String name;
	int roll_number;

	public Friends(String name, int roll_number) {

		this.name = name;
		this.roll_number = roll_number;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public int getroll_number() {

		return roll_number;
	}

	public void setRoll_number(int roll_number) {

		this.roll_number = roll_number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + roll_number;
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
		Friends other = (Friends) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (roll_number != other.roll_number)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Friends [name=" + name + ", roll_number=" + roll_number + "]";
	}

}

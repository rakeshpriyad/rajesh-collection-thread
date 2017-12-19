package collections;

public enum MyNumber {
	
	ONE(1, "one"), TWO(2, "two"), THR(3, "threee");

	private Integer val;

	private String description;

	public Integer getVal() {
		return val;
	}

	public String getDescription() {
		return description;
	}

	MyNumber(Integer val, String description) {
		this.val = val;
		this.description = description;
	}

	
}

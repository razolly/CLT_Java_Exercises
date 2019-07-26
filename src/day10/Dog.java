package day10;

public class Dog {

	private String mDogName;
	private String mDogBreed;
	private int mDogAge;
	private int mDogWeight;
	private boolean mDogIsHappy;

	public Dog(String name, String breed) {
		this.mDogName = name;
		this.mDogBreed = breed;
		this.mDogWeight = 5;
	}

	public String getName() {
		return mDogName;
	}

	public void setName(String name) {
		mDogName = name;
	}

	public int getWeight() {
		return mDogWeight;
	}

	public void setWeight(int weight) {
		mDogWeight = weight;
	}

	public void eat() {
		System.out.println("Yuum that was delicious");
		mDogWeight += 5;
	}

	public void play() {
		mDogIsHappy = true;
	}

	public Object getBreed() {
		return mDogBreed;
	}
}

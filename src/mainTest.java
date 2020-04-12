
public class mainTest {
	public static void main(String[] args) {
		ClothingType testType1 = new Shirt(new Blue());
		ClothingType testType2 = new Pants(new Blue());
		ClothingType testType3 = new Pants(new Red());
		ClothingType testType4 = new Shirt(new Red());
		testType1.listClothingType();
		testType2.listClothingType();
		testType3.listClothingType();
		testType4.listClothingType();

	}
}

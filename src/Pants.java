
public class Pants extends ClothingType{
	ClothingColor color;
	public String type = "";
	public Pants(ClothingColor newColor) {
		super(newColor);
		color = newColor;
		type = "Pants";
	}
	@Override
	public void listClothingType() {
		System.out.println("This piece of clothing is: " + color.getColor() + " " + type);
		
	}
}


public class Shirt extends ClothingType{
	ClothingColor color;
	public String type = "";
	public Shirt(ClothingColor newColor) {
		super(newColor);
		color = newColor;
		type = "Shirt";
		
	}
	@Override
	public void listClothingType() {
		System.out.println("This piece of clothing is: " + color.getColor() + " " + type);
	}

}

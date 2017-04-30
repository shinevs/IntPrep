package Test1;

interface shape {
	public void draw();
}

class Rectanle implements shape {
	@Override
	public void draw() {
		System.out.println("Rectangle");
	}
}

interface colour {
	void paint();
}

class Red implements colour {
	@Override
	public void paint() {
		System.out.println("colour");
	}
}

abstract class absFactory {
	abstract shape getShape(String shape);

	abstract colour getColour(String colour);
}

class shapeFactory extends absFactory {

	@Override
	shape getShape(String shape) {
		if (shape == null)
			return null;
		else if (shape.equals("rectangle"))
			return new Rectanle();

		return null;
	}

	@Override
	colour getColour(String colour) {
		// TODO Auto-generated method stub
		return null;
	}

}

public class AbstractFactory {

}

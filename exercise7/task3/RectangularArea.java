package exercise7.task3;

/**
 * Code exercise from "Foundational Java: Key Elements and Practical Programming" 2nd Edition, Springer, 2020
 * 
 * @author David Parsons
 * 
 * Exercise 10.2
 * 
 * RectanguarArea class for testing - NOTE: contains a deliberate bug!!
 */

public class RectangularArea
{
	private int width;
	private int height;

	public RectangularArea(int width, int height)
	{
		setWidth(width);
		setHeight(height);
	}

	public int getWidth()
	{
		return width;
	}

	public void setWidth(int width)
	{
		this.width = width;
	}

	public int getHeight()
	{
		return height;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}

	public int getArea()
	{
		return getWidth() * getHeight();
	}

	public int getPerimeter()
	{
		return (getWidth() * 2) + (getHeight() * 2);
	}

	public String getOrientation()
	{
		if (getWidth() > getHeight())
		{
			return "landscape";
		}
		else
		{
			return "portrait";
		}
	}

	public Boolean isSquare()
	{
		if (getWidth() == getHeight())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

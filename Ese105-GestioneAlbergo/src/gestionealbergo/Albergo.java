package gestionealbergo;

import java.util.Vector;

public class Albergo
{
	private Vector<Camera>camera;	

	public Albergo(Vector<Camera> camera) 
	{
		super();
		this.camera = camera;
	}

	public Vector<Camera> getCamera()
	{
		return camera;
	}
	
	
}

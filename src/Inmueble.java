public class Inmueble {
	private String direccion;
	private int codigopostal;
	private int pisos;

	public void setDireccion (String dir){
		direccion = dir;
	}
	public String getDireccion(){
		return direccion;
	}

	public void setCodigoPostal (int cp){
		codigopostal = cp;
	}
	public int getCodigoPostal(){
		return codigopostal;
	}

	public void setPisos (int piso){
		pisos = piso;
	}
	public int getPisos(){
		return pisos;
	}
}

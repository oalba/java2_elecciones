public class EspacioPublico {
	protected int extension;
	protected String direccion;

	public EspacioPublico(int extension, String direccion){
		this.extension = extension;
		this.direccion = direccion;
	}

	/*public EspacioPublico(int extension, String direccion) {
		this.Extension = extension;
		this.Direccion = direccion;
	}*/

	public void setExtension (int ex){
		extension = ex;
	}
	public int getExtension(){
		return extension;
	}

	public void setDireccion (String dir){
		direccion = dir;
	}
	public String getDireccion(){
		return direccion;
	}
}
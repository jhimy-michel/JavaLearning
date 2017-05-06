package Colecciones;

public class Libros {
	
	public Libros(String titulo,String autor,int ISBN){
		this.titulo=titulo;
		this.autor=autor;
		this.ISBN=ISBN;
	}
	public String getDatos(){
		return "El titulo es: "+titulo+" autor: "+autor+" Y el ISBN: "+ISBN;
	}
	/*public boolean equals(Object obj){
		if(obj instanceof Libros){//preguntamos si es una instancia de la clas
			Libros otro =(Libros)obj;
			if(this.ISBN==otro.ISBN){//comparamos los ISBN
				return true;
			}else{return false;}
		}else{return false;}
		
	}*/
	
	
	private String titulo;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ISBN;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}
	/********************/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libros other = (Libros) obj;
		if (ISBN != other.ISBN)
			return false;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}


	private String autor;
	private int ISBN;
}

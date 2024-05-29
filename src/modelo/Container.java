package modelo;

import java.util.Arrays;

import interfaces.Keyable;
import interfaces.Operable;

public class Container implements Operable{
	private int id;
	private int capacidad;
	private int contador;
	private Keyable[] contenedor;
	
	public Container(int id, int capacidad) {
		this.id = id; // Asigna el identificador proporcionado al atributo id
		this.capacidad = capacidad; // Asigna la capacidad proporcionada al atributo capacidad
		contador = 0; // Inicializa el contador de elementos en 0
		contenedor = new Keyable[capacidad]; // Crea un nuevo arreglo con la capacidad especificada
	}
	@Override
	public boolean isEmpty() {
		return contador == 0;
	}
	@Override
	public boolean isFull() {
		return contador == capacidad;
	}
	@Override
	public void add(Keyable item) {
		contenedor[contador] = item;
		contador++;
	}
	@Override
	public boolean exist(int position) {
		return position >= 0;
	}
	@Override
	public int getPosition(String clave) {
		for (int i = 0; i < contador; i++)
			if (contenedor[i].getKey().equals(clave))
				return i;
		return -1;
	}
	
	// Verifica si la posición es válida y el elemento en esa posición es de un tipo específico, luego lo convierte y devuelve
	// De lo contrario, devuelve null
	@Override
	public Keyable getItem(int position) {
		if (position >= 0) {
			if (contenedor[position] instanceof Student sourceStudent) {
				Student targetStudent = new Student();
				moveTo(targetStudent, sourceStudent);
				return targetStudent;
			} 
			if (contenedor[position] instanceof Teacher sourceTeacher) {
				Teacher targetTeacher = new Teacher();
				moveTo(targetTeacher, sourceTeacher);
				return targetTeacher;
			}
			if (contenedor[position] instanceof Book sourceBook) {
				Book targetBook =  new Book();
				moveTo(targetBook, sourceBook);
				return targetBook;
			}
			if (contenedor[position] instanceof Directivos sourceManager) {
				Directivos targetManager = new Directivos();
				moveTo(targetManager, sourceManager);
				return targetManager;
			}
		}
		return null;
	}
	
	// Elimina el elemento en la posición especificada del contenedor
			// Disminuye el contador de elementos
	@Override
	public void remove(int position) {
		for (int i = 0; i < contador; i++)
			contenedor[i] = contenedor[i + 1];
		contador--;
	}
	
	// Actualiza el elemento en la posición especificada del contenedor con el nuevo elemento proporcionado
	@Override
	public void update(Keyable item,int position) {
		if (position >= 0) {
			if (contenedor[position] instanceof Student targetStudent)
				moveTo(targetStudent, (Student) item);
			if (contenedor[position] instanceof Teacher targetTeacher)
				moveTo(targetTeacher, (Teacher) item);
			if (contenedor[position] instanceof Book targetBook)
				moveTo(targetBook, (Book) item);
			if (contenedor[position] instanceof Directivos targetManager)
				moveTo(targetManager, (Directivos) item);
		}
	}
	
	// Devuelve una cadena que representa la lista de elementos en el contenedor
	@Override
	public String getList(String titulo) {
		String data = titulo;
		for (int i = 0; i < contador; i++)
			data += contenedor[i] + "\n";
		return data;
	}
	private void moveTo(Student targetStudent, Student sourceStudent) {
		targetStudent.setNumeroControl(sourceStudent.getNumeroControl());
		targetStudent.setNombre(sourceStudent.getNombre());
		targetStudent.setPaterno(sourceStudent.getPaterno());
		targetStudent.setMaterno(sourceStudent.getMaterno());
		targetStudent.setGenero(sourceStudent.getGenero());
		targetStudent.setDomicilio(sourceStudent.getDomicilio());
		targetStudent.setFechaNacimiento(sourceStudent.getFechaNacimiento());
		targetStudent.setCarrera(sourceStudent.getCarrera());
		targetStudent.setSemestre(sourceStudent.getSemestre());
		targetStudent.setGrupo(sourceStudent.getGrupo());
		targetStudent.setTelefono(sourceStudent.getTelefono());
		targetStudent.setEmail(sourceStudent.getEmail());
	}
	private void moveTo(Teacher targetTeacher, Teacher sourceTeacher) {
		targetTeacher.setCurp(sourceTeacher.getCurp());
		targetTeacher.setRfc(sourceTeacher.getRfc());
		targetTeacher.setNombre(sourceTeacher.getNombre());
		targetTeacher.setPaterno(sourceTeacher.getPaterno());
		targetTeacher.setMaterno(sourceTeacher.getMaterno());
		targetTeacher.setFechaNacimiento(sourceTeacher.getFechaNacimiento());
		targetTeacher.setGenero(sourceTeacher.getGenero());
		targetTeacher.setDomicilio(sourceTeacher.getDomicilio());
		targetTeacher.setPuesto(sourceTeacher.getPuesto());
		targetTeacher.setHorario(sourceTeacher.getHorario());
		targetTeacher.setSueldo(sourceTeacher.getSueldo());
		targetTeacher.setTitulo(sourceTeacher.getTitulo());
		targetTeacher.setAcademia(sourceTeacher.getAcademia());
		targetTeacher.setJefeInmediato(sourceTeacher.getJefeInmediato());
	}
	private void moveTo(Book tarjetBook, Book sourceBook) {
		tarjetBook.setIsbn(sourceBook.getKey());
		tarjetBook.setTitulo(sourceBook.getTitulo());
		tarjetBook.setAutor(sourceBook.getAutor());
		tarjetBook.setEditorial(sourceBook.getEditorial());
		tarjetBook.setEdicion(sourceBook.getEdicion());
		tarjetBook.setIdioma(sourceBook.getIdioma());
		tarjetBook.setVolumen(sourceBook.getVolumen());
	}
	private void moveTo(Directivos targetManager, Directivos sourceManager) {
		targetManager.setCurp(sourceManager.getCurp());
		targetManager.setNombre(sourceManager.getNombre());
		targetManager.setPaterno(sourceManager.getPaterno());
		targetManager.setMaterno(sourceManager.getMaterno());
		targetManager.setGenero(sourceManager.getGenero());
		targetManager.setFechaNacimiento(sourceManager.getFechaNacimiento());
		targetManager.setDomicilio(sourceManager.getDomicilio());
		targetManager.setRfc(sourceManager.getRfc());
		targetManager.setPuesto(sourceManager.getPuesto());
		targetManager.setHorario(sourceManager.getHorario());
		targetManager.setSueldo(sourceManager.getSueldo());
		targetManager.setGradoEstudios(sourceManager.getGradoEstudios());
		targetManager.setTipoDirectivo(sourceManager.getTipoDirectivo());
		targetManager.setCompensacion(sourceManager.getCompensacion());
	}
	
	@Override
	public void ordenar() {
		for (int i = 0; i < (contador-1); i++)
			for (int j = 0; j < contador; j++)
				if (contenedor[i].getAtributeComparable().compareTo(contenedor[j].getAtributeComparable()) > 0) {
					Keyable aux = contenedor[i];
					contenedor[i] = contenedor[j];
					contenedor[j] = aux;
				}
	}
	// Ordena los elementos en el contenedor utilizando el método sort de la clase Arrays
	@Override
	public void sort() {
		Arrays.sort(contenedor, 0, contador);
	}

}

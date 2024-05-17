package guia6;

public class Persona {

	private String name = null;
	private Integer age = 0;
	private String dni;
	private Character gen = 'm';
	private Double weigh = 0.0;
	private Double heigh = 0.0;

	public Persona() {
	}// constructor por defecto

	public Persona(String name, Integer age, Character gen) {// constructor con nombre , edad, gen
		this.name = name;
		this.age = age;
		this.gen = gen;
	}

	public Persona(String name, Integer age, String dni, Character gen, Double weigh, Double heigh) {// constructor con
																										// datos por
																										// parametro

		this.name = name;
		this.age = age;
		this.dni = dni;
		this.gen = gen;
		this.weigh = weigh;
		this.heigh = heigh;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Character getGen() {
		return gen;
	}

	public void setGen(Character gen) {
		this.gen = gen;
	}

	public Double getWeigh() {
		return weigh;
	}

	public void setWeigh(Double weigh) {
		this.weigh = weigh;
	}

	public Double getHeigh() {
		return heigh;
	}

	public void setHeigh(Double heigh) {
		this.heigh = heigh;
	}

	public Integer calcImc(Double weigh, double heigh) {
		int rta = 0;
		double imc = weigh / (Math.pow(heigh, 2));
		if (imc < 20) {
			rta = -1;
		} else {
			if ((20 < imc) && (imc <= 25)) {
				rta = 0;
			} else {
				rta = 1;
			}
		}

		return rta;
	}

	public Boolean mayor(Double age) {
		boolean rta;
		if(age >18)
		{
			rta=true;
		}else 
		{
			rta=false;
		}
		return rta;
	}

}

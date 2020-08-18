package tp.kits3.livedinner.vo;

public class Role {
	private Integer id;
	private String name;
	
	public Role(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Role() {
		super();
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}

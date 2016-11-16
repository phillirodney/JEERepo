import javax.persistence.*;

@Entity
@Table(name="Images")
public class Image {
	
	@Id
	@Column(name="Product ID", nullable=false, unique=true)
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int productID;
	
	@Column(name="Path")
	private String path;

	public Image(String path)
	{
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
}


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "images")
public class Image {

	@Id
	@Column(name = "product_id", nullable = false, unique = true)
	// @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int productID;

	@Column(name = "path")
	private String path;

	public Image(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}

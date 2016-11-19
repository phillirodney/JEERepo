import javax.persistence.*;

public class Image {

/////////////////////This class is Not needed/////////////////////

	private int imageId;


	private String path;

	public Image(){

	}

	public Image(String path) {
		this.path = path;
	}

	public int getImageId(){
		return imageId;
	}

	public void setImageId(){
		this.imageId = imageId;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}

/////////////////////////////////////////////////////////////////////
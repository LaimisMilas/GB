package lt.gb;

import java.io.Serializable;

//objektas turi buti atskirai kitaip neveikia
public class PageItem implements Serializable {

	private static final long serialVersionUID = 1L;
	private String sector;
	private String index;
	private String title;
	private String description;
	private int[] imgPort;
	private int[] imgLand;
	private int soundRes;
	private boolean showTextLand;
	private boolean showTextPort;
	private ImageConfig[] images;

	public PageItem(String title, String desc, int port, int land,
			boolean showText) {
		this.title = title;
		this.description = desc;
	}

	public PageItem() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isShowTextLand() {
		return showTextLand;
	}

	public void setShowTextLand(boolean showTextLand) {
		this.showTextLand = showTextLand;
	}

	public boolean isShowTextPort() {
		return showTextPort;
	}

	public void setShowTextPort(boolean showTextPort) {
		this.showTextPort = showTextPort;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public int getSoundRes() {
		return soundRes;
	}

	public void setSoundRes(int soundRes) {
		this.soundRes = soundRes;
	}

	public int[] getImgPort() {
		return imgPort;
	}

	public void setImgPort(int[] imgPort) {
		this.imgPort = imgPort;
	}

	public int[] getImgLand() {
		return imgLand;
	}

	public void setImgLand(int[] imgLand) {
		this.imgLand = imgLand;
	}

	public ImageConfig[] getImages() {
		return images;
	}

	public void setImages(ImageConfig[] images) {
		this.images = images;
	}
}

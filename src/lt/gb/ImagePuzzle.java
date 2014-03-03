package lt.gb;

import java.io.Serializable;
import java.util.List;

public class ImagePuzzle implements Serializable {

	private static final long serialVersionUID = 6165221563974049780L;
	private int imgRes;
	private boolean isActive;
	private List<Integer> altImg;

	public List<Integer> getAltImg() {
		return altImg;
	}

	public void setAltImg(List<Integer> altImg) {
		this.altImg = altImg;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getImgRes() {
		return imgRes;
	}

	public void setImgRes(int imgRes) {
		this.imgRes = imgRes;
	}

}

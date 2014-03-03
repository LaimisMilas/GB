package lt.gb;

import java.io.Serializable;

public class ImageConfig implements Serializable{

	private static final long serialVersionUID = 1L;
	private int res;
	private boolean isVisible = false;
	private boolean isBitmap = true;
	private boolean isBackGround = false;
	
	public ImageConfig(int res, boolean visible) {
		this.res = res;
		this.isVisible = visible;
	}
	
	public ImageConfig(int res, boolean visible, boolean isBitmap ) {
		this.res = res;
		this.isVisible = visible;
		this.isBitmap = isBitmap;
	}
	
	public ImageConfig(int res, boolean visible, boolean isBitmap, boolean isBackGround) {
		this.res = res;
		this.isVisible = visible;
		this.isBitmap = isBitmap;
		this.isBackGround = isBackGround;
	}
	
	public int getRes() {
		return res;
	}
	public void setRes(int res) {
		this.res = res;
	}
	public boolean isVisible() {
		return isVisible;
	}
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	public boolean isBitmap() {
		return isBitmap;
	}
	public void setBitmap(boolean isBitmap) {
		this.isBitmap = isBitmap;
	}

	public boolean isBackGround() {
		return isBackGround;
	}

	public void setBackGround(boolean isBackGround) {
		this.isBackGround = isBackGround;
	}
}

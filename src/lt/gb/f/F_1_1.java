package lt.gb.f;


import lt.gb.PageItem;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

@SuppressLint("ValidFragment")
public class F_1_1 extends B_F {

	public F_1_1() {
	}

	public static F_1_1 newInstance(PageItem item) {
		F_1_1 f = new F_1_1(item);
		Bundle args = new Bundle();
		f.setArguments(args);
		return f;
	}

	public F_1_1(PageItem item) {
		pageItem = item;
	}

	boolean isBoxClosed = false;
	boolean is_gegute_yra = false;
	boolean is_pasvires = false;

	@Override
	protected void onImageClick(View paramView, MotionEvent paramMotionEvent) {

		float x = paramMotionEvent.getX();
		float y = paramMotionEvent.getY();

		// float w = sreenWidth / 8; //reikia nuotrauokos parametru
		float w = paramView.getWidth() / 8; // reikia nuotrauokos parametru

		// float h = screenHeight / 4; //reikia nuotrauokos parametru
		float h = paramView.getHeight() / 4; // reikia nuotrauokos parametru

		// dezutes atidarymas
		if (x > w * 3 && x < w * 4) {
			if (y > h * 1 && y < h * 3) {
				// layerDrawable.setDrawableByLayerId(id, drawable);
				if (layerDrawable.getDrawable(1).getIntrinsicWidth() > 0) {
					layerDrawable.getDrawable(1).setAlpha(0);
				} else {
					layerDrawable.setDrawableByLayerId(
							1,
							createBitmapDrawable(
									pageItem.getImages()[1].getRes(),
									screenWidth, screenHeight));
					layerDrawable.getDrawable(1).setAlpha(0);
				}
				if (layerDrawable.getDrawable(2).getIntrinsicWidth() > 0) {
					layerDrawable.getDrawable(2).setAlpha(0);
				} else {
					layerDrawable.setDrawableByLayerId(
							2,
							createBitmapDrawable(
									pageItem.getImages()[2].getRes(),
									screenWidth, screenHeight));
					layerDrawable.getDrawable(2).setAlpha(0);
				}
				if (layerDrawable.getDrawable(4).getIntrinsicWidth() > 0) {
					layerDrawable.getDrawable(4).setAlpha(0);
				} else {
					layerDrawable.setDrawableByLayerId(
							4,
							createBitmapDrawable(
									pageItem.getImages()[4].getRes(),
									screenWidth, screenHeight));
					layerDrawable.getDrawable(4).setAlpha(0);
				}
				if (layerDrawable.getDrawable(5).getIntrinsicWidth() > 0) {
					layerDrawable.getDrawable(5).setAlpha(0);
				} else {
					layerDrawable.setDrawableByLayerId(
							5,
							createBitmapDrawable(
									pageItem.getImages()[5].getRes(),
									screenWidth, screenHeight));
					layerDrawable.getDrawable(5).setAlpha(0);
				}

				if (isBoxClosed && is_pasvires) {
					layerDrawable.getDrawable(4).setAlpha(255);
					isBoxClosed = false;
					return;
				}
				if (isBoxClosed && !is_pasvires) {
					layerDrawable.getDrawable(1).setAlpha(255);
					isBoxClosed = false;
					return;
				}
				if (!isBoxClosed && is_pasvires) {
					layerDrawable.getDrawable(5).setAlpha(255);
					isBoxClosed = true;
					return;
				}
				if (!isBoxClosed && !is_pasvires) {
					layerDrawable.getDrawable(2).setAlpha(255);
					isBoxClosed = true;
					return;
				}
			}
		}
		// laikrodzio atidarymas
		if (w * 3 > x && x < w * 4) {
			// laikrodis atidarytas

		}
		// senelio pasvyrimas
		if (x > w * 1 && x < w * 3) {
			if (y > h * 1 && y < h * 4) {
				if (layerDrawable.getDrawable(1).getIntrinsicWidth() > 0) {
					layerDrawable.getDrawable(1).setAlpha(0);
				} else {
					layerDrawable.setDrawableByLayerId(
							1,
							createBitmapDrawable(
									pageItem.getImages()[1].getRes(),
									screenWidth, screenHeight));
					layerDrawable.getDrawable(1).setAlpha(0);
				}
				if (layerDrawable.getDrawable(2).getIntrinsicWidth() > 0) {
					layerDrawable.getDrawable(2).setAlpha(0);
				} else {
					layerDrawable.setDrawableByLayerId(
							2,
							createBitmapDrawable(
									pageItem.getImages()[2].getRes(),
									screenWidth, screenHeight));
					layerDrawable.getDrawable(2).setAlpha(0);
				}
				if (layerDrawable.getDrawable(4).getIntrinsicWidth() > 0) {
					layerDrawable.getDrawable(4).setAlpha(0);
				} else {
					layerDrawable.setDrawableByLayerId(
							4,
							createBitmapDrawable(
									pageItem.getImages()[4].getRes(),
									screenWidth, screenHeight));
					layerDrawable.getDrawable(4).setAlpha(0);
				}
				if (layerDrawable.getDrawable(5).getIntrinsicWidth() > 0) {
					layerDrawable.getDrawable(5).setAlpha(0);
				} else {
					layerDrawable.setDrawableByLayerId(
							5,
							createBitmapDrawable(
									pageItem.getImages()[5].getRes(),
									screenWidth, screenHeight));
					layerDrawable.getDrawable(5).setAlpha(0);
				}

				if (isBoxClosed && is_pasvires) {
					layerDrawable.getDrawable(2).setAlpha(255);
					is_pasvires = false;
					return;
				}
				if (isBoxClosed && !is_pasvires) {
					layerDrawable.getDrawable(5).setAlpha(255);
					is_pasvires = true;
					return;
				}
				if (!isBoxClosed && is_pasvires) {
					layerDrawable.getDrawable(1).setAlpha(255);
					is_pasvires = false;
					return;
				}
				if (!isBoxClosed && !is_pasvires) {
					layerDrawable.getDrawable(4).setAlpha(255);
					is_pasvires = true;
					return;
				}
			}
		}

	}

	@Override
	protected void defaultImageConfig() {
		// layerDrawable.getDrawable(2).setAlpha(0);
		// layerDrawable.getDrawable(3).setAlpha(0);
		// layerDrawable.getDrawable(4).setAlpha(0);
		// layerDrawable.getDrawable(5).setAlpha(0);
		runEngine();
	}

	/**
	 * Kada ant paveiksliuko paspaudzia ir paspaudimo kordinaciu vieta sutampa
	 * su is anksto nustatytom kardinatem atliekamas veiksmas, sukeciantis
	 * paveikslus
	 **/

	private void runEngine() {

	}

}
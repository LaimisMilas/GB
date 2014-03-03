package lt.gb.f2;

import lt.gb.BaseManager;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import android.widget.ImageView;

public class HCHelper {

	protected static DisplayMetrics metrics = BaseManager.getInstance()
			.getMetrics();

	public static BitmapFactory.Options getOptions() {
		BitmapFactory.Options options = new BitmapFactory.Options();
		options.inDensity = metrics.densityDpi;
		return options;
	}

	@SuppressLint("UseValueOf")
	public static void updateImageSize(ImageView img, int drawResource) {

		BitmapFactory.Options options = getOptions();

		Bitmap bitmap = BitmapFactory.decodeResource(img.getContext()
				.getResources(), drawResource, options);

		float outImgWidth = options.outWidth;
		float outImgHeight = options.outHeight;

		switch (resizeUp) {
		case 0:
			outImgWidth = outImgWidth * resizeRatio;
			outImgHeight = outImgHeight * resizeRatio;
			break;
		case 1:
			outImgWidth = outImgWidth / resizeRatio;
			outImgHeight = outImgHeight / resizeRatio;
			break;
		default:
			break;
		}

		Bitmap resizedBitmap = Bitmap.createScaledBitmap(bitmap, new Float(
				outImgWidth).intValue(), new Float(outImgHeight).intValue(),
				true);

		img.setImageBitmap(resizedBitmap);
	}

	public static int resizeRatio = 1;
	public static int resizeUp = 2;

	public static void setResizeRatio(int screenHeight, int imageHeight) {
		if (screenHeight > imageHeight) {
			resizeRatio = screenHeight / imageHeight;
			resizeUp = 1;
		} else if (screenHeight < imageHeight) {
			resizeRatio = imageHeight / screenHeight;
			resizeUp = 0;
		} else if (screenHeight == imageHeight) {
			resizeRatio = 1;
			resizeUp = 2;
		}
	}

}

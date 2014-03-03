package lt.gb.f2;

import lt.gb.BaseManager;
import lt.gb.BaseUtils;
import lt.gb.ImageConfig;
import lt.gb.PageItem;
import lt.gb.R;
import lt.gb.BaseUtils.Orentation;
import android.annotation.SuppressLint;
import android.app.ActionBar.LayoutParams;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

@SuppressLint("ValidFragment")
public class PirmasSkyriusPirmoLapoFragmentas extends Fragment {

	public static final String TAG = "PirmasSkyriusPirmoLapoFragmentas";
	private RelativeLayout rootView;
	private PageItem pItem;

	public PirmasSkyriusPirmoLapoFragmentas() {
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		PageItem p_1_1 = new PageItem();
		{
			p_1_1.setSector("1");
			p_1_1.setIndex("1_2");
			p_1_1.setTitle(getString(R.string.t_1));
			p_1_1.setDescription(getString(R.string.p_1_1));
			ImageConfig[] images = new ImageConfig[6];
			images[0] = new ImageConfig(R.drawable.land_1_1, false);
			images[1] = new ImageConfig(R.drawable.land_1_1_1, false);
			images[2] = new ImageConfig(R.drawable.land_1_1_2, false);
			images[3] = new ImageConfig(R.drawable.land_1_1_3, false);
			images[4] = new ImageConfig(R.drawable.land_1_1_4, false);
			images[5] = new ImageConfig(R.drawable.land_1_1_5, false);
			p_1_1.setImages(images);
			p_1_1.setSoundRes(R.raw.s_1);
		}

		pItem = p_1_1;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		super.onCreateView(inflater, container, savedInstanceState);

		rootView = (RelativeLayout) inflater.inflate(
				R.layout.pirmas_skyrius_pirma_dalis, container, false);

		{
			ImageView imag = createImageView();

			HCHelper.updateImageSize(imag,
					R.drawable.senelis_uzdaryta_dez_tiesus);

			imag.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					
				}
			});
				
			rootView.addView(imag, 0);
		}
		{
			ImageView imag = createImageView();

			HCHelper.updateImageSize(imag,
					R.drawable.senelis_atidaryta_dez_tiesus);

			rootView.addView(imag, 1);
		}
		{
			ImageView imag = createImageView();

			HCHelper.updateImageSize(imag,
					R.drawable.senelis_uzdaryta_dez);

			rootView.addView(imag, 2);
		}
		{
			ImageView imag = createImageView();

			HCHelper.updateImageSize(imag,
					R.drawable.senelis_uzdaryta_dez_tiesus);

			rootView.addView(imag, 3);
		}
		return rootView;
	}

	@SuppressLint("NewApi")
	public ImageView createImageView() {

		/*
		 * <ImageView android:id="@+id/senelis_uzdaryta_dez"
		 * android:layout_width="wrap_content"
		 * android:layout_height="wrap_content" android:layout_margin="0dp"
		 * android:padding="0dp" android:src="@drawable/senelis_uzdaryta_dez" />
		 */

		ImageView img = new ImageView(getActivity().getApplicationContext());
		img.setPadding(0, 0, 0, 0);
		LayoutParams lp = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);
		lp.setMargins(0, 0, 0, 0);
		img.setLayoutParams(lp);

		return img;
	}

}

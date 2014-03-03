package lt.gb.f.c;

import lt.gb.R;
import lt.gb.SectorsForkFragment;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class FS_4 extends Fragment {

	protected static final String TAG = FS_4.class.getName();
	
	public static FS_4 newInstance() {
		FS_4 f = new FS_4();
		Bundle args = new Bundle();
		f.setArguments(args);
		return f;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		rootView = inflater.inflate(R.layout.sector_item, container, false);
		pagerImg = (ImageView) rootView.findViewById(R.id.a_img);
		pagerImg.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				SectorsForkFragment sectorFragment = new SectorsForkFragment();
				sectorFragment.setSector('4');
				FragmentManager fm = getActivity().getSupportFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				ft.replace(R.id.fragment_layout, sectorFragment,
						SectorsForkFragment.TAG);
				ft.commit();
				fm.executePendingTransactions();
			}
		});
		setImageResource(R.drawable.t_trauk_4);
		pagerImg.setLayoutParams(new LinearLayout.LayoutParams(new Float(newWidth).intValue(),
				 new Float(newHeight).intValue()));
		return rootView;
	}
	
	protected int densityDpi;
	private ImageView pagerImg;
	private View rootView;
	private int sreenWidth;
	float newWidth = 0;
	float newHeight = 0;

	public void setImageResource(int res) {

		pagerImg.setImageBitmap(getBitmap(res));
	}

	private Bitmap getBitmap(int res) {

		DisplayMetrics metrics = new DisplayMetrics();
		getActivity().getWindowManager().getDefaultDisplay()
				.getMetrics(metrics);

		BitmapFactory.Options options = new BitmapFactory.Options();
		options.inDensity = metrics.densityDpi;
		Resources r = getResources();
		Bitmap bitmap = BitmapFactory.decodeResource(r, res, options);

		newWidth = 0;
		newHeight = 0;

		float outImgWidth = options.outWidth;
		float outImgHeight = options.outHeight;

		sreenWidth = metrics.widthPixels;

		float sc = 0;

		if (sreenWidth > outImgWidth) {
			sc = sreenWidth / outImgWidth;
		} else {
			sc = outImgWidth / sreenWidth;
		}

		sc = sc < 0 ? sc * (-1) : sc;
		sc = sc < 1 ? 1 : sc;

		newWidth = sreenWidth;
		if (outImgWidth < sreenWidth) {
			newHeight = outImgHeight * sc;
		} else {
			newHeight = outImgHeight / sc;
		}

		Bitmap resizedBitmap = Bitmap.createScaledBitmap(bitmap, new Float(
				newWidth).intValue(), new Float(newHeight).intValue(), true);

		System.gc();

		return resizedBitmap;
	}
}
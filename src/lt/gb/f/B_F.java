package lt.gb.f;

import java.util.ArrayList;
import java.util.List;


import lt.gb.BaseManager;
import lt.gb.BaseUtils;
import lt.gb.BaseUtils.Orentation;
import lt.gb.ImageConfig;
import lt.gb.MainFragment;
import lt.gb.PageItem;
import lt.gb.R;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.LayerDrawable;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.Html;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public abstract class B_F extends Fragment {

	protected PageItem pageItem;
	protected ImageView pagerImg;
	protected TextView pagerDesc;
	protected Button button;
	protected TextView pagerText;
	protected View rootView;
	protected float screenHeight;
	protected float screenWidth;
	protected boolean textVisible = false;
	protected View m_liner;
	protected ScrollView scroll;
	protected int densityDpi;
	protected DisplayMetrics metrics;
	protected Button button1;
	protected Button button2;
	protected MediaPlayer mp;
	protected int sreenWidth;
	protected int sreenHeight;
	protected float newWidth = 0;
	protected float newHeight = 0;
	protected int mwidth;
	protected int mheight;
	protected LayerDrawable layerDrawable;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		if (savedInstanceState != null
				&& savedInstanceState.containsKey("pageItem")) {
			pageItem = (PageItem) savedInstanceState
					.getSerializable("pageItem");
		}

		metrics = BaseManager.getInstance().getMetrics();

		screenHeight = metrics.heightPixels;
		screenWidth = metrics.widthPixels;
		densityDpi = metrics.densityDpi;
	}

	protected void swithElements(boolean a) {

		if (a) {
			rootView.findViewById(R.id.m_liner).setVisibility(View.VISIBLE);
			setImageResource(2);
			pagerImg.invalidate();

		} else {
			rootView.findViewById(R.id.m_liner).setVisibility(View.GONE);
			setImageResource(1);
			pagerImg.invalidate();
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		rootView = inflater.inflate(R.layout.pager_item, container, false);
		pagerDesc = (TextView) rootView.findViewById(R.id.m_desc);
		pagerDesc.setText(Html.fromHtml(pageItem.getDescription()));
		pagerImg = (ImageView) rootView.findViewById(R.id.m_image);
		scroll = (ScrollView) rootView.findViewById(R.id.m_liner);
		button = (Button) rootView.findViewById(R.id.s_button);
		button1 = (Button) rootView.findViewById(R.id.s_sound);
		button2 = (Button) rootView.findViewById(R.id.m_sector);
		pagerText = (TextView) rootView.findViewById(R.id.m_text);

		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (textVisible) {
					swithElements(false);
					defaultImageConfig();
					textVisible = false;
				} else {
					swithElements(true);
					defaultImageConfig();
					textVisible = true;
				}
			}
		});

		button1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				if (getMp() == null) {
					setMp(MediaPlayer.create(B_F.this.getActivity(),
							pageItem.getSoundRes()));

					getMp().setOnCompletionListener(new OnCompletionListener() {
						@Override
						public void onCompletion(MediaPlayer mp) {
							mp.stop();
						}
					});
				}

				if (getMp() != null) {
					if (getMp().isPlaying()) {
						getMp().stop();
						setMp(null);
					} else {
						getMp().start();
					}
				}
			}
		});

		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				MainFragment mainFragment = new MainFragment();
				mainFragment.setActivePage(1);
				FragmentManager fm = getActivity().getSupportFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				ft.replace(R.id.fragment_layout, mainFragment, MainFragment.TAG);
				ft.commit();
				fm.executePendingTransactions();
			}
		});

		pagerImg.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View paramView, MotionEvent paramMotionEvent) {

				onImageClick(paramView, paramMotionEvent);

				return false;
			}
		});

		swithElements(false);
		defaultImageConfig();
		pagerText.setText(pageItem.getTitle());

		return rootView;
	}

	public MediaPlayer getMp() {
		return mp;
	}

	public void setMp(MediaPlayer mp) {
		this.mp = mp;
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putSerializable("pageItem", pageItem);
	}

	public BitmapFactory.Options getOptions() {
		BitmapFactory.Options options = new BitmapFactory.Options();
		options.inDensity = metrics.densityDpi;
		return options;
	}

	public Bitmap resizeBitmap(int res, float w, float h,
			BitmapFactory.Options options) {
		Bitmap bitmap = BitmapFactory.decodeResource(getResources(), res,
				options);

		float outImgWidth = options.outWidth;
		float outImgHeight = options.outHeight;

		float sc = 0;

		if (w > outImgWidth) {
			sc = w / outImgWidth;
		} else {
			sc = outImgWidth / w;
		}

		sc = sc < 0 ? sc * (-1) : sc;
		sc = sc < 1 ? 1 : sc;

		if (outImgWidth < w) {
			h = outImgHeight * sc;
		} else {
			h = outImgHeight / sc;
		}

		if (BaseUtils.getOrentation(getActivity()) == Orentation.PORTRET
				&& outImgHeight > h) {

			sc = outImgHeight / h;
			sc = sc < 0 ? sc * (-1) : sc;
			sc = sc < 1 ? 1 : sc;

			if (outImgHeight < h) {
				w = outImgWidth * sc;
			} else {
				w = outImgWidth / sc;
			}
		}

		Bitmap resizedBitmap = Bitmap.createScaledBitmap(bitmap,
				new Float(w).intValue(), new Float(h).intValue(), true);

		return resizedBitmap;
	}

	public BitmapDrawable createBitmapDrawable(int res, float sWidth,
			float sHeight) {
		BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(),
				resizeBitmap(res, sWidth, sHeight, getOptions()));
		bitmapDrawable.setGravity(Gravity.CENTER);

		return bitmapDrawable;
	}

	@SuppressWarnings("deprecation")
	public void setImageResource(int isFullSize) {

		ImageConfig[] images = null;

		if (BaseUtils.getOrentation(getActivity()) == Orentation.PORTRET) {
			images = pageItem.getImages();
		} else {
			images = pageItem.getImages();
		}

		newWidth = 0;
		newHeight = 0;

		sreenWidth = metrics.widthPixels;
		sreenHeight = metrics.heightPixels;

		if (images != null) {

			List<BitmapDrawable> layers = new ArrayList<BitmapDrawable>();

			for (int i = 0; i < images.length; i++) {

				if (BaseUtils.getOrentation(getActivity()) != Orentation.PORTRET) {
					sreenWidth = sreenWidth / isFullSize;
				} else {
					sreenHeight = sreenHeight / isFullSize;
				}
				BitmapDrawable imgbd = null;

				if (!images[i].isVisible()) {
					imgbd = new BitmapDrawable();
				} else {
					imgbd = createBitmapDrawable(images[i].getRes(),
							sreenWidth, sreenHeight);
				}
				layers.add(imgbd);

				System.gc();
			}

			layerDrawable = new LayerDrawable(
					layers.toArray(new BitmapDrawable[layers.size()]));
			// layerDrawable = new LayerDrawable(new
			// BitmapDrawable[images.length]);

			for (int e = 0; e < layers.size(); e++) {
				layerDrawable.setId(e, e);
			}

			pagerImg.setImageDrawable(layerDrawable);

			// sprendzia problema kada port/land
			// keicia LP parametras kada keiciasi teksto matomumas
			RelativeLayout.LayoutParams rlp = (RelativeLayout.LayoutParams) pagerImg
					.getLayoutParams();

			if (isFullSize == 2) {
				rlp.width = LayoutParams.WRAP_CONTENT;
				rlp.height = LayoutParams.WRAP_CONTENT;

			} else {
				rlp.width = LayoutParams.MATCH_PARENT;
				rlp.height = LayoutParams.MATCH_PARENT;
			}
			// pasalina defaultini paddinga
			// pagerImg.setPadding(0, -30, 0, -30);
			System.gc();
		}
	}

	protected abstract void defaultImageConfig();

	protected abstract void onImageClick(View paramView,
			MotionEvent paramMotionEvent);
}

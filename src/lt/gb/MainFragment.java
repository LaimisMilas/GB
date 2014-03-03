package lt.gb;

import lt.gb.adapter.Main_Adapter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment extends Fragment {

	public static final String TAG = MainFragment.class.toString();
	private int activePage;
	private ViewPager pager;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (savedInstanceState != null
				&& savedInstanceState.containsKey("activePage")) {
			activePage = savedInstanceState.getInt("activePage");
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);

		View rootView = inflater.inflate(R.layout.main_page, null);

		pager = (ViewPager) rootView.findViewById(R.id.ai_buttons);

		pager.setAdapter(new Main_Adapter(getChildFragmentManager()));

		if (activePage != 0) {
			pager.setCurrentItem(activePage);
		}

		pager.setOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageScrolled(int paramInt1, float paramFloat,
					int paramInt2) {
			}

			@Override
			public void onPageSelected(int paramInt) {
				activePage = paramInt;
			}

			@Override
			public void onPageScrollStateChanged(int paramInt) {
			}
		});

		return rootView;
	}

	@Override
	public void onStop() {
		super.onStop();
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		if (pager != null) {
			outState.putInt("activePage", activePage);
		}
	}

	public void setActivePage(int i) {
		this.activePage = i;
	}
}

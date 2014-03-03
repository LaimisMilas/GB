package lt.gb;

import lt.gb.adapter.Sector_Adapter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SectorsFragment extends Fragment {

	public static final String TAG = SectorsFragment.class.toString();
	private ViewPager pager;

	public static SectorsFragment newInstance() {
		SectorsFragment f = new SectorsFragment();
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
		super.onCreateView(inflater, container, savedInstanceState);

		View rootView = inflater.inflate(R.layout.main_page, null);

		pager = (ViewPager) rootView.findViewById(R.id.ai_buttons);
		pager.setAdapter(new Sector_Adapter(getChildFragmentManager()));

		return rootView;
	}

	@Override
	public void onStop() {
		super.onStop();
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
	}
}

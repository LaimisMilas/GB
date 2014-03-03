package lt.gb;

import lt.gb.adapter.B_S_Adapter;
import lt.gb.adapter.S_1_Adapter;
import lt.gb.adapter.S_2_Adapter;
import lt.gb.adapter.S_3_Adapter;
import lt.gb.adapter.S_4_Adapter;
import lt.gb.adapter.S_5_Adapter;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SectorsForkFragment extends Fragment {

	// skyriaus numeris
	private char sector;
	private ViewPager pager;
	int currentPage = 0;

	public static final String TAG = SectorsFragment.class.toString();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		if (savedInstanceState != null
				&& savedInstanceState.containsKey("sector")) {
			sector = savedInstanceState.getChar("sector");
		}
		if (savedInstanceState != null
				&& savedInstanceState.containsKey("currentPage")) {
			currentPage = savedInstanceState.getInt("currentPage");
		}
	}

	@SuppressLint("NewApi")
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);

		MResources resources = new MResources(this);

		View rootView = inflater.inflate(R.layout.sectors_page, null);

		pager = (ViewPager) rootView.findViewById(R.id.s_pager);

		switch (getSector()) {
		case '1':
			pager.setAdapter(new S_1_Adapter(getChildFragmentManager(),
					resources.getRes_1()));
			break;
		case '2':
			pager.setAdapter(new S_2_Adapter(getChildFragmentManager(),
					resources.getRes_2()));
			break;
		case '3':
			pager.setAdapter(new S_3_Adapter(getChildFragmentManager(),
					resources.getRes_3()));
			break;
		case '4':
			pager.setAdapter(new S_4_Adapter(getChildFragmentManager(),
					resources.getRes_4()));
			break;
		case '5':
			pager.setAdapter(new S_5_Adapter(getChildFragmentManager(),
					resources.getRes_5()));
			break;
		default:
			break;
		}

		pager.setOnPageChangeListener(new OnPageChangeListener() {

			int index = 0;
			int index_2 = 0;

			@Override
			public void onPageScrollStateChanged(int arg0) {

				index = arg0;
				index_2 = 0;

				System.out.println("onPageScrollStateChanged arg0= " + arg0);
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				System.out.println("onPageScrolled arg0= " + arg0 + ", "
						+ "arg1= " + arg1 + ", " + "arg2= " + arg2);

				index_2++;

				// eventas kada eina pirmyn
				if (pager.getAdapter().getCount() == (arg0 + 1) && arg2 == 0
						&& index == 1 && index_2 == 5) {

					int tag = ((B_S_Adapter) pager.getAdapter()).TAG;

					switch (tag) {
					case 'a':
						// turi patekti i 2(a) skyriaus pradzia
						openSector('2');
						break;
					case 'b':
						// turi patekti i 3(a) skyriaus pradzia
						openSector('3');
						break;
					case 'c':
						// turi patekti i 4(b) skyriaus pradzia
						openSector('4'); 
						break;
					case 'd':
						// turi patekti i 5(c) skyriaus pradzia
						openSector('5');
						break;
					case 'e':
						// turi patekti i turiny
						openMein(); // laikinai
						break;
					}

					// System.out.println("tinka paskutinis");
				}

				// eventas, eina atgal
				if (0 == arg0 && arg1 == 0 && arg2 == 0 && index == 1
						&& index_2 == 5) {

					int tag = ((B_S_Adapter) pager.getAdapter()).TAG;

					switch (tag) {
					case 'a':
						// turi patekti i turiny
						openMein();
						break;
					case 'b':
						// turi patekti i 1(a) skyriaus pradzia
						openSector('1');
						// openMein();
						break;
					case 'c':
						// turi patekti i 2(b) skyriaus pradzia
						openSector('2');
						// openMein();
						break;
					case 'd':
						// turi patekti i 3(c) skyriaus pradzia
						openSector('3');
						// openMein();
						break;
					case 'e':
						// turi patekti i 4(d) skyriaus pradzia
						openSector('4');
						// openMein();
						break;
					}

					// System.out.println("tinka pirmas");
				}
			}

			@Override
			public void onPageSelected(int arg0) {
				// Fragment f = ((S_1_Adapter) pager.getAdapter())
				// .getCurrentFragment();
				// ((B_F) f).getMp().stop();
			}

		});

		return rootView;
	}

	private void openMein() {
		MainFragment mainFragment = new MainFragment();
		mainFragment.setActivePage(1);
		FragmentManager fm = getActivity().getSupportFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();
		ft.replace(R.id.fragment_layout, mainFragment, MainFragment.TAG);
		ft.commit();
		fm.executePendingTransactions();
	}

	private void openSector(char sectorNr) {
		SectorsForkFragment fragment = new SectorsForkFragment();
		fragment.setSector(sectorNr);
		FragmentManager fm = getActivity().getSupportFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();
		ft.replace(R.id.fragment_layout, fragment, SectorsForkFragment.TAG);
		ft.commit();
		fm.executePendingTransactions();
	}

	@Override
	public void onStop() {
		super.onStop();
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putChar("sector", sector);
		outState.putInt("currentPage", currentPage);
	}

	public char getSector() {
		return sector;
	}

	public void setSector(char sector) {
		this.sector = sector;
	}
}

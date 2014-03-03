package lt.gb.adapter;

import lt.gb.HomeFragment;
import lt.gb.SectorsFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class Main_Adapter extends FragmentStatePagerAdapter {

	public Main_Adapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public int getCount() {
		return 2;
	}

	@Override
	public Fragment getItem(int position) {

		switch (position) {
		case 0:
			return HomeFragment.newInstance();
		case 1:
			return SectorsFragment.newInstance();
		}

		return null;
	}

	@Override
	public float getPageWidth(int position) {
		return super.getPageWidth(position);
	}
}

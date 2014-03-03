package lt.gb.adapter;

import lt.gb.f.c.FS_0;
import lt.gb.f.c.FS_1;
import lt.gb.f.c.FS_2;
import lt.gb.f.c.FS_3;
import lt.gb.f.c.FS_4;
import lt.gb.f.c.FS_5;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class Sector_Adapter extends FragmentStatePagerAdapter {

	public Sector_Adapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public int getCount() {
		return 6;
	}

	@Override
	public Fragment getItem(int position) {

		switch (position) {
		case 0:
			return FS_0.newInstance();
		case 1:
			return FS_1.newInstance();
		case 2:
			return FS_2.newInstance();
		case 3:
			return FS_3.newInstance();
		case 4:
			return FS_4.newInstance();
		case 5:
			return FS_5.newInstance();
		}
		return null;
	}

	@Override
	public float getPageWidth(int position) {
		return super.getPageWidth(position);
	}
}

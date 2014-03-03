package lt.gb.adapter;

import lt.gb.PageItem;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class B_S_Adapter extends FragmentStatePagerAdapter {
	
	public char TAG;
	public PageItem[] list;
	private Fragment currentFragment;
	
	public B_S_Adapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public int getCount() {
		return list.length;
	}

	@Override
	public float getPageWidth(int position) {
		return super.getPageWidth(position);
	}

	@Override
	public Fragment getItem(int paramInt) {
		return null;
	}
	
	public Fragment getCurrentFragment() {
		return currentFragment;
	}

	public void setCurrentFragment(Fragment currentFragment) {
		this.currentFragment = currentFragment;
	}
	
}
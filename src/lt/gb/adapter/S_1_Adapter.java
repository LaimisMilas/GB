package lt.gb.adapter;

import lt.gb.PageItem;
import lt.gb.f.F_1_1;
import lt.gb.f.F_1_2;
import lt.gb.f.F_1_3;
import lt.gb.f.F_1_4;
import lt.gb.f2.PirmasSkyriusAntroLapoFragmentas;
import lt.gb.f2.PirmasSkyriusKetvirtoLapoFragmentas;
import lt.gb.f2.PirmasSkyriusPirmoLapoFragmentas;
import lt.gb.f2.PirmasSkyriusTrecioLapoFragmentas;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

// Adapteris turi buti atskirai kitaip neveikia
public class S_1_Adapter extends B_S_Adapter {

	public S_1_Adapter(FragmentManager fm, PageItem[] list) {
		super(fm);
		this.list = list;
		TAG = 'a';
	}

	@Override
	public int getCount() {
		return super.getCount();
	}

	@Override
	public Fragment getItem(int position) {

		String index = list[position].getIndex();

		if (index.equals("1_1")) {
			return new PirmasSkyriusPirmoLapoFragmentas();
		}
		if (index.equals("1_2")) {
			return new PirmasSkyriusAntroLapoFragmentas();
		}
		if (index.equals("1_3")) {
			return new PirmasSkyriusTrecioLapoFragmentas();
		}
		if (index.equals("1_4")) {
			return new PirmasSkyriusKetvirtoLapoFragmentas();
		}

		return null;
	}

	@Override
	public float getPageWidth(int position) {
		return super.getPageWidth(position);
	}

}

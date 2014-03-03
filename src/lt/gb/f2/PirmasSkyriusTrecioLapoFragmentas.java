package lt.gb.f2;

import lt.gb.BaseUtils;
import lt.gb.ImageConfig;
import lt.gb.PageItem;
import lt.gb.R;
import lt.gb.BaseUtils.Orentation;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class PirmasSkyriusTrecioLapoFragmentas extends Fragment {
	
	public static final String TAG = "PirmasSkyriusTrecioLapoFragmentas";
	private RelativeLayout rootView;
	private PageItem pItem;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		PageItem p_1_3 = new PageItem();
		{	
			p_1_3.setSector("1");
			p_1_3.setIndex("1_3");
			p_1_3.setTitle(getString(R.string.t_1));
			p_1_3.setDescription(getString(R.string.p_1_3));

			ImageConfig[] images = new ImageConfig[6];
			images[0] = new ImageConfig(R.drawable.land_1_1,false);
			images[1] = new ImageConfig(R.drawable.land_1_1_1 ,false);
			images[2] = new ImageConfig(R.drawable.land_1_1_2 ,false);
			images[3] = new ImageConfig(R.drawable.land_1_1_3 ,false);
			images[4] = new ImageConfig(R.drawable.land_1_1_4 ,false);
			images[5] = new ImageConfig(R.drawable.land_1_1_5 ,false);
			p_1_3.setImages(images);
			
			p_1_3.setSoundRes(R.raw.s_3);
		}
		
		pItem = p_1_3;
	}

	public PirmasSkyriusTrecioLapoFragmentas(){	
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);
		rootView = (RelativeLayout) inflater.inflate(R.layout.pager_item, container, false);
		
		for (ImageConfig item : pItem.getImages()) {
			if(BaseUtils.getOrentation(getActivity()) == Orentation.LANDSCAPE){
				
				View v = new View(getActivity());
				v.setBackgroundResource(item.getRes());
				rootView.addView(v);
				
			}else{
				
				View v = new View(getActivity());
				v.setBackgroundResource(item.getRes());
				rootView.addView(v);
				
			}
		}
		
		return rootView;
	}

}

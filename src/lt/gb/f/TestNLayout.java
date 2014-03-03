package lt.gb.f;

import lt.gb.BaseUtils;
import lt.gb.ImageConfig;
import lt.gb.PageItem;
import lt.gb.R;
import lt.gb.BaseUtils.Orentation;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

@SuppressLint("ValidFragment")
public class TestNLayout extends Fragment {
	
	public static final String TAG = "TestNLayout";
	private RelativeLayout rootView;
	private PageItem pItem;

	public TestNLayout(){
		
		PageItem p_1_2 = new PageItem();
		{	
			p_1_2.setSector("1");
			p_1_2.setIndex("1_2");
			p_1_2.setTitle("Title");
			p_1_2.setDescription("Description");
			
			ImageConfig[] images = new ImageConfig[19];
			images[0] = new ImageConfig(R.drawable.land_1_2 ,true);
			images[1] = new ImageConfig(R.drawable.land_1_2_1,false);
			images[2] = new ImageConfig(R.drawable.land_1_2_2,false);
			images[3] = new ImageConfig(R.drawable.land_1_2_3,false);
			images[4] = new ImageConfig(R.drawable.land_1_2_4,false);
			images[5] = new ImageConfig(R.drawable.land_1_2_5,false);
			images[6] = new ImageConfig(R.drawable.land_1_2_6,false);
			images[7] = new ImageConfig(R.drawable.land_1_2_7,false);
			images[8] = new ImageConfig(R.drawable.land_1_2_8,false);
			images[9] = new ImageConfig(R.drawable.land_1_2_9,false);
			images[10] = new ImageConfig(R.drawable.land_1_2_10,false);
			images[11] = new ImageConfig(R.drawable.land_1_2_11,false);
			images[12] = new ImageConfig(R.drawable.land_1_2_12,false);
			images[13] = new ImageConfig(R.drawable.land_1_2_13,false);
			images[14] = new ImageConfig(R.drawable.land_1_2_14,false);
			images[15] = new ImageConfig(R.drawable.land_1_2_15,false);
			images[16] = new ImageConfig(R.drawable.land_1_2_16,true);
			images[17] = new ImageConfig(R.drawable.land_1_2_17,true);
			images[18] = new ImageConfig(R.drawable.land_1_2_18,true);
			p_1_2.setImages(images);
			
			int[] p_1_2a = new int[1];
			p_1_2a[0] = R.drawable.land_1_2;
			p_1_2.setImgPort(p_1_2a);

			p_1_2.setSoundRes(R.raw.s_2);
		}
		
		pItem = p_1_2;
		
	}
	
	public TestNLayout(PageItem pItems) {
		this.pItem = pItems;
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

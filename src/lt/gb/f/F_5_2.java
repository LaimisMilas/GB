package lt.gb.f;

import lt.gb.PageItem;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

@SuppressLint("ValidFragment")
public class F_5_2 extends B_F {

	public F_5_2() {
	}

	public static F_5_2 newInstance(PageItem item) {
		F_5_2 f = new F_5_2(item);
		Bundle args = new Bundle();
		f.setArguments(args);
		return f;
	}

	public F_5_2(PageItem item) {
		this.pageItem = item;
	}
	
	@Override
	protected void onImageClick(View paramView, MotionEvent paramMotionEvent) {
		// TODO Auto-generated method stub
	}

	@Override
	protected void defaultImageConfig() {
		// TODO Auto-generated method stub
		
	}

}
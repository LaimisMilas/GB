package lt.gb.f;

import lt.gb.PageItem;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

@SuppressLint("ValidFragment")
public class F_5_4 extends B_F {


	public F_5_4() {
	}

	public static F_5_4 newInstance(PageItem item) {
		F_5_4 f = new F_5_4(item);
		Bundle args = new Bundle();
		f.setArguments(args);
		return f;
	}

	public F_5_4(PageItem item) {
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
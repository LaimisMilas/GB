package lt.gb.f;

import lt.gb.PageItem;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

@SuppressLint("ValidFragment")
public class F_2_1 extends B_F {

	public F_2_1() {
	}

	public static F_2_1 newInstance(PageItem item) {
		F_2_1 f = new F_2_1(item);
		Bundle args = new Bundle();
		f.setArguments(args);
		return f;
	}

	public F_2_1(PageItem item) {
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
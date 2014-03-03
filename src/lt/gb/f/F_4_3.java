package lt.gb.f;

import lt.gb.PageItem;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

@SuppressLint("ValidFragment")
public class F_4_3 extends  B_F {

	public F_4_3() {
	}

	public static F_4_3 newInstance(PageItem item) {
		F_4_3 f = new F_4_3(item);
		Bundle args = new Bundle();
		f.setArguments(args);
		return f;
	}

	public F_4_3(PageItem item) {
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
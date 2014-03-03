package lt.gb.f;

import lt.gb.PageItem;
import android.annotation.SuppressLint;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

@SuppressLint("ValidFragment")
public class F_1_2 extends B_F {

	public F_1_2() {
	}

	public static F_1_2 newInstance(PageItem item) {
		F_1_2 f = new F_1_2(item);
		Bundle args = new Bundle();
		f.setArguments(args);
		return f;
	}

	public F_1_2(PageItem item) {
		this.pageItem = item;
	}

	@Override
	protected void onImageClick(View paramView, MotionEvent paramMotionEvent) {
		// TODO Auto-generated method stub
	}

	@Override
	protected void defaultImageConfig() {
		AnimationDrawable ranka = new AnimationDrawable();
		int df = layerDrawable.getNumberOfLayers();
		//ranka.addFrame(layerDrawable.getDrawable(16), 200);
		//.addFrame(layerDrawable.getDrawable(17), 200);
		//ranka.addFrame(layerDrawable.getDrawable(18), 200);
		ranka.start();
	}
}
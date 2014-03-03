package lt.gb;

import android.content.res.Configuration;
import android.support.v4.app.FragmentActivity;

public class BaseUtils {

	public enum Orentation {
		LANDSCAPE, PORTRET
	}

	public static String df;

	public static Orentation getOrentation(FragmentActivity activity) {
		if (activity.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
			return Orentation.LANDSCAPE;
		}
		return Orentation.PORTRET;
	}

}

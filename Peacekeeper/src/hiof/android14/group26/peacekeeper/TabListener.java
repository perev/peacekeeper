package hiof.android14.group26.peacekeeper;

import android.app.Activity;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Fragment;
import android.app.FragmentTransaction;

public class TabListener<T extends Fragment> implements ActionBar.TabListener{
	private android.app.Fragment mFragment;
	private final Activity mActivity;
	private final String mTag;
	private final Class<T> mClass;
	
	public TabListener (Activity activity, String tag, Class<T> clz){
		mActivity = activity;
		mTag = tag;
		mClass = clz;
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
			// User selected the already selected tab. Usually do nothing.
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		if(mFragment == null){
			mFragment = Fragment.instantiate(mActivity, mClass.getName());
			ft.add(android.R.id.content, mFragment, mTag);
		}
		else{
			ft.attach(mFragment);
		}
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		if(mFragment != null){
			ft.detach(mFragment);
		}
	}
	
}

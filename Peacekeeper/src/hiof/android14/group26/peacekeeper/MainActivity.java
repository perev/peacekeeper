package hiof.android14.group26.peacekeeper;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentManager;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends FragmentActivity {	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		actionBar.setDisplayShowTitleEnabled(false);
		
		Tab tab = actionBar.newTab()
							.setText(R.string.btn_all_tasks)
							.setTabListener(new TabListener<AllTasksFragment>(
									this, "all tabs", AllTasksFragment.class));
		
		actionBar.addTab(tab);
		
		tab = actionBar.newTab()
						.setText(R.string.btn_open_tasks)
						.setTabListener(new TabListener<OpenTasksFragment>(
								this, "open tasks", OpenTasksFragment.class));
		
		actionBar.addTab(tab);
		
		tab = actionBar.newTab()
						.setText(R.string.btn_closed_tasks)
						.setTabListener(new TabListener<ClosedTasksFragment>(
								this, "closed tasks", ClosedTasksFragment.class));
		
		actionBar.addTab(tab);
		
		//Show all tasks in fragment at startup
//		FragmentManager fragmentManager = getFragmentManager();
//		AllTasksFragment allTaskFragment = new AllTasksFragment();
//		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//		
//		fragmentTransaction.add(R.id.taskGroup, allTaskFragment, _dynamicFragments);
//		fragmentTransaction.addToBackStack("Add");
//		fragmentTransaction.commit();
		
	}
	
//	public void onClickBtnShowAllTasks(View view){
//		FragmentManager fragmentManager = getFragmentManager();
//		AllTasksFragment allTaskFragment = new AllTasksFragment();
//		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//		Fragment oldFragment = fragmentManager.findFragmentByTag(_dynamicFragments);
//		
//		if (oldFragment != null)
//			fragmentTransaction.remove(oldFragment);
//		
//		fragmentTransaction.add(R.id.taskGroup, allTaskFragment, _dynamicFragments);
//		fragmentTransaction.addToBackStack("Add");
//		fragmentTransaction.commit();
//	}
//	
//	public void onClickBtnShowOpenTasks(View view){
//		FragmentManager fragmentManager = getFragmentManager();
//		OpenTasksFragment openTasksFragment = new OpenTasksFragment();
//		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//		Fragment oldFragment = fragmentManager.findFragmentByTag(_dynamicFragments);
//		
//		if (oldFragment != null)
//			fragmentTransaction.remove(oldFragment);
//		
//		fragmentTransaction.add(R.id.taskGroup, openTasksFragment, _dynamicFragments);
//		fragmentTransaction.addToBackStack("Add");
//		fragmentTransaction.commit();
//	}
//	
//	public void onClickBtnShowClosedTasks(View view) {
//		FragmentManager fragmentManager = getFragmentManager();
//		ClosedTasksFragment closedTasksFragment = new ClosedTasksFragment();
//		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//		Fragment oldFragment = fragmentManager.findFragmentByTag(_dynamicFragments);
//		
//		if (oldFragment != null)
//			fragmentTransaction.remove(oldFragment);
//		
//		fragmentTransaction.add(R.id.taskGroup, closedTasksFragment, _dynamicFragments);
//		fragmentTransaction.addToBackStack("Add");
//		fragmentTransaction.commit();
//	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
//	@Override
//	public boolean onOptionsItemSelected(MenuItem item) {
//	    // Handle presses on the action bar items
//	    switch (item.getItemId()) {
//	        case R.id.action_search:
//	            
//	            return true;
//	        default:
//	            return super.onOptionsItemSelected(item);
//	    }
//	}
	
	
	
}
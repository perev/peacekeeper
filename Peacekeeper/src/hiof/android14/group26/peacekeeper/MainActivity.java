package hiof.android14.group26.peacekeeper;

import java.util.ArrayList;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.app.SherlockDialogFragment;
import com.actionbarsherlock.app.SherlockFragmentActivity;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.support.v4.app.DialogFragment;
import android.text.format.Time;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;

import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;

public class MainActivity extends SherlockActivity{
	
	private static ArrayList<Tasks> _tasksArray = new ArrayList<Tasks>();
	private String _dynamicFragments = "DynamicFragment";
	

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
									this, _dynamicFragments, AllTasksFragment.class));
		
		actionBar.addTab(tab);
		
		tab = actionBar.newTab()
						.setText(R.string.btn_open_tasks)
						.setTabListener(new TabListener<OpenTasksFragment>(
								this, _dynamicFragments, OpenTasksFragment.class));
		
		actionBar.addTab(tab);
		
		tab = actionBar.newTab()
						.setText(R.string.btn_closed_tasks)
						.setTabListener(new TabListener<ClosedTasksFragment>(
								this, _dynamicFragments, ClosedTasksFragment.class));
		
		actionBar.addTab(tab);
		
	}
	
	public void addNewTaskButton(View view){
		FragmentManager fragmentManager = getFragmentManager();
		AddNewTaskFragment newTaskFragment = new AddNewTaskFragment();
		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
		
		Fragment oldFragment = fragmentManager.findFragmentByTag(_dynamicFragments);
		
		if (oldFragment != null)
			fragmentTransaction.remove(oldFragment);
		
		fragmentTransaction.add(R.id.taskGroup, newTaskFragment, _dynamicFragments);
		fragmentTransaction.addToBackStack("Add");
		fragmentTransaction.commit();
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	   com.actionbarsherlock.view.MenuInflater inflater = getSupportMenuInflater();
	   inflater.inflate(R.menu.main, (com.actionbarsherlock.view.Menu) menu);
	   return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    int itemId = item.getItemId();
		if (itemId == R.id.add) {
			//addNewTask(this.findViewById(R.id.add));
			//showAddNewTaskDialog();
			addNewTaskButton(this.findViewById(R.id.main));
			return true;
		} else {
			return super.onOptionsItemSelected(item);
		}
	    
	}
	
	public static ArrayList<Tasks> get_tasksArray() {
		return _tasksArray;
	}

	
	
	
}
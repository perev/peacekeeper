package hiof.android14.group26.peacekeeper;

import java.util.ArrayList;

import com.actionbarsherlock.app.SherlockActivity;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentManager;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
//import android.support.v4.app.FragmentActivity;
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

public class MainActivity extends SherlockActivity {
	
	private static ArrayList<Tasks> _tasksArray = new ArrayList<Tasks>();
	
	

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
		
	}
	
	public void addNewTask(View arg0){
		
		final EditText taskDesc;
		final EditText price;
		final Time now = new Time();
		
		LayoutInflater layoutInflater 
	     = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);  
	    
		View popupView = layoutInflater.inflate(R.layout.popup_add_user, null);  
		
	    final PopupWindow popupWindow = new PopupWindow(
				popupView, 
				LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT
				
		);  
	    
	    popupWindow.setFocusable(true);
	    popupWindow.setTouchable(true);
	    
	    taskDesc = (EditText) findViewById(R.id.taskDescription);
	    price = (EditText) findViewById(R.id.taskPrice);
	             
         Button btnDismiss = (Button)popupView.findViewById(R.id.dismiss);
         btnDismiss.setOnClickListener(new Button.OnClickListener(){
		     @Override
		     public void onClick(View v) {
		    	 popupWindow.dismiss();
		     }
		 });
         
         
         //TODO: generalize this code for users etc
         Button btnAdd = (Button)popupView.findViewById(R.id.taskAdd);
         btnAdd.setOnClickListener(new Button.OnClickListener(){
        	@Override
        	public void onClick (View v) {
        		
        		now.setToNow();
        		
        		Tasks task = new Tasks(0, 1, 0, 
        				 taskDesc.getText().toString(), 	//description
        				 "Per Edvard", 								//username
        				 now, 										//creation date
        				 null, 										//due date, empty for now
        				 "test"//price.getText().toString()			//price
        		);
        		
        		
        		_tasksArray.add(task);
        	}
         });
	               
	     popupWindow.showAsDropDown(
	    		 popupView, 
	    		 200, 
	    		 200
		 );
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
//		fragmentTransaction.addToBackStack("Add");s
//		fragmentTransaction.commit();
//	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	   com.actionbarsherlock.view.MenuInflater inflater = getSupportMenuInflater();
	   inflater.inflate(R.menu.main, (com.actionbarsherlock.view.Menu) menu);
	   return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
	    switch (item.getItemId()) {
	        case R.id.add:
	        	addNewTask(this.findViewById(R.id.add));
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}
	
	public static ArrayList<Tasks> get_tasksArray() {
		return _tasksArray;
	}

	
	
	
}
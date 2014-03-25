package hiof.android14.group26.peacekeeper;


import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

//public class OpenTasksFragment extends Fragment{
//
//	@Override
//	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceBundle){
//		return inflater.inflate(R.layout.fragment_open_tasks, container, false);
//	}
//}

public class OpenTasksFragment extends ListFragment {
	public void onCreate(Bundle savedInstanceBundle){
		super.onCreate(savedInstanceBundle);
		
		//TODO: get data from database and fill list here
		String[] values = new String[] {"Open Task 1", "Open Task 2", "Open Task 3", "Open Task 4"};
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
		        android.R.layout.simple_list_item_1, values);
		
		setListAdapter(adapter);
	}
	
	@Override
	  public void onListItemClick(ListView l, View v, int position, long id) {
	    //TODO: do something with the data
	  }
}
package hiof.android14.group26.peacekeeper;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

//public class AllTasksFragment extends Fragment{
//
//	@Override
//	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceBundle){
//		return inflater.inflate(R.layout.fragment_all_tasks, container, false);
//	}
//}

public class AllTasksFragment extends ListFragment {
	public void onCreate(Bundle savedInstanceBundle){
		super.onCreate(savedInstanceBundle);
		
		//TODO: get data from database and fill list here
		String[] values = new String[] {"Open Task 1", "Chosen Task 2", "Closed Task 3", "Closed Task 4"};
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
		        R.layout.fragment_all_tasks,R.id.label, values);
		
		setListAdapter(adapter);
	}
	
	@Override
	  public void onListItemClick(ListView l, View v, int position, long id) {
	    //TODO: do something with the data
	  }
}

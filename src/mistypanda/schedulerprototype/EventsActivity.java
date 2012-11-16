package mistypanda.schedulerprototype;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import android.widget.Button;
import java.util.ArrayList;
import java.util.HashMap;
import android.widget.SimpleAdapter;

public class EventsActivity extends Activity {
	
	private ListView eventListView;
	private SimpleAdapter sa;
	  ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
	  @Override
	  public void onCreate(Bundle savedInstanceState) {
	    onCreate(savedInstanceState);
	    setContentView(R.layout.activity_events);
	    
//		Find the ListView resource.
        eventListView = (ListView) findViewById( R.id.eventListView );  
	    
	    Button next = (Button) findViewById(R.id.button5);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(EventsActivity.this, HomeActivity.class);
                setResult(RESULT_OK, intent);
                finish();
            }

        });
	 
	    HashMap<String,String> item;
	    for(int i=0;i<Events.length;i++){
	      item = new HashMap<String,String>();
	      item.put( "line1", Events[i][0]);
	      item.put( "line2", Events[i][1]);
	      list.add( item );
	    sa = new SimpleAdapter(this, list,
	      android.R.layout.two_line_list_item ,
	      new String[] { "line1","line2" },
	      new int[] {android.R.id.text1, android.R.id.text2});
	    eventListView.setAdapter( sa );
	  }
	 
	  // Static synthetic data
	  private String[][] Events =
	    {{"SJU Soccer vs. Augsburg	","Location: SJU   Date: Oct. 25th, 2012"},
	     {"Symphonic Band Concert","Location: BAC   Date: Nov. 3rd, 2012"},
	     {"Free Tacos!", "Location: Fireside Lounge   Date: Oct. 31st, 2012"}};

}


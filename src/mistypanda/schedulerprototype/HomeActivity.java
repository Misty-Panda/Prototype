package mistypanda.schedulerprototype;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class HomeActivity extends Activity {

	boolean click = true;
	PopupWindow popUp;
	LinearLayout mainLayout, layout;
	TextView tv;
    LayoutParams params;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button next = (Button) findViewById(R.id.button1);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), EventsActivity.class);
                startActivityForResult(myIntent, 0);
            }

        });
        /*
        Button trap1 = (Button) findViewById(R.id.b3);
        next.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
                if (click) {
                    popUp.showAtLocation(mainLayout, Gravity.BOTTOM, 10, 10);
                    popUp.update(50, 50, 300, 80);
                    click = false;
                } else {
                    popUp.dismiss();
                    click = true;
                }
            }

        });
        
        Button trap2 = (Button) findViewById(R.id.button1);
        next.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
                if (click) {
                    popUp.showAtLocation(mainLayout, Gravity.BOTTOM, 10, 10);
                    popUp.update(50, 50, 300, 80);
                    click = false;
                } else {
                    popUp.dismiss();
                    click = true;
                }
            }

        });
        
        Button trap3 = (Button) findViewById(R.id.button1);
        next.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
                if (click) {
                    popUp.showAtLocation(mainLayout, Gravity.BOTTOM, 10, 10);
                    popUp.update(50, 50, 300, 80);
                    click = false;
                } else {
                    popUp.dismiss();
                    click = true;
                }
            }

        });
    
    params = new LayoutParams(LayoutParams.WRAP_CONTENT,
            LayoutParams.WRAP_CONTENT);
    layout.setOrientation(LinearLayout.VERTICAL);
    tv.setText("Muhahaha!!!! You activated my trap card!");
    layout.addView(tv, params);
    popUp.setContentView(layout);
    // popUp.showAtLocation(layout, Gravity.BOTTOM, 10, 10);
    mainLayout.addView(trap1, params);
    setContentView(mainLayout);
    */
}
}

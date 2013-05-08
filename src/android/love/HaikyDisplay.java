package android.love;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class HaikyDisplay extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haiky_display);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.haiky_display, menu);
        return true;
    }
    
    public void onLoveButtonClicked(View view) {
    	TextView textView = (TextView) findViewById(R.id.haikuTextView);
	
    	if (textView.getVisibility() == View.INVISIBLE) {
    			textView.setVisibility(View.VISIBLE);
    	}
    	else {
    		textView.setVisibility(View.INVISIBLE);
    	}
    }
}

package MobilePro.C3.4.Hello Satria Pambudi;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Hello Satria Pambudi extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hello_satria);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_hello_satria, menu);
		return true;
	}

}

package starx.sylveryte.androidl;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onShowButtonClicked(View view)
    {
        TextView v=(TextView) findViewById(R.id.textView2);
        //ImageView t=(ImageView) findViewById(R.id.imageView);
        v.setVisibility(1);

    }
    public void onShowImageButtonClicked(View view)
    {

        //TextView v=(TextView) findViewById(R.id.textView2);
        ImageView t=(ImageView) findViewById(R.id.imageView);
       // v.setVisibility(1);
            t.setVisibility(1);

    }
    public void onHideButtonClicked(View view)
    {

        TextView v=(TextView) findViewById(R.id.textView2);
        ImageView t=(ImageView) findViewById(R.id.imageView);
        v.setVisibility(View.INVISIBLE);
        t.setVisibility(View.INVISIBLE);

    }
}

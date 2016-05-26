package cherkassy.pro.alphabet;

import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TableLayout;


public class MainActivity extends AppCompatActivity {

    ImageView image_a,image_b;
    FrameLayout frame_1;
    TableLayout tableLayout_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater=getLayoutInflater();
        android.view.View layout=inflater.inflate(R.layout.activity_main, null);
        image_a=(ImageView)layout.findViewById(R.id.image_a);
        image_b=(ImageView)layout.findViewById(R.id.image_a);
        frame_1=(FrameLayout)layout.findViewById(R.id.frame_1);
        tableLayout_1=(TableLayout)layout.findViewById(R.id.table_layout_1);

        setContentView(layout);

        Log.v("MYVARN",frame_1.getWidth()+"x"+frame_1.getHeight());
        Log.v("MYVARN",tableLayout_1.getWidth()+"x"+tableLayout_1.getHeight());


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

    private class View {
    }
}

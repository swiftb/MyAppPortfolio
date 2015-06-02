package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the user touches one of the app launch buttons.
     * TODO: Is the switch statement needed for the actual app launching?
     */
    public void launchApp(View v) {

        switch(v.getId()){
            case R.id.button_spotifyStreamer:
                this.showToast(getString(R.string.launch_spotify_streamer));
                break;
            case R.id.button_scoresApp:
                this.showToast(getString(R.string.launch_scores_app));
                break;
            case R.id.button_libraryApp:
                this.showToast(getString(R.string.launch_library_app));
                break;
            case R.id.button_buildItBigger:
                this.showToast(getString(R.string.launch_build_it_bigger));
                break;
            case R.id.button_xyzReader:
                this.showToast(getString(R.string.launch_xyz_reader));
                break;
            case R.id.button_capstone:
                this.showToast(getString(R.string.launch_capstone));
                break;
        }
    }

    /** Show a little toast at the bottom of the screen */
    private void showToast(CharSequence text) {
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.show();
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
}

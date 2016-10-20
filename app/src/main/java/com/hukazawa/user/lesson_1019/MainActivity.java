package com.hukazawa.user.lesson_1019;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static com.hukazawa.user.lesson_1019.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ACT","This is onCreate");


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }
    public void click (View V)
    {
        Log.d("ACT","被按了");
        TextView tv=(TextView)findViewById(R.id.textView);
        tv.setText("別按了");
    }
    public void click2 (View V)
    {
        EditText    ed = (EditText)findViewById(R.id.editText);
        String str = ed.getText().toString();
        TextView tv3 = (TextView)findViewById(R.id.textView3);
        tv3.setText(str);
    }

    public void click3 (View V)
    {
        EditText    ed2 = (EditText)findViewById(R.id.editText2);
        EditText    ed3 = (EditText)findViewById(R.id.editText3);
        String x2 = ed2.getText().toString();
        String x3 = ed3.getText().toString();

        int y2=Integer.valueOf(x2);
        int y3=Integer.valueOf(x3);
        int sum;
        sum=y2+y3;
        String x4 = String.valueOf(sum);
        TextView tv5 = (TextView)findViewById(R.id.textView5);
        tv5.setText(x4);
    }
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}

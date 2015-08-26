package me.com.testme;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.security.SecureRandom;
import java.util.UUID;


public class MainActivity extends Activity {
    Button btnGen;
    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static SecureRandom rnd = new SecureRandom();
    private String test = "dirga<br />\n utomo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        btnGen  = (Button)findViewById(R.id.button);
//        btnGen.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                genUUID();
//                randomString(6);
//            }
//        });

        TextView textView = (TextView)findViewById(R.id.textView2);
        textView.setText(encodeHtml(test));

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

    public String genUUID(){
        String uuid = "";
        uuid    = UUID.randomUUID().toString().replaceAll("-", "");
        return uuid;
    }

    private String randomString( int len ){
//        static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        static SecureRandom rnd = new SecureRandom();

        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ )
            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        return sb.toString();
    }

    private String encodeHtml(String value){
        String newValue = TextUtils.htmlEncode(value);
        return newValue;
    }
}

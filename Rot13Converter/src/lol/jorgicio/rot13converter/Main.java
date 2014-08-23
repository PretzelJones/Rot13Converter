package lol.jorgicio.rot13converter;

import com.readystatesoftware.systembartint.SystemBarTintManager;

import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.graphics.Color;
import android.widget.TextView;


public class Main extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
        	SystemBarTintManager tintManager = new SystemBarTintManager(this);
        	tintManager.setStatusBarTintEnabled(true);
        	tintManager.setStatusBarTintResource(R.drawable.abc_ab_stacked_solid_dark_holo);
        	tintManager.setNavigationBarTintEnabled(false);
        	
        }
        TextView t = (TextView) findViewById(R.id.textView1);
        String texto = "Bienvenidos al conversor de Rot13. "
        		+ "Escriba su texto normal o en Rot13 para ser convertido. "
        		+ "Para más información, consulte "
        		+ "<a href=\"http://es.wikipedia.org/wiki/Rot13\">la Wikipedia</a>.";
        t.setMovementMethod(LinkMovementMethod.getInstance());
        t.setText(Html.fromHtml(texto));
        Button boton = (Button) findViewById(R.id.button1);
        boton.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View v){
        		Intent i = new Intent(Main.this,Rot13Converted.class);
        		EditText e = (EditText) findViewById(R.id.editText1);
        		String mensaje = e.getText().toString();
        		i.putExtra("msj", mensaje);
        		startActivity(i);
        	}
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.about) {
        	Intent i_2 = new Intent(Main.this,About.class);
        	startActivity(i_2);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

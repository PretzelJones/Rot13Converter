package lol.jorgicio.rot13converter;

import com.readystatesoftware.systembartint.SystemBarTintManager;

import android.support.v7.app.ActionBarActivity;
import android.os.Build;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Color;
import android.widget.TextView;

public class Rot13Converted extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rot13_converted);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
        	SystemBarTintManager tintManager = new SystemBarTintManager(this);
        	tintManager.setStatusBarTintEnabled(true);
        	tintManager.setTintColor(Color.parseColor("#3D9BDA"));
        	//tintManager.setStatusBarTintResource(R.drawable.abc_ab_stacked_solid_dark_holo);
        	tintManager.setNavigationBarTintEnabled(false);
        	
        }
		Intent i = getIntent();
		String m = i.getStringExtra("msj");
		TextView t_v = (TextView)findViewById(R.id.textOutput);
		StringBuilder s_b = new StringBuilder();
		Rot13 r = new Rot13();
		String[] arreglo = m.split("\\s");
		for (int j = 0; j < arreglo.length; j++){
			s_b.append(r.rot13Method(arreglo[j]+" "));
		}
		t_v.setText(s_b.toString());
		
	}
}

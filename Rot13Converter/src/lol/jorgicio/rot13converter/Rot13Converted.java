package lol.jorgicio.rot13converter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class Rot13Converted extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rot13_converted);
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

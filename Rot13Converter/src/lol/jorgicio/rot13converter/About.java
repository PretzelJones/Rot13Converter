package lol.jorgicio.rot13converter;

import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.os.Bundle;
import android.widget.TextView;

public class About extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		TextView t = (TextView) findViewById(R.id.textView1);
		String texto = "<b>Rot13Converter</b><br>"
				+ "Creado por Jorge Pizarro Callejas (aka Jorgicio).<br>"
				+ "Puedes contactarlo en:<br>"
				+ "<ul>"
				+ "<li><a href=\"mailto:jorgicio@jorgicio.net\">"
				+ "jorgicio@jorgicio.net</a></li><br>"
				+ "<li><a href=\"http://www.jorgicio.net\">Mi página web</a></li><br>"
				+ "<li><a href=\"http://twitter.com/jorgicio\">Mi Twitter</a></li><br>"
				+ "<li><a href=\"http://blog.jorgicio.net\">Mi blog</a></li><br>"
				+ "<li><a href=\"http://www.facebook.com/jorgicio\">Mi Facebook</a></li><br>"
				+ "</ul>";
		t.setMovementMethod(LinkMovementMethod.getInstance());
		t.setText(Html.fromHtml(texto));
	}
}

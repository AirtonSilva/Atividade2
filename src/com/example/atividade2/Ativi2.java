package com.example.atividade2;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Ativi2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ativi2);
		
		NotificationManager mn = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
		mn.cancel(R.drawable.ic_launcher); //cancelar a notificação
		
	}

	
}

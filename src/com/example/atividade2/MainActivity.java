package com.example.atividade2;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationCompat.Builder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void gerarnotificacao (View view){
		
		NotificationManager mn = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		PendingIntent p= PendingIntent.getActivity(this,0, new Intent (this,Ativi2.class),0);
        NotificationCompat.Builder builder = new  NotificationCompat.Builder (this);
        builder.setTicker("Ticker Texto");   // Texto que aparece rapido.
        builder.setContentTitle("Título"); //subtitulo
        builder.setContentText("Descrição da notificação");	//Descrição
        builder.setSmallIcon(R.drawable.ic_launcher);	//imagem
        Builder setLargeIcon = builder.setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.life));
        
        Notification n = builder.build();	//realizar vibração na notificação
        n.vibrate = new long[]{150, 300, 150, 600};  // milisegundos de espera, duração, espera e duração de novo, respectivamente.
        mn.notify(R.drawable.ic_launcher, n); 
        
        try{
        	Uri som = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION); //sonzinho (musiquinha) de notificação do smartphone
        	Ringtone toque = RingtoneManager.getRingtone(this, som); //toque
        	toque.play();
        	
        }catch(Exception e){ }
       
	
	}
	
}

package com.example.fire;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends Activity {
	Button mTorch;
	EditText mText;
	String sText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	
		mTorch = (Button) findViewById(R.id.main_button1);
		mText = (EditText) findViewById(R.id.main_editText2);
		mText.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				sText = mText.getText().toString();
				if (sText.equals("Enter Text Here ...")) {
					mText.setText("");
				}

			}
		});
		mTorch.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				ImageView img=(ImageView)findViewById(R.id.main_imageView1);	
				img.setVisibility(View.VISIBLE);
			    img.setBackgroundResource(R.anim.gif);
			    AnimationDrawable frameAnimation = (AnimationDrawable)  img.getBackground();
			    frameAnimation.start();			    
			    Handler handler = new Handler();
				handler.postDelayed(new Runnable(){		
					@Override
					public void run() {
						Intent mIntent = new Intent(MainActivity.this,
								Blackscreen.class);
						startActivity(mIntent);
						overridePendingTransition(R.anim.slide_in_from_bottom,
								R.anim.slide_out_to_top);
						 finish();}}
				       
				,3000);
			

			}
		});
		


	


	}

}

package com.example.fire;

import java.util.ArrayList;
import java.util.Random;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class Blackscreen extends Activity {
	ProgressDialog lProgressDialog;
	TextView mTextView;

	@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	ArrayList<String> mQuote=new ArrayList<String>();
	mQuote.add("※The best and most beautiful things in the world cannot be seen or even touched 每 they must be felt with the heart§ 每 Helen Keller");
	mQuote.add("※I can＊t change the direction of the wind, but I can adjust my sails to always reach my destination§ 每 Jimmy Dean");
	mQuote.add("※Whoever is happy will make others happy too§ 每 Anne Frank");
	mQuote.add("※Put your heart, mind, and soul into even your smallest acts. This is the secret of success§ 每 Swami Sivananda");
	mQuote.add("※The measure of who we are is what we do with what we have§ 每 Vince Lombardi");
	
	mQuote.add("※Try to be a rainbow in someone＊s cloud§ 每 Maya Angelou");
	mQuote.add("※Believe you can and you＊re halfway there§ 每 Theodore Roosevelt");
	mQuote.add("※We know what we are, but know not what we may be§ 每 William Shakespeare");
	mQuote.add("※As we express our gratitude, we must never forget that the highest appreciation is not to utter words, but to live by them§ 每 John F. Kennedy");
	mQuote.add("※Today I choose life. Every morning when I wake up I can choose joy, happiness, negativity, pain＃ To feel the freedom that comes from being able to continue to make mistakes and choices 每 today I choose to feel like, not to deny my humanity but embrace it§ 每 Kevin Aucoin");
	mQuote.add("※Change your thoughts and you change your world§ 每 Norman Vincent Peale");
	mQuote.add("※It is during our darkest moments that we must focus to see the light§ 每 Aristotle");
	mQuote.add("※Don＊t limit yourself. Many people limit themselves to what they think they can do. You can go as far as your mind lets you. What you believe, remember, you can achieve§ 每 Mary Kay Ash");
	mQuote.add("※Don＊t judge each day by the harvest you reap but by the seeds that you plant§ 每 Robert Louis Stevenson");
	mQuote.add("※We can＊t help everyone, but everyone can help someone§ 每 Ronald Reagan");
	mQuote.add("※When the sun is shining I can do anything; no mountain is too high, no trouble too difficult to overcome§ 每 Wilma Rudolph");
	mQuote.add("※What lies behind you and what lies in front of you, pales in comparison to what lies inside of you§ 每 Ralph Waldo Emerson");
	mQuote.add("※Happiness resides not in possessions, and not in gold, happiness dwells in the soul§ 每 Democritus");
	mQuote.add("※When you get into a tight place and everything goes against you, till it seems as though you could not hang on a minute longer, never give up then, for that is just the place and time that the tide will turn§ 每 Harriet Beecher Stowe");
	mQuote.add("※There are two ways of spreading light: to be the candle or the mirror that reflects it§ 每 Edith Wharton");
	mQuote.add("※I will love the light for it shows me the way, yet I will endure the darkness because it shows me the stars§ 每 Og Mandino");
	mQuote.add("※Your present circumstances don＊t determine where you can go; they merely determine where you start§ 每 Nido Qubein");
	mQuote.add("※Give light, and the darkness will disappear of itself§ 每 Desiderius Erasmus");
	mQuote.add("※If opportunity doesn＊t knock, build a door§ 每 Milton Berle");
	mQuote.add("※It is in your moments of decision that your destiny is shaped§ 每 Tony Robbins");
	mQuote.add("※Don＊t let the fear of striking out hold you back§ 每 Babe Ruth");
	mQuote.add(" ※If you accept the expectations of others, especially negative ones, then you never will change the outcome§ 每 Michael Jordan");
	mQuote.add("※Enthusiasm moves the world§ 每 Arthur Balfour");
	mQuote.add("※Try to be like the turtle 每 at ease in your own shell§ 每 Bill Copeland");
	mQuote.add("※Everyone has inside of him a piece of good news. The good news is that you don＊t know how great you can be! How much you can love! What you can accomplish! And what your potential is!§ 每 Anne Frank");
	mQuote.add("※Turn your face to the sun and the shadows fall behind you§ 每 Charlotte Whitton");
	mQuote.add("※What we achieve inwardly will change outer reality§ 每 Plutarch");
	mQuote.add("※It is always the simple that produces the marvelous§ 每 Amelia Barr");
	mQuote.add("※Two roads diverged in a wood and I 每 I took the one less traveled by, and that has made all the difference§ 每 Robert Frost");
	mQuote.add("※Nobody sets the rules but you. You can design your own life§ 每 Carrie-Anne Moss");
	mQuote.add("※Thought is the wind, knowledge the sail, and mankind the vessel§ 每 Augustus Hare");
	mQuote.add(" ※When we seek to discover the best in others, we somehow bring out the best in ourselves§ 每 William Arthur Ward");
	mQuote.add("※Follow your bliss and the universe will open doors where there were only walls§ 每 Joseph Campbell");
	mQuote.add("※All you need is the plan, the road map, and the courage to press on to your destination§ 每 Earl Nightingale");
	mQuote.add("※The glow of one warm thought is to me worth more than money§ 每 Thomas Jefferson");
	mQuote.add("※You must do the things you think you cannot do§ 每 Eleanor Roosevelt");
	mQuote.add("※Happiness is not something you postpone for the future; it is something you design for the present§ 每 Jim Rohn");
	mQuote.add("※From a small seed a mighty trunk may grow§ 每 Aeschylus");
	mQuote.add("※Wonder rather than doubt is the root of all knowledge§ 每 Abraham Joshua Heschel");
	mQuote.add("※It is never too late to be what you might have been§ 每 George Eliot");
	mQuote.add("※Throw your dreams into space like a kit, and you do not know what it will bring back, a new life, a new friend, a new love, a new country§ 每 Anais Nin");
	mQuote.add("※The most authentic thing about us is our capacity to create, to overcome, to endure, to transform, to love and to be greater than our suffering§ 每 Ben Okri");
	mQuote.add("※Be brave enough to live life creatively. The creative place where no one else has ever been§ 每 Alan Alda");
	mQuote.add("※The only journey is the one within§ 每 Rainer Maria Rilke");
	mQuote.add("※Man never made any material as resilient as the human spirit§ 每 Bernard Williams");
	mQuote.add("※In oneself lies the whole world and if you know how to look and learn, the door is there and the key is in your hand. Nobody on earth can give you either the key or the door to open, except yourself§ 每 Jiddu Krishnamurti");
	mQuote.add("※The best way out is always through§ 每 Robert Frost");
	mQuote.add("※When you have a dream, you＊ve got to grab it and never let go§ 每 Carol Burnett");
	mQuote.add("※What great thing would you attempt if you knew you could not fail?§ 每 Robert H. Schuller");
	mQuote.add("※We can change our lives. We can do, have, and be exactly what we wish§ 每 Tony Robbins");
	mQuote.add("※We relish news of our heroes, forgetting that we are extraordinary to somebody too§ 每 Helen Hayes");
	mQuote.add("※Most of us have far more courage than we ever dreamed we possessed§ 每 Dale Carnegie");
	mQuote.add("※Our greatest weakness lies in giving up. The most certain way to succeed is always to try just one more time§ 每 Thomas A. Edison");
		
	setContentView(R.layout.blackscreen);
	mTextView=(TextView)findViewById(R.id.blackscreen_textView1);	
    Random random=new Random();
    int mRandom=random.nextInt(mQuote.size());
	mTextView.setText(mQuote.get(mRandom));
	Handler handler = new Handler();
	handler.postDelayed(new Runnable(){		
		@Override
		public void run() {
			Intent mIntent=new Intent(Blackscreen.this,MainActivity.class);
			startActivity(mIntent);
			overridePendingTransition(R.anim.slide_in_from_top,R.anim.slide_out_to_bottom);
			finish();
		}}
	,11000);
    }
}

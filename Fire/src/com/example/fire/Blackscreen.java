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
	mQuote.add("��The best and most beautiful things in the world cannot be seen or even touched �C they must be felt with the heart�� �C Helen Keller");
	mQuote.add("��I can��t change the direction of the wind, but I can adjust my sails to always reach my destination�� �C Jimmy Dean");
	mQuote.add("��Whoever is happy will make others happy too�� �C Anne Frank");
	mQuote.add("��Put your heart, mind, and soul into even your smallest acts. This is the secret of success�� �C Swami Sivananda");
	mQuote.add("��The measure of who we are is what we do with what we have�� �C Vince Lombardi");
	
	mQuote.add("��Try to be a rainbow in someone��s cloud�� �C Maya Angelou");
	mQuote.add("��Believe you can and you��re halfway there�� �C Theodore Roosevelt");
	mQuote.add("��We know what we are, but know not what we may be�� �C William Shakespeare");
	mQuote.add("��As we express our gratitude, we must never forget that the highest appreciation is not to utter words, but to live by them�� �C John F. Kennedy");
	mQuote.add("��Today I choose life. Every morning when I wake up I can choose joy, happiness, negativity, pain�� To feel the freedom that comes from being able to continue to make mistakes and choices �C today I choose to feel like, not to deny my humanity but embrace it�� �C Kevin Aucoin");
	mQuote.add("��Change your thoughts and you change your world�� �C Norman Vincent Peale");
	mQuote.add("��It is during our darkest moments that we must focus to see the light�� �C Aristotle");
	mQuote.add("��Don��t limit yourself. Many people limit themselves to what they think they can do. You can go as far as your mind lets you. What you believe, remember, you can achieve�� �C Mary Kay Ash");
	mQuote.add("��Don��t judge each day by the harvest you reap but by the seeds that you plant�� �C Robert Louis Stevenson");
	mQuote.add("��We can��t help everyone, but everyone can help someone�� �C Ronald Reagan");
	mQuote.add("��When the sun is shining I can do anything; no mountain is too high, no trouble too difficult to overcome�� �C Wilma Rudolph");
	mQuote.add("��What lies behind you and what lies in front of you, pales in comparison to what lies inside of you�� �C Ralph Waldo Emerson");
	mQuote.add("��Happiness resides not in possessions, and not in gold, happiness dwells in the soul�� �C Democritus");
	mQuote.add("��When you get into a tight place and everything goes against you, till it seems as though you could not hang on a minute longer, never give up then, for that is just the place and time that the tide will turn�� �C Harriet Beecher Stowe");
	mQuote.add("��There are two ways of spreading light: to be the candle or the mirror that reflects it�� �C Edith Wharton");
	mQuote.add("��I will love the light for it shows me the way, yet I will endure the darkness because it shows me the stars�� �C Og Mandino");
	mQuote.add("��Your present circumstances don��t determine where you can go; they merely determine where you start�� �C Nido Qubein");
	mQuote.add("��Give light, and the darkness will disappear of itself�� �C Desiderius Erasmus");
	mQuote.add("��If opportunity doesn��t knock, build a door�� �C Milton Berle");
	mQuote.add("��It is in your moments of decision that your destiny is shaped�� �C Tony Robbins");
	mQuote.add("��Don��t let the fear of striking out hold you back�� �C Babe Ruth");
	mQuote.add(" ��If you accept the expectations of others, especially negative ones, then you never will change the outcome�� �C Michael Jordan");
	mQuote.add("��Enthusiasm moves the world�� �C Arthur Balfour");
	mQuote.add("��Try to be like the turtle �C at ease in your own shell�� �C Bill Copeland");
	mQuote.add("��Everyone has inside of him a piece of good news. The good news is that you don��t know how great you can be! How much you can love! What you can accomplish! And what your potential is!�� �C Anne Frank");
	mQuote.add("��Turn your face to the sun and the shadows fall behind you�� �C Charlotte Whitton");
	mQuote.add("��What we achieve inwardly will change outer reality�� �C Plutarch");
	mQuote.add("��It is always the simple that produces the marvelous�� �C Amelia Barr");
	mQuote.add("��Two roads diverged in a wood and I �C I took the one less traveled by, and that has made all the difference�� �C Robert Frost");
	mQuote.add("��Nobody sets the rules but you. You can design your own life�� �C Carrie-Anne Moss");
	mQuote.add("��Thought is the wind, knowledge the sail, and mankind the vessel�� �C Augustus Hare");
	mQuote.add(" ��When we seek to discover the best in others, we somehow bring out the best in ourselves�� �C William Arthur Ward");
	mQuote.add("��Follow your bliss and the universe will open doors where there were only walls�� �C Joseph Campbell");
	mQuote.add("��All you need is the plan, the road map, and the courage to press on to your destination�� �C Earl Nightingale");
	mQuote.add("��The glow of one warm thought is to me worth more than money�� �C Thomas Jefferson");
	mQuote.add("��You must do the things you think you cannot do�� �C Eleanor Roosevelt");
	mQuote.add("��Happiness is not something you postpone for the future; it is something you design for the present�� �C Jim Rohn");
	mQuote.add("��From a small seed a mighty trunk may grow�� �C Aeschylus");
	mQuote.add("��Wonder rather than doubt is the root of all knowledge�� �C Abraham Joshua Heschel");
	mQuote.add("��It is never too late to be what you might have been�� �C George Eliot");
	mQuote.add("��Throw your dreams into space like a kit, and you do not know what it will bring back, a new life, a new friend, a new love, a new country�� �C Anais Nin");
	mQuote.add("��The most authentic thing about us is our capacity to create, to overcome, to endure, to transform, to love and to be greater than our suffering�� �C Ben Okri");
	mQuote.add("��Be brave enough to live life creatively. The creative place where no one else has ever been�� �C Alan Alda");
	mQuote.add("��The only journey is the one within�� �C Rainer Maria Rilke");
	mQuote.add("��Man never made any material as resilient as the human spirit�� �C Bernard Williams");
	mQuote.add("��In oneself lies the whole world and if you know how to look and learn, the door is there and the key is in your hand. Nobody on earth can give you either the key or the door to open, except yourself�� �C Jiddu Krishnamurti");
	mQuote.add("��The best way out is always through�� �C Robert Frost");
	mQuote.add("��When you have a dream, you��ve got to grab it and never let go�� �C Carol Burnett");
	mQuote.add("��What great thing would you attempt if you knew you could not fail?�� �C Robert H. Schuller");
	mQuote.add("��We can change our lives. We can do, have, and be exactly what we wish�� �C Tony Robbins");
	mQuote.add("��We relish news of our heroes, forgetting that we are extraordinary to somebody too�� �C Helen Hayes");
	mQuote.add("��Most of us have far more courage than we ever dreamed we possessed�� �C Dale Carnegie");
	mQuote.add("��Our greatest weakness lies in giving up. The most certain way to succeed is always to try just one more time�� �C Thomas A. Edison");
		
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

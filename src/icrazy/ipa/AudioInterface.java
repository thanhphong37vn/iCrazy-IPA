package icrazy.ipa;

import java.util.HashMap;
import android.content.Context;
import android.media.MediaPlayer;
import android.webkit.JavascriptInterface;

public class AudioInterface {
	Context mContext;

	AudioInterface(Context c) {
		mContext = c;
	}

	// Play an audio file from the webpage
	@JavascriptInterface
	public void playAudio(String aud) { // String aud - file name passed
										// from the JavaScript function
		try {
			aud = aud.replace("file:///android_asset/web/", "");
			int id = getResourceID(aud);
			MediaPlayer player = new MediaPlayer().create(mContext, id);
			player.start();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// function which returns the unique resource ID.
	public int getResourceID(String song) throws IllegalArgumentException {
		// System.out.println("inside HashMap"+ song);
		HashMap resmap = new HashMap();
		java.lang.reflect.Field[] fields = R.raw.class.getFields();
		try {
			for (int i = 0; i < fields.length; i++) {
				if (song != null)
					if (fields[i].getName().startsWith(song))
						resmap.put(fields[i].getName(), fields[i].getInt(null));
					else
						resmap.put(fields[i].getName(), fields[i].getInt(null));
			}
		} catch (Exception e) {
			throw new IllegalArgumentException();
		}
		Integer one = (Integer) resmap.get(song);
		int songid = one.intValue();
		return songid;
	}
}
package icrazy.ipa;

import icrazy.ipa.R;
import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/**
 * 
 * Title : Bat chay click vao am co am thanh<br/>
 * Description : <br/>
 * Copyright : Copyright (c) 2016<br/>
 * Company : Aptech Aprotrain <br/>
 * Create on Jan 6, 2016 5:30:40 PM
 * 
 * @author <a href="mailto:hoanpmp@gmail.com">HoanPham</a>
 * @version Jan 6, 2016 5:30:40 PM
 * 
 */
@SuppressLint("SetJavaScriptEnabled")
public class Tab01 extends Fragment {
	public MediaPlayer mp;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View android = inflater.inflate(R.layout.tab01, container, false);
		WebView wv = (WebView) android.findViewById(R.id.android_webview);

		// Set it to a webChromeClient
		wv.setWebChromeClient(new WebChromeClient());
		wv.getSettings().setJavaScriptEnabled(true);
		wv.addJavascriptInterface(new AudioInterface(getActivity()
				.getApplicationContext()), "Audi");
		wv.loadUrl("file:///android_asset/web/IPA Chart With Sounds.html");

		return android;
	}

}

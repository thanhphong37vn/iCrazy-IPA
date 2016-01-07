package icrazy.ipa;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import icrazy.ipa.R;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.WindowManager;

public class MainActivity extends FragmentActivity {
	ViewPager tabViewPager;
	TabPagerAdapter tabAdapter;
	ActionBar actionBar;
	Context ct;

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		// ActionBar actionBarMenu = getActionBar();
		// actionBarMenu.hide();
		setContentView(R.layout.fragment_home);
		FragmentManager fragmentManager = getSupportFragmentManager();

		tabAdapter = new TabPagerAdapter(fragmentManager);
		tabViewPager = (ViewPager) findViewById(R.id.pager);
		tabViewPager
				.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
					@Override
					public void onPageSelected(int position) {
						actionBar = getActionBar();
						actionBar.setSelectedNavigationItem(position);
					}
				});
		tabViewPager.setAdapter(tabAdapter);
		actionBar = getActionBar();
		// Enable Tabs on Action Bar
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		ActionBar.TabListener tabListener = new ActionBar.TabListener() {
			@Override
			public void onTabReselected(android.app.ActionBar.Tab tab,
					FragmentTransaction ft) {
			}

			@Override
			public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
				tabViewPager.setCurrentItem(tab.getPosition());
			}

			@Override
			public void onTabUnselected(android.app.ActionBar.Tab tab,
					FragmentTransaction ft) {
			}
		};
		// Add New Tab
		actionBar.addTab(actionBar.newTab().setText("IPA")
				.setTabListener(tabListener));
		actionBar.addTab(actionBar.newTab().setText("Sounds")
				.setTabListener(tabListener));
		actionBar.addTab(actionBar.newTab().setText("Talk")
				.setTabListener(tabListener));
		actionBar.addTab(actionBar.newTab().setText("Starter")
				.setTabListener(tabListener));
		actionBar.addTab(actionBar.newTab().setText("Advance")
				.setTabListener(tabListener));

		AdView mAdView = (AdView) findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		mAdView.loadAd(adRequest);
	}
}

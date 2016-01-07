package info.androidhive.slidingmenu;

import icrazy.ipa.MainActivity;
import icrazy.ipa.R;
import icrazy.ipa.TabPagerAdapter;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.*;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {
	public HomeFragment() {
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_home, container,
				false);
		// Intent intent=new
		// Intent(getActivity().getApplicationContext(),MainActivity.class);
		// startActivity(intent);
		return rootView;
	}

	ViewPager tabViewPager;
	TabPagerAdapter tabAdapter;
	ActionBar actionBar;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent = new Intent(getActivity().getApplicationContext(),
				MainActivity.class);
		startActivity(intent);
		// getActivity().setContentView(R.layout.fragment_home);
		// // FragmentManager fragmentManager=
		// FragmentManager fragmentManager=getActivity()
		// .getFragmentManager();
		// tabAdapter=new TabPagerAdapter(fragmentManager);
		// tabViewPager=(ViewPager) findViewById(R.id.pager);
		// tabViewPager
		// .setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
		// @Override
		// public void onPageSelected(int position) {
		// actionBar=getActivity().getActionBar();
		// actionBar.setSelectedNavigationItem(position);
		// }
		// });
		// tabViewPager.setAdapter(tabAdapter);
		// actionBar=getActivity().getActionBar();
		// // Enable Tabs on Action Bar
		// actionBar
		// .setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		// ActionBar.TabListener tabListener=new ActionBar.TabListener() {
		// @Override
		// public void onTabReselected(
		// android.app.ActionBar.Tab tab,
		// FragmentTransaction ft) {}
		// @Override
		// public void onTabSelected(ActionBar.Tab tab,
		// FragmentTransaction ft) {
		// tabViewPager.setCurrentItem(tab.getPosition());
		// }
		// @Override
		// public void onTabUnselected(
		// android.app.ActionBar.Tab tab,
		// FragmentTransaction ft) {}
		// };
		// // Add New Tab
		// actionBar.addTab(actionBar.newTab().setText("Android")
		// .setTabListener(tabListener));
		// actionBar.addTab(actionBar.newTab().setText("iOS")
		// .setTabListener(tabListener));
		// actionBar.addTab(actionBar.newTab().setText("Windows")
		// .setTabListener(tabListener));
	}
}

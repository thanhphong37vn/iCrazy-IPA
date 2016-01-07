package icrazy.ipa;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * 
 * Title : TabAdapter <br/>
 * Description : <br/>
 * Copyright : Copyright (c) 2015<br/>
 * Company : Aptech Aprotrain <br/>
 * Create on Oct 27, 2015 2:33:37 PM
 * 
 * @author <a href="mailto:hoanpmp@gmail.com">HoanPham</a>
 * @version Oct 27, 2015 2:33:37 PM
 * 
 */
public class TabPagerAdapter extends FragmentStatePagerAdapter {

	public TabPagerAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param fragmentManager
	 */
	@Override
	public Fragment getItem(int i) {
		switch (i) {
		case 0:
			// Fragement for Android Tab
			return new Tab01();
		case 1:
			return new Tab020(); // Fragment for Ios Tab
		case 2:
			// Fragment for Ios Tab
			return new Tab04();
		case 3:
			// Fragment for Windows Tab
			return new Tab02();
		case 4:
			// Fragment for Windows Tab
			return new Tab03();
		}
		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 5; // No of Tabs
	}
}
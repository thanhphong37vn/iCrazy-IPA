package icrazy.ipa;

import java.util.ArrayList;
import java.util.List;

import icrazy.ipa.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * 
 * Title : <br/>
 * Description : <br/>
 * Copyright : Copyright (c) 2015<br/>
 * Company : Aptech Aprotrain <br/>
 * Create on Oct 27, 2015 2:32:25 PM
 * 
 * @author <a href="mailto:hoanpmp@gmail.com">HoanPham</a>
 * @version Oct 27, 2015 2:32:25 PM
 * 
 */

public class Tab03 extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View windows = inflater.inflate(R.layout.tab03, container,
				false);
		ListView lession_listview_lession = (ListView) windows
				.findViewById(R.id.lession_listview_advantage);
		String[] arrLession_subject = getResources().getStringArray(
				R.array.advance_lession_subject);
		String[] arrLession_content = getResources().getStringArray(
				R.array.advance_lession_content);
		List<Lession> lstLession = new ArrayList<Lession>();
		for (int i = 0; i < arrLession_content.length; i++) {
			Lession lession = new Lession();
			lession.setLessionID(i);
			lession.setLessionSubject(arrLession_subject[i]);
			lession.setLessionContent(arrLession_content[i]);
			lstLession.add(lession);
		}
		LessionAdapter lessionAdapter = new LessionAdapter(getActivity(),
				R.layout.lession_listview_item, (ArrayList<Lession>) lstLession);
		lession_listview_lession.setAdapter(lessionAdapter);
		return windows;
	}
}

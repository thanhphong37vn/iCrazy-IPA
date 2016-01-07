package icrazy.ipa;

import java.util.ArrayList;
import java.util.List;

import icrazy.ipa.R;
import android.os.Bundle;
//import android.app.Fragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class Tab02 extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View ios = inflater.inflate(R.layout.tab02, container, false);
		// ((TextView) ios.findViewById(R.id.textView)).setText("iOS");
		ListView lession_listview_lession = (ListView) ios
				.findViewById(R.id.lession_listview_lession);
		String[] arrLession_subject = getResources().getStringArray(
				R.array.starter_lession_subject);
		String[] arrLession_content = getResources().getStringArray(
				R.array.starter_lession_content);
		List<Lession> lstLession = new ArrayList<Lession>();
		for (int i = 51; i < arrLession_content.length; i++) {
			Lession lession = new Lession();
			lession.setLessionID(i);
			lession.setLessionSubject(arrLession_subject[i]);
			lession.setLessionContent(arrLession_content[i]);
			lstLession.add(lession);
		}
		LessionAdapter lessionAdapter = new LessionAdapter(getActivity(),
				R.layout.lession_listview_item, (ArrayList<Lession>) lstLession);
		lession_listview_lession.setAdapter(lessionAdapter);

		return ios;
	}
}

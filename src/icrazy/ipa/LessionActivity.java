package icrazy.ipa;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Title : <br/>
 * Description : <br/>
 * Copyright : Copyright (c) 2015<br/>
 * Company : Aptech Aprotrain <br/>
 * Create on Sep 13, 2015 2:12:57 PM
 * 
 * @author <a href="mailto:hoanpmp@gmail.com">HoanPham</a>
 * @version Sep 13, 2015 2:12:57 PM
 * 
 */
public class LessionActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lession_activity);

		ListView lession_listview_lession = (ListView) findViewById(R.id.lession_listview_lession);
		String[] arrLession_subject = getResources().getStringArray(
				R.array.starter_lession_subject);
		String[] arrLession_content = getResources().getStringArray(
				R.array.starter_lession_content);
		List<Lession> lstLession = new ArrayList<Lession>();
		for (int i = 0; i < arrLession_content.length; i++) {
			Lession lession = new Lession();
			lession.setLessionID(i);
			lession.setLessionSubject(arrLession_subject[i]);
			lession.setLessionContent(arrLession_content[i]);
			lstLession.add(lession);
		}
		LessionAdapter lessionAdapter = new LessionAdapter(
				LessionActivity.this, R.layout.lession_listview_item,
				(ArrayList<Lession>) lstLession);
		lession_listview_lession.setAdapter(lessionAdapter);

	}
}

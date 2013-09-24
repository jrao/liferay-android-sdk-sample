package com.liferay.mobile.sample.model;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;

import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("serial")
public class Contact implements Serializable {

	public Contact(JSONObject jsonObj) throws JSONException {
		setBirthday(jsonObj.getLong("birthday"));
	}
	
	public String getBirthday() {
		return _birthday;
	}

	public void setBirthday(long timestamp) {
		_birthday = getDateFormatter().format(new Date(timestamp));
	}
	
	protected DateFormat getDateFormatter() {
		if (_dateFormatter == null) {
			_dateFormatter = DateFormat.getDateTimeInstance(
					DateFormat.SHORT, DateFormat.SHORT);
		}
		
		return _dateFormatter;
	}
	
	private String _birthday;
	private transient DateFormat _dateFormatter;

}
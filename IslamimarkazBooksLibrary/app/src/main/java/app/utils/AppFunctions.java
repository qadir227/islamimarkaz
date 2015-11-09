package app.utils;

import java.util.Locale;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.util.Log;

public class AppFunctions {

	public static final String shared_pref_file_name = "islamimarkaz_app_stored_data";

	public static final String KEY_USER_SELECTED_LANG = "user_selected_lang";

	public static final String lang_english = "English";
	public static final String lang_urdu = "Urdu";

	public static String getUserLang(Context mContext) {

		SharedPreferences sharedPref = mContext.getSharedPreferences(
				shared_pref_file_name, Context.MODE_PRIVATE);
		String user_selected_lang = sharedPref.getString(
				KEY_USER_SELECTED_LANG, null);
		return user_selected_lang;

	}

	public static void setUserDefaultValues(Context mContext, String KEY,
			String value) {

		SharedPreferences sharedPref = mContext.getSharedPreferences(
				shared_pref_file_name, Context.MODE_PRIVATE);

		SharedPreferences.Editor editor = sharedPref.edit();
		editor.putString(KEY, value);
		editor.commit();
	}

	public static void setLangLocale(Context mContext, String lang) {

		String lang_code;

		if (lang.equals(lang_english)) {
			lang_code = "en";
		} else {
			lang_code = "ur";
		}

		Log.e("Lang Locale", lang_code);

		Locale locale = new Locale(lang_code);
		Locale.setDefault(locale);
		Configuration config = new Configuration();
		config.locale = locale;
		mContext.getResources().updateConfiguration(config,
				mContext.getResources().getDisplayMetrics());

	}
}

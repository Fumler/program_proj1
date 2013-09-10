package no.whg.mini;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Messages {
	private String language;
	private String country;
	private static final String BUNDLE_NAME = "no.whg.mini.messages"; //$NON-NLS-1$
	private Locale currentLocale;

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);

	private Messages() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
	
	public void setLocale(String language, String country) {
		if (language.length() != 2) {
			this.language = "en";
			this.country = "US";
		} else {
			this.language = language;
			this.country = country;
			
		}
		
		currentLocale = new Locale(language, country);
	}
}

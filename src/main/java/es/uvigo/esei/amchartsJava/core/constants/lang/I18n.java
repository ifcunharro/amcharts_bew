package es.uvigo.esei.amchartsJava.core.constants.lang;

import es.uvigo.esei.amchartsJava.core.constants.config.Config;
import es.uvigo.esei.amchartsJava.core.exceptions.LangException;
import es.uvigo.esei.amchartsJava.core.validators.IdiomValidator;

/**
 * 
 * This class manage idiom of app.
 * @author Iago Fernández Cuñarro
 *
 */
public final class I18n {
	
	private static Idiom lang = ES.getInstance();
	
	static{
		try {
			lang = IdiomValidator.checkIdiom(Config.getString("lang"));
		} catch (LangException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Get language app.
	 * @return Idiom Idiom of app.
	 */
	public static Idiom getLanguage() {
		return lang;
	}
	
	/**
	 * Set language app.
	 * @param language Idiom of app.
	 */
	public static void setLanguage(String language){
		try {
			lang = IdiomValidator.checkIdiom(language);
		} catch (LangException e) {
			//muestra mensaje pero conserva el idioma actual del sistema
			e.printStackTrace();
		}
	}
	
	/**
	 * Get text app.
	 * @param key Key asociated to text searched.
	 * @return String Text searched.
	 */
	public static String get(String key) {
		return lang.get(key);
	}
	
	

}

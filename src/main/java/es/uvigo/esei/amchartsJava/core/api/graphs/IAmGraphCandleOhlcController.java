package es.uvigo.esei.amchartsJava.core.api.graphs;

import es.uvigo.esei.amchartsJava.core.constants.ShowAt;

/**
 * 
 * Interface for AmGraphCandleOhlcController.This interface contains common methods to
 * graphs used in candle and ohlc charts. 
 * Details of AmGraph and its methods in AmCharts API.
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IAmGraphCandleOhlcController extends IAmGraphSerialController {

	/**
	 * Get highField property.
	 * @return Value of highField.
	 */
	abstract String getHighField();

	/**
	 * Set highField property.
	 * @param highField Value for highField.
	 */
	abstract void setHighField(String highField);

	/**
	 * Get lowField property.
	 * @return Value of lowField.
	 */
	abstract String getLowField();

	/**
	 * Set lowField property.
	 * @param lowField Value for lowField.
	 */
	abstract void setLowField(String lowField);
	
	/**
	 * Get showBulletsAt property.<br>
	 * Default: close.
	 * @return Value of showBulletsAt.
	 */
	abstract String getShowBulletsAt();
	
	/**
	 * Set showBulletAt property.
	 * @param showBulletsAt Value for showBulletsAt.
	 */
	abstract void setShowBulletsAt(ShowAt showBulletsAt);

}
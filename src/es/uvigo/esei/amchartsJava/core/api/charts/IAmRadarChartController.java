package es.uvigo.esei.amchartsJava.core.api.charts;

import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmCoordinateChart;

/**
 * 
 * Interface for controller of AmRadarChart. Details of AmRadarChart and 
 *  its properties in AmCharts API
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IAmRadarChartController extends IAmCoordinateChartController<AmCoordinateChart> {

	/**
	 * Get categoryField property.
	 * @return String Value for categoryField.
	 */
	abstract String getCategoryField();

	/**
	 * Set categoryField property.
	 * @param categoryField Value for categoryField.
	 */
	abstract void setCategoryField(String categoryField);

	/**
	 * Get marginBottom property.<br>
	 * Default: 0.
	 * @return Object Value for marginBottom is an integer number.
	 */
	abstract Object getMarginBottom();

	/**
	 * Set marginBottom property.
	 * @param marginBottom Value for marginBottom.
	 * @throws IntegerException Value for marginBottom is not an integer number.
	 */
	abstract void setMarginBottom(Number marginBottom) throws IntegerException;

	/**
	 * Get marginLeft property.<br>
	 * Default: 0.
	 * @return Object Value for marginLeft is an integer number.
	 */
	abstract Object getMarginLeft();

	/**
	 * Set marginLeft property.
	 * @param marginLeft Value for marginLeft.
	 * @throws IntegerException Value for marginLeft is not an integer number.
	 */
	abstract void setMarginLeft(Number marginLeft) throws IntegerException;

	/**
	 * Get marginRight property.<br>
	 * Default: 0.
	 * @return Object Value for marginRight is an integer number.
	 */
	abstract Object getMarginRight();

	/**
	 * Set marginRight property.
	 * @param marginRight Value for marginRight.
	 * @throws IntegerException Value for marginRight is not an integer number.
	 */
	abstract void setMarginRight(Number marginRight) throws IntegerException;

	/**
	 * Get marginTop property.<br>
	 * Default: 0.
	 * @return Object Value for marginTop is an integer number.
	 */
	abstract Object getMarginTop();

	/**
	 * Set marginTop property.
	 * @param marginTop Value for marginTop.
	 * @throws IntegerException Value for marginTop is not an integer number.
	 */
	abstract void setMarginTop(Number marginTop) throws IntegerException;

	/**
	 * Get radius property.<br>
	 * Default: 35%.
	 * @return String Value for radius is an integer number or a percent.
	 */
	abstract String getRadius();

	/**
	 * Set radius property.
	 * @param radius Value for radius.
	 * @throws CoordException Value for radius is not an integer number or a percent.
	 */
	abstract void setRadius(String radius) throws CoordException;

}
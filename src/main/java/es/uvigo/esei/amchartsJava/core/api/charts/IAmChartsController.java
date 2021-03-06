package es.uvigo.esei.amchartsJava.core.api.charts;

import java.util.List;

import es.uvigo.esei.amchartsJava.core.controllers.charts.AmChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;

/**
 * 
 * Controller of AmCharts. Details of AmCharts and its properties in AmCharts API.
 * This class save charts created in app.
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public interface IAmChartsController {

	/**
	 * Enable baseHref property.<br>
	 * Default: AmCharts.baseHref = false;
	 * @param enabled Enable or disable baseHref.
	 * @return Value for enabledBaseHref.
	 */
	abstract String enabledBaseHref(Boolean enabled);

	/**
	 * Get bezierX property.<br>
	 * Default: AmCharts.bezierX = 3;
	 * @return Value of bezierX.
	 */
	abstract String getBezierX();

	/**
	 * Set bezierX property.
	 * @param bezierX Value for bezierX.
	 * @throws IntegerException Value for bezierX is not an integer number.
	 */
	abstract void setBezierX(Number bezierX) throws IntegerException;

	/**
	 * Get bezierY property.<br>
	 * Default: AmCharts.bezierY = 6;
	 * @return String Value of bezierY.
	 */
	abstract String getBezierY();

	/**
	 * Set bezierY property.
	 * @param bezierY Value for bezierY.
	 * @throws IntegerException Value for bezierY is not an integer number.
	 */
	abstract void setBezierY(Number bezierY) throws IntegerException;

	/**
	 * Get charts property.
	 * @return List of charts.
	 */
	@SuppressWarnings("rawtypes")
	abstract List<AmChartController> getCharts();

	/**
	 * Add chart to collection amcharts.
	 * @param <E> type of chart
	 * @param amchart chart to add
	 */
	@SuppressWarnings("rawtypes")
	abstract <E extends AmChartController> void addChart(E amchart);

	/**
	 * Get dayNames property.
	 * Default: Dependent of idiom used by app.
	 * Default amcharts: AmCharts.dayNames = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];
	 * @return Values of dayNames.
	 */
	abstract String getDayNames();

	/**
	 * Get monthNames property.
	 * Default: Dependent of idiom used by app.
	 * Default amcharts: AmCharts.monthNames = ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'];
	 * @return Values of monthNames.
	 */
	abstract String getMonthNames();

	/**
	 * Get processDelay property.<br>
	 * Default: AmCharts.processDelay = 0;
	 * @return Value of proccesDelay.
	 */
	abstract String getProcessDelay();

	/**
	 * Set proccesDelay property.
	 * @param processDelay Value for processDelay.
	 * @throws IntegerException Value for processDelay is not an integer number.
	 */
	abstract void setProcessDelay(Number processDelay) throws IntegerException;

	/**
	 * Get shortDayNames property.<br>
	 * Default: Dependent of idiom used by app.
	 * Default amcharts: AmCharts.shortDayNames = ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'];
	 * @return Value of shortDayNames.
	 */
	abstract String getShortDayNames();

	/**
	 * Get shortMonthNames property.<br>
	 * Default: Dependent of idiom used by app.
	 * Default amcharts: AmCharts.shortMonthNames = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'];
	 * @return Values of short months.
	 */
	abstract String getShortMonthNames();

	/**
	 * Enable useUTC.<br>
	 * Default: AmCharts.useUTC = false;.
	 * @param enabled Value for enabledUseUTC.
	 * @return Enable or disable useUTC.
	 */
	abstract String enabledUseUTC(Boolean enabled);

	/**
	 * Clear all charts from app.
	 */
	abstract void clear();


}
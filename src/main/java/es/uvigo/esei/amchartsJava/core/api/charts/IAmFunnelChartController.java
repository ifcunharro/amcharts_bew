package es.uvigo.esei.amchartsJava.core.api.charts;

import es.uvigo.esei.amchartsJava.core.constants.Align;
import es.uvigo.esei.amchartsJava.core.constants.ValueRepresents;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmSlicedChart;

/**
 * 
 * Interface for controller of AmFunnelChart. Details of AmFunnelChart and 
 *  its properties in AmCharts API
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IAmFunnelChartController extends IAmSlicedChartController<AmSlicedChart> {

	/**
	 * Get angle property.
	 * @return Value of angle.
	 */
	abstract Integer getAngle();

	/**
	 * Set angle property.
	 * @param angle Value for angle.
	 * @throws OutOfRangeException Value out of range admitted: 0-360.
	 */
	abstract void setAngle(Number angle) throws OutOfRangeException;

	/**
	 * Get balloonText property.<br>
	 * Default: [[title]]:[[value]]\n[[description]]
	 * @return Value of balloonText.
	 */
	abstract String getBalloonText();

	/**
	 * Set balloonText property.
	 * @param balloonText Value for balloonText.
	 */
	abstract void setBalloonText(String balloonText);

	/**
	 * Get baseWidth property.<br>
	 * Default: 100%.
	 * @return Value of baseWidth.
	 */
	abstract String getBaseWidth();

	/**
	 * Set baseWidth property.
	 * @param baseWidth Value for baseWidth.
	 * @throws CoordException Value for baseWidth is not an integer number or a percent.
	 */
	abstract void setBaseWidth(String baseWidth) throws CoordException;

	/**
	 * Get depth3D property.<br>
	 * Default: 0.
	 * @return Value of depth3D.
	 */
	abstract Integer getDepth3D();

	/**
	 * Set depth3D property.With improvedVisibility enabled range activated.
	 * @param depth3D Value for depth3D.
	 * @throws OutOfRangeException Value out of range admitted: 0-50
	 */
	abstract void setDepth3D(Number depth3D) throws OutOfRangeException;

	/**
	 * Get labelPosition property.<br>
	 * Default: center.
	 * @return Value of labelPosition.
	 */
	abstract String getLabelPosition();

	/**
	 * Set labelPosition property.
	 * @param labelPosition Value for labelPosition.
	 */
	abstract void setLabelPosition(Align labelPosition);

	/**
	 * Get labelText property.<br>
	 * Default: [[title]]:[[value]]
	 * @return Value of labelText.
	 */
	abstract String getLabelText();

	/**
	 * Set labelText property.
	 * @param labelText Value for labelText.
	 */
	abstract void setLabelText(String labelText);

	/**
	 * Get neckHeight property.<br>
	 * Default: 0.
	 * @return Value of neckHeight.
	 */
	abstract String getNeckHeight();

	/**
	 * Set neckHeight property.
	 * @param neckHeight Value for neckHeight.
	 * @throws CoordException Value for neckHeight is not an integer number or a percent.
	 */
	abstract void setNeckHeight(String neckHeight) throws CoordException;

	/**
	 * Get neckWidth property.<br>
	 * Default: 0.
	 * @return Value of neckWidth.
	 */
	abstract String getNeckWidth();

	/**
	 * Set neckWidth property.
	 * @param neckWidth Value for neckWidth.
	 * @throws CoordException Value for neckWidth is not an integer number or a percent.
	 */
	abstract void setNeckWidth(String neckWidth) throws CoordException;

	/**
	 * Get pullDistance property.<br>
	 * Default: 30.
	 * @return Value of pullDistance.
	 */
	abstract String getPullDistance();

	/**
	 * Set pullDistance property.
	 * @param pullDistance Value for pullDistance.
	 * @throws CoordException Value for pullDistance is not an integer number or a percent.
	 */
	abstract void setPullDistance(String pullDistance) throws CoordException;

	/**
	 * Get rotate property.<br>
	 * Default: false
	 * @return Value of rotate.
	 */
	abstract Boolean isRotate();

	/**
	 * Set rotate property.
	 * @param rotate Enable or disable rotate.
	 */
	abstract void setRotate(Boolean rotate);

	/**
	 * Get startX property.<br>
	 * Default: 0.
	 * @return Value of startX.
	 */
	abstract Integer getStartX();

	/**
	 * Set startX property.
	 * @param startX Value for startX.
	 * @throws IntegerException Value for startX is not an integer number.
	 */
	abstract void setStartX(Number startX) throws IntegerException;

	/**
	 * Get startY property.<br>
	 * Default: 0.
	 * @return Value of startY.
	 */
	abstract Integer getStartY();

	/**
	 * Set startY property.
	 * @param startY Value for startY.
	 * @throws IntegerException Value for startY is not an integer number.
	 */
	abstract void setStartY(Number startY) throws IntegerException;

	/**
	 * Get valueRepresents property.<br>
	 * Default: height.
	 * @return Value of valueRepresents.
	 */
	abstract String getValueRepresents();

	/**
	 * Set valueRepresents property.
	 * @param valueRepresents Value for valueRepresents.
	 */
	abstract void setValueRepresents(ValueRepresents valueRepresents);

}
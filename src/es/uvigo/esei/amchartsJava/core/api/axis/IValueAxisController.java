package es.uvigo.esei.amchartsJava.core.api.axis;

import java.sql.Date;





import es.uvigo.esei.amchartsJava.core.constants.AxisTypeConstant.AxisType;
import es.uvigo.esei.amchartsJava.core.constants.DurationConstant.Duration;
import es.uvigo.esei.amchartsJava.core.constants.PositionConstant.Position;
import es.uvigo.esei.amchartsJava.core.constants.StackTypeConstant.StackType;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.DoubleException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmCoordinateChart;

/**
 * 
 * Interface for controller of ValueAxis. Details of ValueAxis and 
 *  its properties in AmCharts API
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IValueAxisController extends IAxisBaseController {

	/**
	 * Set chart that use ValueAxis.
	 * @param chart own of ValueAxis
	 */
	abstract void setChart(AmCoordinateChart chart);

	/**
	 * Get baseValue property.<br>
	 * Default: 0.
	 * @return Integer Value for baseValue.
	 */
	abstract Integer getBaseValue();

	/**
	 * Set baseValue property.
	 * @param baseValue Value for baseValue.
	 * @throws IntegerException Value for baseValue is not an integer number.
	 */
	abstract void setBaseValue(Number baseValue) throws IntegerException;

	/**
	 * Get duration property.
	 * @return String Value for duration.
	 */
	abstract String getDuration();

	/**
	 * Set duration property.
	 * @param duration Value for duration.
	 */
	abstract void setDuration(Duration duration);

	/**
	 * Get id property.
	 * @return String ValueAxis id.
	 */
	abstract String getId();

	/**
	 * Get includeGuideInMinMax property.<br>
	 * Default: false.
	 * @return Boolean Value for includeGuideesInMinMax.
	 */
	abstract Boolean isIncludeGuidesInMinMax();

	/**
	 * Set includeGuidesInMinMax property.
	 * @param includeGuidesInMinMax Enable or disable includeGuidesInMinMax.
	 */
	abstract void setIncludeGuidesInMinMax(Boolean includeGuidesInMinMax);

	/**
	 * Get includeHidden property.<br>
	 * Default: false.
	 * @return Boolean Value for includeHidden.
	 */
	abstract Boolean isIncludeHidden();
	
	/**
	 * Set includeHidden property.
	 * @param includeHidden Include or exclude graphs hidden.
	 */
	abstract void setIncludeHidden(Boolean includeHidden);

	/**
	 * Get integersOnly property.<br>
	 * Default: false.
	 * @return Boolean Value for integersOnly.
	 */
	abstract Boolean isIntegersOnly();

	/**
	 * Set ingegersOnly property.
	 * @param integersOnly Admit or don't admit double numbers.
	 */
	abstract void setIntegersOnly(Boolean integersOnly);

	/**
	 * Get labelFunction property.
	 * @return String Value for labelFunction.
	 */
	abstract String getLabelFunction();

	/**
	 * Set labelFunction property.
	 * @param labelFunction Value for labelFunction.
	 */
	abstract void setLabelFunction(String labelFunction);

	/**
	 * Get logarithmic property.<br>
	 * Default: false.
	 * @return Boolean Value for lograrithmic.
	 */
	abstract Boolean isLogarithmic();

	/**
	 * Set logarithmic property.
	 * @param logarithmic Enable or disable scale logarithmic.
	 */
	abstract void setLogarithmic(Boolean logarithmic);

	/**
	 * Get maximum property.
	 * @return Double Value for maximum.
	 */
	abstract Double getMaximum();

	/**
	 * Set maximum property.
	 * @param maximum Value for maximum.
	 * @throws DoubleException Value for maximum is not a double number.
	 */
	abstract void setMaximum(Number maximum) throws DoubleException;

	/**
	 * Get maximumDate property.
	 * @return String Value for maximumDate.
	 */
	abstract String getMaximumDate();

	/**
	 * Set maximumDate property.
	 * @param maximumDate Value for maximumDate.
	 */
	abstract void setMaximunDate(Date maximumDate);

	/**
	 * Get minimum property.
	 * @return Double Value for minimum.
	 */
	abstract Double getMinimum();

	/**
	 * Set minimum property.
	 * @param minimum Value for minimum.
	 * @throws DoubleException Value for minimum is not a double number.
	 */
	abstract void setMinimum(Number minimum) throws DoubleException;

	/**
	 * Get minimunDate property.
	 * @return String Value for minimumDate.
	 */
	abstract String getMinimumDate();

	/**
	 * Set minimumDate property.
	 * @param minimumDate Value for minimumDate.
	 */
	abstract void setMinimumDate(Date minimumDate);

	/**
	 * Get minMaxMultiplier property.<br>
	 * Default: 1.
	 * @return Double Value for minMaxMultiplier.
	 */
	abstract Double getMinMaxMultiplier();

	/**
	 * Set minMaxMultiplier property.
	 * @param minMaxMultiplier Value for minMaxMultiplier.
	 * @throws DoubleException Value for minMaxMultiplier is not a double number.
	 */
	abstract void setMinMaxMultiplier(Number minMaxMultiplier)
			throws DoubleException;

	/**
	 * Get precision property.
	 * @return Integer Value for precision.
	 */
	abstract Integer getPrecision();

	/**
	 * Set precision property.
	 * @param precision Value for precision.
	 * @throws OutOfRangeException Value out of range admitted: 2-15.
	 */
	abstract void setPrecision(Number precision) throws OutOfRangeException;

	/**
	 * Get recalculateToPercents property.<br>
	 * Default: false.
	 * @return Boolean Value for recalculateToPercents.
	 */
	abstract Boolean isRecalculateToPercents();

	/**
	 * Set recalculateToPercents property.
	 * @param recalculateToPercents Enable or disable recalculateToPercents.
	 */
	abstract void setRecalculateToPercents(Boolean recalculateToPercents);

	/**
	 * Get revesed property.<br>
	 * Default: false.
	 * @return Boolean Value for reversed.
	 */
	abstract Boolean isReversed();

	/**
	 * Set reversed property.
	 * @param reversed Reverse or don't reverse values.
	 */
	abstract void setReversed(Boolean reversed);

	/**
	 * Get stackType property.<br>
	 * Default: none.
	 * @return String Value for stactType.
	 */
	abstract String getStackType();

	/**
	 * Set stackType property.
	 * @param stackType Value for stackType.
	 */
	abstract void setStackType(StackType stackType);

	/**
	 * Get strictMinMax property.<br>
	 * Default: false.
	 * @return Boolean Value for strictMinMax.
	 */
	abstract Boolean isStrictMinMax();

	/**
	 * Set strictMinMax property.
	 * @param strictMinMax Adjust or don't adjust min or max values.
	 */
	abstract void setStrictMinMax(Boolean strictMinMax);

	/**
	 * Get synchronizationMultiplier property.
	 * @return Double Value for synchronizationMultiplier.
	 */
	abstract Double getSynchronizationMultiplier();

	/**
	 * Set synchronizationMultiplier property.
	 * @param synchronizationMultiplier Value for synchronizationMultiplier.
	 * @throws DoubleException Value for synchronizationMultiplier is not a double number.
	 */
	abstract void setSynchronizationMultiplier(Number synchronizationMultiplier)
			throws DoubleException;

	/**
	 * Get synchronizeWith property.
	 * @return String Value for synchronizeWith is a ValueAxis id.
	 */
	abstract String getSynchronizeWith();

	/**
	 * Set synchronizeWith property.
	 * @param synchronizeWith Value for synchronizeWith.
	 * @throws ChartException Chart doesn't contain a ValueAxis with id equals to synchronizeWith.
	 */
	abstract void setSynchronizeWith(String synchronizeWith) throws ChartException;

	/**
	 * Get totalText property.
	 * @return String Value for totalText.
	 */
	abstract String getTotalText();

	/**
	 * Enable totalText. Set totalText property to
	 * [[total]]
	 */
	abstract void enabledTotalText();

	/**
	 * Get totalTextColor property.
	 * @return String Value for totalTextColor.
	 */
	abstract String getTotalTextColor();

	/**
	 * Set totalTextColor property.
	 * @param totalTextColor Value for totalTextColor.
	 * @throws ColorException Format color doesn'ta admitted, format admitted: #ffffff
	 */
	abstract void setTotalTextColor(String totalTextColor) throws ColorException;

	/**
	 * Get totalTextOffset property.<br>
	 * Default: 0.
	 * @return Integer Value for totalTextOffset.
	 */
	abstract Integer getTotalTextOffset();

	/**
	 * Set totalTextOffset property.With improvedVisibility enabled range activated.
	 * @param totalTextOffset Value for totalTextOffset.
	 * @throws OutOfRangeException Value out of range admitted: 0-10.
	 */
	abstract void setTotalTextOffset(Number totalTextOffset)
			throws OutOfRangeException;

	/**
	 * Get treatZeroAs property.<br>
	 * Default: 0.
	 * @return Integer Value for treaZeroAs.
	 */
	abstract Integer getTreatZeroAs();

	/**
	 * Set treatZeroAs property.
	 * @param treatZeroAs Value for treatZeroAs.
	 * @throws IntegerException Value for treatZeroAs is not an integer number.
	 */
	abstract void setTreatZeroAs(Number treatZeroAs) throws IntegerException;

	/**
	 * Get type property.<br>
	 * Default: numeric.
	 * @return Value for type.
	 */
	abstract String getType();

	/**
	 * Set type property.
	 * @param type Value for type.
	 */
	abstract void setType(AxisType type);

	/**
	 * Get unit property.
	 * @return String Value for unit.
	 */
	abstract String getUnit();

	/**
	 * Set unit property.
	 * @param unit Value for unit.
	 */
	abstract void setUnit(String unit);

	/**
	 * Get unitPosition property.<br>
	 * Default: right.
	 * @return String Value for unitPosition.
	 */
	abstract String getUnitPosition();

	/**
	 * Set unitPosition property.
	 * @param unitPosition Value for unitPosition.
	 */
	abstract void setUnitPosition(Position unitPosition);

	/**
	 * Get usePrefixes property.<br>
	 * Default: false.
	 * @return Boolean Value for usePrefixes.
	 */
	abstract Boolean isUsePrefixes();

	/**
	 * Set usePrefixes property.
	 * @param usePrefixes Enable or disable prefixes.
	 */
	abstract void setUsePrefixes(Boolean usePrefixes);

	/**
	 * Get useScientificNotation property.<br>
	 * Default: false.
	 * @return Boolean Value for useScientificNotation.
	 */
	abstract Boolean isUseScientificNotation();

	/**
	 * Set useScientificNotation property.
	 * @param useScientificNotation Enable or disable scientificNotation.
	 */
	abstract void setUseScientificNotation(Boolean useScientificNotation);
	
}
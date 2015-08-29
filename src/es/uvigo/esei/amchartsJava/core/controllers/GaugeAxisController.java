package es.uvigo.esei.amchartsJava.core.controllers;

import java.io.Serializable;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.IGaugeAxisController;
import es.uvigo.esei.amchartsJava.core.constants.AxisPositionConstant.Position;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.GaugeAxis;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.TypeValidator;

@JsonInclude(Include.NON_NULL)
public class GaugeAxisController 
		implements Serializable, Observer, IGaugeAxisController{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1432463462678411858L;
	private GaugeAxis gaugeAxis;

	
	{
		gaugeAxis = new GaugeAxis();
	}
	
	@Override
	public void update(Observable o, Object arg) {
		this.setId("GaugeAxis-"+arg.toString());	
	}
	
	private void setId(String id) {
		gaugeAxis.setFeature("id", id);
	}
	
	public Object getAxisAlpha(){
		return gaugeAxis.getFeature("axisAlpha");
	}
	
	public void setAxisAlpha(Number axisAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(axisAlpha, 0, 1)){
			gaugeAxis.setFeature("axisAlpha", axisAlpha);
		}
	}
	
	public String getAxisColor(){
		return (String) gaugeAxis.getFeature("axisColor");
	}
	
	public void setAxisColor(String axisColor) throws ColorException{
		if(ColorValidator.checkFormatColor(axisColor)){
			gaugeAxis.setFeature("axisColor", axisColor);
		}
	}
	
	public Object getAxisThickness(){
		return gaugeAxis.getFeature("axisThickness");
	}
	
	public void setAxisThickness(Number axisThickness) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(axisThickness, 0, 5)){
			gaugeAxis.setFeature("axisThickness", axisThickness);
		}
	}
	
	public Object getBandAlpha(){
		return gaugeAxis.getFeature("bandAlpha");
	}
	
	public void setBandAlpha(Number bandAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(bandAlpha, 0, 1)){
			gaugeAxis.setFeature("bandAlpha", bandAlpha);
		}
	}
	
	public Object getBandOutlineAlpha(){
		return gaugeAxis.getFeature("bandOutlineAlpha");
	}
	
	public void setBandOutlineAlpha(Number bandOutlineAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(bandOutlineAlpha, 0, 1)){
			gaugeAxis.setFeature("bandOutlineAlpha", bandOutlineAlpha);
		}
	}
	
	public String getBandOutlineColor(){
		return (String) gaugeAxis.getFeature("bandOutlineColor");
	}
	
	public void setBandOutlineColor(String bandOutlineColor) throws ColorException{
		if(ColorValidator.checkFormatColor(bandOutlineColor)){
			gaugeAxis.setFeature("bandOutlineColor", bandOutlineColor);
		}
	}
	
	public Object getBandOutlineThickness(){
		return gaugeAxis.getFeature("bandOutlineThickness");
	}
	
	public void setBandOutlineThickness(Number bandOutlineThickness) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(bandOutlineThickness, 0, 10)){
			gaugeAxis.setFeature("bandOutlineThickness", bandOutlineThickness);
		}
	}
	
	public List<GaugeBandController> getBands(){
		return gaugeAxis.getBands();
	}
	
	@SuppressWarnings("unused")
	private void setBands(List<GaugeBandController> gaugeBands){
		gaugeAxis.setBands(gaugeBands);
	}
	
	public String getBottomText(){
		return (String) gaugeAxis.getFeature("bottomText");
	}
	
	public void setBottomText(String bottomText){
		gaugeAxis.setFeature("bottomText", bottomText);
	}
	
	@JsonProperty(value="bottomTextBold")
	public Boolean isBottomTextBold(){
		return (Boolean) gaugeAxis.getFeature("bottomTextBold");
	}
	
	public void setBottomTextBold(Boolean bottomTextBold){
		gaugeAxis.setFeature("bottomTextBold", bottomTextBold);
	}
	
	public String getBottomTextColor(){
		return (String) gaugeAxis.getFeature("bottomTextColor");
	}
	
	public void setBottomTextColor(String bottomTextColor) throws ColorException{
		if(ColorValidator.checkFormatColor(bottomTextColor)){
			gaugeAxis.setFeature("bottomTextColor", bottomTextColor);
		}
	}
	
	public Object getBottomTextFontSize(){
		return gaugeAxis.getFeature("bottomTextFontSize");
	}
	
	public void setBottomTextFontSize(Number bottomTextFontSize) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(bottomTextFontSize, 0, 36)){
			gaugeAxis.setFeature("bottomTextFontSize", bottomTextFontSize);
		}
	}
	
	public Object getBottomTextYOffset(){
		return gaugeAxis.getFeature("bottomTextYOffset");
	}
	
	public void setBottomTextYOffset(Number bottomTextYOffset) throws IntegerException{
		if(NumberValidator.integerValidator(bottomTextYOffset)){
			gaugeAxis.setFeature("bottomTextYOffset", bottomTextYOffset);
		}
	}
	
	public String getCenterX(){
		return (String) gaugeAxis.getFeature("centerX");
	}
	
	public void setCenterX(String centerX) throws CoordException{
		if(TypeValidator.pixelOrPercent(centerX)){
			gaugeAxis.setFeature("centerX", centerX);
		}
	}
	
	public String getCenterY(){
		return (String) gaugeAxis.getFeature("centerY");
	}
	
	public void setCenterY(String centerY) throws CoordException{
		if(TypeValidator.pixelOrPercent(centerY)){
			gaugeAxis.setFeature("centerY", centerY);
		}
	}
	
	public Object getEndAngle(){
		return gaugeAxis.getFeature("endAngle");
	}
	
	public void setEndAngle(Number endAngle) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(endAngle, -180, 180)){
			gaugeAxis.setFeature("endAngle", endAngle);
		}
	}
	
	public Object getEndValue(){
		return gaugeAxis.getFeature("endValue");
	}
	
	public void setEndValue(Number endValue) throws IntegerException{
		if(NumberValidator.integerValidator(endValue)){
			gaugeAxis.setFeature("endValue", endValue);
		}
	}
	
	public Object getGridCount(){
		return gaugeAxis.getFeature("gridCount");
	}
	
	public void setGridCount(Number gridCount) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(gridCount, 0, 100)){
			gaugeAxis.setFeature("gridCount", gridCount);
		}
	}
	
	@JsonProperty(value="gridInside")
	public Boolean isGridInside(){
		return (Boolean) gaugeAxis.getFeature("gridInside");
	}
	
	public void setGridInside(Boolean gridInside){
		gaugeAxis.setFeature("gridInside", gridInside);
	}
	
	public String getId() {
		return (String) gaugeAxis.getFeature("id");
	}
	
	@JsonProperty(value="inside")
	public Boolean isInside(){
		return (Boolean) gaugeAxis.getFeature("inside");
	}
	
	public void setInside(Boolean inside){
		gaugeAxis.setFeature("inside", inside);
	}
	
	public Object getLabelFrequncy(){
		return gaugeAxis.getFeature("labelFrequency");
	}
	
	public void setLabelFrequency(Number labelFrequency) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(labelFrequency, 1, 5)){
			gaugeAxis.setFeature("labelFrequency", labelFrequency);
		}
	}
	
	public String getLabelFunction(){
		return (String) gaugeAxis.getFeature("labelFunction");
	}
	
	public void setLabelFunction(String labelFunction){
		gaugeAxis.setFeature("labelFunction", labelFunction);
	}
	
	public Object getLabelOffset(){
		return gaugeAxis.getFeature("labelOffset");
	}
	
	public void setLabelOffset(Number labelOffset) throws IntegerException{
		if(NumberValidator.integerValidator(labelOffset)){
			gaugeAxis.setFeature("labelOffset", labelOffset);
		}
	}
	
	@JsonProperty(value="labelsEnabled")
	public Boolean isLabelsEnabled(){
		return (Boolean) gaugeAxis.getFeature("labelsEnabled");
	}
	
	public void setLabelsEnabled(Boolean labelsEnabled){
		gaugeAxis.setFeature("labelsEnabled", labelsEnabled);
	}
	
	//listeners
	
	public Object getMinorTickInterval(){
		return gaugeAxis.getFeature("minorTickInterval");
	}
	
	public void setMinorTickInterval(Number minorTickInterval) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(minorTickInterval, 1, 5)){
			gaugeAxis.setFeature("minorTickInterval", minorTickInterval);
		}
	}
	
	public Object getMinorTickLength(){
		return gaugeAxis.getFeature("minorTickLength");
	}
	
	public void setMinorTickLength(Number minorTickLength) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(minorTickLength, 1, 10)){
			gaugeAxis.setFeature("minorTickLength", minorTickLength);
		}
	}
	
	public String getRadius(){
		return (String) gaugeAxis.getFeature("radius");
	}
	
	public void setRadius(String radius) throws CoordException{
		if(TypeValidator.pixelOrPercent(radius)){
			if(radius.contains("%")
					&& Integer.valueOf(radius.substring(0, radius.length()-1))>100){
				gaugeAxis.setFeature("radius", "100%");
			}else{
				gaugeAxis.setFeature("radius", radius);
			}
		}
	}
	
	@JsonProperty(value="showFirstLabel")
	public Boolean isShowFirstLabel(){
		return (Boolean) gaugeAxis.getFeature("showFirstLabel");
	}
	
	public void setShowFirstLabel(Boolean showFirstLabel){
		gaugeAxis.setFeature("showFirstLabel", showFirstLabel);
	}
	
	public Boolean isShowLastLabel(){
		return (Boolean) gaugeAxis.getFeature("showLastLabel");
	}
	
	public void setShowLastLabel(Boolean showLastLabel){
		gaugeAxis.setFeature("showLastLabel", showLastLabel);
	}
	
	public Object getStartAngle(){
		return gaugeAxis.getFeature("startAngle");
	}
	
	public void setStartAngle(Number startAngle) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(startAngle, -180, 180)){
			gaugeAxis.setFeature("startAngle", startAngle);
		}
	}
	
	public Object getStartValue(){
		return gaugeAxis.getFeature("startValue");
	}
	
	public void setStartValue(Number startValue) throws IntegerException{
		if(NumberValidator.integerValidator(startValue)){
			gaugeAxis.setFeature("startValue", startValue);
		}
	}
	
	public Object getTickAlpha(){
		return gaugeAxis.getFeature("tickAlpha");
	}
	
	public void setTickAlpha(Number tickAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(tickAlpha, 0, 1)){
			gaugeAxis.setFeature("tickAlpha", tickAlpha);
		}
	}
	
	public String getTickColor(){
		return (String) gaugeAxis.getFeature("tickColor");
	}
	
	public void setTickColor(String tickColor) throws ColorException{
		if(ColorValidator.checkFormatColor(tickColor)){
			gaugeAxis.setFeature("tickColor", tickColor);
		}
	}
	
	public Object getTickLength(){
		return gaugeAxis.getFeature("tickLength");
	}
	
	public void setTickLength(Number tickLength) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(tickLength, 0, 15)){
			gaugeAxis.setFeature("tickLength", tickLength);
		}
	}
	
	public Object getTickThickness(){
		return gaugeAxis.getFeature("tickThickness");
	}
	
	public void setTickThickness(Number tickThickness) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(tickThickness, 0, 4)){
			gaugeAxis.setFeature("tickThickness", tickThickness);
		}
	}
	
	public String getTopText(){
		return (String) gaugeAxis.getFeature("topText");
	}
	
	public void setTopText(String topText){
		gaugeAxis.setFeature("topText", topText);
	}
	
	@JsonProperty(value="topTextBold")
	public Boolean isTopTextBold(){
		return (Boolean) gaugeAxis.getFeature("topTextBold");
	}
	
	public void setTopTextBold(Boolean topTextBold){
		gaugeAxis.setFeature("topTextBold", topTextBold);
	}
	
	public String getTopTextColor(){
		return (String) gaugeAxis.getFeature("topTextColor");
	}
	
	public void setTopTextColor(String topTextColor) throws ColorException{
		if(ColorValidator.checkFormatColor(topTextColor)){
			gaugeAxis.setFeature("topTextColor", topTextColor);
		}
	}
	
	public Object getTopTextFontSize(){
		return gaugeAxis.getFeature("topTextFontSize");
	}
	
	public void setTopTextFontSize(Number topTextFontSize) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(topTextFontSize, 0, 36)){
			gaugeAxis.setFeature("topTextFontSize", topTextFontSize);
		}
	}
	
	public Object getTopTextYOffset(){
		return gaugeAxis.getFeature("topTextYOffset");
	}
	
	public void setTopTextYOffset(Number topTextYOffset) throws IntegerException{
		if(NumberValidator.integerValidator(topTextYOffset)){
			gaugeAxis.setFeature("topTextYOffset", topTextYOffset);
		}
	}
	
	public String getUnit(){
		return (String) gaugeAxis.getFeature("unit");
	}
	
	public void setUnit(String unit){
		gaugeAxis.setFeature("unit", unit);
	}
	
	public String getUnitPosition(){
		return (String) gaugeAxis.getFeature("unitPosition");
	}
	
	public void setUnitPosition(Position unitPosition){
		gaugeAxis.setFeature("unitPosition", unitPosition.toString());
	}
	
	@JsonProperty(value="usePrefixes")
	public Boolean isUsePrefixes(){
		return (Boolean) gaugeAxis.getFeature("usePrefixes");
	}
	
	public void setUsePrefixes(Boolean usePrefixes){
		gaugeAxis.setFeature("usePrefixes", usePrefixes);
	}
	
	public Object getValueInterval(){
		return gaugeAxis.getFeature("valueInterval");
	}
	
	public void setValueInterval(Number valueInterval){
		if(valueInterval.intValue()>1){
			gaugeAxis.setFeature("valueInterval", valueInterval);
		}
	}
	
	public void addBand(GaugeBandController gaugeBandController){
		gaugeAxis.addBand(gaugeBandController);
	}

}
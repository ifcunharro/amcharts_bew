package es.uvigo.esei.amchartsJava.core.controllers.graphs;

import java.io.Serializable;
import java.util.Observable;
import java.util.Observer;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.graphs.IAmGraphController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.ColorsAmCharts;
import es.uvigo.esei.amchartsJava.core.constants.Config;
import es.uvigo.esei.amchartsJava.core.constants.BulletConstant.Bullet;
import es.uvigo.esei.amchartsJava.core.constants.OrientationConstant.Orientation;
import es.uvigo.esei.amchartsJava.core.constants.GraphTypesConstant.GraphType;
import es.uvigo.esei.amchartsJava.core.constants.LabelAnchorConstant.LabelAnchor;
import es.uvigo.esei.amchartsJava.core.constants.LabelPositionConstant.LabelPosition;
import es.uvigo.esei.amchartsJava.core.constants.LegendPeriodValueTextConstant.LegendPeriodValueText;
import es.uvigo.esei.amchartsJava.core.constants.MarkerTypeConstant.MarkerType;
import es.uvigo.esei.amchartsJava.core.constants.TagsTextConstant.TagsText;
import es.uvigo.esei.amchartsJava.core.constants.UrlTargetConstant.UrlTarget;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.controllers.PatternController;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.DoubleException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.MalFormedPatternException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.AmGraph;
import es.uvigo.esei.amchartsJava.core.model.charts.AmCoordinateChart;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.TypeValidator;




@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AmGraphController implements Observer, Serializable, IAmGraphController{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5885650666487286522L;
	protected AmGraph amGraph;
	//chart que usa el graph
	protected AmCoordinateChart amchart;
	protected static final Logger logger = Logger.getLogger(AmGraph.class.getName());

	
	
	{
		amGraph = new AmGraph();
	}
	
	
	protected AmGraphController() {
		
	}
	
	@Override
	public void update(Observable o, Object arg) {
		this.setId("AmGraph-"+arg.toString());
		this.setTitle("AmGraph-"+arg.toString());
	}
	
	@JsonIgnore
	public void setChart(AmCoordinateChart chart){
		amchart = chart;
	}
	
	public String getId(){
		return (String) amGraph.getFeature("id");
	}
	
	private void setId(String id) {
		amGraph.setFeature("id", id);	
	}
	
	public String getAlphaField(){
		return (String) amGraph.getFeature("alphaField");
	}
	
	public void setAlphaField(String alphaField){
		amGraph.setFeature("alphaField", alphaField);
		amGraph.addGraphField("alphaField", alphaField);
	}
	
	@JsonProperty(value="animationPlayed")
	public Boolean isAnimationPlayed(){
		return (Boolean) amGraph.getFeature("animationPlayed");
	}
	
	public void setAnimationPlayed(Boolean animationPlayed){
		amGraph.setFeature("animationPlayed", animationPlayed);
	}
	
	public String getBalloonColor(){
		return (String) amGraph.getFeature("balloonColor");
	}
	
	public void setBalloonColor(ColorsAmCharts balloonColor){
		amGraph.setFeature("balloonColor", balloonColor.toString());
	}
	
	public String getBalloonFunction(){
		return (String) amGraph.getFeature("balloonFunction");
	}
	
	public void setBalloonFunction(String balloonFunction){
		amGraph.setFeature("balloonFunction", balloonFunction);
	}
	
	public String getBullet(){
		return (String) amGraph.getFeature("bullet");
	}
	
	public void setBullet(Bullet bullet){
		amGraph.setFeature("bullet", bullet.toString());
	}
	
	public Object getBulletAlpha(){
		return amGraph.getFeature("bulletAlpha");
	}
	
	public void setBulletAlpha(Number bulletAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(bulletAlpha, 0, 1)){
			amGraph.setFeature("bulletAlpha", bulletAlpha);
		}
	}
	
	public Object getBulletBorderAlpha(){
		return amGraph.getFeature("bulletBorderAlpha");
	}
	
	public void setBulletBorderAlpha(Number bulletBorderAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(bulletBorderAlpha, 0, 1)){
			amGraph.setFeature("bulletBorderAlpha", bulletBorderAlpha);
		}
	}
	
	public String getBulletBordeColor(){
		return (String) amGraph.getFeature("bulletBorderColor");
	}
	
	public void setBulletBorderColor(ColorsAmCharts bulletBorderColor){
		amGraph.setFeature("bulletBorderColor", bulletBorderColor.toString());
	}
	
	public Object getBulletBorderThickness(){
		return amGraph.getFeature("bulletBorderThickness");
	}
	
	public void setBulletBorderThickness(Number bulletBorderThickness) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(bulletBorderThickness, 0, 5)){
				amGraph.setFeature("bulletBorderThickness", bulletBorderThickness);
			}
		}else{
			amGraph.setFeature("bulletBorderThickness", bulletBorderThickness);
		}
	}
	
	public String getBulletColor(){
		return (String) amGraph.getFeature("bulletColor");
	}
	
	public void setBulletColor(ColorsAmCharts bulletColor){
		amGraph.setFeature("bulletColor", bulletColor.toString());
	}
	
	public String getBulletField(){
		return (String) amGraph.getFeature("bulletField");
	}
	
	public void setBulletField(String bulletField){
		amGraph.setFeature("bulletField", bulletField);
		amGraph.addGraphField("bulletField", bulletField);
	}
	
	public Object getBulletOffset(){
		return amGraph.getFeature("bulletOffset");
	}
	
	public void setBulletOffset(Number bulletOffset) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(bulletOffset, 0, 10)){
				amGraph.setFeature("bulletOffset", bulletOffset);
			}
		}else{
			amGraph.setFeature("bulletOffset", bulletOffset);
		}
	}
	
	public Object getBulletSize(){
		return amGraph.getFeature("bulletSize");
	}
	
	public void setBulletSize(Number bulletSize) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(bulletSize, 5, 36)){
				amGraph.setFeature("bulletSize", bulletSize);
			}
		}else{
			amGraph.setFeature("bulletSize", bulletSize);
		}
	}
	
	public String getBulletSizeField(){
		return (String) amGraph.getFeature("bulletSizeField");
	}
	
	public void setBulletSizeField(String bulletSizeField){
		amGraph.setFeature("bulletSizeField", bulletSizeField);
		amGraph.addGraphField("bulletSizeField", bulletSizeField);
	}
	
	public String getCloseField(){
		return (String) amGraph.getFeature("closeField");
	}
	
	public void setCloseField(String closeField){
		amGraph.setFeature("closeField", closeField);
		amGraph.addGraphField("closeField", closeField);
	}
	
	public String getColor(){
		return (String) amGraph.getFeature("color");
	}
	
	public void setColor(ColorsAmCharts color){
		amGraph.setFeature("color", color.toString());
	}
	
	public String getColorField(){
		return (String) amGraph.getFeature("colorField");
	}
	
	public void setColorField(String colorField){
		amGraph.setFeature("colorField", colorField);
		amGraph.addGraphField("colorField", colorField);
	}
	
	public Object getCursorBulletAlpha(){
		return amGraph.getFeature("cursorBulletAlpha");
	}
	
	public void setCursorBulletAlpha(Number cursorBulletAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(cursorBulletAlpha, 0, 1)){
			amGraph.setFeature("cursorBulletAlpha", cursorBulletAlpha);
		}
	}
	//path to image custom bullet
	public String getCustomBullet(){
		return (String) amGraph.getFeature("customBullet");
	}
	//FALTA VALIDAR PATH
	public void setCustomBullet(String customBullet){
		amGraph.setFeature("customBullet", customBullet);
	}
	
	public String getCustomBulletField(){
		return (String) amGraph.getFeature("customBulletField");
	}
	
	public void setCustomBulletField(String customBulletField){
		amGraph.setFeature("customBulletField", customBulletField);
		amGraph.addGraphField("customBulletField", customBulletField);
	}
	
	public String getCustomMarker(){
		return (String) amGraph.getFeature("customMarker");
	}
	
	public void setCustomMarker(String customMarker){
		amGraph.setFeature("customMarker", customMarker);
	}
	
	public String getDateFormat(){
		return (String) amGraph.getFeature("dateFormat");
	}
	
	//escogido de DateFormatConstant, filtrar a nivel interfaz, 
	// si se usa sin interfaz propia o sin ninguna interfaz no se realiza ningún cambio
	public void setDateFormat(String dateFormat){
		if(TypeValidator.checkDateFormat(dateFormat)){
			amGraph.setFeature("dateFormat", dateFormat);
		}
	}
	
	public String getDescriptionField(){
		return (String) amGraph.getFeature("descriptionField");
	}
	
	public void setDescriptionField(String descriptionField){
		amGraph.setFeature("descriptionField", descriptionField);
		amGraph.addGraphField("descriptionField", descriptionField);
	}
	
	public String getErrorField(){
		return (String) amGraph.getFeature("errorField");
	}
	
	public void setErrorField(String errorField){
		amGraph.setFeature("errorField", errorField);
		amGraph.addGraphField("errorField", errorField);
	}
	
	public Object getFillAlphas(){
		return amGraph.getFeature("fillAlphas");
	}
	
	public void setFillAlphas(Number fillAlphas) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(fillAlphas, 0, 1)){
			amGraph.setFeature("fillAlphas",fillAlphas);
		}
	}
	
	public String getFillToGraph(){
		return (String) amGraph.getFeature("fillToGraph");
	}
	
	//debe ser el id de otro graph
	public void setFillToGraph(String fillToGraph) throws ChartException{
		if(amchart != null){
			if(amchart.existGraph(fillToGraph)){
				amGraph.setFeature("fillToGraph", fillToGraph);
			}
		}else{
			if(Config.getString("log").equals("file")){
				logger.info(getClass().getSimpleName()+I18n.get("ChartException"));
			}
			throw new ChartException(getClass().getSimpleName()+I18n.get("ChartException"));
		}
	}
	
	@JsonSetter(value="fillToGraph")
	private void setJsonFillToGraph(String fillToGraph){
		amGraph.setFeature("fillToGraph", fillToGraph);
	}
	
	public Object getFontSize(){
		return amGraph.getFeature("fontSize");
	}
	
	public void setFontSize(Number fontSize) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(fontSize, 10, 36)){
				amGraph.setFeature("fontSize", fontSize);
			}
		}else{
			amGraph.setFeature("fontSize", fontSize);
		}
	}
	
	public Object getGapPeriod(){
		return amGraph.getFeature("gapPeriod");
	}
	
	public void setGapPeriod(Number gapPeriod) throws DoubleException{
		if(NumberValidator.doubleValidator(gapPeriod)){
			amGraph.setFeature("gapPeriod", gapPeriod);
		}
	}
	
	public String getGradientOrientation(){
		return (String) amGraph.getFeature("gradientOrientation");
	}
	
	public void setGradientOrientation(Orientation gradientOrientation){
		amGraph.setFeature("gradientOrientation", gradientOrientation.toString());
	}
	
	@JsonProperty(value="hidden")
	public Boolean isHidden(){
		return (Boolean) amGraph.getFeature("hidden");
	}
	
	public void setHidden(Boolean hidden){
		amGraph.setFeature("hidden", hidden);
	}
	
	public Object getHideBulletsCount(){
		return amGraph.getFeature("hideBulletsCount");
	}
	
	public void setHideBulletsCount(Number hideBulletsCount) throws IntegerException{
		if(NumberValidator.integerValidator(hideBulletsCount)){
			amGraph.setFeature("hideBulletsCount", hideBulletsCount);
		}
	}
	
	@JsonProperty(value="includeInMinMax")
	public Boolean isIncludeInMinMax(){
		return (Boolean) amGraph.getFeature("includeInMinMax");
	}
	
	public void setIncludeInMinMax(Boolean includeInMinMax){
		amGraph.setFeature("includeInMinMax", includeInMinMax);
	}
	
	public String getLabelAnchor(){
		return (String) amGraph.getFeature("labelAnchor");
	}
	
	public void setLabelAnchor(LabelAnchor labelAnchor){
		amGraph.setFeature("labelAnchor", labelAnchor.toString());
	}
	
	public String getLabelColorField(){
		return (String) amGraph.getFeature("labelColorField");
	}
	
	public void setLabelColorField(String labelColorField){
		amGraph.setFeature("labelColorField", labelColorField);
		amGraph.addGraphField("labelColorField", labelColorField);
	}
	
	public String getLabelFunction(){
		return (String) amGraph.getFeature("labelFunction");
	}
	
	public void setLabelFunction(String labelFunction){
		amGraph.setFeature("labelFunction", labelFunction);
	}
	
	public Object getLabelOffset(){
		return amGraph.getFeature("labelOffset");
	}
	
	public void setLabelOffset(Number labelOffset) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(labelOffset, 0, 10)){
				amGraph.setFeature("labelOffset", labelOffset);
			}
		}else{
			amGraph.setFeature("labelOffset", labelOffset);
		}
	}
	
	public String getLabelPosition(){
		return (String) amGraph.getFeature("labelPosition");
	}
	
	public void setLabelPosition(LabelPosition labelPosition){
		amGraph.setFeature("labelPosition", labelPosition.toString());
	}
	
	public Object getLabelRotation(){
		return amGraph.getFeature("labelRotation");
	}
	
	public void setLabelRotation(Number labelRotation) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(labelRotation, 0, 360)){
			amGraph.setFeature("labelRotation", labelRotation);
		}
	}
	
	public String getLabelText(){
		return (String) amGraph.getFeature("labelText");
	}
	
	public void setLabelText(TagsText labelText){
		amGraph.setFeature("labelText", labelText.toString());
	}
	
	public Object getLegendAlpha(){
		return amGraph.getFeature("legendAlpha");
	}
	
	public void setLegendAlpha(Number legendAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(legendAlpha, 0, 1)){
			amGraph.setFeature("legendAlpha", legendAlpha);
		}
	}
	
	public String getLegendColor(){
		return (String) amGraph.getFeature("legendColor");
	}
	
	public void setLegendColor(ColorsAmCharts legendColor){
		amGraph.setFeature("legendColor", legendColor.toString());
	}
	
	public String getLegendPeriodValueText(){
		return (String) amGraph.getFeature("legendPeriodValueText");
	}
	
	public void setLegendPeriodValueText(LegendPeriodValueText legendPeriodValueText){
		amGraph.setFeature("legendPeriodValueText", legendPeriodValueText.toString());
	}
	
	public String getLegendValueText(){
		return (String) amGraph.getFeature("legendValueText");
	}
	
	public void setLegendValueText(TagsText legendValueText){
		amGraph.setFeature("legendValueText", legendValueText.toString());
	}
	
	public Object getLineAlpha(){
		return amGraph.getFeature("lineAlpha");
	}
	
	public void setLineAlpha(Number lineAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(lineAlpha, 0, 1)){
			amGraph.setFeature("lineAlpha", lineAlpha);
		}
	}
	
	public String getMakerType(){
		return (String) amGraph.getFeature("markerType");
	}
	
	public void setMarkerType(MarkerType markerType){
		amGraph.setFeature("markerType", markerType.toString());
	}
	
	public Object getMinDistance(){
		return amGraph.getFeature("minDistance");
	}
	
	public void setMinDistance(Number minDistance) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(minDistance, 0, 100)){
				amGraph.setFeature("minDistance", minDistance);
			}
		}else{
			amGraph.setFeature("minDistance", minDistance);
		}
	}
	
	public Object getNegativeBase(){
		return amGraph.getFeature("negativeBase");
	}
	
	public void setNegativeBase(Number negativeBase) throws IntegerException{
		if(NumberValidator.integerValidator(negativeBase)){
			amGraph.setFeature("negativeBase", negativeBase);
		}
	}
	
	public Object getNegativeFillAlphas(){
		return amGraph.getFeature("negativeFillAlphas");
	}
	
	public void setNegativeFillAlphas(Number negativeFillAlhas) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(negativeFillAlhas, 0, 1)){
			amGraph.setFeature("negativeFillAlhas", negativeFillAlhas);
		}
	}
	
	public String getNegativeFillColors(){
		return (String) amGraph.getFeature("negativeFillColors");
	}
	
	public void setNegativeFillColors(ColorsAmCharts negativeFillColors){
		amGraph.setFeature("negativeFillColors", negativeFillColors.toString());
	}
	
	public PatternController getPattern(){
		return amGraph.getPattern();
	}
	
	public void setPattern(PatternController pattern) throws MalFormedPatternException{
		if(TypeValidator.checkPattern(pattern)){
			amGraph.addPattern(pattern);
		}else{
			if(Config.getString("log").equals("file")){
				logger.info(I18n.get("PatternException"));
			}
			throw new MalFormedPatternException(I18n.get("PatternException"));
		}
	}
	
	public String getPatternField(){
		return (String) amGraph.getFeature("patternField");
	}
	
	public void setPatternField(String patternField){
		amGraph.setFeature("patternField", patternField);
		amGraph.addGraphField("patternField", patternField);
	}
	
	public Object getPrecision(){
		return amGraph.getFeature("precision");
	}
	
	public void setPrecision(Number precision) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(precision, -1, 2)){
			amGraph.setFeature("precision", precision);
		}
	}
	
	@JsonProperty(value="proCandleSticks")
	public Boolean isProCandleSticks(){
		return (Boolean) amGraph.getFeature("proCandleSticks");
	}
	
	public void setProCandleSticks(Boolean proCandleSticks){
		amGraph.setFeature("proCandleSticks", proCandleSticks);
	}
	
	@JsonProperty(value="showAllValueLabels")
	public Boolean isShowAllValueLabels(){
		return (Boolean) amGraph.getFeature("showAllValueLabels");
	}
	
	public void setShowAllValueLabels(Boolean showAllValueLabels){
		amGraph.setFeature("showAllValueLabels", showAllValueLabels);
	}
	
	@JsonProperty(value="showBalloon")
	public Boolean isShowBalloon(){
		return (Boolean) amGraph.getFeature("showBalloon");
	}
	
	public void setShowBalloon(Boolean showBalloon){
		amGraph.setFeature("showBalloon", showBalloon);
	}
	
	@JsonProperty(value="showHandOnHover")
	public Boolean isShowHandOnHover(){
		return (Boolean) amGraph.getFeature("showHandOnHover");
	}
	
	public void setShowHandOnHover(Boolean showHandOnHover){
		amGraph.setFeature("showHandOnHover", showHandOnHover);
	}
	
	@JsonProperty(value="showOnAxis")
	public Boolean isShowOnAxis(){
		return (Boolean) amGraph.getFeature("showOnAxis");
	}
	
	public void setShowOnAxis(Boolean showOnAxis){
		amGraph.setFeature("showOnAxis", showOnAxis);
	}
	
	@JsonProperty(value="stackable")
	public Boolean isStackable(){
		return (Boolean) amGraph.getFeature("stackable");
	}
	
	public void setStackable(Boolean stackable){
		amGraph.setFeature("stackable", stackable);
	}
	
	@JsonProperty(value="switchable")
	public Boolean isSwitchable(){
		return (Boolean) amGraph.getFeature("switchable");
	}
	
	public void setSwitchable(Boolean switchable){
		amGraph.setFeature("switchable", switchable);
	}
	
	public String getTitle(){
		return (String) amGraph.getFeature("title");
	}
	
	public void setTitle(String title) {
		amGraph.setFeature("title", title);
	}
	
	public String getType(){
		return (String) amGraph.getFeature("type");
	}
	
	public void setType(GraphType type){
		amGraph.setFeature("type", type.toString());
	}
	
	public String getUrlField(){
		return (String) amGraph.getFeature("urlField");
	}
	
	public void setUrlField(String urlField){
		amGraph.setFeature("urlField", urlField);
		amGraph.addGraphField("urlField", urlField);
	}
	
	public String getUrlTarget(){
		return (String) amGraph.getFeature("urlTarget");
	}
	
	public void setUrlTarget(UrlTarget urlTarget){
		amGraph.setFeature("urlTarget", urlTarget.toString());
	}
	
	public String getValueAxis(){
		return (String) amGraph.getFeature("valueAxis");
	}
	
	public void setValueAxis(String valueAxis) throws ChartException{
		if(amchart != null){
			if(amchart.existValueAxis(valueAxis)){
				amGraph.setFeature("valueAxis", valueAxis);
			}
		}else{
			if(Config.getString("log").equals("file")){
				logger.info(getClass().getSimpleName()+I18n.get("ChartException"));
			
			}
			throw new ChartException(getClass().getSimpleName()+I18n.get("ChartException"));
		}
	}
	
	@JsonSetter(value="valueAxis")
	private void setJsonValueAxis(String valueAxis){
		amGraph.setFeature("valueAxis", valueAxis);
	}
	
	public String getValueField(){
		return (String) amGraph.getFeature("valueField");
	}
	
	public void setValueField(String valueField){
		amGraph.setFeature("valueField", valueField);
		amGraph.addGraphField("valueField", valueField);
	}
	
	@JsonProperty(value="visibleInLegend")
	public Boolean isVisibleInLegend(){
		return (Boolean) amGraph.getFeature("visibleInLegend");
	}
	
	public void setVisibleInLegend(Boolean visibleInLegend){
		amGraph.setFeature("visibleInLegend", visibleInLegend);
	}
	
}

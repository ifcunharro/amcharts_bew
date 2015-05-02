package amcharts.controller;




import amcharts.model.Constants.AlignConstant;
import amcharts.model.Constants.LegendPositionConstant.LegendPosition;
import amcharts.model.Constants.MarkerTypeConstant.MarkerType;

import com.fasterxml.jackson.annotation.JsonProperty;

import model.AmLegend;

public class AmLegendController {
	private AmLegend legend;

	{
		legend = new AmLegend();
	}

	public Object getLegend() {
		return legend;
	}
	
	public Object getAlign(){
		return legend.getFeature("align");
	}
	//left center or right
	public void setALign(AlignConstant align){
		legend.setFeature("align", align.toString());
	}
	
	@JsonProperty
	public Object isAutoMargins(){
		return legend.getFeature("autoMargins");
	}
	
	public void setAutoMargins(Boolean autoMargins){
		legend.setFeature("autoMargins", autoMargins);
	}
	
	public Object getBackgroundAlpha(){
		return legend.getFeature("backgroundAlpha");
	}
	
	public void setBackgroundAlpha(Number backgroundAlpha){
		legend.setFeature("backgroundAlpha", backgroundAlpha);
	}
	
	public Object getBackgroundColor(){
		return legend.getFeature("color");
	}
	
	public void setBackgroundColor(String backGroundColor){
		legend.setFeature("backGroundColor", backGroundColor);
	}
	
	public Object getBorderAlpha(){
		return legend.getFeature("borderAlpha");
	}
	
	public void setBorderAlpha(Number borderAlpha){
		legend.setFeature("borderAlpha", borderAlpha);
	}
	
	public Object getBorderColor(){
		return legend.getFeature("borderColor");
	}
	
	public void setBorderColor(String borderColor){
		legend.setFeature("borderColor", borderColor);
	}
	
	public Object getBottom(){
		return legend.getFeature("bottom");
	}
	
	public void setBottom(Number bottom){
		legend.setFeature("bottom", bottom);
	}
	
	public Object getColor(){
		return legend.getFeature("color");
	}
	
	public void setColor(String color){
		legend.setFeature("color", color);
	}
	
	public Object getDivId(){
		return legend.getFeature("divId");
	}
	
	public void setDivId(String divId){
		legend.setFeature("divId", divId);
	}
	
	@JsonProperty
	public Object isEnabled(){
		return legend.getFeature("enabled");
	}
	
	public void setEnabled(Boolean enabled){
		legend.setFeature("enabled", enabled);
	}
	
	@JsonProperty
	public Object isEqualWidths(){
		return legend.getFeature("equalWidths");
	}
	
	public void setEqualWidths(Boolean equalWidths){
		legend.setFeature("equalWidths", equalWidths);
	}
	
	public Object getFontSize(){
		return legend.getFeature("fontSize");
	}
	
	public void setFontSize(Number fontSize){
		legend.setFeature("fontSize", fontSize);
	}
	
	@JsonProperty
	public Object isForceWidth(){
		return legend.getFeature("forceWidth");
	}
	
	public void setForceWidth(Boolean forceWidth){
		legend.setFeature("forceWidth", forceWidth);
	}
	
	public Object getHorizontalGap(){
		return legend.getFeature("horizontalGap");
	}
	
	public void setHorizontalGap(Number horizontalGap){
		legend.setFeature("horizontalGap", horizontalGap);
	}
	
	public Object getLabelText(){
		return legend.getFeature("labelText");
	}
	
	//texto entre [[]]
	public void setLabelText(String labelText){
		legend.setFeature("labelText", labelText);
	}
	
	public Object getLabelWidth(){
		return legend.getFeature("labelWidth");
	}
	
	public void setLabelWidth(Number labelWidth){
		legend.setFeature("labelWidth", labelWidth);
	}
	
	public Object getLeft(){
		return legend.getFeature("left");
	}
	
	public void setLeft(Number left){
		legend.setFeature("left", left);
	}
	
	public Object getMarginBottom(){
		return legend.getFeature("marginBottom");
	}
	
	public void setMarginBottom(Number marginBottom){
		legend.setFeature("marginBottom", marginBottom);
	}
	
	public Object getMarginLeft(){
		return legend.getFeature("marginLeft");
	}
	
	public void setMarginLeft(Number marginLeft){
		legend.setFeature("marginLeft", marginLeft);
	}
	
	public Object getMarginRight(){
		return legend.getFeature("marginRight");
	}
	
	public void setMarginRight(Number marginRight){
		legend.setFeature("marginRight", marginRight);
	}
	
	public Object getMarginTop(){
		return legend.getFeature("marginTop");
	}
	
	public void setMarginTop(Number marginTop){
		legend.setFeature("marginTop", marginTop);
	}
	
	public Object getMarkerBorderAlpha(){
		return legend.getFeature("markerBorderAlpha");
	}
	
	public void setMarkerBorderAlpha(Number markerBorderAlpha){
		legend.setFeature("markerBorderAlpha", markerBorderAlpha);
	}
	
	public Object getMarkerBorderColor(){
		return legend.getFeature("markerBorderColor");
	}
	
	public void setMarkerBorderColor(String markerBorderColor){
		legend.setFeature("markerBorderColor", markerBorderColor);
	}
	
	public Object getMarkerBorderThickness(){
		return legend.getFeature("markerBorderThickness");
	}
	
	public void setMarkerBorderThickness(Number markerBorderThickness){
		legend.setFeature("markerBorderThickness", markerBorderThickness);
	}
	
	public Object getMarkerDisabledColor(){
		return legend.getFeature("markenDisabledColor");
	}
	
	public void setMarkerDisabledColor(String markerDisabledColor){
		legend.setFeature("markerDisabledColor", markerDisabledColor);
	}
	
	public Object getMarkerLabelGap(){
		return legend.getFeature("markerLabelGap");
	}
	
	public void setMarkerLabelGap(Number markerLabelGap){
		legend.setFeature("markerLabelGap", markerLabelGap);
	}
	
	public Object getMarkerSize(){
		return legend.getFeature("markerSize");
	}
	
	public void setMarkerSize(Number markerSize){
		legend.setFeature("markerSize", markerSize);
	}
	
	public Object getMarkerType(){
		return legend.getFeature("markerType");
	}
	
	public void setMarkerType(MarkerType markerType){
		legend.setFeature("markerType", markerType.toString());
	}
	
	public Object getMaxColumns(){
		return legend.getFeature("maxColumns");
	}
	
	public void setMaxColumns(Number maxColumns){
		legend.setFeature("maxColumns", maxColumns);
	}
	
	public Object getPeriodValueText(){
		return legend.getFeature("periodValueText");
	}
	
	public void setPeriodValueText(String periodValueText){
		legend.setFeature("periodValueText", periodValueText);
	}
	
	public Object getPosition(){
		return legend.getFeature("position");
	}
	
	public void setPosition(LegendPosition position){
		legend.setFeature("position", position.toString());
	}
	
	
	
	
	
	
	
	
	
	
}

package es.uvigo.esei.amchartsJava.controllers.charts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import es.uvigo.esei.amchartsJava.constants.StartEffectConstant.StartEffect;
import es.uvigo.esei.amchartsJava.constants.UrlTargetConstant.UrlTarget;
import es.uvigo.esei.amchartsJava.controllers.graphs.AmGraphController;
import es.uvigo.esei.amchartsJava.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.model.charts.AmCoordinateChart;
import es.uvigo.esei.amchartsJava.validators.NumberValidator;

@JsonInclude(Include.NON_NULL)
public abstract class AmCoordinateChartController<E extends AmCoordinateChart>
			extends AmChartController<AmCoordinateChart>{

	
	public AmCoordinateChartController(E chart){
		super(chart);

	}
	

	//chartData solo lectura
	
	//colors problema tipo prefixes
	
	public Object getColors(){
		return amchart.getColors();
	}
	
	public void changeColorsDefault(String... newColors){
		amchart.changeColorsDefault(newColors);
	}
	
	public void addColor(String color){
		amchart.addColor(color);
	}
	
	@JsonProperty(value="gridAboveGraphs")
	public Object isGridAboveGraphs(){
		return amchart.getFeature("gridAboveGraphs");
	}
	
	public void setGridAboveGraphs(Boolean gridAboveGraphs){
		amchart.setFeature("gridAboveGraphs", gridAboveGraphs);
	}
	
	
	
	//graphs
	public Object getGraphs(){
		return amchart.getGraphs();
	}
	
	//guides
	
	@JsonProperty(value="sequencedAnimation")
	public Object isSequencedAnimation(){
		return amchart.getFeature("sequencedAnimation");
	}
	
	public void setSequencedAnimation(Boolean sequencedAnimation){
		amchart.setFeature("sequencedAnimation", sequencedAnimation);
	}
	
	public Object getStartAlpha(){
		return amchart.getFeature("startAlpha");
	}
	
	public void setStartAlpha(Number startAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(startAlpha, 0, 1)){
			amchart.setFeature("startAlpha", startAlpha);
		}
	}
	
	public Object getStartDuration(){
		return amchart.getFeature("startDuration");
	}
	
	public void setStartDuration(Number startDuration) throws IntegerException{
		if(NumberValidator.integerValidator(startDuration)){
			amchart.setFeature("startDuration", startDuration);
		}
	}
	
	public Object getStartEffect(){
		return amchart.getFeature("startEffect");
	}
	
	public void setStartEffect(StartEffect startEffect){
		amchart.setFeature("startEffect", startEffect.toString());
	}
	
	public Object getUrlTarget(){
		return amchart.getFeature("urlTarget");
	}
	
	public void setUrlTarget(UrlTarget urlTarget){
		amchart.setFeature("urlTarget", urlTarget.toString());
	}
	
	//valueAxes
	
	//methods
	public <T extends AmGraphController> void addGraph(T amGraphController){
		amchart.addGraph(amGraphController);
	}
	
	//remove by id
	public void removeGraph(String id){
		amchart.removeGraph(id);
	}



	

	
}

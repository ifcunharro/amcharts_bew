package es.uvigo.esei.amchartsJava.core.controllers.graphs;

import com.fasterxml.jackson.annotation.JsonSetter;

import es.uvigo.esei.amchartsJava.core.api.graphs.IAmGraphXyController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.GraphType;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.PropertyValidator;

/**
 * This class is a controller for AmGraph of type line used in AmXyChart
 * @author Iago Fernández Cuñarro
 *
 */
public class AmGraphXyController extends AmGraphController 
	implements IAmGraphXyController {

	
	private static final long serialVersionUID = -1740784739849045134L;


	{
		setType(GraphType.line);
		try {
			//property only used by AmXyChart, used to deserialize from json to this class
			setMaxBulletSize(50);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public String getBulletAxis(){
		return (String) amGraph.getFeature("bulletAxis");
	}
	
	public void setBulletAxis(String bulletAxis) throws ChartException{
		if(amchart != null){
			if(PropertyValidator.isValidString(bulletAxis) && amchart.existValueAxis(bulletAxis)){
				amGraph.setFeature("bulletAxis", bulletAxis);
			}
		}else{
			throw new ChartException(getClass().getSimpleName()+I18n.get("ChartException"));
		}
	}
	
	//Used by deserialize json
	@JsonSetter(value="bulletAxis")
	private void setJsonBulletAxis(String bulletAxis){
		amGraph.setFeature("bulletAxis", bulletAxis);	
	}
	
	public String getFillToAxis(){
		return (String) amGraph.getFeature("fillToAxis");
	}
	
	public void setFillToAxis(String fillToAxis) throws ChartException{
		if(amchart != null){
			if(PropertyValidator.isValidString(fillToAxis) && amchart.existValueAxis(fillToAxis)){
				amGraph.setFeature("fillToAxis", fillToAxis);
			}
		}else{
			throw new ChartException(getClass().getSimpleName()+I18n.get("ChartException"));
		}
	}
	
	//Used to deserialize json
	@JsonSetter(value="fillToAxis")
	private void setJsonFillToAxis(String fillToAxis){
		amGraph.setFeature("fillToAxis", fillToAxis);
	}
	
	public Integer getMaxBulletSize(){
		Object maxBulletSize = amGraph.getFeature("maxBulletSize");
		
		return maxBulletSize != null ? ((Number)maxBulletSize).intValue() : null;
	}
	
	public void setMaxBulletSize(Number maxBulletSize) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(maxBulletSize, 50, 100)){
				amGraph.setFeature("maxBulletSize", maxBulletSize);
			}
		}else{
			amGraph.setFeature("maxBulletSize", maxBulletSize);
		}
	}
	
	public Integer getMinBulletSize(){
		Object minBulletSize = amGraph.getFeature("minBulletSize");
		
		return minBulletSize != null ? ((Number)minBulletSize).intValue() : null;
	}
	
	public void setMinBulletSize(Number minBulletSize) throws IntegerException{
		if(NumberValidator.integerValidator(minBulletSize) && minBulletSize.intValue()>=0){
			amGraph.setFeature("minBulletSize", minBulletSize);
		}
	}
	
	public String getXAxis(){
		return (String) amGraph.getFeature("xAxis");
	}
	
	public void setXAxis(String xAxis) throws ChartException{
		if(amchart != null){
			if(PropertyValidator.isValidString(xAxis) && amchart.existValueAxis(xAxis)){
				amGraph.setFeature("xAxis", xAxis);
			}
		}else{
			throw new ChartException(getClass().getSimpleName()+I18n.get("ChartException"));
		}
	}
	
	//Used to deserialize json
	@JsonSetter(value="xAxis")
	private void setJsonXAxis(String xAxis){
		amGraph.setFeature("xAxis", xAxis);
	}
	
	public String getXField(){
		return (String) amGraph.getFeature("xField");
	}
	
	public void setXField(String xField){
		if(PropertyValidator.isValidString(xField)){
			amGraph.setFeature("xField", xField);
			amGraph.addGraphField("xField", xField);
		}
	}
	
	public String getYAxis(){
		return (String) amGraph.getFeature("yAxis");
	}
	
	public void setYAxis(String yAxis) throws ChartException{
		if(amchart != null){
			if(PropertyValidator.isValidString(yAxis) && amchart.existValueAxis(yAxis)){
				amGraph.setFeature("yAxis", yAxis);
			}
		}else{
			throw new ChartException(getClass().getSimpleName()+I18n.get("ChartException"));
		}
	}
	
	//Used to deserialize json
	@JsonSetter(value="yAxis")
	private void setJsonYAxis(String yAxis){
		amGraph.setFeature("yAxis", yAxis);
	}
	
	public String getYField(){
		return (String) amGraph.getFeature("yField");
	}
	
	public void setYField(String yField){
		if(PropertyValidator.isValidString(yField)){
			amGraph.setFeature("yField", yField);
			amGraph.addGraphField("yField", yField);
		}
	}

}

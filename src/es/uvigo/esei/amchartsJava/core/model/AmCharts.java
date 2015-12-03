package es.uvigo.esei.amchartsJava.core.model;

import java.util.ArrayList;
import java.util.List;

import es.uvigo.esei.amchartsJava.core.controllers.charts.AmChartController;

/**
 * Model class for AmCharts.
 * @author Iago Fernández Cuñarro
 *
 */
public class AmCharts extends IModel {
	
	
	@SuppressWarnings("rawtypes")
	private List<AmChartController> charts;

	/**
	 * Get charts.
	 * @return List<AmChartController> List of charts.
	 */
	@SuppressWarnings("rawtypes")
	public List<AmChartController> getCharts() {
		if(charts == null){
			return null;
		}else{
			return charts;
		}
	}

	/**
	 * Add a chart.
	 * @param amchart New chart.
	 */
	@SuppressWarnings("rawtypes")
	public <E extends AmChartController>void addChart(E amchart) {
		if(charts == null){
			charts = new ArrayList<AmChartController>();
		}
		charts.add(amchart);
		
	}

	/**
	 * Remove all charts.
	 */
	public void clear() {
		charts.clear();
		charts = null;
		
		
	}

}

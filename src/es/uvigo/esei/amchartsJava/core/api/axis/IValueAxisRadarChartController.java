package es.uvigo.esei.amchartsJava.core.api.axis;


import es.uvigo.esei.amchartsJava.core.constants.GridTypesConstant.GridType;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public interface IValueAxisRadarChartController extends IValueAxisController {

	public Object getAxisTitleOffset();

	public void setAxixTitleOffset(Number axisTitleOffset)
			throws OutOfRangeException;

	public Object getGridType();

	public void setGridType(GridType gridType);

	public Object isRadarCategoriesEnabled();

	public void setRadarCategoriesEnabled(Boolean radarCategoriesEnabled);

}
package es.uvigo.esei.amchartsJava.core.constants;


public final class LabelAnchorConstant {
	
	private LabelAnchorConstant(){
		
	}
	
	private static class InitSingleton{
		private static final LabelAnchorConstant INSTANCE = new LabelAnchorConstant();
	}
	
	/**
	 * Method to get a instance of this class
	 * 
	 * @return LabelAnchorConstant instance of LabelAnchorConstant
	 */
	public static LabelAnchorConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum LabelAnchor{
		auto, start, middle, end;
	}
	
	
	public LabelAnchor getAuto(){
		return LabelAnchor.auto;
	}
	
	public LabelAnchor getStart(){
		return LabelAnchor.start;
	}
	
	public LabelAnchor getMiddle(){
		return LabelAnchor.middle;
	}
	
	public LabelAnchor getEnd(){
		return LabelAnchor.end;
	}
	
	public LabelAnchor[] values(){
		return LabelAnchor.values();
	}
}

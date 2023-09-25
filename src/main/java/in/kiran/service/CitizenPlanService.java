package in.kiran.service;

import java.util.List;

import in.kiran.binding.SearchCriteria;
import in.kiran.entity.CitezenPlan;
import jakarta.servlet.http.HttpServletResponse;

public interface CitizenPlanService {
  
	public List<String> getPlanName();
	
	public List<String> getPlanStatus();
	
	public List<CitezenPlan> searchCitezens(SearchCriteria criteria);
	
	public void generateExcel(HttpServletResponse response);
	
	public void generatePdf(HttpServletResponse response);
	
}

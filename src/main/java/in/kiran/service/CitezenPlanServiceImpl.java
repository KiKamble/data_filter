package in.kiran.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.kiran.binding.SearchCriteria;
import in.kiran.entity.CitezenPlan;
import in.kiran.repository.CitezenPlanRepo;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class CitezenPlanServiceImpl implements CitizenPlanService {

	@Autowired
	private CitezenPlanRepo repo;
	
	@Override
	public List<String> getPlanName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getPlanStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CitezenPlan> searchCitezens(SearchCriteria criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void generateExcel(HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void generatePdf(HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

}

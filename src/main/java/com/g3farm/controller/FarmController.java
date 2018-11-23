package com.g3farm.controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.g3farm.model.G3FarmFarmer;
import com.g3farm.service.FarmerServiceImplement;



@Controller
public class FarmController {
	private static final Logger logger = Logger
			.getLogger(FarmController.class);

	public FarmController() {
		System.out.println("FarmerController()");
	}

	@Autowired
	private FarmerServiceImplement farmerService;

	/*@RequestMapping(value = "/")
	public ModelAndView listFarmer(ModelAndView model) throws IOException {
		List<G3FarmFarmer> listFarmer = farmerService.listFarmer();
		model.addObject("listFarmer", listFarmer);
		model.setViewName("FarmerForm");
		return model;
	}*/
	

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ModelAndView newContact(ModelAndView model) {
		G3FarmFarmer f = new G3FarmFarmer();
		model.addObject("employee", f);
		model.setViewName("FarmerForm");
		return model;
	}

	/*@RequestMapping(value = "/saveFarmer", method = RequestMethod.POST)
	public ModelAndView saveFarmer(@ModelAttribute G3FarmFarmer f) {
		if (f.getFId() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			farmerService.addFarmer(f);
		} else {
			farmerService.updateFarmer(f);
		}
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.GET)
	public ModelAndView deleteFarmer(HttpServletRequest request) {
		int fId = Integer.parseInt(request.getParameter("id"));
		farmerService.removeFarmer(fId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editEmployee", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int fid = Integer.parseInt(request.getParameter("id"));
		G3FarmFarmer f = farmerService.getFarmerById(fid);
		ModelAndView model = new ModelAndView("FarmerForm");
		model.addObject("farmer",f);

		return model;
	}*/


}

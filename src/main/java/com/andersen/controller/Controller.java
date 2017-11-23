package com.andersen.controller;

import com.andersen.List;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;


@org.springframework.stereotype.Controller
@SessionAttributes(value = "listJSP")
public class Controller {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView main(@ModelAttribute("listJSP") List list) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("listJSP", list);
		modelAndView.setViewName("index");
		return modelAndView;
	}

	@ModelAttribute("listJSP")
	public List createList() {
		return new List();
	}


	@RequestMapping(value = "/addString")
	public ModelAndView checkUser(@ModelAttribute("listJSP") List list) {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("index");

		modelAndView.addObject("listJSP", list);

		return modelAndView;
	}
}

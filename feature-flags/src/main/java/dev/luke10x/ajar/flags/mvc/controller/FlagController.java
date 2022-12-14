package dev.luke10x.ajar.flags.mvc.controller;

import dev.luke10x.ajar.flags.mvc.view.FeatureFlagSiteMap;
import dev.luke10x.ajar.shared.Api;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")

public class FlagController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(ModelMap model) {

		model.addAttribute("message", "From Ajax controller!");
		System.out.println("[welcome]");

		return FeatureFlagSiteMap.JSP_INDEX;
	}

	@GetMapping("/registration")
	public String registration(ModelMap model) {
		var api = new Api();
//		var user = User.builder()
//				.email("e@host")
//				.password(api.getMagicPhrase()).build();
		model.addAttribute("user", null);

		return FeatureFlagSiteMap.JSP_REGISTRATION;
	}
}

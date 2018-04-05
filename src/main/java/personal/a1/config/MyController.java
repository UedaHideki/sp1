package personal.a1.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {


   @GetMapping("/")
   public String index(Model model) {

      model.addAttribute("message", "Hello Spring MVC 5!こんにちは");
      
      
      return "index";
   }
   

	@RequestMapping(value = "/login.html", method = RequestMethod.GET)
	public String login(@RequestParam(name = "error", required = false) String error, Model model) {
		try {
			if (error.equalsIgnoreCase("true")) {
				String errorMsg = "Login Error";
				model.addAttribute("errorMsg", errorMsg);
			}else{
				model.addAttribute("errorMsg", error);
			}
		} catch (NullPointerException e) {
			return "login";
		}

		return "login";
	}

	@RequestMapping(value = {"/logout.html"}, method = RequestMethod.GET)
	public String logout() {
		return "logout_form";
	}
	
	@RequestMapping(value = {"/after_logout.html"}, method = RequestMethod.GET)
	public String afterLogout() {
		return "after_logout_form";
	}

	@RequestMapping(value = {"/logerr.html"}, method = RequestMethod.GET)
	public String logerr() {
		return "logerr_form";
	}
	
		
	@RequestMapping("/access_denied.html")
	public String accessDenied(){
		return "access_denied";
	}
	
		
	@RequestMapping(value = {"/login_form.html"}, method = RequestMethod.GET)
	public String login_form(@RequestParam(name = "error", required = false) String error, Model model) {
		try {
			if (error.equalsIgnoreCase("true")) {
				String errorMsg = "Login Error";
				model.addAttribute("errorMsg", errorMsg);
			}else{
				model.addAttribute("errorMsg", error);
			}
		} catch (NullPointerException e) {
			return "login_form";
		}

		return "login_form";
	}
	
	@RequestMapping(value = {"/after_logout_url.html"}, method = RequestMethod.GET)
	public String afterLogoutUrl() {
		return "after_logout_form";
	}
	
}
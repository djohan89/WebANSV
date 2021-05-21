package vn.ansv.controller.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import vn.ansv.Service.Web.HomeServiceImpl;

@Controller
public class HomeController {
	@Autowired
	HomeServiceImpl homeService;
	
	@RequestMapping(value = { "/", "/trang-chu" }, method = RequestMethod.GET)
	public ModelAndView indexWeb() {
		ModelAndView mav = new ModelAndView("web/index");
		mav.addObject("homeOne", homeService.GetData_HomeOne());
		return mav;
	}
	
	@RequestMapping(value = "/ve-chung-toi", method = RequestMethod.GET)
	public ModelAndView aboutPage() {
		ModelAndView mav = new ModelAndView("web/about_us");
		return mav;
	}
	
	@RequestMapping(value = "/to-chuc", method = RequestMethod.GET)
	public ModelAndView structurePage() {
		ModelAndView mav = new ModelAndView("web/structure");
		return mav;
	}
	
	@RequestMapping(value = "/lich-su", method = RequestMethod.GET)
	public ModelAndView historyPage() {
		ModelAndView mav = new ModelAndView("web/history_timeline");
		return mav;
	}
	
	@RequestMapping(value = "/khach-hang", method = RequestMethod.GET)
	public ModelAndView clientPage() {
		ModelAndView mav = new ModelAndView("web/client");
		return mav;
	}
	
	@RequestMapping(value = "/san-pham-thuong-mai", method = RequestMethod.GET)
	public ModelAndView productCommerPage() {
		ModelAndView mav = new ModelAndView("web/product-commer-new");
		return mav;
	}
	
	@RequestMapping(value = "/san-pham-cong-nghe-cong-nghiep", method = RequestMethod.GET)
	public ModelAndView productInformationPage() {
		ModelAndView mav = new ModelAndView("web/product_information");
		return mav;
	}
	@RequestMapping(value = "/du-an-tieu-bieu", method = RequestMethod.GET)
	public ModelAndView hightlightPage() {
		ModelAndView mav = new ModelAndView("web/hightlight");
		return mav;
	}
	
	@RequestMapping(value = "/chuyen-nganh-vien-thong", method = RequestMethod.GET)
	public ModelAndView telecomPage() {
		ModelAndView mav = new ModelAndView("web/telecom");
		return mav;
	}
	
	@RequestMapping(value = "/cong-nghe-thong-tin", method = RequestMethod.GET)
	public ModelAndView ifTechnologyPage() {
		ModelAndView mav = new ModelAndView("web/if_technology");
		return mav;
	}
	
	@RequestMapping(value = "/chuyen-doi-so", method = RequestMethod.GET)
	public ModelAndView nbConvertPage() {
		ModelAndView mav = new ModelAndView("web/nb_convert");
		return mav;
	}
	
	@RequestMapping(value = "/dich-vu", method = RequestMethod.GET)
	public ModelAndView servicePage() {
		ModelAndView mav = new ModelAndView("web/service");
		return mav;
	}
	
	@RequestMapping(value = "/chi-tiet-san-pham", method = RequestMethod.GET)
	public ModelAndView producDetailPage() {
		ModelAndView mav = new ModelAndView("web/product_detail");
		return mav;
	}
	
	@RequestMapping(value = "/lien-he", method = RequestMethod.GET)
	public ModelAndView contactPage() {
		ModelAndView mav = new ModelAndView("web/contact");
		return mav;
	}
	
	@RequestMapping(value = "/tin-tuc", method = RequestMethod.GET)
	public ModelAndView newsPage() {
		ModelAndView mav = new ModelAndView("web/news");
		return mav;
	}
	
}

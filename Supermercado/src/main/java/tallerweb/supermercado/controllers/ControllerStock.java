package tallerweb.supermercado.controllers;

import java.util.Map;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import tallerweb.supermercado.modelo.Producto;
import tallerweb.supermercado.modelo.Stock;


@Controller
public class ControllerStock {
	private Stock stockSupermercado = Stock.getInstance();
	
	@RequestMapping("verStock")
	public ModelAndView irStock() {
		return new ModelAndView("stock");
	}
	
	@ModelAttribute("stockSuper")
	public  Map<Producto, Integer> listadoStock(){
		return stockSupermercado.obtenerStock();
	}

	}

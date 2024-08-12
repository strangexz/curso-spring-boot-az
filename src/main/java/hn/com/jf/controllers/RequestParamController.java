package hn.com.jf.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.com.jf.models.dto.ParamDTO;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/params")
public class RequestParamController {

	@GetMapping("/foo")
	public ParamDTO foo(
			@RequestParam(required = false, defaultValue = "Hola Mundo!", name = "message") String message) {
		ParamDTO param = new ParamDTO();
		param.setMessage(message);

		return param;
	}

	@GetMapping("/bar")
	public ParamDTO bar(@RequestParam String text, @RequestParam Integer code) {
		return new ParamDTO();
	}

	@GetMapping("/request")
	public ParamDTO request(HttpServletRequest request) {
		ParamDTO params = new ParamDTO();
		params.setMessage(request.getParameter("message"));
		params.setCode(Integer.parseInt(request.getParameter("code")));

		return params;
	}
}

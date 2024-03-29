package com.jk.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.jk.command.VehicleDetlsCmd;
import com.jk.dto.VehicleDetlsDTO;
import com.jk.entity.VehicleDetlsEntity;
import com.jk.service.RtoService;

@Controller
@SessionAttributes({ "vhclDtlsModelCmd" })
public class VehicleDetlsController {

	@Autowired
	private RtoService rtoService;

	@GetMapping("/vhclDtls")
	public String showVhclDtlsForm(Model model, @RequestParam("ownerID") int id) {
		
		VehicleDetlsCmd vhclDtlsCmd = null;
		vhclDtlsCmd = new VehicleDetlsCmd();
		model.addAttribute("vhclDtlsModelCmd", vhclDtlsCmd);
		model.addAttribute("ownerID", id);
		return "vehicle-dtls";
	}// showVhclDtlsForm

	// use service
	// redirect to next form
	@PostMapping("/vhclInfo")
	public String saveVhclDtlsFormData(@ModelAttribute VehicleDetlsCmd vhclDtlsCmd, @RequestParam("ownerID") int id) {

		VehicleDetlsDTO vhclDtlsDto = null;
		vhclDtlsDto = new VehicleDetlsDTO();
		BeanUtils.copyProperties(vhclDtlsCmd, vhclDtlsDto);
		rtoService.insertVehicleDetails(vhclDtlsDto, id);
		return "redirect:/vhclReg?ownerID=" + id;
	}// saveVhclDtlsFormData

	// use service
	// launch vehicle-dtlsUpdate form
	@GetMapping("/vhclDtlsUpd")
	public String showVhclDtlsUpdateFormData(@ModelAttribute VehicleDetlsCmd vhclDtlsCmd,
			@RequestParam("ownerID") int id, Model model) {
		
		VehicleDetlsDTO vhclDtlsDto=null;
		vhclDtlsDto = new VehicleDetlsDTO();
		VehicleDetlsEntity vhclDtlsEntity = rtoService.getVehicleDtlsBy(id);
		BeanUtils.copyProperties(vhclDtlsEntity, vhclDtlsDto);
		BeanUtils.copyProperties(vhclDtlsDto, vhclDtlsCmd);
		model.addAttribute("vhclDtlsModelCmd", vhclDtlsCmd);
		model.addAttribute("ownerID", id);
		return "vehicle-dtlsUpdate";
	}// showVhclDtlsUpdateFormData

	// use service
	// redirect to next page
	@PostMapping("/vhclInfoUpd")
	public String updateVhclDtls(@ModelAttribute VehicleDetlsCmd vhclDtlsCmd, @RequestParam("ownerID") int id) {
		
		VehicleDetlsDTO vhclDtlsDto=null;
		vhclDtlsDto = new VehicleDetlsDTO();
		BeanUtils.copyProperties(vhclDtlsCmd, vhclDtlsDto);
		rtoService.updateVhclDtls(vhclDtlsDto, id);
		return "redirect:/vhclReg?ownerID=" + id;
		
	}// updateVhclDtls
}// class

package com.solt.petclinicdemo.controller;

import com.solt.petclinicdemo.model.Vet;
import com.solt.petclinicdemo.service.VetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;

@Controller
public class VetController {
  private final VetService vetService;

  public VetController(VetService vetService) {
    this.vetService = vetService;
  }


  @GetMapping("/vets")
  public String showAllVets(Model model){
    model.addAttribute("vets",vetService.findAll());
    return "view/vets";
  }

  @GetMapping("/home")
  public String home(){
    return "layout/viewlayout";
  }

  @GetMapping("/findvet")
  public String findVet(Model model,HttpServletRequest request){
      String lastName=request.getParameter("vet");
      logger.info("LastName:"+ lastName);
      Vet vet=vetService.searchVetLastName(lastName);
      model.addAttribute("vet",vet);
      return "redirect:/vet/"+ vet.getId();
  }

  @GetMapping("/vet/{id}")
  public String showDetailVet(Model model, @PathVariable("id")long id){
    model.addAttribute("vet",vetService.findById(id));
    return "view/vet";
  }


  private Logger logger= LoggerFactory.getLogger(this.getClass());


}

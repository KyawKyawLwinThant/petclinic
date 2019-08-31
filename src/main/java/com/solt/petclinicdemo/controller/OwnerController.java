package com.solt.petclinicdemo.controller;

import com.solt.petclinicdemo.model.Owner;
import com.solt.petclinicdemo.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class OwnerController {


  private final OwnerService ownerService;

  public OwnerController(OwnerService ownerService) {
    this.ownerService = ownerService;
  }

  @GetMapping("/findowner")
  public String findOwner(){
    return "view/findowner";
  }

  @GetMapping("/addowner")
  public String addOwner(Model model){
    model.addAttribute("owner",new Owner());
    return "view/ownerForm";
  }

  @PostMapping("/addowner")
  public String processOwner(Owner owner
          , RedirectAttributes redirectAttributes
          , Model model){

    ownerService.create(owner);
    redirectAttributes.addFlashAttribute("success",true);

    return "redirect:/view/owners";
  }


  @GetMapping("/view/owners")
  public String showAllOwners(Model model){
    model.addAttribute("owners",ownerService.findAll());
    model.addAttribute("createsuccess",model.containsAttribute("success"));
    return "view/owners";
  }


}

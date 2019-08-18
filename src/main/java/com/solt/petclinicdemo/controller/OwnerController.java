package com.solt.petclinicdemo.controller;

import com.solt.petclinicdemo.model.Owner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OwnerController {


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
  public String processOwner(Owner owner, BindingResult result,Model model){
    if(result.hasErrors()){
      model.addAttribute("owner",owner);
      return "view/ownerForm";
    }
    return "";
  }
}

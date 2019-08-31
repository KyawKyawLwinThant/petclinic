package com.solt.petclinicdemo.controller;

import com.solt.petclinicdemo.model.Owner;
import com.solt.petclinicdemo.model.Pet;
import com.solt.petclinicdemo.service.OwnerService;
import com.solt.petclinicdemo.service.PetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
public class OwnerController {

  private Logger logger= LoggerFactory.getLogger(this.getClass());

  private final OwnerService ownerService;
  private final PetService petService;

  public OwnerController(OwnerService ownerService,PetService petService) {
    this.ownerService = ownerService;
    this.petService=petService;
  }

  @GetMapping("/findowner")
  public String findOwner(){
    return "view/findowner";
  }
  @GetMapping("/find")
  public String find(HttpServletRequest request,Model model){
    String lastName=request.getParameter("lastName");
    logger.info("Last Name:"+ lastName);
    Owner owner=ownerService.searchByLastName(lastName);
    model.addAttribute("owner",owner);
    return "redirect:/owner/"+ owner.getId();
  }
  @GetMapping("/owner/{id}")
  public String ownerDetail(Model model,@PathVariable("id")long id){
    model.addAttribute("owner",ownerService.findById(id));
    return "view/ownerdetial";
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

  @GetMapping("/addpet/{ownerid}")
  public String addPetForm(Model model, @PathVariable("ownerid")long ownerid){
    this.ownerId=ownerid;
    model.addAttribute("pet",new Pet());
    return "view/petFrom";
  }

  private long ownerId;

  @PostMapping("/addpet")
  public String processPet(Pet pet){
      ownerService.addPet(pet,ownerId);
      return "redirect:/pets";
  }


  @GetMapping("/pets")
  public String showAllOwnerAndPets(Model model){

      model.addAttribute("pets",petService.findAll());


      return "view/pets";
  }




}

package com.solt.petclinicdemo.model;

import com.solt.petclinicdemo.service.SpecialityService;
import com.solt.petclinicdemo.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

  private final VetService vetService;
  private final SpecialityService specialityService;

  public DatabaseLoader(VetService vetService,SpecialityService specialityService) {
    this.vetService = vetService;
    this.specialityService=specialityService;
  }

  @Override
  public void run(String... args) throws Exception {
    Speciality sp1=new Speciality("Surgeon");
    Speciality sp2=new Speciality("Pharmacy");
    Speciality sp3=new Speciality("Neoulogy");
    Speciality sp4=new Speciality("Food");
    Vet vet1=new Vet("Thaw","Thaw");
    Vet vet2=new Vet("Maw","Maw");
    Vet vet3=new Vet("Thuza","Nwe");
    Vet vet4=new Vet("Kay","Khaing");
    Vet vet5=new Vet("Hlaing","Hlaing");

    //mapping
    vet1.addSepciality(sp1);
    vet1.addSepciality(sp4);
    sp1.getVets().add(vet1);
    sp4.getVets().add(vet1);

    vet2.addSepciality(sp1);
    vet2.addSepciality(sp2);
    sp1.getVets().add(vet2);
    sp2.getVets().add(vet2);

    vet3.addSepciality(sp3);
    sp3.getVets().add(vet3);

    vet4.addSepciality(sp4);
    sp4.getVets().add(vet4);

    vet5.addSepciality(sp1);
    sp1.getVets().add(vet5);

    //persist
   /* specialityService.create(sp1);
    specialityService.create(sp2);
    specialityService.create(sp3);
    specialityService.create(sp4);




    vetService.create(vet1);
    vetService.create(vet2);
    vetService.create(vet3);
    vetService.create(vet4);
    vetService.create(vet5);*/



  }
}

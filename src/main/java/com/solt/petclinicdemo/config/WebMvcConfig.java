package com.solt.petclinicdemo.config;

import com.solt.petclinicdemo.exception.LastNameNotFoundException;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;

@Configuration
@ControllerAdvice
public class WebMvcConfig implements WebMvcConfigurer {


  @Override
  public void addViewControllers(ViewControllerRegistry registry) {
      registry.addRedirectViewController("/","/home");
  }


  @ExceptionHandler({LastNameNotFoundException.class})
  public ModelAndView handleException(Exception ex, HttpServletRequest request){
    ModelAndView mv=new ModelAndView();

    mv.addObject("exception",ex);
    mv.addObject("message",ex.getMessage());
    mv.addObject("url",request.getRequestURL());
    mv.setViewName("view/notfounderror");

    return mv;
  }
}

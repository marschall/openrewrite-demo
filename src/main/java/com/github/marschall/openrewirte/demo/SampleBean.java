package com.github.marschall.openrewirte.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class SampleBean {
  
  @Autowired
  private Integer firstDependency;
  
  @Autowired
  private String secondDependency;

}

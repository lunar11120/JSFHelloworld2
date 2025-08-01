/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.List;

/**
 *
 * @author Juckkapun.l
 */
public class CustomDto {
     private List<CompanyDto> CompanyDtos;
     private List<ProgrammingDto> ProgrammingDtos;

    public CustomDto() {
    }

    public List<CompanyDto> getCompanyDtos() {
        return CompanyDtos;
    }

    public void setCompanyDtos(List<CompanyDto> CompanyDtos) {
        this.CompanyDtos = CompanyDtos;
    }

    public List<ProgrammingDto> getProgrammingDtos() {
        return ProgrammingDtos;
    }

    public void setProgrammingDtos(List<ProgrammingDto> ProgrammingDtos) {
        this.ProgrammingDtos = ProgrammingDtos;
    }
     
}

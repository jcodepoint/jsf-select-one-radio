package com.jcodepoint.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;

@Named("bean")
@RequestScoped
public class ExampleBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<SelectItem> rivers;
	private Map<String, String> lakes;
	
	private String selectedCountry;
	private String selectedRiver;	
	private String selectedLake;	
	
	
	@PostConstruct
	public void init() {
		this.rivers = new ArrayList<SelectItem>();
		this.rivers.add(new SelectItem("parana", "Paraná"));
		this.rivers.add(new SelectItem("limay", "Limay"));
		this.rivers.add(new SelectItem("salado", "Salado"));
		this.rivers.add(new SelectItem("uruguay", "Uruguay"));
		
		this.lakes = new HashMap<String, String>();
		this.lakes.put("san-roque", "San Roque");
		this.lakes.put("argentino", "Argentino");
		this.lakes.put("nahuel-huapi", "Nahuel Huapi");
	}

	
	public List<SelectItem> getRivers() {
		return this.rivers;
	}

	public void setRivers(List<SelectItem> rivers) {
		this.rivers = rivers;
	}

	public Map<String, String> getLakes() {
		return lakes;
	}
	
	public void setLakes(Map<String, String> lakes) {
		this.lakes = lakes;
	}
	
	
	public String getSelectedCountry() {
		return selectedCountry;
	}

	public void setSelectedCountry(String selectedCountry) {
		this.selectedCountry = selectedCountry;
	}
	
	public String getSelectedRiver() {
		return selectedRiver;
	}

	public void setSelectedRiver(String selectedRiver) {
		this.selectedRiver = selectedRiver;
	}

	public String getSelectedLake() {
		return selectedLake;
	}

	public void setSelectedLake(String selectedLake) {
		this.selectedLake = selectedLake;
	}


	public String aceptar() {
		return "result";
	}
	

	public String volver() {
		return "inicio";
	}

}

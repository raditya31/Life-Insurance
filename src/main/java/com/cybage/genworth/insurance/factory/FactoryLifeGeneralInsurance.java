package com.cybage.genworth.insurance.factory;


public class FactoryLifeGeneralInsurance {
public static InsuranceTypeService getUserType(String policyType) {
	if(policyType==null) {
		return null;
	}else if (policyType.equalsIgnoreCase("life")) {
		return new LifeInsurance();
	}else if (policyType.equalsIgnoreCase("general")) {
		return new GeneralInsurance();
	}
	throw new RuntimeException("invalid Input");
	
}
}

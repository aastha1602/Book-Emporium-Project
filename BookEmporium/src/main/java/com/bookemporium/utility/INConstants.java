package com.bookemporium.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class INConstants {
	
	public final static String IN = "IN";
	
	public final static Map<String, String> mapOfINStates = new HashMap<String, String>() {
		{
			put("AN", "Andaman and Nicobar Islands");
			put("AP", "Andhra Pradesh");
			put("AD", "Andhra Pradesh (New)");
            put("AR", "Arunachal Pradesh");
            put("AS", "Assam");
            put("BH", "Bihar");
            put("CH", "Chandigarh");
            put("CT", "Chattisgarh");
            put("DN", "Dadra and Nagar Haveli");
            put("DD", "Daman and Diu ");
            put("DL", "Delhi");
            put("GA", "Goa");
            put("GJ", "Gujarat");
            put("HR", "Haryana");
            put("HP", "Himachal Pradesh");
            put("JK", "Jammu and Kashmir");
            put("JH", "Jharkhand");
            put("KA", "Karnataka");
            put("LA", "Louisiana");
            put("ME", "Maine");
            put("MD", "Maryland");
            put("MA", "Massachusetts");
            put("MI", "Michigan");
            put("MN", "Minnesota");
            put("MS", "Mississippi");
            put("MO", "Missouri");
            put("MT", "Montana");
            put("NE", "Nebraska");
            put("NV", "Nevada");
            put("NH", "New Hampshire");
            put("NJ", "New Jersey");
            put("NM", "New Mexico");
            put("NY", "New York");
            put("NC", "North Carolina");
            put("KL", "Kerala");
            put("LD", "Lakshadweep Islands");
            put("MP", "Madhya Pradesh");
            put("MH", "Maharashtra ");
            put("MN", "Manipur");
            put("ME", "Meghalaya");
            put("MI", "Mizoram");
            put("NL", "Nagaland");
            put("OR", "Odisha");
            put("PY", "Pondicherry");
            put("PB", "Punjab");
            put("RJ", "Rajasthan");
            put("SK", "Sikkim");
            put("TN", "Tamil Nadu");
            put("TS", "Telangana");
            put("TR", "Tripura");
            put("UP", "Uttar Pradesh");
            put("UT", "Uttarakhand");
            put("WB", "West Bengal ");
		}
	};
	
	public final static List<String> listOfINStatesCode = new ArrayList<>(mapOfINStates.keySet());
	public final static List<String> listOfINStatesName = new ArrayList<>(mapOfINStates.values());

}

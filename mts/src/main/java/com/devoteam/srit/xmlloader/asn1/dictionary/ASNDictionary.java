/* 
 * Copyright 2012 Devoteam http://www.devoteam.com
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * 
 * 
 * This file is part of Multi-Protocol Test Suite (MTS).
 * 
 * Multi-Protocol Test Suite (MTS) is free software: you can redistribute
 * it and/or modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation, either version 3 of the
 * License.
 * 
 * Multi-Protocol Test Suite (MTS) is distributed in the hope that it will
 * be useful, but WITHOUT ANY WARRANTY; without even the implied warranty 
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Multi-Protocol Test Suite (MTS).
 * If not, see <http://www.gnu.org/licenses/>.
 * 
 */

package com.devoteam.srit.xmlloader.asn1.dictionary;

import java.util.HashMap;
import java.util.List;

import com.devoteam.srit.xmlloader.core.coding.binary.BooleanField;
import com.devoteam.srit.xmlloader.core.coding.binary.ElementAbstract;
import com.devoteam.srit.xmlloader.core.coding.binary.ElementSimple;
import com.devoteam.srit.xmlloader.core.coding.binary.IntegerField;
import com.devoteam.srit.xmlloader.core.coding.binary.NumberBCDField;


/**
 *
 * @author fhenry
 */
public class ASNDictionary 
{

	private static ASNDictionary _instance;
    
	// list of embedded objects
	private static EmbeddedMap embeddedList;

	// list of binary objects
	private HashMap<String, ElementAbstract> binaryByLabel;

    public ASNDictionary()
    {
		embeddedList = new EmbeddedMap();
		binaryByLabel = new HashMap<String, ElementAbstract>();
		
    	// TCAP dico
		Embedded embedded = new Embedded(
				"com.devoteam.srit.xmlloader.sigtran.ap.tcap.DialogueOC", 
				"com.devoteam.srit.xmlloader.sigtran.ap.tcap.ExternalPDU",
				null); 
		embeddedList.addEmbedded(embedded);
		embedded = new Embedded(
				"com.devoteam.srit.xmlloader.sigtran.ap.tcap.EmbeddedData", 
				"com.devoteam.srit.xmlloader.sigtran.ap.tcap.UniDialoguePDU",
				"direct_reference=0.0.17.773.1.2.1"); 
		embeddedList.addEmbedded(embedded);
		embedded = new Embedded(
				"com.devoteam.srit.xmlloader.sigtran.ap.tcap.EmbeddedData", 
				"com.devoteam.srit.xmlloader.sigtran.ap.tcap.DialoguePDU",
				"direct_reference=0.0.17.773.1.1.1"); 
		embeddedList.addEmbedded(embedded);
		embedded = new Embedded(
				"com.devoteam.srit.xmlloader.sigtran.ap.tcap.ObjectId", 
				"org.bn.types.ObjectIdentifier",
				null); 
		embeddedList.addEmbedded(embedded);
		embedded = new Embedded(
				"com.devoteam.srit.xmlloader.sigtran.ap.tcap.AssResult", 
				"com.devoteam.srit.xmlloader.sigtran.ap.tcap.Associate_result",
				null); 
		embeddedList.addEmbedded(embedded);
		embedded = new Embedded(
				"com.devoteam.srit.xmlloader.sigtran.ap.tcap.AssSourceDiagnostic", 
				"com.devoteam.srit.xmlloader.sigtran.ap.tcap.Associate_source_diagnostic",
				null); 
		embeddedList.addEmbedded(embedded);
		embedded = new Embedded(
				"com.devoteam.srit.xmlloader.sigtran.ap.tcap.DialogueServiceUser", 
				"com.devoteam.srit.xmlloader.sigtran.ap.tcap.Dialogue_service_user",
				null); 
		embeddedList.addEmbedded(embedded);
		embedded = new Embedded(
				"com.devoteam.srit.xmlloader.sigtran.ap.tcap.AssResult", 
				"com.devoteam.srit.xmlloader.sigtran.ap.tcap.Associate_result",
				null); 
		embeddedList.addEmbedded(embedded);
		embedded = new Embedded(
				"com.devoteam.srit.xmlloader.sigtran.ap.tcap.DialogueServiceProvider", 
				"com.devoteam.srit.xmlloader.sigtran.ap.tcap.Dialogue_service_provider",
				null); 
		embeddedList.addEmbedded(embedded);
		embedded = new Embedded(
				"com.devoteam.srit.xmlloader.sigtran.ap.tcap.DialogueServiceProvider", 
				"com.devoteam.srit.xmlloader.sigtran.ap.tcap.Dialogue_service_provider",
				null); 
		embeddedList.addEmbedded(embedded);
		embedded = new Embedded(
				"com.devoteam.srit.xmlloader.sigtran.ap.tcap.DialogueServiceProvider", 
				"com.devoteam.srit.xmlloader.sigtran.ap.tcap.Dialogue_service_provider",
				null); 
		embeddedList.addEmbedded(embedded);
		// MAP dico
		// sendRoutingInfoForSM MESSAGE 
		embedded = new Embedded(
				"invokeparameter", 
				"com.devoteam.srit.xmlloader.sigtran.ap.map.RoutingInfoForSMArg",
				"localValue=45");
		embeddedList.addEmbedded(embedded);
		embedded = new Embedded(
				"returnparameter", 
				"com.devoteam.srit.xmlloader.sigtran.ap.map.RoutingInfoForSM_Res",
				"localValue=45");
		embeddedList.addEmbedded(embedded);
		// mt-forwardSM MESSAGE
		embedded = new Embedded(
				"invokeparameter", 
				"com.devoteam.srit.xmlloader.sigtran.ap.map.Mt_forwardSM_Arg",
				"localValue=44");
		embeddedList.addEmbedded(embedded);
		embedded = new Embedded(
				"returnparameter", 
				"com.devoteam.srit.xmlloader.sigtran.ap.map.Mt_forwardSM_Res",
				"localValue=44");
		embeddedList.addEmbedded(embedded);
		// mo-forwardSM MESSAGE
		embedded = new Embedded(
				"invokeparameter", 
				"com.devoteam.srit.xmlloader.sigtran.ap.map.Mo_forwardSM_Arg",
				"localValue=46");
		embeddedList.addEmbedded(embedded);
		embedded = new Embedded(
				"returnparameter", 
				"com.devoteam.srit.xmlloader.sigtran.ap.map.Mo_forwardSM_Res",
				"localValue=46");
		embeddedList.addEmbedded(embedded);
		// reportSM-DeliveryStatus MESSAGE
		embedded = new Embedded(
				"invokeparameter", 
				"com.devoteam.srit.xmlloader.sigtran.ap.map.ReportSM_DeliveryStatusArg",
				"localValue=47");
		embeddedList.addEmbedded(embedded);
		embedded = new Embedded(
				"returnparameter", 
				"com.devoteam.srit.xmlloader.sigtran.ap.map.ReportSM_DeliveryStatusRes",
				"localValue=47");
		embeddedList.addEmbedded(embedded);
		// readyForSM MESSAGE
		embedded = new Embedded(
				"invokeparameter", 
				"com.devoteam.srit.xmlloader.sigtran.ap.map.ReadyForSM_Arg",
				"localValue=66");
		embeddedList.addEmbedded(embedded);
		embedded = new Embedded(
				"returnparameter", 
				"com.devoteam.srit.xmlloader.sigtran.ap.map.ReadyForSM_Res",
				"localValue=66");
		embeddedList.addEmbedded(embedded);
		// provideSubscriberLocation MESSAGE
		embedded = new Embedded(
				"invokeparameter", 
				"com.devoteam.srit.xmlloader.sigtran.ap.map.ProvideSubscriberLocation_Arg",
				"localValue=83"); 
		embeddedList.addEmbedded(embedded);
		embedded = new Embedded(
				"returnparameter", 
				"com.devoteam.srit.xmlloader.sigtran.ap.map.ProvideSubscriberLocation_Res",
				"localValue=83"); 
		// subscriberLocationReport MESSAGE
		embeddedList.addEmbedded(embedded);
		embedded = new Embedded(
				"invokeparameter", 
				"com.devoteam.srit.xmlloader.sigtran.ap.map.RoutingInfoForLCS_Arg",
				"localValue=85");
		embeddedList.addEmbedded(embedded);
		embedded = new Embedded(
				"returnparameter", 
				"com.devoteam.srit.xmlloader.sigtran.ap.map.RoutingInfoForLCS_Res",
				"localValue=85");
		embeddedList.addEmbedded(embedded);
		
		// binary field
		ElementSimple binary = new ElementSimple();
		binary.setLabel("ISDN_AddressString");
		BooleanField extension = new BooleanField();
		extension.setName("extension");
		extension.setLength(1);
		extension.setOffset(0);
		binary.addField(extension);
		IntegerField natureAddress = new IntegerField();
		natureAddress.setName("nature of address");
		natureAddress.setLength(3);
		natureAddress.setOffset(1);
		binary.addField(natureAddress);
		IntegerField numberingPlan = new IntegerField();
		numberingPlan.setName("numbering plan");
		numberingPlan.setLength(4);
		numberingPlan.setOffset(4);
		binary.addField(numberingPlan);
		NumberBCDField digits = new NumberBCDField();
		digits.setName("digits");
		//digits.setLength(1);
		digits.setOffset(8);
		binary.addField(digits);
		binaryByLabel.put(binary.getLabel(), binary);
		
		binary = new ElementSimple();
		binary.setLabel("ServiceCentreAddress");
		extension = new BooleanField();
		extension.setName("extension");
		extension.setLength(1);
		extension.setOffset(0);
		binary.addField(extension);
		natureAddress = new IntegerField();
		natureAddress.setName("nature of address");
		natureAddress.setLength(3);
		natureAddress.setOffset(1);
		binary.addField(natureAddress);
		numberingPlan = new IntegerField();
		numberingPlan.setName("numbering plan");
		numberingPlan.setLength(4);
		numberingPlan.setOffset(4);
		binary.addField(numberingPlan);
		digits = new NumberBCDField();
		digits.setName("digits");
		//digits.setLength(1);
		digits.setOffset(8);
		binary.addField(digits);
		binaryByLabel.put(binary.getLabel(), binary);

    }
	
	public static ASNDictionary getInstance()
    {
    	if (_instance == null)
    	{
    		_instance = new ASNDictionary();
    	}
    	return _instance;
    }
	
    public Embedded getEmbeddedByInitial(String initial) 
	{
		return embeddedList.getEmbeddedByInitial(initial);
	}

    public List<Embedded> getEmbeddedByCondition(String condition) 
	{
    	return embeddedList.getEmbeddedByCondition(condition);
	}

    public ElementAbstract getBinaryByLabel(String label) 
	{
    	return binaryByLabel.get(label);
	}

}

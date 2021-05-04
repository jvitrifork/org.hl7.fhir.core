package org.hl7.fhir.convertors.conv10_50;

import org.hl7.fhir.convertors.VersionConvertor_10_50;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r5.model.Identifier;

public class Substance10_50 {

    public static org.hl7.fhir.r5.model.Substance convertSubstance(org.hl7.fhir.dstu2.model.Substance src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.Substance tgt = new org.hl7.fhir.r5.model.Substance();
        VersionConvertor_10_50.copyDomainResource(src, tgt);
        for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_10_50.convertIdentifier(t));
        for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getCategory()) tgt.addCategory(VersionConvertor_10_50.convertCodeableConcept(t));
        if (src.hasCode())
            tgt.getCode().setConcept(VersionConvertor_10_50.convertCodeableConcept(src.getCode()));
        if (src.hasDescriptionElement())
            tgt.setDescriptionElement(VersionConvertor_10_50.convertString(src.getDescriptionElement()));
        for (org.hl7.fhir.dstu2.model.Substance.SubstanceInstanceComponent t : src.getInstance()) convertSubstanceInstanceComponent(t, tgt);
        for (org.hl7.fhir.dstu2.model.Substance.SubstanceIngredientComponent t : src.getIngredient()) tgt.addIngredient(convertSubstanceIngredientComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.Substance convertSubstance(org.hl7.fhir.r5.model.Substance src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.Substance tgt = new org.hl7.fhir.dstu2.model.Substance();
        VersionConvertor_10_50.copyDomainResource(src, tgt);
        for (org.hl7.fhir.r5.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_10_50.convertIdentifier(t));
        for (org.hl7.fhir.r5.model.CodeableConcept t : src.getCategory()) tgt.addCategory(VersionConvertor_10_50.convertCodeableConcept(t));
        if (src.hasCode())
            tgt.setCode(VersionConvertor_10_50.convertCodeableConcept(src.getCode().getConcept()));
        if (src.hasDescriptionElement())
            tgt.setDescriptionElement(VersionConvertor_10_50.convertString(src.getDescriptionElement()));
        if (src.getInstance())  {
          tgt.addInstance(convertSubstanceInstanceComponent(src));
        }
        for (org.hl7.fhir.r5.model.Substance.SubstanceIngredientComponent t : src.getIngredient()) tgt.addIngredient(convertSubstanceIngredientComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.Substance.SubstanceIngredientComponent convertSubstanceIngredientComponent(org.hl7.fhir.r5.model.Substance.SubstanceIngredientComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.Substance.SubstanceIngredientComponent tgt = new org.hl7.fhir.dstu2.model.Substance.SubstanceIngredientComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasQuantity())
            tgt.setQuantity(VersionConvertor_10_50.convertRatio(src.getQuantity()));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.Substance.SubstanceIngredientComponent convertSubstanceIngredientComponent(org.hl7.fhir.dstu2.model.Substance.SubstanceIngredientComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.Substance.SubstanceIngredientComponent tgt = new org.hl7.fhir.r5.model.Substance.SubstanceIngredientComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasQuantity())
            tgt.setQuantity(VersionConvertor_10_50.convertRatio(src.getQuantity()));
        if (src.hasSubstance())
            tgt.setSubstance(VersionConvertor_10_50.convertReference(src.getSubstance()));
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.Substance.SubstanceInstanceComponent convertSubstanceInstanceComponent(org.hl7.fhir.r5.model.Substance src) throws FHIRException {
        org.hl7.fhir.dstu2.model.Substance.SubstanceInstanceComponent tgt = new org.hl7.fhir.dstu2.model.Substance.SubstanceInstanceComponent();
        for (Identifier t : src.getIdentifier()) {
          tgt.setIdentifier(VersionConvertor_10_50.convertIdentifier(t));
      }
      if (src.hasExpiry())
          tgt.setExpiryElement(VersionConvertor_10_50.convertDateTime(src.getExpiryElement()));
      if (src.hasQuantity())
          tgt.setQuantity(VersionConvertor_10_50.convertSimpleQuantity(src.getQuantity()));
      return tgt;
  }


    public static void convertSubstanceInstanceComponent(org.hl7.fhir.dstu2.model.Substance.SubstanceInstanceComponent src, org.hl7.fhir.r5.model.Substance tgt) throws FHIRException {
      tgt.setInstance(true);
        if (src.hasIdentifier())
            tgt.addIdentifier(VersionConvertor_10_50.convertIdentifier(src.getIdentifier()));
        if (src.hasExpiryElement())
            tgt.setExpiryElement(VersionConvertor_10_50.convertDateTime(src.getExpiryElement()));
        if (src.hasQuantity())
            tgt.setQuantity(VersionConvertor_10_50.convertSimpleQuantity(src.getQuantity()));
    }
}
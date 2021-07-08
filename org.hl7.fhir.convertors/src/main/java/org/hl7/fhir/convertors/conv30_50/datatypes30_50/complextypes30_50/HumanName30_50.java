package org.hl7.fhir.convertors.conv30_50.datatypes30_50.complextypes30_50;

import org.hl7.fhir.convertors.conv30_50.datatypes30_50.Element30_50;
import org.hl7.fhir.convertors.conv30_50.datatypes30_50.primitivetypes30_50.String30_50;
import org.hl7.fhir.exceptions.FHIRException;

public class HumanName30_50 {
    public static org.hl7.fhir.r5.model.HumanName convertHumanName(org.hl7.fhir.dstu3.model.HumanName src) throws FHIRException {
      if (src == null) return null;
      org.hl7.fhir.r5.model.HumanName tgt = new org.hl7.fhir.r5.model.HumanName();
      Element30_50.copyElement(src, tgt);
      if (src.hasUse()) tgt.setUseElement(convertNameUse(src.getUseElement()));
      if (src.hasText()) tgt.setTextElement(String30_50.convertString(src.getTextElement()));
      if (src.hasFamily()) tgt.setFamilyElement(String30_50.convertString(src.getFamilyElement()));
      for (org.hl7.fhir.dstu3.model.StringType t : src.getGiven()) tgt.addGiven(t.getValue());
      for (org.hl7.fhir.dstu3.model.StringType t : src.getPrefix()) tgt.addPrefix(t.getValue());
      for (org.hl7.fhir.dstu3.model.StringType t : src.getSuffix()) tgt.addSuffix(t.getValue());
      if (src.hasPeriod()) tgt.setPeriod(Period30_50.convertPeriod(src.getPeriod()));
      return tgt;
    }

    public static org.hl7.fhir.dstu3.model.HumanName convertHumanName(org.hl7.fhir.r5.model.HumanName src) throws FHIRException {
      if (src == null) return null;
      org.hl7.fhir.dstu3.model.HumanName tgt = new org.hl7.fhir.dstu3.model.HumanName();
      Element30_50.copyElement(src, tgt);
      if (src.hasUse()) tgt.setUseElement(convertNameUse(src.getUseElement()));
      if (src.hasText()) tgt.setTextElement(String30_50.convertString(src.getTextElement()));
      if (src.hasFamily()) tgt.setFamilyElement(String30_50.convertString(src.getFamilyElement()));
      for (org.hl7.fhir.r5.model.StringType t : src.getGiven()) tgt.addGiven(t.getValue());
      for (org.hl7.fhir.r5.model.StringType t : src.getPrefix()) tgt.addPrefix(t.getValue());
      for (org.hl7.fhir.r5.model.StringType t : src.getSuffix()) tgt.addSuffix(t.getValue());
      if (src.hasPeriod()) tgt.setPeriod(Period30_50.convertPeriod(src.getPeriod()));
      return tgt;
    }

    static public org.hl7.fhir.r5.model.Enumeration<org.hl7.fhir.r5.model.HumanName.NameUse> convertNameUse(org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.HumanName.NameUse> src) throws FHIRException {
      if (src == null || src.isEmpty()) return null;
      org.hl7.fhir.r5.model.Enumeration<org.hl7.fhir.r5.model.HumanName.NameUse> tgt = new org.hl7.fhir.r5.model.Enumeration<>(new org.hl7.fhir.r5.model.HumanName.NameUseEnumFactory());
      Element30_50.copyElement(src, tgt);
      if (src.getValue() == null) {
        tgt.setValue(org.hl7.fhir.r5.model.HumanName.NameUse.NULL);
      } else {
        switch (src.getValue()) {
          case USUAL:
            tgt.setValue(org.hl7.fhir.r5.model.HumanName.NameUse.USUAL);
            break;
          case OFFICIAL:
            tgt.setValue(org.hl7.fhir.r5.model.HumanName.NameUse.OFFICIAL);
            break;
          case TEMP:
            tgt.setValue(org.hl7.fhir.r5.model.HumanName.NameUse.TEMP);
            break;
          case NICKNAME:
            tgt.setValue(org.hl7.fhir.r5.model.HumanName.NameUse.NICKNAME);
            break;
          case ANONYMOUS:
            tgt.setValue(org.hl7.fhir.r5.model.HumanName.NameUse.ANONYMOUS);
            break;
          case OLD:
            tgt.setValue(org.hl7.fhir.r5.model.HumanName.NameUse.OLD);
            break;
          case MAIDEN:
            tgt.setValue(org.hl7.fhir.r5.model.HumanName.NameUse.MAIDEN);
            break;
          default:
            tgt.setValue(org.hl7.fhir.r5.model.HumanName.NameUse.NULL);
            break;
        }
      }
      return tgt;
    }

    static public org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.HumanName.NameUse> convertNameUse(org.hl7.fhir.r5.model.Enumeration<org.hl7.fhir.r5.model.HumanName.NameUse> src) throws FHIRException {
      if (src == null || src.isEmpty()) return null;
      org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.HumanName.NameUse> tgt = new org.hl7.fhir.dstu3.model.Enumeration<>(new org.hl7.fhir.dstu3.model.HumanName.NameUseEnumFactory());
      Element30_50.copyElement(src, tgt);
      if (src.getValue() == null) {
        tgt.setValue(org.hl7.fhir.dstu3.model.HumanName.NameUse.NULL);
      } else {
        switch (src.getValue()) {
          case USUAL:
            tgt.setValue(org.hl7.fhir.dstu3.model.HumanName.NameUse.USUAL);
            break;
          case OFFICIAL:
            tgt.setValue(org.hl7.fhir.dstu3.model.HumanName.NameUse.OFFICIAL);
            break;
          case TEMP:
            tgt.setValue(org.hl7.fhir.dstu3.model.HumanName.NameUse.TEMP);
            break;
          case NICKNAME:
            tgt.setValue(org.hl7.fhir.dstu3.model.HumanName.NameUse.NICKNAME);
            break;
          case ANONYMOUS:
            tgt.setValue(org.hl7.fhir.dstu3.model.HumanName.NameUse.ANONYMOUS);
            break;
          case OLD:
            tgt.setValue(org.hl7.fhir.dstu3.model.HumanName.NameUse.OLD);
            break;
          case MAIDEN:
            tgt.setValue(org.hl7.fhir.dstu3.model.HumanName.NameUse.MAIDEN);
            break;
          default:
            tgt.setValue(org.hl7.fhir.dstu3.model.HumanName.NameUse.NULL);
            break;
        }
      }
      return tgt;
    }
}

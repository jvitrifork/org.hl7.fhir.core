package org.hl7.fhir.convertors.conv10_40.resources10_40;

import org.hl7.fhir.convertors.context.ConversionContext10_40;
import org.hl7.fhir.convertors.conv10_40.datatypes10_40.Reference10_40;
import org.hl7.fhir.convertors.conv10_40.datatypes10_40.complextypes10_40.CodeableConcept10_40;
import org.hl7.fhir.convertors.conv10_40.datatypes10_40.complextypes10_40.Identifier10_40;
import org.hl7.fhir.exceptions.FHIRException;

public class Condition10_40 {

  public static org.hl7.fhir.dstu2.model.Condition convertCondition(org.hl7.fhir.r4.model.Condition src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2.model.Condition tgt = new org.hl7.fhir.dstu2.model.Condition();
    ConversionContext10_40.INSTANCE.getVersionConvertor_10_40().copyDomainResource(src, tgt);
    for (org.hl7.fhir.r4.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(Identifier10_40.convertIdentifier(t));
    if (src.hasSubject())
      tgt.setPatient(Reference10_40.convertReference(src.getSubject()));
    if (src.hasEncounter())
      tgt.setEncounter(Reference10_40.convertReference(src.getEncounter()));
    if (src.hasAsserter())
      tgt.setAsserter(Reference10_40.convertReference(src.getAsserter()));
    if (src.hasRecordedDate())
      tgt.setDateRecorded(src.getRecordedDate());
    if (src.hasCode())
      tgt.setCode(CodeableConcept10_40.convertCodeableConcept(src.getCode()));
    for (org.hl7.fhir.r4.model.CodeableConcept t : src.getCategory())
      tgt.setCategory(CodeableConcept10_40.convertCodeableConcept(t));
    if (src.hasClinicalStatus())
      tgt.setClinicalStatus(convertConditionClinicalStatus(src.getClinicalStatus()));
    if (src.hasVerificationStatus())
      tgt.setVerificationStatus(convertConditionVerificationStatus(src.getVerificationStatus()));
    if (src.hasSeverity())
      tgt.setSeverity(CodeableConcept10_40.convertCodeableConcept(src.getSeverity()));
    if (src.hasOnset())
      tgt.setOnset(ConversionContext10_40.INSTANCE.getVersionConvertor_10_40().convertType(src.getOnset()));
    if (src.hasAbatement() && !(src.getAbatement() instanceof org.hl7.fhir.r4.model.BooleanType))
      tgt.setAbatement(ConversionContext10_40.INSTANCE.getVersionConvertor_10_40().convertType(src.getAbatement()));
    if (src.hasStage())
      tgt.setStage(convertConditionStageComponent(src.getStageFirstRep()));
    for (org.hl7.fhir.r4.model.Condition.ConditionEvidenceComponent t : src.getEvidence())
      tgt.addEvidence(convertConditionEvidenceComponent(t));
    for (org.hl7.fhir.r4.model.CodeableConcept t : src.getBodySite())
      tgt.addBodySite(CodeableConcept10_40.convertCodeableConcept(t));
    return tgt;
  }

  public static org.hl7.fhir.r4.model.Condition convertCondition(org.hl7.fhir.dstu2.model.Condition src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.r4.model.Condition tgt = new org.hl7.fhir.r4.model.Condition();
    ConversionContext10_40.INSTANCE.getVersionConvertor_10_40().copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(Identifier10_40.convertIdentifier(t));
    if (src.hasPatient())
      tgt.setSubject(Reference10_40.convertReference(src.getPatient()));
    if (src.hasEncounter())
      tgt.setEncounter(Reference10_40.convertReference(src.getEncounter()));
    if (src.hasAsserter())
      tgt.setAsserter(Reference10_40.convertReference(src.getAsserter()));
    if (src.hasDateRecorded())
      tgt.setRecordedDate(src.getDateRecorded());
    if (src.hasCode())
      tgt.setCode(CodeableConcept10_40.convertCodeableConcept(src.getCode()));
    if (src.hasCategory())
      tgt.addCategory(CodeableConcept10_40.convertCodeableConcept(src.getCategory()));
    if (src.hasClinicalStatus())
      tgt.setClinicalStatus(convertConditionClinicalStatus(src.getClinicalStatus()));
    if (src.hasVerificationStatus())
      tgt.setVerificationStatus(convertConditionVerificationStatus(src.getVerificationStatus()));
    if (src.hasSeverity())
      tgt.setSeverity(CodeableConcept10_40.convertCodeableConcept(src.getSeverity()));
    if (src.hasOnset())
      tgt.setOnset(ConversionContext10_40.INSTANCE.getVersionConvertor_10_40().convertType(src.getOnset()));
    if (src.hasAbatement() && !(src.getAbatement() instanceof org.hl7.fhir.dstu2.model.BooleanType))
      tgt.setAbatement(ConversionContext10_40.INSTANCE.getVersionConvertor_10_40().convertType(src.getAbatement()));
    if (src.hasStage())
      tgt.addStage(convertConditionStageComponent(src.getStage()));
    for (org.hl7.fhir.dstu2.model.Condition.ConditionEvidenceComponent t : src.getEvidence())
      tgt.addEvidence(convertConditionEvidenceComponent(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getBodySite())
      tgt.addBodySite(CodeableConcept10_40.convertCodeableConcept(t));
    return tgt;
  }

  static public org.hl7.fhir.r4.model.CodeableConcept convertConditionClinicalStatus(String src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r4.model.CodeableConcept cc = new org.hl7.fhir.r4.model.CodeableConcept();
    cc.addCoding().setSystem("http://hl7.org/fhir/condition-clinical").setCode(src);
    return cc;
  }

  static public String convertConditionClinicalStatus(org.hl7.fhir.r4.model.CodeableConcept src) throws FHIRException {
    if (src == null)
      return null;
    for (org.hl7.fhir.r4.model.Coding c : src.getCoding()) {
      if ("http://hl7.org/fhir/condition-clinical".equals(c.getSystem()))
        return c.getCode();
    }
    return null;
  }

  public static org.hl7.fhir.r4.model.Condition.ConditionEvidenceComponent convertConditionEvidenceComponent(org.hl7.fhir.dstu2.model.Condition.ConditionEvidenceComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.r4.model.Condition.ConditionEvidenceComponent tgt = new org.hl7.fhir.r4.model.Condition.ConditionEvidenceComponent();
    ConversionContext10_40.INSTANCE.getVersionConvertor_10_40().copyElement(src, tgt);
    if (src.hasCode())
      tgt.addCode(CodeableConcept10_40.convertCodeableConcept(src.getCode()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getDetail()) tgt.addDetail(Reference10_40.convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Condition.ConditionEvidenceComponent convertConditionEvidenceComponent(org.hl7.fhir.r4.model.Condition.ConditionEvidenceComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2.model.Condition.ConditionEvidenceComponent tgt = new org.hl7.fhir.dstu2.model.Condition.ConditionEvidenceComponent();
    ConversionContext10_40.INSTANCE.getVersionConvertor_10_40().copyElement(src, tgt);
    for (org.hl7.fhir.r4.model.CodeableConcept cc : src.getCode())
      tgt.setCode(CodeableConcept10_40.convertCodeableConcept(cc));
    for (org.hl7.fhir.r4.model.Reference t : src.getDetail()) tgt.addDetail(Reference10_40.convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Condition.ConditionStageComponent convertConditionStageComponent(org.hl7.fhir.r4.model.Condition.ConditionStageComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2.model.Condition.ConditionStageComponent tgt = new org.hl7.fhir.dstu2.model.Condition.ConditionStageComponent();
    ConversionContext10_40.INSTANCE.getVersionConvertor_10_40().copyElement(src, tgt);
    if (src.hasSummary())
      tgt.setSummary(CodeableConcept10_40.convertCodeableConcept(src.getSummary()));
    for (org.hl7.fhir.r4.model.Reference t : src.getAssessment()) tgt.addAssessment(Reference10_40.convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.r4.model.Condition.ConditionStageComponent convertConditionStageComponent(org.hl7.fhir.dstu2.model.Condition.ConditionStageComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.r4.model.Condition.ConditionStageComponent tgt = new org.hl7.fhir.r4.model.Condition.ConditionStageComponent();
    ConversionContext10_40.INSTANCE.getVersionConvertor_10_40().copyElement(src, tgt);
    if (src.hasSummary())
      tgt.setSummary(CodeableConcept10_40.convertCodeableConcept(src.getSummary()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getAssessment())
      tgt.addAssessment(Reference10_40.convertReference(t));
    return tgt;
  }

  static public org.hl7.fhir.r4.model.CodeableConcept convertConditionVerificationStatus(org.hl7.fhir.dstu2.model.Condition.ConditionVerificationStatus src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r4.model.CodeableConcept cc = new org.hl7.fhir.r4.model.CodeableConcept();
    switch (src) {
      case PROVISIONAL:
        cc.addCoding().setSystem("http://hl7.org/fhir/condition-ver-status").setCode("provisional");
        return cc;
      case DIFFERENTIAL:
        cc.addCoding().setSystem("http://hl7.org/fhir/condition-ver-status").setCode("differential");
        return cc;
      case CONFIRMED:
        cc.addCoding().setSystem("http://hl7.org/fhir/condition-ver-status").setCode("confirmed");
        return cc;
      case REFUTED:
        cc.addCoding().setSystem("http://hl7.org/fhir/condition-ver-status").setCode("refuted");
        return cc;
      case ENTEREDINERROR:
        cc.addCoding().setSystem("http://hl7.org/fhir/condition-ver-status").setCode("entered-in-error");
        return cc;
      default:
        return null;
    }
  }

  static public org.hl7.fhir.dstu2.model.Condition.ConditionVerificationStatus convertConditionVerificationStatus(org.hl7.fhir.r4.model.CodeableConcept src) throws FHIRException {
    if (src == null)
      return null;
    if (src.hasCoding("http://hl7.org/fhir/condition-clinical", "provisional"))
      return org.hl7.fhir.dstu2.model.Condition.ConditionVerificationStatus.PROVISIONAL;
    if (src.hasCoding("http://hl7.org/fhir/condition-clinical", "differential"))
      return org.hl7.fhir.dstu2.model.Condition.ConditionVerificationStatus.DIFFERENTIAL;
    if (src.hasCoding("http://hl7.org/fhir/condition-clinical", "confirmed"))
      return org.hl7.fhir.dstu2.model.Condition.ConditionVerificationStatus.CONFIRMED;
    if (src.hasCoding("http://hl7.org/fhir/condition-clinical", "refuted"))
      return org.hl7.fhir.dstu2.model.Condition.ConditionVerificationStatus.REFUTED;
    if (src.hasCoding("http://hl7.org/fhir/condition-clinical", "entered-in-error"))
      return org.hl7.fhir.dstu2.model.Condition.ConditionVerificationStatus.ENTEREDINERROR;
    return org.hl7.fhir.dstu2.model.Condition.ConditionVerificationStatus.NULL;
  }
}
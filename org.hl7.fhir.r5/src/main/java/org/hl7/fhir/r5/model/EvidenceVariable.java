package org.hl7.fhir.r5.model;


/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, \
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this \
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, \
     this list of conditions and the following disclaimer in the documentation \
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\" AND \
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED \
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. \
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, \
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT \
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR \
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, \
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) \
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE \
  POSSIBILITY OF SUCH DAMAGE.
  */

// Generated on Tue, Dec 28, 2021 07:16+1100 for FHIR v5.0.0-snapshot1

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.r5.model.Enumerations.*;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.ICompositeType;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Block;

/**
 * The EvidenceVariable resource describes an element that knowledge (Evidence) is about.
 */
@ResourceDef(name="EvidenceVariable", profile="http://hl7.org/fhir/StructureDefinition/EvidenceVariable")
public class EvidenceVariable extends MetadataResource {

    public enum CharacteristicCombination {
        /**
         * Combine characteristics with AND.
         */
        ALLOF, 
        /**
         * Combine characteristics with OR.
         */
        ANYOF, 
        /**
         * Meet at least the threshold number of characteristics for definition.
         */
        ATLEAST, 
        /**
         * Meet at most the threshold number of characteristics for definition.
         */
        ATMOST, 
        /**
         *  Combine characteristics statistically.
         */
        NETEFFECT, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static CharacteristicCombination fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("all-of".equals(codeString))
          return ALLOF;
        if ("any-of".equals(codeString))
          return ANYOF;
        if ("at-least".equals(codeString))
          return ATLEAST;
        if ("at-most".equals(codeString))
          return ATMOST;
        if ("net-effect".equals(codeString))
          return NETEFFECT;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown CharacteristicCombination code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case ALLOF: return "all-of";
            case ANYOF: return "any-of";
            case ATLEAST: return "at-least";
            case ATMOST: return "at-most";
            case NETEFFECT: return "net-effect";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case ALLOF: return "http://hl7.org/fhir/characteristic-combination";
            case ANYOF: return "http://hl7.org/fhir/characteristic-combination";
            case ATLEAST: return "http://hl7.org/fhir/characteristic-combination";
            case ATMOST: return "http://hl7.org/fhir/characteristic-combination";
            case NETEFFECT: return "http://hl7.org/fhir/characteristic-combination";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case ALLOF: return "Combine characteristics with AND.";
            case ANYOF: return "Combine characteristics with OR.";
            case ATLEAST: return "Meet at least the threshold number of characteristics for definition.";
            case ATMOST: return "Meet at most the threshold number of characteristics for definition.";
            case NETEFFECT: return " Combine characteristics statistically.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case ALLOF: return "All of";
            case ANYOF: return "Any of";
            case ATLEAST: return "At least";
            case ATMOST: return "At most";
            case NETEFFECT: return "Net effect";
            default: return "?";
          }
        }
    }

  public static class CharacteristicCombinationEnumFactory implements EnumFactory<CharacteristicCombination> {
    public CharacteristicCombination fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("all-of".equals(codeString))
          return CharacteristicCombination.ALLOF;
        if ("any-of".equals(codeString))
          return CharacteristicCombination.ANYOF;
        if ("at-least".equals(codeString))
          return CharacteristicCombination.ATLEAST;
        if ("at-most".equals(codeString))
          return CharacteristicCombination.ATMOST;
        if ("net-effect".equals(codeString))
          return CharacteristicCombination.NETEFFECT;
        throw new IllegalArgumentException("Unknown CharacteristicCombination code '"+codeString+"'");
        }
        public Enumeration<CharacteristicCombination> fromType(Base code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<CharacteristicCombination>(this);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return null;
        if ("all-of".equals(codeString))
          return new Enumeration<CharacteristicCombination>(this, CharacteristicCombination.ALLOF);
        if ("any-of".equals(codeString))
          return new Enumeration<CharacteristicCombination>(this, CharacteristicCombination.ANYOF);
        if ("at-least".equals(codeString))
          return new Enumeration<CharacteristicCombination>(this, CharacteristicCombination.ATLEAST);
        if ("at-most".equals(codeString))
          return new Enumeration<CharacteristicCombination>(this, CharacteristicCombination.ATMOST);
        if ("net-effect".equals(codeString))
          return new Enumeration<CharacteristicCombination>(this, CharacteristicCombination.NETEFFECT);
        throw new FHIRException("Unknown CharacteristicCombination code '"+codeString+"'");
        }
    public String toCode(CharacteristicCombination code) {
      if (code == CharacteristicCombination.ALLOF)
        return "all-of";
      if (code == CharacteristicCombination.ANYOF)
        return "any-of";
      if (code == CharacteristicCombination.ATLEAST)
        return "at-least";
      if (code == CharacteristicCombination.ATMOST)
        return "at-most";
      if (code == CharacteristicCombination.NETEFFECT)
        return "net-effect";
      return "?";
      }
    public String toSystem(CharacteristicCombination code) {
      return code.getSystem();
      }
    }

    public enum GroupMeasure {
        /**
         * Aggregated using Mean of participant values.
         */
        MEAN, 
        /**
         * Aggregated using Median of participant values.
         */
        MEDIAN, 
        /**
         * Aggregated using Mean of study mean values.
         */
        MEANOFMEAN, 
        /**
         * Aggregated using Mean of study median values.
         */
        MEANOFMEDIAN, 
        /**
         * Aggregated using Median of study mean values.
         */
        MEDIANOFMEAN, 
        /**
         * Aggregated using Median of study median values.
         */
        MEDIANOFMEDIAN, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static GroupMeasure fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("mean".equals(codeString))
          return MEAN;
        if ("median".equals(codeString))
          return MEDIAN;
        if ("mean-of-mean".equals(codeString))
          return MEANOFMEAN;
        if ("mean-of-median".equals(codeString))
          return MEANOFMEDIAN;
        if ("median-of-mean".equals(codeString))
          return MEDIANOFMEAN;
        if ("median-of-median".equals(codeString))
          return MEDIANOFMEDIAN;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown GroupMeasure code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case MEAN: return "mean";
            case MEDIAN: return "median";
            case MEANOFMEAN: return "mean-of-mean";
            case MEANOFMEDIAN: return "mean-of-median";
            case MEDIANOFMEAN: return "median-of-mean";
            case MEDIANOFMEDIAN: return "median-of-median";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case MEAN: return "http://hl7.org/fhir/group-measure";
            case MEDIAN: return "http://hl7.org/fhir/group-measure";
            case MEANOFMEAN: return "http://hl7.org/fhir/group-measure";
            case MEANOFMEDIAN: return "http://hl7.org/fhir/group-measure";
            case MEDIANOFMEAN: return "http://hl7.org/fhir/group-measure";
            case MEDIANOFMEDIAN: return "http://hl7.org/fhir/group-measure";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case MEAN: return "Aggregated using Mean of participant values.";
            case MEDIAN: return "Aggregated using Median of participant values.";
            case MEANOFMEAN: return "Aggregated using Mean of study mean values.";
            case MEANOFMEDIAN: return "Aggregated using Mean of study median values.";
            case MEDIANOFMEAN: return "Aggregated using Median of study mean values.";
            case MEDIANOFMEDIAN: return "Aggregated using Median of study median values.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case MEAN: return "Mean";
            case MEDIAN: return "Median";
            case MEANOFMEAN: return "Mean of Study Means";
            case MEANOFMEDIAN: return "Mean of Study Medins";
            case MEDIANOFMEAN: return "Median of Study Means";
            case MEDIANOFMEDIAN: return "Median of Study Medians";
            default: return "?";
          }
        }
    }

  public static class GroupMeasureEnumFactory implements EnumFactory<GroupMeasure> {
    public GroupMeasure fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("mean".equals(codeString))
          return GroupMeasure.MEAN;
        if ("median".equals(codeString))
          return GroupMeasure.MEDIAN;
        if ("mean-of-mean".equals(codeString))
          return GroupMeasure.MEANOFMEAN;
        if ("mean-of-median".equals(codeString))
          return GroupMeasure.MEANOFMEDIAN;
        if ("median-of-mean".equals(codeString))
          return GroupMeasure.MEDIANOFMEAN;
        if ("median-of-median".equals(codeString))
          return GroupMeasure.MEDIANOFMEDIAN;
        throw new IllegalArgumentException("Unknown GroupMeasure code '"+codeString+"'");
        }
        public Enumeration<GroupMeasure> fromType(Base code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<GroupMeasure>(this);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return null;
        if ("mean".equals(codeString))
          return new Enumeration<GroupMeasure>(this, GroupMeasure.MEAN);
        if ("median".equals(codeString))
          return new Enumeration<GroupMeasure>(this, GroupMeasure.MEDIAN);
        if ("mean-of-mean".equals(codeString))
          return new Enumeration<GroupMeasure>(this, GroupMeasure.MEANOFMEAN);
        if ("mean-of-median".equals(codeString))
          return new Enumeration<GroupMeasure>(this, GroupMeasure.MEANOFMEDIAN);
        if ("median-of-mean".equals(codeString))
          return new Enumeration<GroupMeasure>(this, GroupMeasure.MEDIANOFMEAN);
        if ("median-of-median".equals(codeString))
          return new Enumeration<GroupMeasure>(this, GroupMeasure.MEDIANOFMEDIAN);
        throw new FHIRException("Unknown GroupMeasure code '"+codeString+"'");
        }
    public String toCode(GroupMeasure code) {
      if (code == GroupMeasure.MEAN)
        return "mean";
      if (code == GroupMeasure.MEDIAN)
        return "median";
      if (code == GroupMeasure.MEANOFMEAN)
        return "mean-of-mean";
      if (code == GroupMeasure.MEANOFMEDIAN)
        return "mean-of-median";
      if (code == GroupMeasure.MEDIANOFMEAN)
        return "median-of-mean";
      if (code == GroupMeasure.MEDIANOFMEDIAN)
        return "median-of-median";
      return "?";
      }
    public String toSystem(GroupMeasure code) {
      return code.getSystem();
      }
    }

    @Block()
    public static class EvidenceVariableCharacteristicCombinationComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Used to specify if two or more characteristics are combined with OR or AND.
         */
        @Child(name = "code", type = {CodeType.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="all-of | any-of | at-least | at-most | net-effect", formalDefinition="Used to specify if two or more characteristics are combined with OR or AND." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/characteristic-combination")
        protected Enumeration<CharacteristicCombination> code;

        /**
         * Provides the value of "n" when "at-least" or "at-most" codes are used.
         */
        @Child(name = "threshold", type = {PositiveIntType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Provides the value of \"n\" when \"at-least\" or \"at-most\" codes are used", formalDefinition="Provides the value of \"n\" when \"at-least\" or \"at-most\" codes are used." )
        protected PositiveIntType threshold;

        private static final long serialVersionUID = 1699440811L;

    /**
     * Constructor
     */
      public EvidenceVariableCharacteristicCombinationComponent() {
        super();
      }

    /**
     * Constructor
     */
      public EvidenceVariableCharacteristicCombinationComponent(CharacteristicCombination code) {
        super();
        this.setCode(code);
      }

        /**
         * @return {@link #code} (Used to specify if two or more characteristics are combined with OR or AND.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
         */
        public Enumeration<CharacteristicCombination> getCodeElement() { 
          if (this.code == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EvidenceVariableCharacteristicCombinationComponent.code");
            else if (Configuration.doAutoCreate())
              this.code = new Enumeration<CharacteristicCombination>(new CharacteristicCombinationEnumFactory()); // bb
          return this.code;
        }

        public boolean hasCodeElement() { 
          return this.code != null && !this.code.isEmpty();
        }

        public boolean hasCode() { 
          return this.code != null && !this.code.isEmpty();
        }

        /**
         * @param value {@link #code} (Used to specify if two or more characteristics are combined with OR or AND.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
         */
        public EvidenceVariableCharacteristicCombinationComponent setCodeElement(Enumeration<CharacteristicCombination> value) { 
          this.code = value;
          return this;
        }

        /**
         * @return Used to specify if two or more characteristics are combined with OR or AND.
         */
        public CharacteristicCombination getCode() { 
          return this.code == null ? null : this.code.getValue();
        }

        /**
         * @param value Used to specify if two or more characteristics are combined with OR or AND.
         */
        public EvidenceVariableCharacteristicCombinationComponent setCode(CharacteristicCombination value) { 
            if (this.code == null)
              this.code = new Enumeration<CharacteristicCombination>(new CharacteristicCombinationEnumFactory());
            this.code.setValue(value);
          return this;
        }

        /**
         * @return {@link #threshold} (Provides the value of "n" when "at-least" or "at-most" codes are used.). This is the underlying object with id, value and extensions. The accessor "getThreshold" gives direct access to the value
         */
        public PositiveIntType getThresholdElement() { 
          if (this.threshold == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EvidenceVariableCharacteristicCombinationComponent.threshold");
            else if (Configuration.doAutoCreate())
              this.threshold = new PositiveIntType(); // bb
          return this.threshold;
        }

        public boolean hasThresholdElement() { 
          return this.threshold != null && !this.threshold.isEmpty();
        }

        public boolean hasThreshold() { 
          return this.threshold != null && !this.threshold.isEmpty();
        }

        /**
         * @param value {@link #threshold} (Provides the value of "n" when "at-least" or "at-most" codes are used.). This is the underlying object with id, value and extensions. The accessor "getThreshold" gives direct access to the value
         */
        public EvidenceVariableCharacteristicCombinationComponent setThresholdElement(PositiveIntType value) { 
          this.threshold = value;
          return this;
        }

        /**
         * @return Provides the value of "n" when "at-least" or "at-most" codes are used.
         */
        public int getThreshold() { 
          return this.threshold == null || this.threshold.isEmpty() ? 0 : this.threshold.getValue();
        }

        /**
         * @param value Provides the value of "n" when "at-least" or "at-most" codes are used.
         */
        public EvidenceVariableCharacteristicCombinationComponent setThreshold(int value) { 
            if (this.threshold == null)
              this.threshold = new PositiveIntType();
            this.threshold.setValue(value);
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("code", "code", "Used to specify if two or more characteristics are combined with OR or AND.", 0, 1, code));
          children.add(new Property("threshold", "positiveInt", "Provides the value of \"n\" when \"at-least\" or \"at-most\" codes are used.", 0, 1, threshold));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3059181: /*code*/  return new Property("code", "code", "Used to specify if two or more characteristics are combined with OR or AND.", 0, 1, code);
          case -1545477013: /*threshold*/  return new Property("threshold", "positiveInt", "Provides the value of \"n\" when \"at-least\" or \"at-most\" codes are used.", 0, 1, threshold);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return this.code == null ? new Base[0] : new Base[] {this.code}; // Enumeration<CharacteristicCombination>
        case -1545477013: /*threshold*/ return this.threshold == null ? new Base[0] : new Base[] {this.threshold}; // PositiveIntType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3059181: // code
          value = new CharacteristicCombinationEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.code = (Enumeration) value; // Enumeration<CharacteristicCombination>
          return value;
        case -1545477013: // threshold
          this.threshold = TypeConvertor.castToPositiveInt(value); // PositiveIntType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code")) {
          value = new CharacteristicCombinationEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.code = (Enumeration) value; // Enumeration<CharacteristicCombination>
        } else if (name.equals("threshold")) {
          this.threshold = TypeConvertor.castToPositiveInt(value); // PositiveIntType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181:  return getCodeElement();
        case -1545477013:  return getThresholdElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return new String[] {"code"};
        case -1545477013: /*threshold*/ return new String[] {"positiveInt"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
          throw new FHIRException("Cannot call addChild on a primitive type EvidenceVariable.characteristicCombination.code");
        }
        else if (name.equals("threshold")) {
          throw new FHIRException("Cannot call addChild on a primitive type EvidenceVariable.characteristicCombination.threshold");
        }
        else
          return super.addChild(name);
      }

      public EvidenceVariableCharacteristicCombinationComponent copy() {
        EvidenceVariableCharacteristicCombinationComponent dst = new EvidenceVariableCharacteristicCombinationComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(EvidenceVariableCharacteristicCombinationComponent dst) {
        super.copyValues(dst);
        dst.code = code == null ? null : code.copy();
        dst.threshold = threshold == null ? null : threshold.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof EvidenceVariableCharacteristicCombinationComponent))
          return false;
        EvidenceVariableCharacteristicCombinationComponent o = (EvidenceVariableCharacteristicCombinationComponent) other_;
        return compareDeep(code, o.code, true) && compareDeep(threshold, o.threshold, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof EvidenceVariableCharacteristicCombinationComponent))
          return false;
        EvidenceVariableCharacteristicCombinationComponent o = (EvidenceVariableCharacteristicCombinationComponent) other_;
        return compareValues(code, o.code, true) && compareValues(threshold, o.threshold, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(code, threshold);
      }

  public String fhirType() {
    return "EvidenceVariable.characteristicCombination";

  }

  }

    @Block()
    public static class EvidenceVariableCharacteristicComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * A short, natural language description of the characteristic that could be used to communicate the criteria to an end-user.
         */
        @Child(name = "description", type = {StringType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Natural language description of the characteristic", formalDefinition="A short, natural language description of the characteristic that could be used to communicate the criteria to an end-user." )
        protected StringType description;

        /**
         * Used to expressing the type of characteristic.
         */
        @Child(name = "type", type = {CodeableConcept.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Expresses the type of characteristic", formalDefinition="Used to expressing the type of characteristic." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/usage-context-type")
        protected CodeableConcept type;

        /**
         * Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).
         */
        @Child(name = "definition", type = {Group.class, EvidenceVariable.class, CanonicalType.class, CodeableConcept.class, Expression.class}, order=3, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="What code or expression defines members?", formalDefinition="Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year)." )
        protected DataType definition;

        /**
         * Method used for describing characteristic.
         */
        @Child(name = "method", type = {CodeableConcept.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Method used for describing characteristic", formalDefinition="Method used for describing characteristic." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/characteristic-method")
        protected CodeableConcept method;

        /**
         * Device used for determining characteristic.
         */
        @Child(name = "device", type = {Device.class, DeviceMetric.class}, order=5, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Device used for determining characteristic", formalDefinition="Device used for determining characteristic." )
        protected Reference device;

        /**
         * When true, members with this characteristic are excluded from the element.
         */
        @Child(name = "exclude", type = {BooleanType.class}, order=6, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Whether the characteristic includes or excludes members", formalDefinition="When true, members with this characteristic are excluded from the element." )
        protected BooleanType exclude;

        /**
         * Observation time from study specified event.
         */
        @Child(name = "timeFromEvent", type = {}, order=7, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Observation time from study specified event", formalDefinition="Observation time from study specified event." )
        protected List<EvidenceVariableCharacteristicTimeFromEventComponent> timeFromEvent;

        /**
         * Value or set of values that define the grouping.
         */
        @Child(name = "groupMeasure", type = {CodeType.class}, order=8, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="mean | median | mean-of-mean | mean-of-median | median-of-mean | median-of-median", formalDefinition="Value or set of values that define the grouping." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/group-measure")
        protected Enumeration<GroupMeasure> groupMeasure;

        private static final long serialVersionUID = 1870376402L;

    /**
     * Constructor
     */
      public EvidenceVariableCharacteristicComponent() {
        super();
      }

    /**
     * Constructor
     */
      public EvidenceVariableCharacteristicComponent(DataType definition) {
        super();
        this.setDefinition(definition);
      }

        /**
         * @return {@link #description} (A short, natural language description of the characteristic that could be used to communicate the criteria to an end-user.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public StringType getDescriptionElement() { 
          if (this.description == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EvidenceVariableCharacteristicComponent.description");
            else if (Configuration.doAutoCreate())
              this.description = new StringType(); // bb
          return this.description;
        }

        public boolean hasDescriptionElement() { 
          return this.description != null && !this.description.isEmpty();
        }

        public boolean hasDescription() { 
          return this.description != null && !this.description.isEmpty();
        }

        /**
         * @param value {@link #description} (A short, natural language description of the characteristic that could be used to communicate the criteria to an end-user.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public EvidenceVariableCharacteristicComponent setDescriptionElement(StringType value) { 
          this.description = value;
          return this;
        }

        /**
         * @return A short, natural language description of the characteristic that could be used to communicate the criteria to an end-user.
         */
        public String getDescription() { 
          return this.description == null ? null : this.description.getValue();
        }

        /**
         * @param value A short, natural language description of the characteristic that could be used to communicate the criteria to an end-user.
         */
        public EvidenceVariableCharacteristicComponent setDescription(String value) { 
          if (Utilities.noString(value))
            this.description = null;
          else {
            if (this.description == null)
              this.description = new StringType();
            this.description.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #type} (Used to expressing the type of characteristic.)
         */
        public CodeableConcept getType() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EvidenceVariableCharacteristicComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new CodeableConcept(); // cc
          return this.type;
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (Used to expressing the type of characteristic.)
         */
        public EvidenceVariableCharacteristicComponent setType(CodeableConcept value) { 
          this.type = value;
          return this;
        }

        /**
         * @return {@link #definition} (Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).)
         */
        public DataType getDefinition() { 
          return this.definition;
        }

        /**
         * @return {@link #definition} (Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).)
         */
        public Reference getDefinitionReference() throws FHIRException { 
          if (this.definition == null)
            this.definition = new Reference();
          if (!(this.definition instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but "+this.definition.getClass().getName()+" was encountered");
          return (Reference) this.definition;
        }

        public boolean hasDefinitionReference() { 
          return this != null && this.definition instanceof Reference;
        }

        /**
         * @return {@link #definition} (Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).)
         */
        public CanonicalType getDefinitionCanonicalType() throws FHIRException { 
          if (this.definition == null)
            this.definition = new CanonicalType();
          if (!(this.definition instanceof CanonicalType))
            throw new FHIRException("Type mismatch: the type CanonicalType was expected, but "+this.definition.getClass().getName()+" was encountered");
          return (CanonicalType) this.definition;
        }

        public boolean hasDefinitionCanonicalType() { 
          return this != null && this.definition instanceof CanonicalType;
        }

        /**
         * @return {@link #definition} (Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).)
         */
        public CodeableConcept getDefinitionCodeableConcept() throws FHIRException { 
          if (this.definition == null)
            this.definition = new CodeableConcept();
          if (!(this.definition instanceof CodeableConcept))
            throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but "+this.definition.getClass().getName()+" was encountered");
          return (CodeableConcept) this.definition;
        }

        public boolean hasDefinitionCodeableConcept() { 
          return this != null && this.definition instanceof CodeableConcept;
        }

        /**
         * @return {@link #definition} (Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).)
         */
        public Expression getDefinitionExpression() throws FHIRException { 
          if (this.definition == null)
            this.definition = new Expression();
          if (!(this.definition instanceof Expression))
            throw new FHIRException("Type mismatch: the type Expression was expected, but "+this.definition.getClass().getName()+" was encountered");
          return (Expression) this.definition;
        }

        public boolean hasDefinitionExpression() { 
          return this != null && this.definition instanceof Expression;
        }

        public boolean hasDefinition() { 
          return this.definition != null && !this.definition.isEmpty();
        }

        /**
         * @param value {@link #definition} (Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).)
         */
        public EvidenceVariableCharacteristicComponent setDefinition(DataType value) { 
          if (value != null && !(value instanceof Reference || value instanceof CanonicalType || value instanceof CodeableConcept || value instanceof Expression))
            throw new Error("Not the right type for EvidenceVariable.characteristic.definition[x]: "+value.fhirType());
          this.definition = value;
          return this;
        }

        /**
         * @return {@link #method} (Method used for describing characteristic.)
         */
        public CodeableConcept getMethod() { 
          if (this.method == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EvidenceVariableCharacteristicComponent.method");
            else if (Configuration.doAutoCreate())
              this.method = new CodeableConcept(); // cc
          return this.method;
        }

        public boolean hasMethod() { 
          return this.method != null && !this.method.isEmpty();
        }

        /**
         * @param value {@link #method} (Method used for describing characteristic.)
         */
        public EvidenceVariableCharacteristicComponent setMethod(CodeableConcept value) { 
          this.method = value;
          return this;
        }

        /**
         * @return {@link #device} (Device used for determining characteristic.)
         */
        public Reference getDevice() { 
          if (this.device == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EvidenceVariableCharacteristicComponent.device");
            else if (Configuration.doAutoCreate())
              this.device = new Reference(); // cc
          return this.device;
        }

        public boolean hasDevice() { 
          return this.device != null && !this.device.isEmpty();
        }

        /**
         * @param value {@link #device} (Device used for determining characteristic.)
         */
        public EvidenceVariableCharacteristicComponent setDevice(Reference value) { 
          this.device = value;
          return this;
        }

        /**
         * @return {@link #exclude} (When true, members with this characteristic are excluded from the element.). This is the underlying object with id, value and extensions. The accessor "getExclude" gives direct access to the value
         */
        public BooleanType getExcludeElement() { 
          if (this.exclude == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EvidenceVariableCharacteristicComponent.exclude");
            else if (Configuration.doAutoCreate())
              this.exclude = new BooleanType(); // bb
          return this.exclude;
        }

        public boolean hasExcludeElement() { 
          return this.exclude != null && !this.exclude.isEmpty();
        }

        public boolean hasExclude() { 
          return this.exclude != null && !this.exclude.isEmpty();
        }

        /**
         * @param value {@link #exclude} (When true, members with this characteristic are excluded from the element.). This is the underlying object with id, value and extensions. The accessor "getExclude" gives direct access to the value
         */
        public EvidenceVariableCharacteristicComponent setExcludeElement(BooleanType value) { 
          this.exclude = value;
          return this;
        }

        /**
         * @return When true, members with this characteristic are excluded from the element.
         */
        public boolean getExclude() { 
          return this.exclude == null || this.exclude.isEmpty() ? false : this.exclude.getValue();
        }

        /**
         * @param value When true, members with this characteristic are excluded from the element.
         */
        public EvidenceVariableCharacteristicComponent setExclude(boolean value) { 
            if (this.exclude == null)
              this.exclude = new BooleanType();
            this.exclude.setValue(value);
          return this;
        }

        /**
         * @return {@link #timeFromEvent} (Observation time from study specified event.)
         */
        public List<EvidenceVariableCharacteristicTimeFromEventComponent> getTimeFromEvent() { 
          if (this.timeFromEvent == null)
            this.timeFromEvent = new ArrayList<EvidenceVariableCharacteristicTimeFromEventComponent>();
          return this.timeFromEvent;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public EvidenceVariableCharacteristicComponent setTimeFromEvent(List<EvidenceVariableCharacteristicTimeFromEventComponent> theTimeFromEvent) { 
          this.timeFromEvent = theTimeFromEvent;
          return this;
        }

        public boolean hasTimeFromEvent() { 
          if (this.timeFromEvent == null)
            return false;
          for (EvidenceVariableCharacteristicTimeFromEventComponent item : this.timeFromEvent)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public EvidenceVariableCharacteristicTimeFromEventComponent addTimeFromEvent() { //3
          EvidenceVariableCharacteristicTimeFromEventComponent t = new EvidenceVariableCharacteristicTimeFromEventComponent();
          if (this.timeFromEvent == null)
            this.timeFromEvent = new ArrayList<EvidenceVariableCharacteristicTimeFromEventComponent>();
          this.timeFromEvent.add(t);
          return t;
        }

        public EvidenceVariableCharacteristicComponent addTimeFromEvent(EvidenceVariableCharacteristicTimeFromEventComponent t) { //3
          if (t == null)
            return this;
          if (this.timeFromEvent == null)
            this.timeFromEvent = new ArrayList<EvidenceVariableCharacteristicTimeFromEventComponent>();
          this.timeFromEvent.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #timeFromEvent}, creating it if it does not already exist {3}
         */
        public EvidenceVariableCharacteristicTimeFromEventComponent getTimeFromEventFirstRep() { 
          if (getTimeFromEvent().isEmpty()) {
            addTimeFromEvent();
          }
          return getTimeFromEvent().get(0);
        }

        /**
         * @return {@link #groupMeasure} (Value or set of values that define the grouping.). This is the underlying object with id, value and extensions. The accessor "getGroupMeasure" gives direct access to the value
         */
        public Enumeration<GroupMeasure> getGroupMeasureElement() { 
          if (this.groupMeasure == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EvidenceVariableCharacteristicComponent.groupMeasure");
            else if (Configuration.doAutoCreate())
              this.groupMeasure = new Enumeration<GroupMeasure>(new GroupMeasureEnumFactory()); // bb
          return this.groupMeasure;
        }

        public boolean hasGroupMeasureElement() { 
          return this.groupMeasure != null && !this.groupMeasure.isEmpty();
        }

        public boolean hasGroupMeasure() { 
          return this.groupMeasure != null && !this.groupMeasure.isEmpty();
        }

        /**
         * @param value {@link #groupMeasure} (Value or set of values that define the grouping.). This is the underlying object with id, value and extensions. The accessor "getGroupMeasure" gives direct access to the value
         */
        public EvidenceVariableCharacteristicComponent setGroupMeasureElement(Enumeration<GroupMeasure> value) { 
          this.groupMeasure = value;
          return this;
        }

        /**
         * @return Value or set of values that define the grouping.
         */
        public GroupMeasure getGroupMeasure() { 
          return this.groupMeasure == null ? null : this.groupMeasure.getValue();
        }

        /**
         * @param value Value or set of values that define the grouping.
         */
        public EvidenceVariableCharacteristicComponent setGroupMeasure(GroupMeasure value) { 
          if (value == null)
            this.groupMeasure = null;
          else {
            if (this.groupMeasure == null)
              this.groupMeasure = new Enumeration<GroupMeasure>(new GroupMeasureEnumFactory());
            this.groupMeasure.setValue(value);
          }
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("description", "string", "A short, natural language description of the characteristic that could be used to communicate the criteria to an end-user.", 0, 1, description));
          children.add(new Property("type", "CodeableConcept", "Used to expressing the type of characteristic.", 0, 1, type));
          children.add(new Property("definition[x]", "Reference(Group|EvidenceVariable)|canonical(Any)|CodeableConcept|Expression", "Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).", 0, 1, definition));
          children.add(new Property("method", "CodeableConcept", "Method used for describing characteristic.", 0, 1, method));
          children.add(new Property("device", "Reference(Device|DeviceMetric)", "Device used for determining characteristic.", 0, 1, device));
          children.add(new Property("exclude", "boolean", "When true, members with this characteristic are excluded from the element.", 0, 1, exclude));
          children.add(new Property("timeFromEvent", "", "Observation time from study specified event.", 0, java.lang.Integer.MAX_VALUE, timeFromEvent));
          children.add(new Property("groupMeasure", "code", "Value or set of values that define the grouping.", 0, 1, groupMeasure));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -1724546052: /*description*/  return new Property("description", "string", "A short, natural language description of the characteristic that could be used to communicate the criteria to an end-user.", 0, 1, description);
          case 3575610: /*type*/  return new Property("type", "CodeableConcept", "Used to expressing the type of characteristic.", 0, 1, type);
          case -1139422643: /*definition[x]*/  return new Property("definition[x]", "Reference(Group|EvidenceVariable)|canonical(Any)|CodeableConcept|Expression", "Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).", 0, 1, definition);
          case -1014418093: /*definition*/  return new Property("definition[x]", "Reference(Group|EvidenceVariable)|canonical(Any)|CodeableConcept|Expression", "Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).", 0, 1, definition);
          case -820021448: /*definitionReference*/  return new Property("definition[x]", "Reference(Group|EvidenceVariable)", "Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).", 0, 1, definition);
          case 933485793: /*definitionCanonical*/  return new Property("definition[x]", "canonical(Any)", "Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).", 0, 1, definition);
          case -1446002226: /*definitionCodeableConcept*/  return new Property("definition[x]", "CodeableConcept", "Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).", 0, 1, definition);
          case 1463703627: /*definitionExpression*/  return new Property("definition[x]", "Expression", "Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).", 0, 1, definition);
          case -1077554975: /*method*/  return new Property("method", "CodeableConcept", "Method used for describing characteristic.", 0, 1, method);
          case -1335157162: /*device*/  return new Property("device", "Reference(Device|DeviceMetric)", "Device used for determining characteristic.", 0, 1, device);
          case -1321148966: /*exclude*/  return new Property("exclude", "boolean", "When true, members with this characteristic are excluded from the element.", 0, 1, exclude);
          case 2087274691: /*timeFromEvent*/  return new Property("timeFromEvent", "", "Observation time from study specified event.", 0, java.lang.Integer.MAX_VALUE, timeFromEvent);
          case 588892639: /*groupMeasure*/  return new Property("groupMeasure", "code", "Value or set of values that define the grouping.", 0, 1, groupMeasure);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // StringType
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeableConcept
        case -1014418093: /*definition*/ return this.definition == null ? new Base[0] : new Base[] {this.definition}; // DataType
        case -1077554975: /*method*/ return this.method == null ? new Base[0] : new Base[] {this.method}; // CodeableConcept
        case -1335157162: /*device*/ return this.device == null ? new Base[0] : new Base[] {this.device}; // Reference
        case -1321148966: /*exclude*/ return this.exclude == null ? new Base[0] : new Base[] {this.exclude}; // BooleanType
        case 2087274691: /*timeFromEvent*/ return this.timeFromEvent == null ? new Base[0] : this.timeFromEvent.toArray(new Base[this.timeFromEvent.size()]); // EvidenceVariableCharacteristicTimeFromEventComponent
        case 588892639: /*groupMeasure*/ return this.groupMeasure == null ? new Base[0] : new Base[] {this.groupMeasure}; // Enumeration<GroupMeasure>
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1724546052: // description
          this.description = TypeConvertor.castToString(value); // StringType
          return value;
        case 3575610: // type
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1014418093: // definition
          this.definition = TypeConvertor.castToType(value); // DataType
          return value;
        case -1077554975: // method
          this.method = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1335157162: // device
          this.device = TypeConvertor.castToReference(value); // Reference
          return value;
        case -1321148966: // exclude
          this.exclude = TypeConvertor.castToBoolean(value); // BooleanType
          return value;
        case 2087274691: // timeFromEvent
          this.getTimeFromEvent().add((EvidenceVariableCharacteristicTimeFromEventComponent) value); // EvidenceVariableCharacteristicTimeFromEventComponent
          return value;
        case 588892639: // groupMeasure
          value = new GroupMeasureEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.groupMeasure = (Enumeration) value; // Enumeration<GroupMeasure>
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("description")) {
          this.description = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("type")) {
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("definition[x]")) {
          this.definition = TypeConvertor.castToType(value); // DataType
        } else if (name.equals("method")) {
          this.method = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("device")) {
          this.device = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("exclude")) {
          this.exclude = TypeConvertor.castToBoolean(value); // BooleanType
        } else if (name.equals("timeFromEvent")) {
          this.getTimeFromEvent().add((EvidenceVariableCharacteristicTimeFromEventComponent) value);
        } else if (name.equals("groupMeasure")) {
          value = new GroupMeasureEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.groupMeasure = (Enumeration) value; // Enumeration<GroupMeasure>
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1724546052:  return getDescriptionElement();
        case 3575610:  return getType();
        case -1139422643:  return getDefinition();
        case -1014418093:  return getDefinition();
        case -1077554975:  return getMethod();
        case -1335157162:  return getDevice();
        case -1321148966:  return getExcludeElement();
        case 2087274691:  return addTimeFromEvent(); 
        case 588892639:  return getGroupMeasureElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1724546052: /*description*/ return new String[] {"string"};
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case -1014418093: /*definition*/ return new String[] {"Reference", "canonical", "CodeableConcept", "Expression"};
        case -1077554975: /*method*/ return new String[] {"CodeableConcept"};
        case -1335157162: /*device*/ return new String[] {"Reference"};
        case -1321148966: /*exclude*/ return new String[] {"boolean"};
        case 2087274691: /*timeFromEvent*/ return new String[] {};
        case 588892639: /*groupMeasure*/ return new String[] {"code"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a primitive type EvidenceVariable.characteristic.description");
        }
        else if (name.equals("type")) {
          this.type = new CodeableConcept();
          return this.type;
        }
        else if (name.equals("definitionReference")) {
          this.definition = new Reference();
          return this.definition;
        }
        else if (name.equals("definitionCanonical")) {
          this.definition = new CanonicalType();
          return this.definition;
        }
        else if (name.equals("definitionCodeableConcept")) {
          this.definition = new CodeableConcept();
          return this.definition;
        }
        else if (name.equals("definitionExpression")) {
          this.definition = new Expression();
          return this.definition;
        }
        else if (name.equals("method")) {
          this.method = new CodeableConcept();
          return this.method;
        }
        else if (name.equals("device")) {
          this.device = new Reference();
          return this.device;
        }
        else if (name.equals("exclude")) {
          throw new FHIRException("Cannot call addChild on a primitive type EvidenceVariable.characteristic.exclude");
        }
        else if (name.equals("timeFromEvent")) {
          return addTimeFromEvent();
        }
        else if (name.equals("groupMeasure")) {
          throw new FHIRException("Cannot call addChild on a primitive type EvidenceVariable.characteristic.groupMeasure");
        }
        else
          return super.addChild(name);
      }

      public EvidenceVariableCharacteristicComponent copy() {
        EvidenceVariableCharacteristicComponent dst = new EvidenceVariableCharacteristicComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(EvidenceVariableCharacteristicComponent dst) {
        super.copyValues(dst);
        dst.description = description == null ? null : description.copy();
        dst.type = type == null ? null : type.copy();
        dst.definition = definition == null ? null : definition.copy();
        dst.method = method == null ? null : method.copy();
        dst.device = device == null ? null : device.copy();
        dst.exclude = exclude == null ? null : exclude.copy();
        if (timeFromEvent != null) {
          dst.timeFromEvent = new ArrayList<EvidenceVariableCharacteristicTimeFromEventComponent>();
          for (EvidenceVariableCharacteristicTimeFromEventComponent i : timeFromEvent)
            dst.timeFromEvent.add(i.copy());
        };
        dst.groupMeasure = groupMeasure == null ? null : groupMeasure.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof EvidenceVariableCharacteristicComponent))
          return false;
        EvidenceVariableCharacteristicComponent o = (EvidenceVariableCharacteristicComponent) other_;
        return compareDeep(description, o.description, true) && compareDeep(type, o.type, true) && compareDeep(definition, o.definition, true)
           && compareDeep(method, o.method, true) && compareDeep(device, o.device, true) && compareDeep(exclude, o.exclude, true)
           && compareDeep(timeFromEvent, o.timeFromEvent, true) && compareDeep(groupMeasure, o.groupMeasure, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof EvidenceVariableCharacteristicComponent))
          return false;
        EvidenceVariableCharacteristicComponent o = (EvidenceVariableCharacteristicComponent) other_;
        return compareValues(description, o.description, true) && compareValues(exclude, o.exclude, true) && compareValues(groupMeasure, o.groupMeasure, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(description, type, definition
          , method, device, exclude, timeFromEvent, groupMeasure);
      }

  public String fhirType() {
    return "EvidenceVariable.characteristic";

  }

  }

    @Block()
    public static class EvidenceVariableCharacteristicTimeFromEventComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Human readable description.
         */
        @Child(name = "description", type = {StringType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Human readable description", formalDefinition="Human readable description." )
        protected StringType description;

        /**
         * The event used as a base point (reference point) in time.
         */
        @Child(name = "event", type = {CodeableConcept.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="The event used as a base point (reference point) in time", formalDefinition="The event used as a base point (reference point) in time." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/evidence-variable-event")
        protected CodeableConcept event;

        /**
         * Used to express the observation at a defined amount of time after the study start.
         */
        @Child(name = "quantity", type = {Quantity.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Used to express the observation at a defined amount of time after the study start", formalDefinition="Used to express the observation at a defined amount of time after the study start." )
        protected Quantity quantity;

        /**
         * Used to express the observation within a period after the study start.
         */
        @Child(name = "range", type = {Range.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Used to express the observation within a period after the study start", formalDefinition="Used to express the observation within a period after the study start." )
        protected Range range;

        /**
         * A human-readable string to clarify or explain concepts about the resource.
         */
        @Child(name = "note", type = {Annotation.class}, order=5, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Used for footnotes or explanatory notes", formalDefinition="A human-readable string to clarify or explain concepts about the resource." )
        protected List<Annotation> note;

        private static final long serialVersionUID = 1217037073L;

    /**
     * Constructor
     */
      public EvidenceVariableCharacteristicTimeFromEventComponent() {
        super();
      }

        /**
         * @return {@link #description} (Human readable description.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public StringType getDescriptionElement() { 
          if (this.description == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EvidenceVariableCharacteristicTimeFromEventComponent.description");
            else if (Configuration.doAutoCreate())
              this.description = new StringType(); // bb
          return this.description;
        }

        public boolean hasDescriptionElement() { 
          return this.description != null && !this.description.isEmpty();
        }

        public boolean hasDescription() { 
          return this.description != null && !this.description.isEmpty();
        }

        /**
         * @param value {@link #description} (Human readable description.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public EvidenceVariableCharacteristicTimeFromEventComponent setDescriptionElement(StringType value) { 
          this.description = value;
          return this;
        }

        /**
         * @return Human readable description.
         */
        public String getDescription() { 
          return this.description == null ? null : this.description.getValue();
        }

        /**
         * @param value Human readable description.
         */
        public EvidenceVariableCharacteristicTimeFromEventComponent setDescription(String value) { 
          if (Utilities.noString(value))
            this.description = null;
          else {
            if (this.description == null)
              this.description = new StringType();
            this.description.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #event} (The event used as a base point (reference point) in time.)
         */
        public CodeableConcept getEvent() { 
          if (this.event == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EvidenceVariableCharacteristicTimeFromEventComponent.event");
            else if (Configuration.doAutoCreate())
              this.event = new CodeableConcept(); // cc
          return this.event;
        }

        public boolean hasEvent() { 
          return this.event != null && !this.event.isEmpty();
        }

        /**
         * @param value {@link #event} (The event used as a base point (reference point) in time.)
         */
        public EvidenceVariableCharacteristicTimeFromEventComponent setEvent(CodeableConcept value) { 
          this.event = value;
          return this;
        }

        /**
         * @return {@link #quantity} (Used to express the observation at a defined amount of time after the study start.)
         */
        public Quantity getQuantity() { 
          if (this.quantity == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EvidenceVariableCharacteristicTimeFromEventComponent.quantity");
            else if (Configuration.doAutoCreate())
              this.quantity = new Quantity(); // cc
          return this.quantity;
        }

        public boolean hasQuantity() { 
          return this.quantity != null && !this.quantity.isEmpty();
        }

        /**
         * @param value {@link #quantity} (Used to express the observation at a defined amount of time after the study start.)
         */
        public EvidenceVariableCharacteristicTimeFromEventComponent setQuantity(Quantity value) { 
          this.quantity = value;
          return this;
        }

        /**
         * @return {@link #range} (Used to express the observation within a period after the study start.)
         */
        public Range getRange() { 
          if (this.range == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EvidenceVariableCharacteristicTimeFromEventComponent.range");
            else if (Configuration.doAutoCreate())
              this.range = new Range(); // cc
          return this.range;
        }

        public boolean hasRange() { 
          return this.range != null && !this.range.isEmpty();
        }

        /**
         * @param value {@link #range} (Used to express the observation within a period after the study start.)
         */
        public EvidenceVariableCharacteristicTimeFromEventComponent setRange(Range value) { 
          this.range = value;
          return this;
        }

        /**
         * @return {@link #note} (A human-readable string to clarify or explain concepts about the resource.)
         */
        public List<Annotation> getNote() { 
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          return this.note;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public EvidenceVariableCharacteristicTimeFromEventComponent setNote(List<Annotation> theNote) { 
          this.note = theNote;
          return this;
        }

        public boolean hasNote() { 
          if (this.note == null)
            return false;
          for (Annotation item : this.note)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Annotation addNote() { //3
          Annotation t = new Annotation();
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          this.note.add(t);
          return t;
        }

        public EvidenceVariableCharacteristicTimeFromEventComponent addNote(Annotation t) { //3
          if (t == null)
            return this;
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          this.note.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #note}, creating it if it does not already exist {3}
         */
        public Annotation getNoteFirstRep() { 
          if (getNote().isEmpty()) {
            addNote();
          }
          return getNote().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("description", "string", "Human readable description.", 0, 1, description));
          children.add(new Property("event", "CodeableConcept", "The event used as a base point (reference point) in time.", 0, 1, event));
          children.add(new Property("quantity", "Quantity", "Used to express the observation at a defined amount of time after the study start.", 0, 1, quantity));
          children.add(new Property("range", "Range", "Used to express the observation within a period after the study start.", 0, 1, range));
          children.add(new Property("note", "Annotation", "A human-readable string to clarify or explain concepts about the resource.", 0, java.lang.Integer.MAX_VALUE, note));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -1724546052: /*description*/  return new Property("description", "string", "Human readable description.", 0, 1, description);
          case 96891546: /*event*/  return new Property("event", "CodeableConcept", "The event used as a base point (reference point) in time.", 0, 1, event);
          case -1285004149: /*quantity*/  return new Property("quantity", "Quantity", "Used to express the observation at a defined amount of time after the study start.", 0, 1, quantity);
          case 108280125: /*range*/  return new Property("range", "Range", "Used to express the observation within a period after the study start.", 0, 1, range);
          case 3387378: /*note*/  return new Property("note", "Annotation", "A human-readable string to clarify or explain concepts about the resource.", 0, java.lang.Integer.MAX_VALUE, note);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // StringType
        case 96891546: /*event*/ return this.event == null ? new Base[0] : new Base[] {this.event}; // CodeableConcept
        case -1285004149: /*quantity*/ return this.quantity == null ? new Base[0] : new Base[] {this.quantity}; // Quantity
        case 108280125: /*range*/ return this.range == null ? new Base[0] : new Base[] {this.range}; // Range
        case 3387378: /*note*/ return this.note == null ? new Base[0] : this.note.toArray(new Base[this.note.size()]); // Annotation
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1724546052: // description
          this.description = TypeConvertor.castToString(value); // StringType
          return value;
        case 96891546: // event
          this.event = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1285004149: // quantity
          this.quantity = TypeConvertor.castToQuantity(value); // Quantity
          return value;
        case 108280125: // range
          this.range = TypeConvertor.castToRange(value); // Range
          return value;
        case 3387378: // note
          this.getNote().add(TypeConvertor.castToAnnotation(value)); // Annotation
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("description")) {
          this.description = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("event")) {
          this.event = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("quantity")) {
          this.quantity = TypeConvertor.castToQuantity(value); // Quantity
        } else if (name.equals("range")) {
          this.range = TypeConvertor.castToRange(value); // Range
        } else if (name.equals("note")) {
          this.getNote().add(TypeConvertor.castToAnnotation(value));
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1724546052:  return getDescriptionElement();
        case 96891546:  return getEvent();
        case -1285004149:  return getQuantity();
        case 108280125:  return getRange();
        case 3387378:  return addNote(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1724546052: /*description*/ return new String[] {"string"};
        case 96891546: /*event*/ return new String[] {"CodeableConcept"};
        case -1285004149: /*quantity*/ return new String[] {"Quantity"};
        case 108280125: /*range*/ return new String[] {"Range"};
        case 3387378: /*note*/ return new String[] {"Annotation"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a primitive type EvidenceVariable.characteristic.timeFromEvent.description");
        }
        else if (name.equals("event")) {
          this.event = new CodeableConcept();
          return this.event;
        }
        else if (name.equals("quantity")) {
          this.quantity = new Quantity();
          return this.quantity;
        }
        else if (name.equals("range")) {
          this.range = new Range();
          return this.range;
        }
        else if (name.equals("note")) {
          return addNote();
        }
        else
          return super.addChild(name);
      }

      public EvidenceVariableCharacteristicTimeFromEventComponent copy() {
        EvidenceVariableCharacteristicTimeFromEventComponent dst = new EvidenceVariableCharacteristicTimeFromEventComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(EvidenceVariableCharacteristicTimeFromEventComponent dst) {
        super.copyValues(dst);
        dst.description = description == null ? null : description.copy();
        dst.event = event == null ? null : event.copy();
        dst.quantity = quantity == null ? null : quantity.copy();
        dst.range = range == null ? null : range.copy();
        if (note != null) {
          dst.note = new ArrayList<Annotation>();
          for (Annotation i : note)
            dst.note.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof EvidenceVariableCharacteristicTimeFromEventComponent))
          return false;
        EvidenceVariableCharacteristicTimeFromEventComponent o = (EvidenceVariableCharacteristicTimeFromEventComponent) other_;
        return compareDeep(description, o.description, true) && compareDeep(event, o.event, true) && compareDeep(quantity, o.quantity, true)
           && compareDeep(range, o.range, true) && compareDeep(note, o.note, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof EvidenceVariableCharacteristicTimeFromEventComponent))
          return false;
        EvidenceVariableCharacteristicTimeFromEventComponent o = (EvidenceVariableCharacteristicTimeFromEventComponent) other_;
        return compareValues(description, o.description, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(description, event, quantity
          , range, note);
      }

  public String fhirType() {
    return "EvidenceVariable.characteristic.timeFromEvent";

  }

  }

    @Block()
    public static class EvidenceVariableCategoryComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Description of the grouping.
         */
        @Child(name = "name", type = {StringType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Description of the grouping", formalDefinition="Description of the grouping." )
        protected StringType name;

        /**
         * Definition of the grouping.
         */
        @Child(name = "value", type = {CodeableConcept.class, Quantity.class, Range.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Definition of the grouping", formalDefinition="Definition of the grouping." )
        protected DataType value;

        private static final long serialVersionUID = 1839679495L;

    /**
     * Constructor
     */
      public EvidenceVariableCategoryComponent() {
        super();
      }

        /**
         * @return {@link #name} (Description of the grouping.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
         */
        public StringType getNameElement() { 
          if (this.name == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EvidenceVariableCategoryComponent.name");
            else if (Configuration.doAutoCreate())
              this.name = new StringType(); // bb
          return this.name;
        }

        public boolean hasNameElement() { 
          return this.name != null && !this.name.isEmpty();
        }

        public boolean hasName() { 
          return this.name != null && !this.name.isEmpty();
        }

        /**
         * @param value {@link #name} (Description of the grouping.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
         */
        public EvidenceVariableCategoryComponent setNameElement(StringType value) { 
          this.name = value;
          return this;
        }

        /**
         * @return Description of the grouping.
         */
        public String getName() { 
          return this.name == null ? null : this.name.getValue();
        }

        /**
         * @param value Description of the grouping.
         */
        public EvidenceVariableCategoryComponent setName(String value) { 
          if (Utilities.noString(value))
            this.name = null;
          else {
            if (this.name == null)
              this.name = new StringType();
            this.name.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #value} (Definition of the grouping.)
         */
        public DataType getValue() { 
          return this.value;
        }

        /**
         * @return {@link #value} (Definition of the grouping.)
         */
        public CodeableConcept getValueCodeableConcept() throws FHIRException { 
          if (this.value == null)
            this.value = new CodeableConcept();
          if (!(this.value instanceof CodeableConcept))
            throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but "+this.value.getClass().getName()+" was encountered");
          return (CodeableConcept) this.value;
        }

        public boolean hasValueCodeableConcept() { 
          return this != null && this.value instanceof CodeableConcept;
        }

        /**
         * @return {@link #value} (Definition of the grouping.)
         */
        public Quantity getValueQuantity() throws FHIRException { 
          if (this.value == null)
            this.value = new Quantity();
          if (!(this.value instanceof Quantity))
            throw new FHIRException("Type mismatch: the type Quantity was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Quantity) this.value;
        }

        public boolean hasValueQuantity() { 
          return this != null && this.value instanceof Quantity;
        }

        /**
         * @return {@link #value} (Definition of the grouping.)
         */
        public Range getValueRange() throws FHIRException { 
          if (this.value == null)
            this.value = new Range();
          if (!(this.value instanceof Range))
            throw new FHIRException("Type mismatch: the type Range was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Range) this.value;
        }

        public boolean hasValueRange() { 
          return this != null && this.value instanceof Range;
        }

        public boolean hasValue() { 
          return this.value != null && !this.value.isEmpty();
        }

        /**
         * @param value {@link #value} (Definition of the grouping.)
         */
        public EvidenceVariableCategoryComponent setValue(DataType value) { 
          if (value != null && !(value instanceof CodeableConcept || value instanceof Quantity || value instanceof Range))
            throw new Error("Not the right type for EvidenceVariable.category.value[x]: "+value.fhirType());
          this.value = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("name", "string", "Description of the grouping.", 0, 1, name));
          children.add(new Property("value[x]", "CodeableConcept|Quantity|Range", "Definition of the grouping.", 0, 1, value));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3373707: /*name*/  return new Property("name", "string", "Description of the grouping.", 0, 1, name);
          case -1410166417: /*value[x]*/  return new Property("value[x]", "CodeableConcept|Quantity|Range", "Definition of the grouping.", 0, 1, value);
          case 111972721: /*value*/  return new Property("value[x]", "CodeableConcept|Quantity|Range", "Definition of the grouping.", 0, 1, value);
          case 924902896: /*valueCodeableConcept*/  return new Property("value[x]", "CodeableConcept", "Definition of the grouping.", 0, 1, value);
          case -2029823716: /*valueQuantity*/  return new Property("value[x]", "Quantity", "Definition of the grouping.", 0, 1, value);
          case 2030761548: /*valueRange*/  return new Property("value[x]", "Range", "Definition of the grouping.", 0, 1, value);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3373707: /*name*/ return this.name == null ? new Base[0] : new Base[] {this.name}; // StringType
        case 111972721: /*value*/ return this.value == null ? new Base[0] : new Base[] {this.value}; // DataType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3373707: // name
          this.name = TypeConvertor.castToString(value); // StringType
          return value;
        case 111972721: // value
          this.value = TypeConvertor.castToType(value); // DataType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("name")) {
          this.name = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("value[x]")) {
          this.value = TypeConvertor.castToType(value); // DataType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3373707:  return getNameElement();
        case -1410166417:  return getValue();
        case 111972721:  return getValue();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3373707: /*name*/ return new String[] {"string"};
        case 111972721: /*value*/ return new String[] {"CodeableConcept", "Quantity", "Range"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("name")) {
          throw new FHIRException("Cannot call addChild on a primitive type EvidenceVariable.category.name");
        }
        else if (name.equals("valueCodeableConcept")) {
          this.value = new CodeableConcept();
          return this.value;
        }
        else if (name.equals("valueQuantity")) {
          this.value = new Quantity();
          return this.value;
        }
        else if (name.equals("valueRange")) {
          this.value = new Range();
          return this.value;
        }
        else
          return super.addChild(name);
      }

      public EvidenceVariableCategoryComponent copy() {
        EvidenceVariableCategoryComponent dst = new EvidenceVariableCategoryComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(EvidenceVariableCategoryComponent dst) {
        super.copyValues(dst);
        dst.name = name == null ? null : name.copy();
        dst.value = value == null ? null : value.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof EvidenceVariableCategoryComponent))
          return false;
        EvidenceVariableCategoryComponent o = (EvidenceVariableCategoryComponent) other_;
        return compareDeep(name, o.name, true) && compareDeep(value, o.value, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof EvidenceVariableCategoryComponent))
          return false;
        EvidenceVariableCategoryComponent o = (EvidenceVariableCategoryComponent) other_;
        return compareValues(name, o.name, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(name, value);
      }

  public String fhirType() {
    return "EvidenceVariable.category";

  }

  }

    /**
     * An absolute URI that is used to identify this evidence variable when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this evidence variable is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the evidence variable is stored on different servers.
     */
    @Child(name = "url", type = {UriType.class}, order=0, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Canonical identifier for this evidence variable, represented as a URI (globally unique)", formalDefinition="An absolute URI that is used to identify this evidence variable when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this evidence variable is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the evidence variable is stored on different servers." )
    protected UriType url;

    /**
     * A formal identifier that is used to identify this evidence variable when it is represented in other formats, or referenced in a specification, model, design or an instance.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=1, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Additional identifier for the evidence variable", formalDefinition="A formal identifier that is used to identify this evidence variable when it is represented in other formats, or referenced in a specification, model, design or an instance." )
    protected List<Identifier> identifier;

    /**
     * The identifier that is used to identify this version of the evidence variable when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the evidence variable author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge assets, refer to the Decision Support Service specification. Note that a version is required for non-experimental active artifacts.
     */
    @Child(name = "version", type = {StringType.class}, order=2, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Business version of the evidence variable", formalDefinition="The identifier that is used to identify this version of the evidence variable when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the evidence variable author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge assets, refer to the Decision Support Service specification. Note that a version is required for non-experimental active artifacts." )
    protected StringType version;

    /**
     * A natural language name identifying the evidence variable. This name should be usable as an identifier for the module by machine processing applications such as code generation.
     */
    @Child(name = "name", type = {StringType.class}, order=3, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Name for this evidence variable (computer friendly)", formalDefinition="A natural language name identifying the evidence variable. This name should be usable as an identifier for the module by machine processing applications such as code generation." )
    protected StringType name;

    /**
     * A short, descriptive, user-friendly title for the evidence variable.
     */
    @Child(name = "title", type = {StringType.class}, order=4, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Name for this evidence variable (human friendly)", formalDefinition="A short, descriptive, user-friendly title for the evidence variable." )
    protected StringType title;

    /**
     * The short title provides an alternate title for use in informal descriptive contexts where the full, formal title is not necessary.
     */
    @Child(name = "shortTitle", type = {StringType.class}, order=5, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Title for use in informal contexts", formalDefinition="The short title provides an alternate title for use in informal descriptive contexts where the full, formal title is not necessary." )
    protected StringType shortTitle;

    /**
     * An explanatory or alternate title for the EvidenceVariable giving additional information about its content.
     */
    @Child(name = "subtitle", type = {StringType.class}, order=6, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Subordinate title of the EvidenceVariable", formalDefinition="An explanatory or alternate title for the EvidenceVariable giving additional information about its content." )
    protected StringType subtitle;

    /**
     * The status of this evidence variable. Enables tracking the life-cycle of the content.
     */
    @Child(name = "status", type = {CodeType.class}, order=7, min=1, max=1, modifier=true, summary=true)
    @Description(shortDefinition="draft | active | retired | unknown", formalDefinition="The status of this evidence variable. Enables tracking the life-cycle of the content." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/publication-status")
    protected Enumeration<PublicationStatus> status;

    /**
     * The date  (and optionally time) when the evidence variable was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the evidence variable changes.
     */
    @Child(name = "date", type = {DateTimeType.class}, order=8, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Date last changed", formalDefinition="The date  (and optionally time) when the evidence variable was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the evidence variable changes." )
    protected DateTimeType date;

    /**
     * A free text natural language description of the evidence variable from a consumer's perspective.
     */
    @Child(name = "description", type = {MarkdownType.class}, order=9, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Natural language description of the evidence variable", formalDefinition="A free text natural language description of the evidence variable from a consumer's perspective." )
    protected MarkdownType description;

    /**
     * A human-readable string to clarify or explain concepts about the resource.
     */
    @Child(name = "note", type = {Annotation.class}, order=10, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Used for footnotes or explanatory notes", formalDefinition="A human-readable string to clarify or explain concepts about the resource." )
    protected List<Annotation> note;

    /**
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate evidence variable instances.
     */
    @Child(name = "useContext", type = {UsageContext.class}, order=11, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="The context that the content is intended to support", formalDefinition="The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate evidence variable instances." )
    protected List<UsageContext> useContext;

    /**
     * The name of the organization or individual that published the evidence variable.
     */
    @Child(name = "publisher", type = {StringType.class}, order=12, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Name of the publisher (organization or individual)", formalDefinition="The name of the organization or individual that published the evidence variable." )
    protected StringType publisher;

    /**
     * Contact details to assist a user in finding and communicating with the publisher.
     */
    @Child(name = "contact", type = {ContactDetail.class}, order=13, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Contact details for the publisher", formalDefinition="Contact details to assist a user in finding and communicating with the publisher." )
    protected List<ContactDetail> contact;

    /**
     * An individiual or organization primarily involved in the creation and maintenance of the content.
     */
    @Child(name = "author", type = {ContactDetail.class}, order=14, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Who authored the content", formalDefinition="An individiual or organization primarily involved in the creation and maintenance of the content." )
    protected List<ContactDetail> author;

    /**
     * An individual or organization primarily responsible for internal coherence of the content.
     */
    @Child(name = "editor", type = {ContactDetail.class}, order=15, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Who edited the content", formalDefinition="An individual or organization primarily responsible for internal coherence of the content." )
    protected List<ContactDetail> editor;

    /**
     * An individual or organization primarily responsible for review of some aspect of the content.
     */
    @Child(name = "reviewer", type = {ContactDetail.class}, order=16, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Who reviewed the content", formalDefinition="An individual or organization primarily responsible for review of some aspect of the content." )
    protected List<ContactDetail> reviewer;

    /**
     * An individual or organization responsible for officially endorsing the content for use in some setting.
     */
    @Child(name = "endorser", type = {ContactDetail.class}, order=17, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Who endorsed the content", formalDefinition="An individual or organization responsible for officially endorsing the content for use in some setting." )
    protected List<ContactDetail> endorser;

    /**
     * Related artifacts such as additional documentation, justification, or bibliographic references.
     */
    @Child(name = "relatedArtifact", type = {RelatedArtifact.class}, order=18, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Additional documentation, citations, etc.", formalDefinition="Related artifacts such as additional documentation, justification, or bibliographic references." )
    protected List<RelatedArtifact> relatedArtifact;

    /**
     * True if the actual variable measured, false if a conceptual representation of the intended variable.
     */
    @Child(name = "actual", type = {BooleanType.class}, order=19, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Actual or conceptual", formalDefinition="True if the actual variable measured, false if a conceptual representation of the intended variable." )
    protected BooleanType actual;

    /**
     * Used to specify how two or more characteristics are combined.
     */
    @Child(name = "characteristicCombination", type = {}, order=20, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Used to specify how two or more characteristics are combined", formalDefinition="Used to specify how two or more characteristics are combined." )
    protected EvidenceVariableCharacteristicCombinationComponent characteristicCombination;

    /**
     * A characteristic that defines the members of the evidence element. Multiple characteristics are applied with "and" semantics.
     */
    @Child(name = "characteristic", type = {}, order=21, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="What defines the members of the evidence element", formalDefinition="A characteristic that defines the members of the evidence element. Multiple characteristics are applied with \"and\" semantics." )
    protected List<EvidenceVariableCharacteristicComponent> characteristic;

    /**
     * continuous | dichotomous | ordinal | polychotomous.
     */
    @Child(name = "handling", type = {CodeType.class}, order=22, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="continuous | dichotomous | ordinal | polychotomous", formalDefinition="continuous | dichotomous | ordinal | polychotomous." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/variable-handling")
    protected Enumeration<EvidenceVariableHandling> handling;

    /**
     * A grouping for ordinal or polychotomous variables.
     */
    @Child(name = "category", type = {}, order=23, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="A grouping for ordinal or polychotomous variables", formalDefinition="A grouping for ordinal or polychotomous variables." )
    protected List<EvidenceVariableCategoryComponent> category;

    private static final long serialVersionUID = -208109028L;

  /**
   * Constructor
   */
    public EvidenceVariable() {
      super();
    }

  /**
   * Constructor
   */
    public EvidenceVariable(PublicationStatus status) {
      super();
      this.setStatus(status);
    }

    /**
     * @return {@link #url} (An absolute URI that is used to identify this evidence variable when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this evidence variable is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the evidence variable is stored on different servers.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public UriType getUrlElement() { 
      if (this.url == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EvidenceVariable.url");
        else if (Configuration.doAutoCreate())
          this.url = new UriType(); // bb
      return this.url;
    }

    public boolean hasUrlElement() { 
      return this.url != null && !this.url.isEmpty();
    }

    public boolean hasUrl() { 
      return this.url != null && !this.url.isEmpty();
    }

    /**
     * @param value {@link #url} (An absolute URI that is used to identify this evidence variable when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this evidence variable is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the evidence variable is stored on different servers.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public EvidenceVariable setUrlElement(UriType value) { 
      this.url = value;
      return this;
    }

    /**
     * @return An absolute URI that is used to identify this evidence variable when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this evidence variable is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the evidence variable is stored on different servers.
     */
    public String getUrl() { 
      return this.url == null ? null : this.url.getValue();
    }

    /**
     * @param value An absolute URI that is used to identify this evidence variable when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this evidence variable is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the evidence variable is stored on different servers.
     */
    public EvidenceVariable setUrl(String value) { 
      if (Utilities.noString(value))
        this.url = null;
      else {
        if (this.url == null)
          this.url = new UriType();
        this.url.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #identifier} (A formal identifier that is used to identify this evidence variable when it is represented in other formats, or referenced in a specification, model, design or an instance.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EvidenceVariable setIdentifier(List<Identifier> theIdentifier) { 
      this.identifier = theIdentifier;
      return this;
    }

    public boolean hasIdentifier() { 
      if (this.identifier == null)
        return false;
      for (Identifier item : this.identifier)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Identifier addIdentifier() { //3
      Identifier t = new Identifier();
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return t;
    }

    public EvidenceVariable addIdentifier(Identifier t) { //3
      if (t == null)
        return this;
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #identifier}, creating it if it does not already exist {3}
     */
    public Identifier getIdentifierFirstRep() { 
      if (getIdentifier().isEmpty()) {
        addIdentifier();
      }
      return getIdentifier().get(0);
    }

    /**
     * @return {@link #version} (The identifier that is used to identify this version of the evidence variable when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the evidence variable author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge assets, refer to the Decision Support Service specification. Note that a version is required for non-experimental active artifacts.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public StringType getVersionElement() { 
      if (this.version == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EvidenceVariable.version");
        else if (Configuration.doAutoCreate())
          this.version = new StringType(); // bb
      return this.version;
    }

    public boolean hasVersionElement() { 
      return this.version != null && !this.version.isEmpty();
    }

    public boolean hasVersion() { 
      return this.version != null && !this.version.isEmpty();
    }

    /**
     * @param value {@link #version} (The identifier that is used to identify this version of the evidence variable when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the evidence variable author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge assets, refer to the Decision Support Service specification. Note that a version is required for non-experimental active artifacts.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public EvidenceVariable setVersionElement(StringType value) { 
      this.version = value;
      return this;
    }

    /**
     * @return The identifier that is used to identify this version of the evidence variable when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the evidence variable author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge assets, refer to the Decision Support Service specification. Note that a version is required for non-experimental active artifacts.
     */
    public String getVersion() { 
      return this.version == null ? null : this.version.getValue();
    }

    /**
     * @param value The identifier that is used to identify this version of the evidence variable when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the evidence variable author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge assets, refer to the Decision Support Service specification. Note that a version is required for non-experimental active artifacts.
     */
    public EvidenceVariable setVersion(String value) { 
      if (Utilities.noString(value))
        this.version = null;
      else {
        if (this.version == null)
          this.version = new StringType();
        this.version.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #name} (A natural language name identifying the evidence variable. This name should be usable as an identifier for the module by machine processing applications such as code generation.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() { 
      if (this.name == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EvidenceVariable.name");
        else if (Configuration.doAutoCreate())
          this.name = new StringType(); // bb
      return this.name;
    }

    public boolean hasNameElement() { 
      return this.name != null && !this.name.isEmpty();
    }

    public boolean hasName() { 
      return this.name != null && !this.name.isEmpty();
    }

    /**
     * @param value {@link #name} (A natural language name identifying the evidence variable. This name should be usable as an identifier for the module by machine processing applications such as code generation.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public EvidenceVariable setNameElement(StringType value) { 
      this.name = value;
      return this;
    }

    /**
     * @return A natural language name identifying the evidence variable. This name should be usable as an identifier for the module by machine processing applications such as code generation.
     */
    public String getName() { 
      return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value A natural language name identifying the evidence variable. This name should be usable as an identifier for the module by machine processing applications such as code generation.
     */
    public EvidenceVariable setName(String value) { 
      if (Utilities.noString(value))
        this.name = null;
      else {
        if (this.name == null)
          this.name = new StringType();
        this.name.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #title} (A short, descriptive, user-friendly title for the evidence variable.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
     */
    public StringType getTitleElement() { 
      if (this.title == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EvidenceVariable.title");
        else if (Configuration.doAutoCreate())
          this.title = new StringType(); // bb
      return this.title;
    }

    public boolean hasTitleElement() { 
      return this.title != null && !this.title.isEmpty();
    }

    public boolean hasTitle() { 
      return this.title != null && !this.title.isEmpty();
    }

    /**
     * @param value {@link #title} (A short, descriptive, user-friendly title for the evidence variable.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
     */
    public EvidenceVariable setTitleElement(StringType value) { 
      this.title = value;
      return this;
    }

    /**
     * @return A short, descriptive, user-friendly title for the evidence variable.
     */
    public String getTitle() { 
      return this.title == null ? null : this.title.getValue();
    }

    /**
     * @param value A short, descriptive, user-friendly title for the evidence variable.
     */
    public EvidenceVariable setTitle(String value) { 
      if (Utilities.noString(value))
        this.title = null;
      else {
        if (this.title == null)
          this.title = new StringType();
        this.title.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #shortTitle} (The short title provides an alternate title for use in informal descriptive contexts where the full, formal title is not necessary.). This is the underlying object with id, value and extensions. The accessor "getShortTitle" gives direct access to the value
     */
    public StringType getShortTitleElement() { 
      if (this.shortTitle == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EvidenceVariable.shortTitle");
        else if (Configuration.doAutoCreate())
          this.shortTitle = new StringType(); // bb
      return this.shortTitle;
    }

    public boolean hasShortTitleElement() { 
      return this.shortTitle != null && !this.shortTitle.isEmpty();
    }

    public boolean hasShortTitle() { 
      return this.shortTitle != null && !this.shortTitle.isEmpty();
    }

    /**
     * @param value {@link #shortTitle} (The short title provides an alternate title for use in informal descriptive contexts where the full, formal title is not necessary.). This is the underlying object with id, value and extensions. The accessor "getShortTitle" gives direct access to the value
     */
    public EvidenceVariable setShortTitleElement(StringType value) { 
      this.shortTitle = value;
      return this;
    }

    /**
     * @return The short title provides an alternate title for use in informal descriptive contexts where the full, formal title is not necessary.
     */
    public String getShortTitle() { 
      return this.shortTitle == null ? null : this.shortTitle.getValue();
    }

    /**
     * @param value The short title provides an alternate title for use in informal descriptive contexts where the full, formal title is not necessary.
     */
    public EvidenceVariable setShortTitle(String value) { 
      if (Utilities.noString(value))
        this.shortTitle = null;
      else {
        if (this.shortTitle == null)
          this.shortTitle = new StringType();
        this.shortTitle.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #subtitle} (An explanatory or alternate title for the EvidenceVariable giving additional information about its content.). This is the underlying object with id, value and extensions. The accessor "getSubtitle" gives direct access to the value
     */
    public StringType getSubtitleElement() { 
      if (this.subtitle == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EvidenceVariable.subtitle");
        else if (Configuration.doAutoCreate())
          this.subtitle = new StringType(); // bb
      return this.subtitle;
    }

    public boolean hasSubtitleElement() { 
      return this.subtitle != null && !this.subtitle.isEmpty();
    }

    public boolean hasSubtitle() { 
      return this.subtitle != null && !this.subtitle.isEmpty();
    }

    /**
     * @param value {@link #subtitle} (An explanatory or alternate title for the EvidenceVariable giving additional information about its content.). This is the underlying object with id, value and extensions. The accessor "getSubtitle" gives direct access to the value
     */
    public EvidenceVariable setSubtitleElement(StringType value) { 
      this.subtitle = value;
      return this;
    }

    /**
     * @return An explanatory or alternate title for the EvidenceVariable giving additional information about its content.
     */
    public String getSubtitle() { 
      return this.subtitle == null ? null : this.subtitle.getValue();
    }

    /**
     * @param value An explanatory or alternate title for the EvidenceVariable giving additional information about its content.
     */
    public EvidenceVariable setSubtitle(String value) { 
      if (Utilities.noString(value))
        this.subtitle = null;
      else {
        if (this.subtitle == null)
          this.subtitle = new StringType();
        this.subtitle.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #status} (The status of this evidence variable. Enables tracking the life-cycle of the content.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<PublicationStatus> getStatusElement() { 
      if (this.status == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EvidenceVariable.status");
        else if (Configuration.doAutoCreate())
          this.status = new Enumeration<PublicationStatus>(new PublicationStatusEnumFactory()); // bb
      return this.status;
    }

    public boolean hasStatusElement() { 
      return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() { 
      return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The status of this evidence variable. Enables tracking the life-cycle of the content.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public EvidenceVariable setStatusElement(Enumeration<PublicationStatus> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return The status of this evidence variable. Enables tracking the life-cycle of the content.
     */
    public PublicationStatus getStatus() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of this evidence variable. Enables tracking the life-cycle of the content.
     */
    public EvidenceVariable setStatus(PublicationStatus value) { 
        if (this.status == null)
          this.status = new Enumeration<PublicationStatus>(new PublicationStatusEnumFactory());
        this.status.setValue(value);
      return this;
    }

    /**
     * @return {@link #date} (The date  (and optionally time) when the evidence variable was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the evidence variable changes.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() { 
      if (this.date == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EvidenceVariable.date");
        else if (Configuration.doAutoCreate())
          this.date = new DateTimeType(); // bb
      return this.date;
    }

    public boolean hasDateElement() { 
      return this.date != null && !this.date.isEmpty();
    }

    public boolean hasDate() { 
      return this.date != null && !this.date.isEmpty();
    }

    /**
     * @param value {@link #date} (The date  (and optionally time) when the evidence variable was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the evidence variable changes.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public EvidenceVariable setDateElement(DateTimeType value) { 
      this.date = value;
      return this;
    }

    /**
     * @return The date  (and optionally time) when the evidence variable was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the evidence variable changes.
     */
    public Date getDate() { 
      return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The date  (and optionally time) when the evidence variable was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the evidence variable changes.
     */
    public EvidenceVariable setDate(Date value) { 
      if (value == null)
        this.date = null;
      else {
        if (this.date == null)
          this.date = new DateTimeType();
        this.date.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #description} (A free text natural language description of the evidence variable from a consumer's perspective.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public MarkdownType getDescriptionElement() { 
      if (this.description == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EvidenceVariable.description");
        else if (Configuration.doAutoCreate())
          this.description = new MarkdownType(); // bb
      return this.description;
    }

    public boolean hasDescriptionElement() { 
      return this.description != null && !this.description.isEmpty();
    }

    public boolean hasDescription() { 
      return this.description != null && !this.description.isEmpty();
    }

    /**
     * @param value {@link #description} (A free text natural language description of the evidence variable from a consumer's perspective.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public EvidenceVariable setDescriptionElement(MarkdownType value) { 
      this.description = value;
      return this;
    }

    /**
     * @return A free text natural language description of the evidence variable from a consumer's perspective.
     */
    public String getDescription() { 
      return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value A free text natural language description of the evidence variable from a consumer's perspective.
     */
    public EvidenceVariable setDescription(String value) { 
      if (value == null)
        this.description = null;
      else {
        if (this.description == null)
          this.description = new MarkdownType();
        this.description.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #note} (A human-readable string to clarify or explain concepts about the resource.)
     */
    public List<Annotation> getNote() { 
      if (this.note == null)
        this.note = new ArrayList<Annotation>();
      return this.note;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EvidenceVariable setNote(List<Annotation> theNote) { 
      this.note = theNote;
      return this;
    }

    public boolean hasNote() { 
      if (this.note == null)
        return false;
      for (Annotation item : this.note)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Annotation addNote() { //3
      Annotation t = new Annotation();
      if (this.note == null)
        this.note = new ArrayList<Annotation>();
      this.note.add(t);
      return t;
    }

    public EvidenceVariable addNote(Annotation t) { //3
      if (t == null)
        return this;
      if (this.note == null)
        this.note = new ArrayList<Annotation>();
      this.note.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #note}, creating it if it does not already exist {3}
     */
    public Annotation getNoteFirstRep() { 
      if (getNote().isEmpty()) {
        addNote();
      }
      return getNote().get(0);
    }

    /**
     * @return {@link #useContext} (The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate evidence variable instances.)
     */
    public List<UsageContext> getUseContext() { 
      if (this.useContext == null)
        this.useContext = new ArrayList<UsageContext>();
      return this.useContext;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EvidenceVariable setUseContext(List<UsageContext> theUseContext) { 
      this.useContext = theUseContext;
      return this;
    }

    public boolean hasUseContext() { 
      if (this.useContext == null)
        return false;
      for (UsageContext item : this.useContext)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public UsageContext addUseContext() { //3
      UsageContext t = new UsageContext();
      if (this.useContext == null)
        this.useContext = new ArrayList<UsageContext>();
      this.useContext.add(t);
      return t;
    }

    public EvidenceVariable addUseContext(UsageContext t) { //3
      if (t == null)
        return this;
      if (this.useContext == null)
        this.useContext = new ArrayList<UsageContext>();
      this.useContext.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #useContext}, creating it if it does not already exist {3}
     */
    public UsageContext getUseContextFirstRep() { 
      if (getUseContext().isEmpty()) {
        addUseContext();
      }
      return getUseContext().get(0);
    }

    /**
     * @return {@link #publisher} (The name of the organization or individual that published the evidence variable.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public StringType getPublisherElement() { 
      if (this.publisher == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EvidenceVariable.publisher");
        else if (Configuration.doAutoCreate())
          this.publisher = new StringType(); // bb
      return this.publisher;
    }

    public boolean hasPublisherElement() { 
      return this.publisher != null && !this.publisher.isEmpty();
    }

    public boolean hasPublisher() { 
      return this.publisher != null && !this.publisher.isEmpty();
    }

    /**
     * @param value {@link #publisher} (The name of the organization or individual that published the evidence variable.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public EvidenceVariable setPublisherElement(StringType value) { 
      this.publisher = value;
      return this;
    }

    /**
     * @return The name of the organization or individual that published the evidence variable.
     */
    public String getPublisher() { 
      return this.publisher == null ? null : this.publisher.getValue();
    }

    /**
     * @param value The name of the organization or individual that published the evidence variable.
     */
    public EvidenceVariable setPublisher(String value) { 
      if (Utilities.noString(value))
        this.publisher = null;
      else {
        if (this.publisher == null)
          this.publisher = new StringType();
        this.publisher.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #contact} (Contact details to assist a user in finding and communicating with the publisher.)
     */
    public List<ContactDetail> getContact() { 
      if (this.contact == null)
        this.contact = new ArrayList<ContactDetail>();
      return this.contact;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EvidenceVariable setContact(List<ContactDetail> theContact) { 
      this.contact = theContact;
      return this;
    }

    public boolean hasContact() { 
      if (this.contact == null)
        return false;
      for (ContactDetail item : this.contact)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ContactDetail addContact() { //3
      ContactDetail t = new ContactDetail();
      if (this.contact == null)
        this.contact = new ArrayList<ContactDetail>();
      this.contact.add(t);
      return t;
    }

    public EvidenceVariable addContact(ContactDetail t) { //3
      if (t == null)
        return this;
      if (this.contact == null)
        this.contact = new ArrayList<ContactDetail>();
      this.contact.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #contact}, creating it if it does not already exist {3}
     */
    public ContactDetail getContactFirstRep() { 
      if (getContact().isEmpty()) {
        addContact();
      }
      return getContact().get(0);
    }

    /**
     * @return {@link #author} (An individiual or organization primarily involved in the creation and maintenance of the content.)
     */
    public List<ContactDetail> getAuthor() { 
      if (this.author == null)
        this.author = new ArrayList<ContactDetail>();
      return this.author;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EvidenceVariable setAuthor(List<ContactDetail> theAuthor) { 
      this.author = theAuthor;
      return this;
    }

    public boolean hasAuthor() { 
      if (this.author == null)
        return false;
      for (ContactDetail item : this.author)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ContactDetail addAuthor() { //3
      ContactDetail t = new ContactDetail();
      if (this.author == null)
        this.author = new ArrayList<ContactDetail>();
      this.author.add(t);
      return t;
    }

    public EvidenceVariable addAuthor(ContactDetail t) { //3
      if (t == null)
        return this;
      if (this.author == null)
        this.author = new ArrayList<ContactDetail>();
      this.author.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #author}, creating it if it does not already exist {3}
     */
    public ContactDetail getAuthorFirstRep() { 
      if (getAuthor().isEmpty()) {
        addAuthor();
      }
      return getAuthor().get(0);
    }

    /**
     * @return {@link #editor} (An individual or organization primarily responsible for internal coherence of the content.)
     */
    public List<ContactDetail> getEditor() { 
      if (this.editor == null)
        this.editor = new ArrayList<ContactDetail>();
      return this.editor;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EvidenceVariable setEditor(List<ContactDetail> theEditor) { 
      this.editor = theEditor;
      return this;
    }

    public boolean hasEditor() { 
      if (this.editor == null)
        return false;
      for (ContactDetail item : this.editor)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ContactDetail addEditor() { //3
      ContactDetail t = new ContactDetail();
      if (this.editor == null)
        this.editor = new ArrayList<ContactDetail>();
      this.editor.add(t);
      return t;
    }

    public EvidenceVariable addEditor(ContactDetail t) { //3
      if (t == null)
        return this;
      if (this.editor == null)
        this.editor = new ArrayList<ContactDetail>();
      this.editor.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #editor}, creating it if it does not already exist {3}
     */
    public ContactDetail getEditorFirstRep() { 
      if (getEditor().isEmpty()) {
        addEditor();
      }
      return getEditor().get(0);
    }

    /**
     * @return {@link #reviewer} (An individual or organization primarily responsible for review of some aspect of the content.)
     */
    public List<ContactDetail> getReviewer() { 
      if (this.reviewer == null)
        this.reviewer = new ArrayList<ContactDetail>();
      return this.reviewer;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EvidenceVariable setReviewer(List<ContactDetail> theReviewer) { 
      this.reviewer = theReviewer;
      return this;
    }

    public boolean hasReviewer() { 
      if (this.reviewer == null)
        return false;
      for (ContactDetail item : this.reviewer)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ContactDetail addReviewer() { //3
      ContactDetail t = new ContactDetail();
      if (this.reviewer == null)
        this.reviewer = new ArrayList<ContactDetail>();
      this.reviewer.add(t);
      return t;
    }

    public EvidenceVariable addReviewer(ContactDetail t) { //3
      if (t == null)
        return this;
      if (this.reviewer == null)
        this.reviewer = new ArrayList<ContactDetail>();
      this.reviewer.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #reviewer}, creating it if it does not already exist {3}
     */
    public ContactDetail getReviewerFirstRep() { 
      if (getReviewer().isEmpty()) {
        addReviewer();
      }
      return getReviewer().get(0);
    }

    /**
     * @return {@link #endorser} (An individual or organization responsible for officially endorsing the content for use in some setting.)
     */
    public List<ContactDetail> getEndorser() { 
      if (this.endorser == null)
        this.endorser = new ArrayList<ContactDetail>();
      return this.endorser;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EvidenceVariable setEndorser(List<ContactDetail> theEndorser) { 
      this.endorser = theEndorser;
      return this;
    }

    public boolean hasEndorser() { 
      if (this.endorser == null)
        return false;
      for (ContactDetail item : this.endorser)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ContactDetail addEndorser() { //3
      ContactDetail t = new ContactDetail();
      if (this.endorser == null)
        this.endorser = new ArrayList<ContactDetail>();
      this.endorser.add(t);
      return t;
    }

    public EvidenceVariable addEndorser(ContactDetail t) { //3
      if (t == null)
        return this;
      if (this.endorser == null)
        this.endorser = new ArrayList<ContactDetail>();
      this.endorser.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #endorser}, creating it if it does not already exist {3}
     */
    public ContactDetail getEndorserFirstRep() { 
      if (getEndorser().isEmpty()) {
        addEndorser();
      }
      return getEndorser().get(0);
    }

    /**
     * @return {@link #relatedArtifact} (Related artifacts such as additional documentation, justification, or bibliographic references.)
     */
    public List<RelatedArtifact> getRelatedArtifact() { 
      if (this.relatedArtifact == null)
        this.relatedArtifact = new ArrayList<RelatedArtifact>();
      return this.relatedArtifact;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EvidenceVariable setRelatedArtifact(List<RelatedArtifact> theRelatedArtifact) { 
      this.relatedArtifact = theRelatedArtifact;
      return this;
    }

    public boolean hasRelatedArtifact() { 
      if (this.relatedArtifact == null)
        return false;
      for (RelatedArtifact item : this.relatedArtifact)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public RelatedArtifact addRelatedArtifact() { //3
      RelatedArtifact t = new RelatedArtifact();
      if (this.relatedArtifact == null)
        this.relatedArtifact = new ArrayList<RelatedArtifact>();
      this.relatedArtifact.add(t);
      return t;
    }

    public EvidenceVariable addRelatedArtifact(RelatedArtifact t) { //3
      if (t == null)
        return this;
      if (this.relatedArtifact == null)
        this.relatedArtifact = new ArrayList<RelatedArtifact>();
      this.relatedArtifact.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #relatedArtifact}, creating it if it does not already exist {3}
     */
    public RelatedArtifact getRelatedArtifactFirstRep() { 
      if (getRelatedArtifact().isEmpty()) {
        addRelatedArtifact();
      }
      return getRelatedArtifact().get(0);
    }

    /**
     * @return {@link #actual} (True if the actual variable measured, false if a conceptual representation of the intended variable.). This is the underlying object with id, value and extensions. The accessor "getActual" gives direct access to the value
     */
    public BooleanType getActualElement() { 
      if (this.actual == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EvidenceVariable.actual");
        else if (Configuration.doAutoCreate())
          this.actual = new BooleanType(); // bb
      return this.actual;
    }

    public boolean hasActualElement() { 
      return this.actual != null && !this.actual.isEmpty();
    }

    public boolean hasActual() { 
      return this.actual != null && !this.actual.isEmpty();
    }

    /**
     * @param value {@link #actual} (True if the actual variable measured, false if a conceptual representation of the intended variable.). This is the underlying object with id, value and extensions. The accessor "getActual" gives direct access to the value
     */
    public EvidenceVariable setActualElement(BooleanType value) { 
      this.actual = value;
      return this;
    }

    /**
     * @return True if the actual variable measured, false if a conceptual representation of the intended variable.
     */
    public boolean getActual() { 
      return this.actual == null || this.actual.isEmpty() ? false : this.actual.getValue();
    }

    /**
     * @param value True if the actual variable measured, false if a conceptual representation of the intended variable.
     */
    public EvidenceVariable setActual(boolean value) { 
        if (this.actual == null)
          this.actual = new BooleanType();
        this.actual.setValue(value);
      return this;
    }

    /**
     * @return {@link #characteristicCombination} (Used to specify how two or more characteristics are combined.)
     */
    public EvidenceVariableCharacteristicCombinationComponent getCharacteristicCombination() { 
      if (this.characteristicCombination == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EvidenceVariable.characteristicCombination");
        else if (Configuration.doAutoCreate())
          this.characteristicCombination = new EvidenceVariableCharacteristicCombinationComponent(); // cc
      return this.characteristicCombination;
    }

    public boolean hasCharacteristicCombination() { 
      return this.characteristicCombination != null && !this.characteristicCombination.isEmpty();
    }

    /**
     * @param value {@link #characteristicCombination} (Used to specify how two or more characteristics are combined.)
     */
    public EvidenceVariable setCharacteristicCombination(EvidenceVariableCharacteristicCombinationComponent value) { 
      this.characteristicCombination = value;
      return this;
    }

    /**
     * @return {@link #characteristic} (A characteristic that defines the members of the evidence element. Multiple characteristics are applied with "and" semantics.)
     */
    public List<EvidenceVariableCharacteristicComponent> getCharacteristic() { 
      if (this.characteristic == null)
        this.characteristic = new ArrayList<EvidenceVariableCharacteristicComponent>();
      return this.characteristic;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EvidenceVariable setCharacteristic(List<EvidenceVariableCharacteristicComponent> theCharacteristic) { 
      this.characteristic = theCharacteristic;
      return this;
    }

    public boolean hasCharacteristic() { 
      if (this.characteristic == null)
        return false;
      for (EvidenceVariableCharacteristicComponent item : this.characteristic)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public EvidenceVariableCharacteristicComponent addCharacteristic() { //3
      EvidenceVariableCharacteristicComponent t = new EvidenceVariableCharacteristicComponent();
      if (this.characteristic == null)
        this.characteristic = new ArrayList<EvidenceVariableCharacteristicComponent>();
      this.characteristic.add(t);
      return t;
    }

    public EvidenceVariable addCharacteristic(EvidenceVariableCharacteristicComponent t) { //3
      if (t == null)
        return this;
      if (this.characteristic == null)
        this.characteristic = new ArrayList<EvidenceVariableCharacteristicComponent>();
      this.characteristic.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #characteristic}, creating it if it does not already exist {3}
     */
    public EvidenceVariableCharacteristicComponent getCharacteristicFirstRep() { 
      if (getCharacteristic().isEmpty()) {
        addCharacteristic();
      }
      return getCharacteristic().get(0);
    }

    /**
     * @return {@link #handling} (continuous | dichotomous | ordinal | polychotomous.). This is the underlying object with id, value and extensions. The accessor "getHandling" gives direct access to the value
     */
    public Enumeration<EvidenceVariableHandling> getHandlingElement() { 
      if (this.handling == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EvidenceVariable.handling");
        else if (Configuration.doAutoCreate())
          this.handling = new Enumeration<EvidenceVariableHandling>(new EvidenceVariableHandlingEnumFactory()); // bb
      return this.handling;
    }

    public boolean hasHandlingElement() { 
      return this.handling != null && !this.handling.isEmpty();
    }

    public boolean hasHandling() { 
      return this.handling != null && !this.handling.isEmpty();
    }

    /**
     * @param value {@link #handling} (continuous | dichotomous | ordinal | polychotomous.). This is the underlying object with id, value and extensions. The accessor "getHandling" gives direct access to the value
     */
    public EvidenceVariable setHandlingElement(Enumeration<EvidenceVariableHandling> value) { 
      this.handling = value;
      return this;
    }

    /**
     * @return continuous | dichotomous | ordinal | polychotomous.
     */
    public EvidenceVariableHandling getHandling() { 
      return this.handling == null ? null : this.handling.getValue();
    }

    /**
     * @param value continuous | dichotomous | ordinal | polychotomous.
     */
    public EvidenceVariable setHandling(EvidenceVariableHandling value) { 
      if (value == null)
        this.handling = null;
      else {
        if (this.handling == null)
          this.handling = new Enumeration<EvidenceVariableHandling>(new EvidenceVariableHandlingEnumFactory());
        this.handling.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #category} (A grouping for ordinal or polychotomous variables.)
     */
    public List<EvidenceVariableCategoryComponent> getCategory() { 
      if (this.category == null)
        this.category = new ArrayList<EvidenceVariableCategoryComponent>();
      return this.category;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EvidenceVariable setCategory(List<EvidenceVariableCategoryComponent> theCategory) { 
      this.category = theCategory;
      return this;
    }

    public boolean hasCategory() { 
      if (this.category == null)
        return false;
      for (EvidenceVariableCategoryComponent item : this.category)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public EvidenceVariableCategoryComponent addCategory() { //3
      EvidenceVariableCategoryComponent t = new EvidenceVariableCategoryComponent();
      if (this.category == null)
        this.category = new ArrayList<EvidenceVariableCategoryComponent>();
      this.category.add(t);
      return t;
    }

    public EvidenceVariable addCategory(EvidenceVariableCategoryComponent t) { //3
      if (t == null)
        return this;
      if (this.category == null)
        this.category = new ArrayList<EvidenceVariableCategoryComponent>();
      this.category.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #category}, creating it if it does not already exist {3}
     */
    public EvidenceVariableCategoryComponent getCategoryFirstRep() { 
      if (getCategory().isEmpty()) {
        addCategory();
      }
      return getCategory().get(0);
    }

    /**
     * not supported on this implementation
     */
    @Override
    public int getExperimentalMax() { 
      return 0;
    }
    /**
     * @return {@link #experimental} (A Boolean value to indicate that this evidence variable is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.). This is the underlying object with id, value and extensions. The accessor "getExperimental" gives direct access to the value
     */
    public BooleanType getExperimentalElement() { 
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"experimental\"");
    }

    public boolean hasExperimentalElement() { 
      return false;
    }
    public boolean hasExperimental() {
      return false;
    }

    /**
     * @param value {@link #experimental} (A Boolean value to indicate that this evidence variable is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.). This is the underlying object with id, value and extensions. The accessor "getExperimental" gives direct access to the value
     */
    public EvidenceVariable setExperimentalElement(BooleanType value) { 
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"experimental\"");
    }
    public boolean getExperimental() { 
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"experimental\"");
    }
    /**
     * @param value A Boolean value to indicate that this evidence variable is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.
     */
    public EvidenceVariable setExperimental(boolean value) { 
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"experimental\"");
    }
    /**
     * not supported on this implementation
     */
    @Override
    public int getJurisdictionMax() { 
      return 0;
    }
    /**
     * @return {@link #jurisdiction} (A legal or geographic region in which the evidence variable is intended to be used.)
     */
    public List<CodeableConcept> getJurisdiction() { 
      return new ArrayList<>();
    }
    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EvidenceVariable setJurisdiction(List<CodeableConcept> theJurisdiction) { 
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"jurisdiction\"");
    }
    public boolean hasJurisdiction() { 
      return false;
    }

    public CodeableConcept addJurisdiction() { //3
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"jurisdiction\"");
    }
    public EvidenceVariable addJurisdiction(CodeableConcept t) { //3
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"jurisdiction\"");
    }
    /**
     * @return The first repetition of repeating field {@link #jurisdiction}, creating it if it does not already exist {2}
     */
    public CodeableConcept getJurisdictionFirstRep() { 
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"jurisdiction\"");
    }
    /**
     * not supported on this implementation
     */
    @Override
    public int getPurposeMax() { 
      return 0;
    }
    /**
     * @return {@link #purpose} (Explanation of why this evidence variable is needed and why it has been designed as it has.). This is the underlying object with id, value and extensions. The accessor "getPurpose" gives direct access to the value
     */
    public MarkdownType getPurposeElement() { 
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"purpose\"");
    }

    public boolean hasPurposeElement() { 
      return false;
    }
    public boolean hasPurpose() {
      return false;
    }

    /**
     * @param value {@link #purpose} (Explanation of why this evidence variable is needed and why it has been designed as it has.). This is the underlying object with id, value and extensions. The accessor "getPurpose" gives direct access to the value
     */
    public EvidenceVariable setPurposeElement(MarkdownType value) { 
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"purpose\"");
    }
    public String getPurpose() { 
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"purpose\"");
    }
    /**
     * @param value Explanation of why this evidence variable is needed and why it has been designed as it has.
     */
    public EvidenceVariable setPurpose(String value) { 
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"purpose\"");
    }
    /**
     * not supported on this implementation
     */
    @Override
    public int getCopyrightMax() { 
      return 0;
    }
    /**
     * @return {@link #copyright} (A copyright statement relating to the evidence variable and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the evidence variable.). This is the underlying object with id, value and extensions. The accessor "getCopyright" gives direct access to the value
     */
    public MarkdownType getCopyrightElement() { 
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"copyright\"");
    }

    public boolean hasCopyrightElement() { 
      return false;
    }
    public boolean hasCopyright() {
      return false;
    }

    /**
     * @param value {@link #copyright} (A copyright statement relating to the evidence variable and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the evidence variable.). This is the underlying object with id, value and extensions. The accessor "getCopyright" gives direct access to the value
     */
    public EvidenceVariable setCopyrightElement(MarkdownType value) { 
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"copyright\"");
    }
    public String getCopyright() { 
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"copyright\"");
    }
    /**
     * @param value A copyright statement relating to the evidence variable and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the evidence variable.
     */
    public EvidenceVariable setCopyright(String value) { 
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"copyright\"");
    }
    /**
     * not supported on this implementation
     */
    @Override
    public int getApprovalDateMax() { 
      return 0;
    }
    /**
     * @return {@link #approvalDate} (The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.). This is the underlying object with id, value and extensions. The accessor "getApprovalDate" gives direct access to the value
     */
    public DateType getApprovalDateElement() { 
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"approvalDate\"");
    }

    public boolean hasApprovalDateElement() { 
      return false;
    }
    public boolean hasApprovalDate() {
      return false;
    }

    /**
     * @param value {@link #approvalDate} (The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.). This is the underlying object with id, value and extensions. The accessor "getApprovalDate" gives direct access to the value
     */
    public EvidenceVariable setApprovalDateElement(DateType value) { 
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"approvalDate\"");
    }
    public Date getApprovalDate() { 
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"approvalDate\"");
    }
    /**
     * @param value The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.
     */
    public EvidenceVariable setApprovalDate(Date value) { 
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"approvalDate\"");
    }
    /**
     * not supported on this implementation
     */
    @Override
    public int getLastReviewDateMax() { 
      return 0;
    }
    /**
     * @return {@link #lastReviewDate} (The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.). This is the underlying object with id, value and extensions. The accessor "getLastReviewDate" gives direct access to the value
     */
    public DateType getLastReviewDateElement() { 
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"lastReviewDate\"");
    }

    public boolean hasLastReviewDateElement() { 
      return false;
    }
    public boolean hasLastReviewDate() {
      return false;
    }

    /**
     * @param value {@link #lastReviewDate} (The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.). This is the underlying object with id, value and extensions. The accessor "getLastReviewDate" gives direct access to the value
     */
    public EvidenceVariable setLastReviewDateElement(DateType value) { 
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"lastReviewDate\"");
    }
    public Date getLastReviewDate() { 
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"lastReviewDate\"");
    }
    /**
     * @param value The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.
     */
    public EvidenceVariable setLastReviewDate(Date value) { 
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"lastReviewDate\"");
    }
    /**
     * not supported on this implementation
     */
    @Override
    public int getEffectivePeriodMax() { 
      return 0;
    }
    /**
     * @return {@link #effectivePeriod} (The period during which the evidence variable content was or is planned to be in active use.)
     */
    public Period getEffectivePeriod() { 
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"effectivePeriod\"");
    }
    public boolean hasEffectivePeriod() { 
      return false;
    }
    /**
     * @param value {@link #effectivePeriod} (The period during which the evidence variable content was or is planned to be in active use.)
     */
    public EvidenceVariable setEffectivePeriod(Period value) { 
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"effectivePeriod\"");
    }

    /**
     * not supported on this implementation
     */
    @Override
    public int getTopicMax() { 
      return 0;
    }
    /**
     * @return {@link #topic} (Descriptive topics related to the content of the library. Topics provide a high-level categorization of the library that can be useful for filtering and searching.)
     */
    public List<CodeableConcept> getTopic() { 
      return new ArrayList<>();
    }
    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EvidenceVariable setTopic(List<CodeableConcept> theTopic) { 
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"topic\"");
    }
    public boolean hasTopic() { 
      return false;
    }

    public CodeableConcept addTopic() { //3
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"topic\"");
    }
    public EvidenceVariable addTopic(CodeableConcept t) { //3
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"topic\"");
    }
    /**
     * @return The first repetition of repeating field {@link #topic}, creating it if it does not already exist {2}
     */
    public CodeableConcept getTopicFirstRep() { 
      throw new Error("The resource type \"EvidenceVariable\" does not implement the property \"topic\"");
    }
      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("url", "uri", "An absolute URI that is used to identify this evidence variable when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this evidence variable is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the evidence variable is stored on different servers.", 0, 1, url));
        children.add(new Property("identifier", "Identifier", "A formal identifier that is used to identify this evidence variable when it is represented in other formats, or referenced in a specification, model, design or an instance.", 0, java.lang.Integer.MAX_VALUE, identifier));
        children.add(new Property("version", "string", "The identifier that is used to identify this version of the evidence variable when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the evidence variable author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge assets, refer to the Decision Support Service specification. Note that a version is required for non-experimental active artifacts.", 0, 1, version));
        children.add(new Property("name", "string", "A natural language name identifying the evidence variable. This name should be usable as an identifier for the module by machine processing applications such as code generation.", 0, 1, name));
        children.add(new Property("title", "string", "A short, descriptive, user-friendly title for the evidence variable.", 0, 1, title));
        children.add(new Property("shortTitle", "string", "The short title provides an alternate title for use in informal descriptive contexts where the full, formal title is not necessary.", 0, 1, shortTitle));
        children.add(new Property("subtitle", "string", "An explanatory or alternate title for the EvidenceVariable giving additional information about its content.", 0, 1, subtitle));
        children.add(new Property("status", "code", "The status of this evidence variable. Enables tracking the life-cycle of the content.", 0, 1, status));
        children.add(new Property("date", "dateTime", "The date  (and optionally time) when the evidence variable was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the evidence variable changes.", 0, 1, date));
        children.add(new Property("description", "markdown", "A free text natural language description of the evidence variable from a consumer's perspective.", 0, 1, description));
        children.add(new Property("note", "Annotation", "A human-readable string to clarify or explain concepts about the resource.", 0, java.lang.Integer.MAX_VALUE, note));
        children.add(new Property("useContext", "UsageContext", "The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate evidence variable instances.", 0, java.lang.Integer.MAX_VALUE, useContext));
        children.add(new Property("publisher", "string", "The name of the organization or individual that published the evidence variable.", 0, 1, publisher));
        children.add(new Property("contact", "ContactDetail", "Contact details to assist a user in finding and communicating with the publisher.", 0, java.lang.Integer.MAX_VALUE, contact));
        children.add(new Property("author", "ContactDetail", "An individiual or organization primarily involved in the creation and maintenance of the content.", 0, java.lang.Integer.MAX_VALUE, author));
        children.add(new Property("editor", "ContactDetail", "An individual or organization primarily responsible for internal coherence of the content.", 0, java.lang.Integer.MAX_VALUE, editor));
        children.add(new Property("reviewer", "ContactDetail", "An individual or organization primarily responsible for review of some aspect of the content.", 0, java.lang.Integer.MAX_VALUE, reviewer));
        children.add(new Property("endorser", "ContactDetail", "An individual or organization responsible for officially endorsing the content for use in some setting.", 0, java.lang.Integer.MAX_VALUE, endorser));
        children.add(new Property("relatedArtifact", "RelatedArtifact", "Related artifacts such as additional documentation, justification, or bibliographic references.", 0, java.lang.Integer.MAX_VALUE, relatedArtifact));
        children.add(new Property("actual", "boolean", "True if the actual variable measured, false if a conceptual representation of the intended variable.", 0, 1, actual));
        children.add(new Property("characteristicCombination", "", "Used to specify how two or more characteristics are combined.", 0, 1, characteristicCombination));
        children.add(new Property("characteristic", "", "A characteristic that defines the members of the evidence element. Multiple characteristics are applied with \"and\" semantics.", 0, java.lang.Integer.MAX_VALUE, characteristic));
        children.add(new Property("handling", "code", "continuous | dichotomous | ordinal | polychotomous.", 0, 1, handling));
        children.add(new Property("category", "", "A grouping for ordinal or polychotomous variables.", 0, java.lang.Integer.MAX_VALUE, category));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case 116079: /*url*/  return new Property("url", "uri", "An absolute URI that is used to identify this evidence variable when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this evidence variable is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the evidence variable is stored on different servers.", 0, 1, url);
        case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "A formal identifier that is used to identify this evidence variable when it is represented in other formats, or referenced in a specification, model, design or an instance.", 0, java.lang.Integer.MAX_VALUE, identifier);
        case 351608024: /*version*/  return new Property("version", "string", "The identifier that is used to identify this version of the evidence variable when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the evidence variable author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge assets, refer to the Decision Support Service specification. Note that a version is required for non-experimental active artifacts.", 0, 1, version);
        case 3373707: /*name*/  return new Property("name", "string", "A natural language name identifying the evidence variable. This name should be usable as an identifier for the module by machine processing applications such as code generation.", 0, 1, name);
        case 110371416: /*title*/  return new Property("title", "string", "A short, descriptive, user-friendly title for the evidence variable.", 0, 1, title);
        case 1555503932: /*shortTitle*/  return new Property("shortTitle", "string", "The short title provides an alternate title for use in informal descriptive contexts where the full, formal title is not necessary.", 0, 1, shortTitle);
        case -2060497896: /*subtitle*/  return new Property("subtitle", "string", "An explanatory or alternate title for the EvidenceVariable giving additional information about its content.", 0, 1, subtitle);
        case -892481550: /*status*/  return new Property("status", "code", "The status of this evidence variable. Enables tracking the life-cycle of the content.", 0, 1, status);
        case 3076014: /*date*/  return new Property("date", "dateTime", "The date  (and optionally time) when the evidence variable was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the evidence variable changes.", 0, 1, date);
        case -1724546052: /*description*/  return new Property("description", "markdown", "A free text natural language description of the evidence variable from a consumer's perspective.", 0, 1, description);
        case 3387378: /*note*/  return new Property("note", "Annotation", "A human-readable string to clarify or explain concepts about the resource.", 0, java.lang.Integer.MAX_VALUE, note);
        case -669707736: /*useContext*/  return new Property("useContext", "UsageContext", "The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate evidence variable instances.", 0, java.lang.Integer.MAX_VALUE, useContext);
        case 1447404028: /*publisher*/  return new Property("publisher", "string", "The name of the organization or individual that published the evidence variable.", 0, 1, publisher);
        case 951526432: /*contact*/  return new Property("contact", "ContactDetail", "Contact details to assist a user in finding and communicating with the publisher.", 0, java.lang.Integer.MAX_VALUE, contact);
        case -1406328437: /*author*/  return new Property("author", "ContactDetail", "An individiual or organization primarily involved in the creation and maintenance of the content.", 0, java.lang.Integer.MAX_VALUE, author);
        case -1307827859: /*editor*/  return new Property("editor", "ContactDetail", "An individual or organization primarily responsible for internal coherence of the content.", 0, java.lang.Integer.MAX_VALUE, editor);
        case -261190139: /*reviewer*/  return new Property("reviewer", "ContactDetail", "An individual or organization primarily responsible for review of some aspect of the content.", 0, java.lang.Integer.MAX_VALUE, reviewer);
        case 1740277666: /*endorser*/  return new Property("endorser", "ContactDetail", "An individual or organization responsible for officially endorsing the content for use in some setting.", 0, java.lang.Integer.MAX_VALUE, endorser);
        case 666807069: /*relatedArtifact*/  return new Property("relatedArtifact", "RelatedArtifact", "Related artifacts such as additional documentation, justification, or bibliographic references.", 0, java.lang.Integer.MAX_VALUE, relatedArtifact);
        case -1422939762: /*actual*/  return new Property("actual", "boolean", "True if the actual variable measured, false if a conceptual representation of the intended variable.", 0, 1, actual);
        case -861347276: /*characteristicCombination*/  return new Property("characteristicCombination", "", "Used to specify how two or more characteristics are combined.", 0, 1, characteristicCombination);
        case 366313883: /*characteristic*/  return new Property("characteristic", "", "A characteristic that defines the members of the evidence element. Multiple characteristics are applied with \"and\" semantics.", 0, java.lang.Integer.MAX_VALUE, characteristic);
        case 2072805: /*handling*/  return new Property("handling", "code", "continuous | dichotomous | ordinal | polychotomous.", 0, 1, handling);
        case 50511102: /*category*/  return new Property("category", "", "A grouping for ordinal or polychotomous variables.", 0, java.lang.Integer.MAX_VALUE, category);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 116079: /*url*/ return this.url == null ? new Base[0] : new Base[] {this.url}; // UriType
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case 351608024: /*version*/ return this.version == null ? new Base[0] : new Base[] {this.version}; // StringType
        case 3373707: /*name*/ return this.name == null ? new Base[0] : new Base[] {this.name}; // StringType
        case 110371416: /*title*/ return this.title == null ? new Base[0] : new Base[] {this.title}; // StringType
        case 1555503932: /*shortTitle*/ return this.shortTitle == null ? new Base[0] : new Base[] {this.shortTitle}; // StringType
        case -2060497896: /*subtitle*/ return this.subtitle == null ? new Base[0] : new Base[] {this.subtitle}; // StringType
        case -892481550: /*status*/ return this.status == null ? new Base[0] : new Base[] {this.status}; // Enumeration<PublicationStatus>
        case 3076014: /*date*/ return this.date == null ? new Base[0] : new Base[] {this.date}; // DateTimeType
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // MarkdownType
        case 3387378: /*note*/ return this.note == null ? new Base[0] : this.note.toArray(new Base[this.note.size()]); // Annotation
        case -669707736: /*useContext*/ return this.useContext == null ? new Base[0] : this.useContext.toArray(new Base[this.useContext.size()]); // UsageContext
        case 1447404028: /*publisher*/ return this.publisher == null ? new Base[0] : new Base[] {this.publisher}; // StringType
        case 951526432: /*contact*/ return this.contact == null ? new Base[0] : this.contact.toArray(new Base[this.contact.size()]); // ContactDetail
        case -1406328437: /*author*/ return this.author == null ? new Base[0] : this.author.toArray(new Base[this.author.size()]); // ContactDetail
        case -1307827859: /*editor*/ return this.editor == null ? new Base[0] : this.editor.toArray(new Base[this.editor.size()]); // ContactDetail
        case -261190139: /*reviewer*/ return this.reviewer == null ? new Base[0] : this.reviewer.toArray(new Base[this.reviewer.size()]); // ContactDetail
        case 1740277666: /*endorser*/ return this.endorser == null ? new Base[0] : this.endorser.toArray(new Base[this.endorser.size()]); // ContactDetail
        case 666807069: /*relatedArtifact*/ return this.relatedArtifact == null ? new Base[0] : this.relatedArtifact.toArray(new Base[this.relatedArtifact.size()]); // RelatedArtifact
        case -1422939762: /*actual*/ return this.actual == null ? new Base[0] : new Base[] {this.actual}; // BooleanType
        case -861347276: /*characteristicCombination*/ return this.characteristicCombination == null ? new Base[0] : new Base[] {this.characteristicCombination}; // EvidenceVariableCharacteristicCombinationComponent
        case 366313883: /*characteristic*/ return this.characteristic == null ? new Base[0] : this.characteristic.toArray(new Base[this.characteristic.size()]); // EvidenceVariableCharacteristicComponent
        case 2072805: /*handling*/ return this.handling == null ? new Base[0] : new Base[] {this.handling}; // Enumeration<EvidenceVariableHandling>
        case 50511102: /*category*/ return this.category == null ? new Base[0] : this.category.toArray(new Base[this.category.size()]); // EvidenceVariableCategoryComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 116079: // url
          this.url = TypeConvertor.castToUri(value); // UriType
          return value;
        case -1618432855: // identifier
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value)); // Identifier
          return value;
        case 351608024: // version
          this.version = TypeConvertor.castToString(value); // StringType
          return value;
        case 3373707: // name
          this.name = TypeConvertor.castToString(value); // StringType
          return value;
        case 110371416: // title
          this.title = TypeConvertor.castToString(value); // StringType
          return value;
        case 1555503932: // shortTitle
          this.shortTitle = TypeConvertor.castToString(value); // StringType
          return value;
        case -2060497896: // subtitle
          this.subtitle = TypeConvertor.castToString(value); // StringType
          return value;
        case -892481550: // status
          value = new PublicationStatusEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<PublicationStatus>
          return value;
        case 3076014: // date
          this.date = TypeConvertor.castToDateTime(value); // DateTimeType
          return value;
        case -1724546052: // description
          this.description = TypeConvertor.castToMarkdown(value); // MarkdownType
          return value;
        case 3387378: // note
          this.getNote().add(TypeConvertor.castToAnnotation(value)); // Annotation
          return value;
        case -669707736: // useContext
          this.getUseContext().add(TypeConvertor.castToUsageContext(value)); // UsageContext
          return value;
        case 1447404028: // publisher
          this.publisher = TypeConvertor.castToString(value); // StringType
          return value;
        case 951526432: // contact
          this.getContact().add(TypeConvertor.castToContactDetail(value)); // ContactDetail
          return value;
        case -1406328437: // author
          this.getAuthor().add(TypeConvertor.castToContactDetail(value)); // ContactDetail
          return value;
        case -1307827859: // editor
          this.getEditor().add(TypeConvertor.castToContactDetail(value)); // ContactDetail
          return value;
        case -261190139: // reviewer
          this.getReviewer().add(TypeConvertor.castToContactDetail(value)); // ContactDetail
          return value;
        case 1740277666: // endorser
          this.getEndorser().add(TypeConvertor.castToContactDetail(value)); // ContactDetail
          return value;
        case 666807069: // relatedArtifact
          this.getRelatedArtifact().add(TypeConvertor.castToRelatedArtifact(value)); // RelatedArtifact
          return value;
        case -1422939762: // actual
          this.actual = TypeConvertor.castToBoolean(value); // BooleanType
          return value;
        case -861347276: // characteristicCombination
          this.characteristicCombination = (EvidenceVariableCharacteristicCombinationComponent) value; // EvidenceVariableCharacteristicCombinationComponent
          return value;
        case 366313883: // characteristic
          this.getCharacteristic().add((EvidenceVariableCharacteristicComponent) value); // EvidenceVariableCharacteristicComponent
          return value;
        case 2072805: // handling
          value = new EvidenceVariableHandlingEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.handling = (Enumeration) value; // Enumeration<EvidenceVariableHandling>
          return value;
        case 50511102: // category
          this.getCategory().add((EvidenceVariableCategoryComponent) value); // EvidenceVariableCategoryComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("url")) {
          this.url = TypeConvertor.castToUri(value); // UriType
        } else if (name.equals("identifier")) {
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value));
        } else if (name.equals("version")) {
          this.version = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("name")) {
          this.name = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("title")) {
          this.title = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("shortTitle")) {
          this.shortTitle = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("subtitle")) {
          this.subtitle = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("status")) {
          value = new PublicationStatusEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<PublicationStatus>
        } else if (name.equals("date")) {
          this.date = TypeConvertor.castToDateTime(value); // DateTimeType
        } else if (name.equals("description")) {
          this.description = TypeConvertor.castToMarkdown(value); // MarkdownType
        } else if (name.equals("note")) {
          this.getNote().add(TypeConvertor.castToAnnotation(value));
        } else if (name.equals("useContext")) {
          this.getUseContext().add(TypeConvertor.castToUsageContext(value));
        } else if (name.equals("publisher")) {
          this.publisher = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("contact")) {
          this.getContact().add(TypeConvertor.castToContactDetail(value));
        } else if (name.equals("author")) {
          this.getAuthor().add(TypeConvertor.castToContactDetail(value));
        } else if (name.equals("editor")) {
          this.getEditor().add(TypeConvertor.castToContactDetail(value));
        } else if (name.equals("reviewer")) {
          this.getReviewer().add(TypeConvertor.castToContactDetail(value));
        } else if (name.equals("endorser")) {
          this.getEndorser().add(TypeConvertor.castToContactDetail(value));
        } else if (name.equals("relatedArtifact")) {
          this.getRelatedArtifact().add(TypeConvertor.castToRelatedArtifact(value));
        } else if (name.equals("actual")) {
          this.actual = TypeConvertor.castToBoolean(value); // BooleanType
        } else if (name.equals("characteristicCombination")) {
          this.characteristicCombination = (EvidenceVariableCharacteristicCombinationComponent) value; // EvidenceVariableCharacteristicCombinationComponent
        } else if (name.equals("characteristic")) {
          this.getCharacteristic().add((EvidenceVariableCharacteristicComponent) value);
        } else if (name.equals("handling")) {
          value = new EvidenceVariableHandlingEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.handling = (Enumeration) value; // Enumeration<EvidenceVariableHandling>
        } else if (name.equals("category")) {
          this.getCategory().add((EvidenceVariableCategoryComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 116079:  return getUrlElement();
        case -1618432855:  return addIdentifier(); 
        case 351608024:  return getVersionElement();
        case 3373707:  return getNameElement();
        case 110371416:  return getTitleElement();
        case 1555503932:  return getShortTitleElement();
        case -2060497896:  return getSubtitleElement();
        case -892481550:  return getStatusElement();
        case 3076014:  return getDateElement();
        case -1724546052:  return getDescriptionElement();
        case 3387378:  return addNote(); 
        case -669707736:  return addUseContext(); 
        case 1447404028:  return getPublisherElement();
        case 951526432:  return addContact(); 
        case -1406328437:  return addAuthor(); 
        case -1307827859:  return addEditor(); 
        case -261190139:  return addReviewer(); 
        case 1740277666:  return addEndorser(); 
        case 666807069:  return addRelatedArtifact(); 
        case -1422939762:  return getActualElement();
        case -861347276:  return getCharacteristicCombination();
        case 366313883:  return addCharacteristic(); 
        case 2072805:  return getHandlingElement();
        case 50511102:  return addCategory(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 116079: /*url*/ return new String[] {"uri"};
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case 351608024: /*version*/ return new String[] {"string"};
        case 3373707: /*name*/ return new String[] {"string"};
        case 110371416: /*title*/ return new String[] {"string"};
        case 1555503932: /*shortTitle*/ return new String[] {"string"};
        case -2060497896: /*subtitle*/ return new String[] {"string"};
        case -892481550: /*status*/ return new String[] {"code"};
        case 3076014: /*date*/ return new String[] {"dateTime"};
        case -1724546052: /*description*/ return new String[] {"markdown"};
        case 3387378: /*note*/ return new String[] {"Annotation"};
        case -669707736: /*useContext*/ return new String[] {"UsageContext"};
        case 1447404028: /*publisher*/ return new String[] {"string"};
        case 951526432: /*contact*/ return new String[] {"ContactDetail"};
        case -1406328437: /*author*/ return new String[] {"ContactDetail"};
        case -1307827859: /*editor*/ return new String[] {"ContactDetail"};
        case -261190139: /*reviewer*/ return new String[] {"ContactDetail"};
        case 1740277666: /*endorser*/ return new String[] {"ContactDetail"};
        case 666807069: /*relatedArtifact*/ return new String[] {"RelatedArtifact"};
        case -1422939762: /*actual*/ return new String[] {"boolean"};
        case -861347276: /*characteristicCombination*/ return new String[] {};
        case 366313883: /*characteristic*/ return new String[] {};
        case 2072805: /*handling*/ return new String[] {"code"};
        case 50511102: /*category*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("url")) {
          throw new FHIRException("Cannot call addChild on a primitive type EvidenceVariable.url");
        }
        else if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("version")) {
          throw new FHIRException("Cannot call addChild on a primitive type EvidenceVariable.version");
        }
        else if (name.equals("name")) {
          throw new FHIRException("Cannot call addChild on a primitive type EvidenceVariable.name");
        }
        else if (name.equals("title")) {
          throw new FHIRException("Cannot call addChild on a primitive type EvidenceVariable.title");
        }
        else if (name.equals("shortTitle")) {
          throw new FHIRException("Cannot call addChild on a primitive type EvidenceVariable.shortTitle");
        }
        else if (name.equals("subtitle")) {
          throw new FHIRException("Cannot call addChild on a primitive type EvidenceVariable.subtitle");
        }
        else if (name.equals("status")) {
          throw new FHIRException("Cannot call addChild on a primitive type EvidenceVariable.status");
        }
        else if (name.equals("date")) {
          throw new FHIRException("Cannot call addChild on a primitive type EvidenceVariable.date");
        }
        else if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a primitive type EvidenceVariable.description");
        }
        else if (name.equals("note")) {
          return addNote();
        }
        else if (name.equals("useContext")) {
          return addUseContext();
        }
        else if (name.equals("publisher")) {
          throw new FHIRException("Cannot call addChild on a primitive type EvidenceVariable.publisher");
        }
        else if (name.equals("contact")) {
          return addContact();
        }
        else if (name.equals("author")) {
          return addAuthor();
        }
        else if (name.equals("editor")) {
          return addEditor();
        }
        else if (name.equals("reviewer")) {
          return addReviewer();
        }
        else if (name.equals("endorser")) {
          return addEndorser();
        }
        else if (name.equals("relatedArtifact")) {
          return addRelatedArtifact();
        }
        else if (name.equals("actual")) {
          throw new FHIRException("Cannot call addChild on a primitive type EvidenceVariable.actual");
        }
        else if (name.equals("characteristicCombination")) {
          this.characteristicCombination = new EvidenceVariableCharacteristicCombinationComponent();
          return this.characteristicCombination;
        }
        else if (name.equals("characteristic")) {
          return addCharacteristic();
        }
        else if (name.equals("handling")) {
          throw new FHIRException("Cannot call addChild on a primitive type EvidenceVariable.handling");
        }
        else if (name.equals("category")) {
          return addCategory();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "EvidenceVariable";

  }

      public EvidenceVariable copy() {
        EvidenceVariable dst = new EvidenceVariable();
        copyValues(dst);
        return dst;
      }

      public void copyValues(EvidenceVariable dst) {
        super.copyValues(dst);
        dst.url = url == null ? null : url.copy();
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.version = version == null ? null : version.copy();
        dst.name = name == null ? null : name.copy();
        dst.title = title == null ? null : title.copy();
        dst.shortTitle = shortTitle == null ? null : shortTitle.copy();
        dst.subtitle = subtitle == null ? null : subtitle.copy();
        dst.status = status == null ? null : status.copy();
        dst.date = date == null ? null : date.copy();
        dst.description = description == null ? null : description.copy();
        if (note != null) {
          dst.note = new ArrayList<Annotation>();
          for (Annotation i : note)
            dst.note.add(i.copy());
        };
        if (useContext != null) {
          dst.useContext = new ArrayList<UsageContext>();
          for (UsageContext i : useContext)
            dst.useContext.add(i.copy());
        };
        dst.publisher = publisher == null ? null : publisher.copy();
        if (contact != null) {
          dst.contact = new ArrayList<ContactDetail>();
          for (ContactDetail i : contact)
            dst.contact.add(i.copy());
        };
        if (author != null) {
          dst.author = new ArrayList<ContactDetail>();
          for (ContactDetail i : author)
            dst.author.add(i.copy());
        };
        if (editor != null) {
          dst.editor = new ArrayList<ContactDetail>();
          for (ContactDetail i : editor)
            dst.editor.add(i.copy());
        };
        if (reviewer != null) {
          dst.reviewer = new ArrayList<ContactDetail>();
          for (ContactDetail i : reviewer)
            dst.reviewer.add(i.copy());
        };
        if (endorser != null) {
          dst.endorser = new ArrayList<ContactDetail>();
          for (ContactDetail i : endorser)
            dst.endorser.add(i.copy());
        };
        if (relatedArtifact != null) {
          dst.relatedArtifact = new ArrayList<RelatedArtifact>();
          for (RelatedArtifact i : relatedArtifact)
            dst.relatedArtifact.add(i.copy());
        };
        dst.actual = actual == null ? null : actual.copy();
        dst.characteristicCombination = characteristicCombination == null ? null : characteristicCombination.copy();
        if (characteristic != null) {
          dst.characteristic = new ArrayList<EvidenceVariableCharacteristicComponent>();
          for (EvidenceVariableCharacteristicComponent i : characteristic)
            dst.characteristic.add(i.copy());
        };
        dst.handling = handling == null ? null : handling.copy();
        if (category != null) {
          dst.category = new ArrayList<EvidenceVariableCategoryComponent>();
          for (EvidenceVariableCategoryComponent i : category)
            dst.category.add(i.copy());
        };
      }

      protected EvidenceVariable typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof EvidenceVariable))
          return false;
        EvidenceVariable o = (EvidenceVariable) other_;
        return compareDeep(url, o.url, true) && compareDeep(identifier, o.identifier, true) && compareDeep(version, o.version, true)
           && compareDeep(name, o.name, true) && compareDeep(title, o.title, true) && compareDeep(shortTitle, o.shortTitle, true)
           && compareDeep(subtitle, o.subtitle, true) && compareDeep(status, o.status, true) && compareDeep(date, o.date, true)
           && compareDeep(description, o.description, true) && compareDeep(note, o.note, true) && compareDeep(useContext, o.useContext, true)
           && compareDeep(publisher, o.publisher, true) && compareDeep(contact, o.contact, true) && compareDeep(author, o.author, true)
           && compareDeep(editor, o.editor, true) && compareDeep(reviewer, o.reviewer, true) && compareDeep(endorser, o.endorser, true)
           && compareDeep(relatedArtifact, o.relatedArtifact, true) && compareDeep(actual, o.actual, true)
           && compareDeep(characteristicCombination, o.characteristicCombination, true) && compareDeep(characteristic, o.characteristic, true)
           && compareDeep(handling, o.handling, true) && compareDeep(category, o.category, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof EvidenceVariable))
          return false;
        EvidenceVariable o = (EvidenceVariable) other_;
        return compareValues(url, o.url, true) && compareValues(version, o.version, true) && compareValues(name, o.name, true)
           && compareValues(title, o.title, true) && compareValues(shortTitle, o.shortTitle, true) && compareValues(subtitle, o.subtitle, true)
           && compareValues(status, o.status, true) && compareValues(date, o.date, true) && compareValues(description, o.description, true)
           && compareValues(publisher, o.publisher, true) && compareValues(actual, o.actual, true) && compareValues(handling, o.handling, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(url, identifier, version
          , name, title, shortTitle, subtitle, status, date, description, note, useContext
          , publisher, contact, author, editor, reviewer, endorser, relatedArtifact, actual
          , characteristicCombination, characteristic, handling, category);
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.EvidenceVariable;
   }

 /**
   * Search parameter: <b>composed-of</b>
   * <p>
   * Description: <b>What resource is being referenced</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EvidenceVariable.relatedArtifact.where(type='composed-of').resource</b><br>
   * </p>
   */
  @SearchParamDefinition(name="composed-of", path="EvidenceVariable.relatedArtifact.where(type='composed-of').resource", description="What resource is being referenced", type="reference", target={Account.class, ActivityDefinition.class, AdministrableProductDefinition.class, AdverseEvent.class, AllergyIntolerance.class, Appointment.class, AppointmentResponse.class, ArtifactAssessment.class, AuditEvent.class, Basic.class, Binary.class, BiologicallyDerivedProduct.class, BodyStructure.class, Bundle.class, CapabilityStatement.class, CapabilityStatement2.class, CarePlan.class, CareTeam.class, ChargeItem.class, ChargeItemDefinition.class, Citation.class, Claim.class, ClaimResponse.class, ClinicalImpression.class, ClinicalUseDefinition.class, ClinicalUseIssue.class, CodeSystem.class, Communication.class, CommunicationRequest.class, CompartmentDefinition.class, Composition.class, ConceptMap.class, ConceptMap2.class, Condition.class, ConditionDefinition.class, Consent.class, Contract.class, Coverage.class, CoverageEligibilityRequest.class, CoverageEligibilityResponse.class, DetectedIssue.class, Device.class, DeviceDefinition.class, DeviceDispense.class, DeviceMetric.class, DeviceRequest.class, DeviceUsage.class, DiagnosticReport.class, DocumentManifest.class, DocumentReference.class, Encounter.class, Endpoint.class, EnrollmentRequest.class, EnrollmentResponse.class, EpisodeOfCare.class, EventDefinition.class, Evidence.class, EvidenceReport.class, EvidenceVariable.class, ExampleScenario.class, ExplanationOfBenefit.class, FamilyMemberHistory.class, Flag.class, Goal.class, GraphDefinition.class, Group.class, GuidanceResponse.class, HealthcareService.class, ImagingSelection.class, ImagingStudy.class, Immunization.class, ImmunizationEvaluation.class, ImmunizationRecommendation.class, ImplementationGuide.class, Ingredient.class, InsurancePlan.class, InventoryReport.class, Invoice.class, Library.class, Linkage.class, ListResource.class, Location.class, ManufacturedItemDefinition.class, Measure.class, MeasureReport.class, Medication.class, MedicationAdministration.class, MedicationDispense.class, MedicationKnowledge.class, MedicationRequest.class, MedicationUsage.class, MedicinalProductDefinition.class, MessageDefinition.class, MessageHeader.class, MolecularSequence.class, NamingSystem.class, NutritionIntake.class, NutritionOrder.class, NutritionProduct.class, Observation.class, ObservationDefinition.class, OperationDefinition.class, OperationOutcome.class, Organization.class, OrganizationAffiliation.class, PackagedProductDefinition.class, Patient.class, PaymentNotice.class, PaymentReconciliation.class, Permission.class, Person.class, PlanDefinition.class, Practitioner.class, PractitionerRole.class, Procedure.class, Provenance.class, Questionnaire.class, QuestionnaireResponse.class, RegulatedAuthorization.class, RelatedPerson.class, RequestGroup.class, ResearchStudy.class, ResearchSubject.class, RiskAssessment.class, Schedule.class, SearchParameter.class, ServiceRequest.class, Slot.class, Specimen.class, SpecimenDefinition.class, StructureDefinition.class, StructureMap.class, Subscription.class, SubscriptionStatus.class, SubscriptionTopic.class, Substance.class, SubstanceDefinition.class, SubstanceNucleicAcid.class, SubstancePolymer.class, SubstanceProtein.class, SubstanceReferenceInformation.class, SubstanceSourceMaterial.class, SupplyDelivery.class, SupplyRequest.class, Task.class, TerminologyCapabilities.class, TestReport.class, TestScript.class, ValueSet.class, VerificationResult.class, VisionPrescription.class } )
  public static final String SP_COMPOSED_OF = "composed-of";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>composed-of</b>
   * <p>
   * Description: <b>What resource is being referenced</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EvidenceVariable.relatedArtifact.where(type='composed-of').resource</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam COMPOSED_OF = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_COMPOSED_OF);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>EvidenceVariable:composed-of</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_COMPOSED_OF = new ca.uhn.fhir.model.api.Include("EvidenceVariable:composed-of").toLocked();

 /**
   * Search parameter: <b>context-quantity</b>
   * <p>
   * Description: <b>A quantity- or range-valued use context assigned to the evidence variable</b><br>
   * Type: <b>quantity</b><br>
   * Path: <b>(EvidenceVariable.useContext.value as Quantity) | (EvidenceVariable.useContext.value as Range)</b><br>
   * </p>
   */
  @SearchParamDefinition(name="context-quantity", path="(EvidenceVariable.useContext.value as Quantity) | (EvidenceVariable.useContext.value as Range)", description="A quantity- or range-valued use context assigned to the evidence variable", type="quantity" )
  public static final String SP_CONTEXT_QUANTITY = "context-quantity";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>context-quantity</b>
   * <p>
   * Description: <b>A quantity- or range-valued use context assigned to the evidence variable</b><br>
   * Type: <b>quantity</b><br>
   * Path: <b>(EvidenceVariable.useContext.value as Quantity) | (EvidenceVariable.useContext.value as Range)</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.QuantityClientParam CONTEXT_QUANTITY = new ca.uhn.fhir.rest.gclient.QuantityClientParam(SP_CONTEXT_QUANTITY);

 /**
   * Search parameter: <b>context-type-quantity</b>
   * <p>
   * Description: <b>A use context type and quantity- or range-based value assigned to the evidence variable</b><br>
   * Type: <b>composite</b><br>
   * Path: <b>EvidenceVariable.useContext</b><br>
   * </p>
   */
  @SearchParamDefinition(name="context-type-quantity", path="EvidenceVariable.useContext", description="A use context type and quantity- or range-based value assigned to the evidence variable", type="composite", compositeOf={"context-type", "context-quantity"} )
  public static final String SP_CONTEXT_TYPE_QUANTITY = "context-type-quantity";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>context-type-quantity</b>
   * <p>
   * Description: <b>A use context type and quantity- or range-based value assigned to the evidence variable</b><br>
   * Type: <b>composite</b><br>
   * Path: <b>EvidenceVariable.useContext</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.QuantityClientParam> CONTEXT_TYPE_QUANTITY = new ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.QuantityClientParam>(SP_CONTEXT_TYPE_QUANTITY);

 /**
   * Search parameter: <b>context-type-value</b>
   * <p>
   * Description: <b>A use context type and value assigned to the evidence variable</b><br>
   * Type: <b>composite</b><br>
   * Path: <b>EvidenceVariable.useContext</b><br>
   * </p>
   */
  @SearchParamDefinition(name="context-type-value", path="EvidenceVariable.useContext", description="A use context type and value assigned to the evidence variable", type="composite", compositeOf={"context-type", "context"} )
  public static final String SP_CONTEXT_TYPE_VALUE = "context-type-value";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>context-type-value</b>
   * <p>
   * Description: <b>A use context type and value assigned to the evidence variable</b><br>
   * Type: <b>composite</b><br>
   * Path: <b>EvidenceVariable.useContext</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.TokenClientParam> CONTEXT_TYPE_VALUE = new ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.TokenClientParam>(SP_CONTEXT_TYPE_VALUE);

 /**
   * Search parameter: <b>context-type</b>
   * <p>
   * Description: <b>A type of use context assigned to the evidence variable</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EvidenceVariable.useContext.code</b><br>
   * </p>
   */
  @SearchParamDefinition(name="context-type", path="EvidenceVariable.useContext.code", description="A type of use context assigned to the evidence variable", type="token" )
  public static final String SP_CONTEXT_TYPE = "context-type";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>context-type</b>
   * <p>
   * Description: <b>A type of use context assigned to the evidence variable</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EvidenceVariable.useContext.code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CONTEXT_TYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_CONTEXT_TYPE);

 /**
   * Search parameter: <b>context</b>
   * <p>
   * Description: <b>A use context assigned to the evidence variable</b><br>
   * Type: <b>token</b><br>
   * Path: <b>(EvidenceVariable.useContext.value as CodeableConcept)</b><br>
   * </p>
   */
  @SearchParamDefinition(name="context", path="(EvidenceVariable.useContext.value as CodeableConcept)", description="A use context assigned to the evidence variable", type="token" )
  public static final String SP_CONTEXT = "context";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>context</b>
   * <p>
   * Description: <b>A use context assigned to the evidence variable</b><br>
   * Type: <b>token</b><br>
   * Path: <b>(EvidenceVariable.useContext.value as CodeableConcept)</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CONTEXT = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_CONTEXT);

 /**
   * Search parameter: <b>date</b>
   * <p>
   * Description: <b>The evidence variable publication date</b><br>
   * Type: <b>date</b><br>
   * Path: <b>EvidenceVariable.date</b><br>
   * </p>
   */
  @SearchParamDefinition(name="date", path="EvidenceVariable.date", description="The evidence variable publication date", type="date" )
  public static final String SP_DATE = "date";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>date</b>
   * <p>
   * Description: <b>The evidence variable publication date</b><br>
   * Type: <b>date</b><br>
   * Path: <b>EvidenceVariable.date</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam DATE = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_DATE);

 /**
   * Search parameter: <b>depends-on</b>
   * <p>
   * Description: <b>What resource is being referenced</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EvidenceVariable.relatedArtifact.where(type='depends-on').resource</b><br>
   * </p>
   */
  @SearchParamDefinition(name="depends-on", path="EvidenceVariable.relatedArtifact.where(type='depends-on').resource", description="What resource is being referenced", type="reference", target={Account.class, ActivityDefinition.class, AdministrableProductDefinition.class, AdverseEvent.class, AllergyIntolerance.class, Appointment.class, AppointmentResponse.class, ArtifactAssessment.class, AuditEvent.class, Basic.class, Binary.class, BiologicallyDerivedProduct.class, BodyStructure.class, Bundle.class, CapabilityStatement.class, CapabilityStatement2.class, CarePlan.class, CareTeam.class, ChargeItem.class, ChargeItemDefinition.class, Citation.class, Claim.class, ClaimResponse.class, ClinicalImpression.class, ClinicalUseDefinition.class, ClinicalUseIssue.class, CodeSystem.class, Communication.class, CommunicationRequest.class, CompartmentDefinition.class, Composition.class, ConceptMap.class, ConceptMap2.class, Condition.class, ConditionDefinition.class, Consent.class, Contract.class, Coverage.class, CoverageEligibilityRequest.class, CoverageEligibilityResponse.class, DetectedIssue.class, Device.class, DeviceDefinition.class, DeviceDispense.class, DeviceMetric.class, DeviceRequest.class, DeviceUsage.class, DiagnosticReport.class, DocumentManifest.class, DocumentReference.class, Encounter.class, Endpoint.class, EnrollmentRequest.class, EnrollmentResponse.class, EpisodeOfCare.class, EventDefinition.class, Evidence.class, EvidenceReport.class, EvidenceVariable.class, ExampleScenario.class, ExplanationOfBenefit.class, FamilyMemberHistory.class, Flag.class, Goal.class, GraphDefinition.class, Group.class, GuidanceResponse.class, HealthcareService.class, ImagingSelection.class, ImagingStudy.class, Immunization.class, ImmunizationEvaluation.class, ImmunizationRecommendation.class, ImplementationGuide.class, Ingredient.class, InsurancePlan.class, InventoryReport.class, Invoice.class, Library.class, Linkage.class, ListResource.class, Location.class, ManufacturedItemDefinition.class, Measure.class, MeasureReport.class, Medication.class, MedicationAdministration.class, MedicationDispense.class, MedicationKnowledge.class, MedicationRequest.class, MedicationUsage.class, MedicinalProductDefinition.class, MessageDefinition.class, MessageHeader.class, MolecularSequence.class, NamingSystem.class, NutritionIntake.class, NutritionOrder.class, NutritionProduct.class, Observation.class, ObservationDefinition.class, OperationDefinition.class, OperationOutcome.class, Organization.class, OrganizationAffiliation.class, PackagedProductDefinition.class, Patient.class, PaymentNotice.class, PaymentReconciliation.class, Permission.class, Person.class, PlanDefinition.class, Practitioner.class, PractitionerRole.class, Procedure.class, Provenance.class, Questionnaire.class, QuestionnaireResponse.class, RegulatedAuthorization.class, RelatedPerson.class, RequestGroup.class, ResearchStudy.class, ResearchSubject.class, RiskAssessment.class, Schedule.class, SearchParameter.class, ServiceRequest.class, Slot.class, Specimen.class, SpecimenDefinition.class, StructureDefinition.class, StructureMap.class, Subscription.class, SubscriptionStatus.class, SubscriptionTopic.class, Substance.class, SubstanceDefinition.class, SubstanceNucleicAcid.class, SubstancePolymer.class, SubstanceProtein.class, SubstanceReferenceInformation.class, SubstanceSourceMaterial.class, SupplyDelivery.class, SupplyRequest.class, Task.class, TerminologyCapabilities.class, TestReport.class, TestScript.class, ValueSet.class, VerificationResult.class, VisionPrescription.class } )
  public static final String SP_DEPENDS_ON = "depends-on";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>depends-on</b>
   * <p>
   * Description: <b>What resource is being referenced</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EvidenceVariable.relatedArtifact.where(type='depends-on').resource</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam DEPENDS_ON = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_DEPENDS_ON);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>EvidenceVariable:depends-on</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_DEPENDS_ON = new ca.uhn.fhir.model.api.Include("EvidenceVariable:depends-on").toLocked();

 /**
   * Search parameter: <b>derived-from</b>
   * <p>
   * Description: <b>What resource is being referenced</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EvidenceVariable.relatedArtifact.where(type='derived-from').resource</b><br>
   * </p>
   */
  @SearchParamDefinition(name="derived-from", path="EvidenceVariable.relatedArtifact.where(type='derived-from').resource", description="What resource is being referenced", type="reference", target={Account.class, ActivityDefinition.class, AdministrableProductDefinition.class, AdverseEvent.class, AllergyIntolerance.class, Appointment.class, AppointmentResponse.class, ArtifactAssessment.class, AuditEvent.class, Basic.class, Binary.class, BiologicallyDerivedProduct.class, BodyStructure.class, Bundle.class, CapabilityStatement.class, CapabilityStatement2.class, CarePlan.class, CareTeam.class, ChargeItem.class, ChargeItemDefinition.class, Citation.class, Claim.class, ClaimResponse.class, ClinicalImpression.class, ClinicalUseDefinition.class, ClinicalUseIssue.class, CodeSystem.class, Communication.class, CommunicationRequest.class, CompartmentDefinition.class, Composition.class, ConceptMap.class, ConceptMap2.class, Condition.class, ConditionDefinition.class, Consent.class, Contract.class, Coverage.class, CoverageEligibilityRequest.class, CoverageEligibilityResponse.class, DetectedIssue.class, Device.class, DeviceDefinition.class, DeviceDispense.class, DeviceMetric.class, DeviceRequest.class, DeviceUsage.class, DiagnosticReport.class, DocumentManifest.class, DocumentReference.class, Encounter.class, Endpoint.class, EnrollmentRequest.class, EnrollmentResponse.class, EpisodeOfCare.class, EventDefinition.class, Evidence.class, EvidenceReport.class, EvidenceVariable.class, ExampleScenario.class, ExplanationOfBenefit.class, FamilyMemberHistory.class, Flag.class, Goal.class, GraphDefinition.class, Group.class, GuidanceResponse.class, HealthcareService.class, ImagingSelection.class, ImagingStudy.class, Immunization.class, ImmunizationEvaluation.class, ImmunizationRecommendation.class, ImplementationGuide.class, Ingredient.class, InsurancePlan.class, InventoryReport.class, Invoice.class, Library.class, Linkage.class, ListResource.class, Location.class, ManufacturedItemDefinition.class, Measure.class, MeasureReport.class, Medication.class, MedicationAdministration.class, MedicationDispense.class, MedicationKnowledge.class, MedicationRequest.class, MedicationUsage.class, MedicinalProductDefinition.class, MessageDefinition.class, MessageHeader.class, MolecularSequence.class, NamingSystem.class, NutritionIntake.class, NutritionOrder.class, NutritionProduct.class, Observation.class, ObservationDefinition.class, OperationDefinition.class, OperationOutcome.class, Organization.class, OrganizationAffiliation.class, PackagedProductDefinition.class, Patient.class, PaymentNotice.class, PaymentReconciliation.class, Permission.class, Person.class, PlanDefinition.class, Practitioner.class, PractitionerRole.class, Procedure.class, Provenance.class, Questionnaire.class, QuestionnaireResponse.class, RegulatedAuthorization.class, RelatedPerson.class, RequestGroup.class, ResearchStudy.class, ResearchSubject.class, RiskAssessment.class, Schedule.class, SearchParameter.class, ServiceRequest.class, Slot.class, Specimen.class, SpecimenDefinition.class, StructureDefinition.class, StructureMap.class, Subscription.class, SubscriptionStatus.class, SubscriptionTopic.class, Substance.class, SubstanceDefinition.class, SubstanceNucleicAcid.class, SubstancePolymer.class, SubstanceProtein.class, SubstanceReferenceInformation.class, SubstanceSourceMaterial.class, SupplyDelivery.class, SupplyRequest.class, Task.class, TerminologyCapabilities.class, TestReport.class, TestScript.class, ValueSet.class, VerificationResult.class, VisionPrescription.class } )
  public static final String SP_DERIVED_FROM = "derived-from";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>derived-from</b>
   * <p>
   * Description: <b>What resource is being referenced</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EvidenceVariable.relatedArtifact.where(type='derived-from').resource</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam DERIVED_FROM = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_DERIVED_FROM);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>EvidenceVariable:derived-from</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_DERIVED_FROM = new ca.uhn.fhir.model.api.Include("EvidenceVariable:derived-from").toLocked();

 /**
   * Search parameter: <b>description</b>
   * <p>
   * Description: <b>The description of the evidence variable</b><br>
   * Type: <b>string</b><br>
   * Path: <b>EvidenceVariable.description</b><br>
   * </p>
   */
  @SearchParamDefinition(name="description", path="EvidenceVariable.description", description="The description of the evidence variable", type="string" )
  public static final String SP_DESCRIPTION = "description";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>description</b>
   * <p>
   * Description: <b>The description of the evidence variable</b><br>
   * Type: <b>string</b><br>
   * Path: <b>EvidenceVariable.description</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam DESCRIPTION = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_DESCRIPTION);

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>External identifier for the evidence variable</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EvidenceVariable.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="EvidenceVariable.identifier", description="External identifier for the evidence variable", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>External identifier for the evidence variable</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EvidenceVariable.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);

 /**
   * Search parameter: <b>name</b>
   * <p>
   * Description: <b>Computationally friendly name of the evidence variable</b><br>
   * Type: <b>string</b><br>
   * Path: <b>EvidenceVariable.name</b><br>
   * </p>
   */
  @SearchParamDefinition(name="name", path="EvidenceVariable.name", description="Computationally friendly name of the evidence variable", type="string" )
  public static final String SP_NAME = "name";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>name</b>
   * <p>
   * Description: <b>Computationally friendly name of the evidence variable</b><br>
   * Type: <b>string</b><br>
   * Path: <b>EvidenceVariable.name</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam NAME = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_NAME);

 /**
   * Search parameter: <b>predecessor</b>
   * <p>
   * Description: <b>What resource is being referenced</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EvidenceVariable.relatedArtifact.where(type='predecessor').resource</b><br>
   * </p>
   */
  @SearchParamDefinition(name="predecessor", path="EvidenceVariable.relatedArtifact.where(type='predecessor').resource", description="What resource is being referenced", type="reference", target={Account.class, ActivityDefinition.class, AdministrableProductDefinition.class, AdverseEvent.class, AllergyIntolerance.class, Appointment.class, AppointmentResponse.class, ArtifactAssessment.class, AuditEvent.class, Basic.class, Binary.class, BiologicallyDerivedProduct.class, BodyStructure.class, Bundle.class, CapabilityStatement.class, CapabilityStatement2.class, CarePlan.class, CareTeam.class, ChargeItem.class, ChargeItemDefinition.class, Citation.class, Claim.class, ClaimResponse.class, ClinicalImpression.class, ClinicalUseDefinition.class, ClinicalUseIssue.class, CodeSystem.class, Communication.class, CommunicationRequest.class, CompartmentDefinition.class, Composition.class, ConceptMap.class, ConceptMap2.class, Condition.class, ConditionDefinition.class, Consent.class, Contract.class, Coverage.class, CoverageEligibilityRequest.class, CoverageEligibilityResponse.class, DetectedIssue.class, Device.class, DeviceDefinition.class, DeviceDispense.class, DeviceMetric.class, DeviceRequest.class, DeviceUsage.class, DiagnosticReport.class, DocumentManifest.class, DocumentReference.class, Encounter.class, Endpoint.class, EnrollmentRequest.class, EnrollmentResponse.class, EpisodeOfCare.class, EventDefinition.class, Evidence.class, EvidenceReport.class, EvidenceVariable.class, ExampleScenario.class, ExplanationOfBenefit.class, FamilyMemberHistory.class, Flag.class, Goal.class, GraphDefinition.class, Group.class, GuidanceResponse.class, HealthcareService.class, ImagingSelection.class, ImagingStudy.class, Immunization.class, ImmunizationEvaluation.class, ImmunizationRecommendation.class, ImplementationGuide.class, Ingredient.class, InsurancePlan.class, InventoryReport.class, Invoice.class, Library.class, Linkage.class, ListResource.class, Location.class, ManufacturedItemDefinition.class, Measure.class, MeasureReport.class, Medication.class, MedicationAdministration.class, MedicationDispense.class, MedicationKnowledge.class, MedicationRequest.class, MedicationUsage.class, MedicinalProductDefinition.class, MessageDefinition.class, MessageHeader.class, MolecularSequence.class, NamingSystem.class, NutritionIntake.class, NutritionOrder.class, NutritionProduct.class, Observation.class, ObservationDefinition.class, OperationDefinition.class, OperationOutcome.class, Organization.class, OrganizationAffiliation.class, PackagedProductDefinition.class, Patient.class, PaymentNotice.class, PaymentReconciliation.class, Permission.class, Person.class, PlanDefinition.class, Practitioner.class, PractitionerRole.class, Procedure.class, Provenance.class, Questionnaire.class, QuestionnaireResponse.class, RegulatedAuthorization.class, RelatedPerson.class, RequestGroup.class, ResearchStudy.class, ResearchSubject.class, RiskAssessment.class, Schedule.class, SearchParameter.class, ServiceRequest.class, Slot.class, Specimen.class, SpecimenDefinition.class, StructureDefinition.class, StructureMap.class, Subscription.class, SubscriptionStatus.class, SubscriptionTopic.class, Substance.class, SubstanceDefinition.class, SubstanceNucleicAcid.class, SubstancePolymer.class, SubstanceProtein.class, SubstanceReferenceInformation.class, SubstanceSourceMaterial.class, SupplyDelivery.class, SupplyRequest.class, Task.class, TerminologyCapabilities.class, TestReport.class, TestScript.class, ValueSet.class, VerificationResult.class, VisionPrescription.class } )
  public static final String SP_PREDECESSOR = "predecessor";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>predecessor</b>
   * <p>
   * Description: <b>What resource is being referenced</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EvidenceVariable.relatedArtifact.where(type='predecessor').resource</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PREDECESSOR = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_PREDECESSOR);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>EvidenceVariable:predecessor</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PREDECESSOR = new ca.uhn.fhir.model.api.Include("EvidenceVariable:predecessor").toLocked();

 /**
   * Search parameter: <b>publisher</b>
   * <p>
   * Description: <b>Name of the publisher of the evidence variable</b><br>
   * Type: <b>string</b><br>
   * Path: <b>EvidenceVariable.publisher</b><br>
   * </p>
   */
  @SearchParamDefinition(name="publisher", path="EvidenceVariable.publisher", description="Name of the publisher of the evidence variable", type="string" )
  public static final String SP_PUBLISHER = "publisher";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>publisher</b>
   * <p>
   * Description: <b>Name of the publisher of the evidence variable</b><br>
   * Type: <b>string</b><br>
   * Path: <b>EvidenceVariable.publisher</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam PUBLISHER = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_PUBLISHER);

 /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>The current status of the evidence variable</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EvidenceVariable.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name="status", path="EvidenceVariable.status", description="The current status of the evidence variable", type="token" )
  public static final String SP_STATUS = "status";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>The current status of the evidence variable</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EvidenceVariable.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_STATUS);

 /**
   * Search parameter: <b>successor</b>
   * <p>
   * Description: <b>What resource is being referenced</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EvidenceVariable.relatedArtifact.where(type='successor').resource</b><br>
   * </p>
   */
  @SearchParamDefinition(name="successor", path="EvidenceVariable.relatedArtifact.where(type='successor').resource", description="What resource is being referenced", type="reference", target={Account.class, ActivityDefinition.class, AdministrableProductDefinition.class, AdverseEvent.class, AllergyIntolerance.class, Appointment.class, AppointmentResponse.class, ArtifactAssessment.class, AuditEvent.class, Basic.class, Binary.class, BiologicallyDerivedProduct.class, BodyStructure.class, Bundle.class, CapabilityStatement.class, CapabilityStatement2.class, CarePlan.class, CareTeam.class, ChargeItem.class, ChargeItemDefinition.class, Citation.class, Claim.class, ClaimResponse.class, ClinicalImpression.class, ClinicalUseDefinition.class, ClinicalUseIssue.class, CodeSystem.class, Communication.class, CommunicationRequest.class, CompartmentDefinition.class, Composition.class, ConceptMap.class, ConceptMap2.class, Condition.class, ConditionDefinition.class, Consent.class, Contract.class, Coverage.class, CoverageEligibilityRequest.class, CoverageEligibilityResponse.class, DetectedIssue.class, Device.class, DeviceDefinition.class, DeviceDispense.class, DeviceMetric.class, DeviceRequest.class, DeviceUsage.class, DiagnosticReport.class, DocumentManifest.class, DocumentReference.class, Encounter.class, Endpoint.class, EnrollmentRequest.class, EnrollmentResponse.class, EpisodeOfCare.class, EventDefinition.class, Evidence.class, EvidenceReport.class, EvidenceVariable.class, ExampleScenario.class, ExplanationOfBenefit.class, FamilyMemberHistory.class, Flag.class, Goal.class, GraphDefinition.class, Group.class, GuidanceResponse.class, HealthcareService.class, ImagingSelection.class, ImagingStudy.class, Immunization.class, ImmunizationEvaluation.class, ImmunizationRecommendation.class, ImplementationGuide.class, Ingredient.class, InsurancePlan.class, InventoryReport.class, Invoice.class, Library.class, Linkage.class, ListResource.class, Location.class, ManufacturedItemDefinition.class, Measure.class, MeasureReport.class, Medication.class, MedicationAdministration.class, MedicationDispense.class, MedicationKnowledge.class, MedicationRequest.class, MedicationUsage.class, MedicinalProductDefinition.class, MessageDefinition.class, MessageHeader.class, MolecularSequence.class, NamingSystem.class, NutritionIntake.class, NutritionOrder.class, NutritionProduct.class, Observation.class, ObservationDefinition.class, OperationDefinition.class, OperationOutcome.class, Organization.class, OrganizationAffiliation.class, PackagedProductDefinition.class, Patient.class, PaymentNotice.class, PaymentReconciliation.class, Permission.class, Person.class, PlanDefinition.class, Practitioner.class, PractitionerRole.class, Procedure.class, Provenance.class, Questionnaire.class, QuestionnaireResponse.class, RegulatedAuthorization.class, RelatedPerson.class, RequestGroup.class, ResearchStudy.class, ResearchSubject.class, RiskAssessment.class, Schedule.class, SearchParameter.class, ServiceRequest.class, Slot.class, Specimen.class, SpecimenDefinition.class, StructureDefinition.class, StructureMap.class, Subscription.class, SubscriptionStatus.class, SubscriptionTopic.class, Substance.class, SubstanceDefinition.class, SubstanceNucleicAcid.class, SubstancePolymer.class, SubstanceProtein.class, SubstanceReferenceInformation.class, SubstanceSourceMaterial.class, SupplyDelivery.class, SupplyRequest.class, Task.class, TerminologyCapabilities.class, TestReport.class, TestScript.class, ValueSet.class, VerificationResult.class, VisionPrescription.class } )
  public static final String SP_SUCCESSOR = "successor";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>successor</b>
   * <p>
   * Description: <b>What resource is being referenced</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EvidenceVariable.relatedArtifact.where(type='successor').resource</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam SUCCESSOR = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_SUCCESSOR);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>EvidenceVariable:successor</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_SUCCESSOR = new ca.uhn.fhir.model.api.Include("EvidenceVariable:successor").toLocked();

 /**
   * Search parameter: <b>title</b>
   * <p>
   * Description: <b>The human-friendly name of the evidence variable</b><br>
   * Type: <b>string</b><br>
   * Path: <b>EvidenceVariable.title</b><br>
   * </p>
   */
  @SearchParamDefinition(name="title", path="EvidenceVariable.title", description="The human-friendly name of the evidence variable", type="string" )
  public static final String SP_TITLE = "title";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>title</b>
   * <p>
   * Description: <b>The human-friendly name of the evidence variable</b><br>
   * Type: <b>string</b><br>
   * Path: <b>EvidenceVariable.title</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam TITLE = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_TITLE);

 /**
   * Search parameter: <b>topic</b>
   * <p>
   * Description: <b>Topics associated with the EvidenceVariable</b><br>
   * Type: <b>token</b><br>
   * Path: <b>null</b><br>
   * </p>
   */
  @SearchParamDefinition(name="topic", path="", description="Topics associated with the EvidenceVariable", type="token" )
  public static final String SP_TOPIC = "topic";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>topic</b>
   * <p>
   * Description: <b>Topics associated with the EvidenceVariable</b><br>
   * Type: <b>token</b><br>
   * Path: <b>null</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam TOPIC = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_TOPIC);

 /**
   * Search parameter: <b>url</b>
   * <p>
   * Description: <b>The uri that identifies the evidence variable</b><br>
   * Type: <b>uri</b><br>
   * Path: <b>EvidenceVariable.url</b><br>
   * </p>
   */
  @SearchParamDefinition(name="url", path="EvidenceVariable.url", description="The uri that identifies the evidence variable", type="uri" )
  public static final String SP_URL = "url";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>url</b>
   * <p>
   * Description: <b>The uri that identifies the evidence variable</b><br>
   * Type: <b>uri</b><br>
   * Path: <b>EvidenceVariable.url</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.UriClientParam URL = new ca.uhn.fhir.rest.gclient.UriClientParam(SP_URL);

 /**
   * Search parameter: <b>version</b>
   * <p>
   * Description: <b>The business version of the evidence variable</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EvidenceVariable.version</b><br>
   * </p>
   */
  @SearchParamDefinition(name="version", path="EvidenceVariable.version", description="The business version of the evidence variable", type="token" )
  public static final String SP_VERSION = "version";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>version</b>
   * <p>
   * Description: <b>The business version of the evidence variable</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EvidenceVariable.version</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam VERSION = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_VERSION);


}


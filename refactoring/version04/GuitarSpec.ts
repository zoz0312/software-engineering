// package version03;

import Wood from "./Wood.type";
import Type from "./type";
import Builder from "./Builder.type";

class GuitarSpec {
  private builder: Builder;
  private model: string;
  private type: Type;
  private numStrings: number;
  private backWood: Wood;
  private topWood: Wood;

  constructor(
    builder: Builder,
    model: string,
    type: Type,
    numStrings: number,
    backWood: Wood,
    topWood: Wood
  ) {
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.numStrings = numStrings;
    this.backWood = backWood;
    this.topWood = topWood;
  }

  getBuilder() {
    return this.builder;
  }
  getModel() {
    return this.model;
  }
  getType() {
    return this.type;
  }
  getNumStrings() {
    return this.numStrings;
  }
  getBackWood() {
    return this.backWood;
  }
  getTopWood() {
    return this.topWood;
  }
  matches(otherSpec: GuitarSpec) {
    if (this.builder !== otherSpec.builder) {
      return false;
    }
    if (this.model !== otherSpec.model) {
      return false;
    }
    if (this.type !== otherSpec.type) {
      return false;
    }
    if (this.numStrings !== otherSpec.numStrings) {
      return false;
    }
    if (this.backWood !== otherSpec.backWood) {
      return false;
    }
    if (this.topWood !== otherSpec.topWood) {
      return false;
    }
    return true;
  }
}

export default GuitarSpec;

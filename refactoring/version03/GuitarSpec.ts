// package version03;

import Wood from "./Wood.type";
import Type from "./type";
import Builder from "./Builder.type";

class GuitarSpec {
  private builder: Builder;
  private model: string;
  private type: Type;
  private backWood: Wood;
  private topWood: Wood;

  constructor(
    builder: Builder,
    model: string,
    type: Type,
    backWood: Wood,
    topWood: Wood
  ) {
    this.builder = builder;
    this.model = model;
    this.type = type;
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
  getBackWood() {
    return this.backWood;
  }
  getTopWood() {
    return this.topWood;
  }
}

export default GuitarSpec;

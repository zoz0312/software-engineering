// package version02;

import Wood from "./Wood.type";
import Type from "./type";
import Builder from "./Builder.type";

class Guitar {
  private serialNumber: string;
  private builder: Builder;
  private model: string;
  private type: Type;
  private backWood: Wood;
  private topWood: Wood;

  private price: number;

  constructor(
    serialNumber: string,
    price: number,
    builder: Builder,
    model: string,
    type: Type,
    backWood: Wood,
    topWood: Wood
  ) {
    this.serialNumber = serialNumber;
    this.price = price;
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.backWood = backWood;
    this.topWood = topWood;
  }

  getSerialnumber() {
    return this.serialNumber;
  }
  getPrice() {
    return this.price;
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

export default Guitar;

// package version03;

import Wood from "./Wood.type";
import Type from "./type";
import Builder from "./Builder.type";
import GuitarSpec from "./GuitarSpec";

class Guitar {
  private serialNumber: string;
  private spec: GuitarSpec;

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
    this.spec = new GuitarSpec(builder, model, type, backWood, topWood);
  }

  getSerialnumber() {
    return this.serialNumber;
  }
  getPrice() {
    return this.price;
  }
  getSpec() {
    return this.spec;
  }
}

export default Guitar;

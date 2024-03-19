// package version03;

import Wood from "./Wood.type";
import Type from "./type";
import Builder from "./Builder.type";
import GuitarSpec from "./GuitarSpec";

class Guitar {
  private serialNumber: string;
  private price: number;
  private spec: GuitarSpec;

  constructor(serialNumber: string, price: number, spec: GuitarSpec) {
    this.serialNumber = serialNumber;
    this.price = price;
    this.spec = spec;
  }

  getSerialnumber() {
    return this.serialNumber;
  }
  getPrice() {
    return this.price;
  }
  setPrice(newPrice: number) {
    this.price = newPrice;
  }
  getSpec() {
    return this.spec;
  }
}

export default Guitar;

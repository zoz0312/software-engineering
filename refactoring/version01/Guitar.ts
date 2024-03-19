// package version01;

class Guitar {
  private serialNumber: string;
  private builder: string;
  private model: string;
  private type: string;
  private backWood: string;
  private topWood: string;

  private price: number;

  constructor(
    serialNumber: string,
    price: number,
    builder: string,
    model: string,
    type: string,
    backWood: string,
    topWood: string
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

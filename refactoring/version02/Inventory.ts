import Builder from "./Builder.type";
import Guitar from "./Guitar";
import Wood from "./Wood.type";
import Type from "./type";

class Inventory {
  guitars!: Guitar[];

  constructor() {
    this.guitars = [];
  }

  addGuitar(
    serialNumber: string,
    price: number,
    builder: Builder,
    model: string,
    type: Type,
    backWood: Wood,
    topWood: Wood
  ) {
    const guitar = new Guitar(
      serialNumber,
      price,
      builder,
      model,
      type,
      backWood,
      topWood
    );
    this.guitars.push(guitar);
  }

  getGuitar(serialNumber: string): Guitar | null {
    for (let i = 0; i < this.guitars.length; i++) {
      if (this.guitars[i].getSerialnumber() === serialNumber) {
        return this.guitars[i];
      }
    }
    return null;
  }

  search(searchGuitar: Guitar): Guitar | null {
    let guitar: Guitar | null = null;
    for (let i = 0; i < this.guitars.length; i++) {
      let isFind = false;
      if (
        this.guitars[i].getSerialnumber() === searchGuitar.getSerialnumber()
      ) {
        isFind = true;
      }
      if (this.guitars[i].getPrice() === searchGuitar.getPrice()) {
        isFind = true;
      }
      if (this.guitars[i].getBackWood() === searchGuitar.getBackWood()) {
        isFind = true;
      }
      if (this.guitars[i].getBuilder() === searchGuitar.getBuilder()) {
        isFind = true;
      }
      if (this.guitars[i].getTopWood() === searchGuitar.getTopWood()) {
        isFind = true;
      }
      if (this.guitars[i].getType() === searchGuitar.getType()) {
        isFind = true;
      }

      if (isFind) {
        guitar = this.guitars[i];
        break;
      }
    }

    return guitar;
  }
}

export default Inventory;

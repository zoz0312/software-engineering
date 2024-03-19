import Builder from "./Builder.type";
import Guitar from "./Guitar";
import GuitarSpec from "./GuitarSpec";
import Wood from "./Wood.type";
import Type from "./type";

class Inventory {
  guitars!: Guitar[];

  constructor() {
    this.guitars = [];
  }

  addGuitar(serialNumber: string, price: number, spec: GuitarSpec) {
    const guitar = new Guitar(serialNumber, price, spec);
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

  search(searchSpec: GuitarSpec): Guitar | null {
    let guitar: Guitar | null = null;
    for (let i = 0; i < this.guitars.length; i++) {
      let guitarSpec = this.guitars[i].getSpec();

      if (guitarSpec.matches(searchSpec)) {
        guitar = this.guitars[i];
        break;
      }
    }

    return guitar;
  }
}

export default Inventory;

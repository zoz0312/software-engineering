// Gun 클래스
class Gun {
    private bullet: number;

    constructor(bullet: number) {
        this.bullet = bullet;
    }

    public shoot(): void {
        console.log("BANG!");
        this.bullet--;
    }
}

// Police 클래스
class Police {
    private handcuffs: number;
    private pistol: Gun | null;

    constructor(bullet: number, handcuffs: number) {
        this.handcuffs = handcuffs;
        this.pistol = bullet > 0 ? new Gun(bullet) : null;
    }

    public putHandcuff(): void {
        console.log("SNAP!");
        this.handcuffs--;
    }

    public shoot(): void {
        if (this.pistol === null) {
            console.log("HUT BBANG!");
        } else {
            this.pistol.shoot();
        }
    }
}

// FruitSeller 클래스
class FruitSeller {
    private applePrice: number;
    private numOfApples: number;
    private myMoney: number;

    constructor(applePrice: number, numOfApples: number, myMoney: number) {
        this.applePrice = applePrice;
        this.numOfApples = numOfApples;
        this.myMoney = myMoney;
    }

    public saleApples(money: number): number {
        let num: number = Math.floor(money / this.applePrice);
        this.numOfApples -= num;
        this.myMoney += money;
        return num;
    }

    public showSalesResult(): void {
        console.log("남은 사과: " + this.numOfApples);
        console.log("판매 수익: " + this.myMoney);
    }
}

// FruitBuyer 클래스
class FruitBuyer {
    private myMoney: number;
    private numOfApples: number;

    constructor(myMoney: number) {
        this.myMoney = myMoney;
        this.numOfApples = 0;
    }

    public buyApples(seller: FruitSeller, money: number): void {
        this.numOfApples += seller.saleApples(money);
        this.myMoney -= money;
    }

    public showBuyResult(): void {
        console.log("현재 잔액: " + this.myMoney);
        console.log("사과 개수: " + this.numOfApples);
    }
}

// 테스트 코드
class BuyFruitTest {
    public static main(): void {
        let seller: FruitSeller = new FruitSeller(1000, 20, 0);
        let buyer: FruitBuyer = new FruitBuyer(5000);

        buyer.buyApples(seller, 2000);

        console.log("과일 판매자의 판매 결과");
        seller.showSalesResult();

        console.log("과일 구매자의 구매 결과");
        buyer.showBuyResult();
    }
}

class Gun1 {
    private bullet: number;

    constructor (bullet: number) {
        this.bullet = bullet;
    }

    public shoot(): void {
        console.log('BANG');
        this.bullet--;
    }
}

class Police1 {
    private handcuffs: number;

    constructor (handcuffs: number) {
        this.handcuffs = handcuffs;
    }

    public putHandcuff(): void {
        console.log('SNAP');
        this.handcuffs--;
    }

    public shoot(pistol: Gun1 | null) {
        if (!pistol) {
            console.log('HUT BANG');
            return;
        }
        pistol.shoot();
    }

    public static main(): void {
        const p1: Police1 = new Police1(3);
        const pistol: Gun1 = new Gun1(5);
        p1.shoot(pistol);
        p1.putHandcuff();

        const p2: Police1 = new Police1(3);
        const pistol1: Gun1 | null = null;
        p2.shoot(pistol1);
        p2.putHandcuff();
    }
}
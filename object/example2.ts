// Chef 클래스
class Chef {
    private name: string;

    constructor(name: string) {
        this.name = name;
    }

    cook(food: string): string {
        console.log(`주문받은 음식: ${this.name} + ${food}를 만들겠습니다.`);
        return food;
    }
}

// Server 클래스
class Server {
    readonly name: string;
    private chef: Chef;

    constructor(name: string, chef: Chef) {
        this.name = name;
        this.chef = chef;
    }

    serve(foodName: string): string {
        console.log(`${this.name} + ${foodName}를 주문받았습니다.`);
        const food: string = this.chef.cook(foodName);
        console.log(`${this.name} + ${food}를 주문한 테이블에 제공하겠습니다.`);
        return food;
    }
}

// Customer 클래스
class Customer {
    private name: string;

    constructor(name: string) {
        this.name = name;
    }

    order(server: Server, food: string): string {
        console.log(`${this.name}이(가) ${server.name}에게 ${food}를 주문합니다.`);
        const f: string = server.serve(food);
        console.log(`${this.name}이(가) ${f}를 배달받았습니다.`);
        return f;
    }

    getName(): string {
        return this.name;
    }
}

// OrderTest 클래스
class OrderTest {
    public static main(): void {
        const ch: Chef = new Chef("고길동");
        const c: Customer = new Customer("둘리");
        const s: Server = new Server("마이콜", ch);
        const food: string = c.order(s, "스파게티");
        console.log(`${c.getName()} + ${food} 주문을 받았습니다.`);
    }
}

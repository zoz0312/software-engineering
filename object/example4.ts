class Watch {
    private time: Date;

    constructor() {
        this.time = new Date();
    }

    whatTime(): Date {
        return this.time;
    }
}

class Person {
    private name: string;
    private watch: Watch | null;

    constructor(name: string, watch: Watch | null) {
        this.name = name;
        if (!watch) {
            this.watch = null; // new Watch();
        } else {
            this.watch = watch;
        }
    }

    whatTime(): Date | string {
        if (!this.watch) {
            return "시계가 없어요.";
        }
        return `현재시간: ${this.watch.whatTime()}`;
    }

    setWatch(watch: Watch) {
        this.watch = watch;
    }
}

class WatchTest {
    public static main(): void {
        const p: Person = new Person("홍길동", null);
        console.log(p.whatTime());

        p.setWatch(new Watch());
        console.log(p.whatTime());
    }
}

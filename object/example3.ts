// Account 클래스
class Account {
    readonly name: string;
    private balance: number;

    constructor(name?: string) {
        this.name = name || "";
        this.balance = 0;
    }

    deposit(amount: number): void {
        this.balance += amount;
        console.log(`${this.name} 계정에 ${amount}원이 입금되었습니다.`);
    }

    withdraw(amount: number): void {
        if (this.balance >= amount) {
            this.balance -= amount;
            console.log(`${this.name} 계정에서 ${amount}원이 출금되었습니다.`);
        } else {
            console.log(`${this.name} 계정의 잔액이 부족합니다.`);
        }
    }

    getBalance(): number {
        return this.balance;
    }
}

// AccountManager 클래스
class AccountManager {
    private accounts: Account[];
    private accountNum: number;

    constructor() {
        this.accounts = [];
        this.accountNum = 0;
    }

    newAccount(name: string): void {
        if (this.accountNum < 10) {
            const acc = new Account(name);
            this.accounts.push(acc);
            this.accountNum++;
        } else {
            console.log("계좌 수가 최대치를 초과했습니다.");
        }
    }

    deposit(name: string, amount: number): void {
        const account = this.accounts.find((acc: Account) => acc.name === name);
        account?.deposit(amount);
    }

    withdraw(name: string, amount: number): void {
        const account = this.accounts.find((acc: Account) => acc.name === name);
        account?.withdraw(amount);
    }

    getBalance(name: string): number {
        const account = this.accounts.find((acc: Account) => acc.name === name);
        return account ? account.getBalance() : 0;
    }
}

// WebBanking 클래스
class WebBanking {
    public static main(): void {
        const am = new AccountManager();
        am.newAccount("고길동");
        am.deposit("고길동", 1000);
        am.withdraw("고길동", 200);
        console.log(`고길동의 잔액은 ${am.getBalance("고길동")}원 입니다.`);
    }
}

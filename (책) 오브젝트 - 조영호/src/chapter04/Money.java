package chapter04;

public class Money {
    public static final Money ZERO = Money.wons(0.0);
    
    private final double amount;

    // 생성자
    public Money(double amount) {
        this.amount = amount;
    }

    // 정적 생성자 (원화 단위로 생성)
    public static Money wons(double amount) {
        return new Money(amount);
    }

    // 두 금액의 합을 반환
    public Money add(Money other) {
        return new Money(this.amount + other.amount);
    }

    // 두 금액의 차를 반환
    public Money minus(Money other) {
        return new Money(this.amount - other.amount);
    }

    // 금액에 배수를 곱함 (예: 할인율 계산 시 사용)
    public Money times(double multiplier) {
        return new Money(this.amount * multiplier);
    }

    // 비교: 현재 금액이 다른 금액보다 작은지 여부
    public boolean isLessThan(Money other) {
        return this.amount < other.amount;
    }
    
    // 비교: 현재 금액이 다른 금액보다 크거나 같은지 여부
    public boolean isGreaterThanOrEqual(Money other) {
        return this.amount >= other.amount;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money)) return false;
        Money money = (Money) o;
        return Double.compare(money.amount, amount) == 0;
    }
    
    @Override
    public int hashCode() {
        return Double.hashCode(amount);
    }
    
    @Override
    public String toString() {
        return "Money: " + amount;
    }
}

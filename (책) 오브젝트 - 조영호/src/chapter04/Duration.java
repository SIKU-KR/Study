package chapter04;

public class Duration {
    private final int minutes;

    // 생성자: 분 단위의 상영 시간 지정
    public Duration(int minutes) {
        this.minutes = minutes;
    }

    // 총 분 반환
    public int toMinutes() {
        return minutes;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Duration)) return false;
        Duration duration = (Duration) o;
        return minutes == duration.minutes;
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(minutes);
    }
    
    @Override
    public String toString() {
        return minutes + " minutes";
    }
}

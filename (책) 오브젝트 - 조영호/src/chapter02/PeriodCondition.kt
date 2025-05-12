package chapter_2

import java.time.DayOfWeek
import java.time.LocalTime

class PeriodCondition(
    private var dayOfWeek: DayOfWeek,
    private var startTime: LocalTime,
    private var endTime: LocalTime
) : DiscountCondition {
    override fun isSatisfiedBy(screening: Screening): Boolean {
        return screening.getStartTime().dayOfWeek.equals(dayOfWeek) &&
                startTime.compareTo(screening.getStartTime().toLocalTime()) <= 0 &&
                endTime.compareTo(screening.getStartTime().toLocalTime()) >= 0
    }

}
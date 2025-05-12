package chapter_2

import java.time.DayOfWeek
import java.time.LocalTime
import kotlin.time.Duration.Companion.minutes

class Main

val movie = Movie(
    "아바타",
    120.minutes,
    Money.wons(10000),
    AmountDiscountPolicy(
        Money.wons(800),
        SequenceCondition(1),
        SequenceCondition(2),
        PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59)),
        PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(20, 59))
    )
)
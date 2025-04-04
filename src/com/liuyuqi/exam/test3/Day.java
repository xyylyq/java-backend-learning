package com.liuyuqi.exam.test3;

import java.time.LocalDate;

public class Day {
    private LocalDate date;
    private boolean isFree;

    public Day() {
    }

    public Day(LocalDate date, boolean isFree) {
        this.date = date;
        this.isFree = isFree;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    @Override
    public String toString() {
        return date + "[" + (isFree ? "休息" : "") + "]";
    }
}

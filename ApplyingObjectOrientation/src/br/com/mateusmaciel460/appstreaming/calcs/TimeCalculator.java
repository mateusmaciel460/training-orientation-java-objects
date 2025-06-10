package br.com.mateusmaciel460.appstreaming.calcs;

import br.com.mateusmaciel460.appstreaming.models.TemplateTitle;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return this.totalTime;
    }

    public void includeInTime(TemplateTitle templateTitle) {
        totalTime += templateTitle.getDurationInMinutes();
    }
}

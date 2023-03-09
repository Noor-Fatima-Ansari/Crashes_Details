 class Crashes {
   int crashYear, crashDay;
    String timeOfDay, crashMonth, dayOfWeek, lightCondition, weatherCondition, crashIntersection, crashHitAndRun;
    public Crashes(int crashYear, String crashMonth, int crashDay, String timeOfDay, String dayOfWeek, String crashIntersection,
                   String crashHitAndRun, String lightCondition, String weatherCondition) {
        this.crashYear = crashYear;
        this.crashDay = crashDay;
        this.dayOfWeek = dayOfWeek;
        this.timeOfDay = timeOfDay;
        this.crashMonth = crashMonth;
        this.lightCondition = lightCondition;
        this.weatherCondition = weatherCondition;
        this.crashIntersection = crashIntersection;
        this.crashHitAndRun = crashHitAndRun;
    }

    public String toString(){
        return crashYear+"  "+crashMonth+"  "+crashDay+"  "+timeOfDay+"  "+dayOfWeek+"  "
                +crashIntersection+"  "+crashHitAndRun+"  "+lightCondition+"  "+weatherCondition+" ";
    }

    public String getDayOfWeek(){
        return dayOfWeek;
    }
    public String getWeatherCondition(){
        return  weatherCondition;
    }
    public String getCrashMonth(){
        return crashMonth;
    }
    public String getLightCondition(){
        return lightCondition;
    }
    public String getCrashHitAndRun(){return crashHitAndRun;}


}

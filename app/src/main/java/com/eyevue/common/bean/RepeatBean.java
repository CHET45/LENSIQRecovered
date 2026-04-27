package com.eyevue.common.bean;

import android.content.Context;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public class RepeatBean {
    public static final int REPEAT_TYPE_EVERY_DAY = 2;
    public static final int REPEAT_TYPE_EVERY_HOUR = 1;
    public static final int REPEAT_TYPE_EVERY_MONTH = 4;
    public static final int REPEAT_TYPE_EVERY_WEEK = 3;
    public static final int REPEAT_TYPE_NONE = 0;
    private String repeatStr;
    private int repeatType;

    public RepeatBean(int repeatType, String repeatStr) {
        this.repeatType = repeatType;
        this.repeatStr = repeatStr;
    }

    public static String getRepeatTypeStr(Context context, int repeatType) {
        return repeatType != 0 ? repeatType != 1 ? repeatType != 2 ? repeatType != 3 ? repeatType != 4 ? "Unknown" : context.getString(C2531R.string.string_alarm_repeat_type_month) : context.getString(C2531R.string.string_alarm_repeat_type_week) : context.getString(C2531R.string.string_alarm_repeat_type_day) : context.getString(C2531R.string.string_alarm_repeat_type_hour) : context.getString(C2531R.string.string_alarm_repeat_type_none);
    }

    public String getRepeatStr() {
        return this.repeatStr;
    }

    public int getRepeatType() {
        return this.repeatType;
    }

    public void setRepeatStr(String repeatStr) {
        this.repeatStr = repeatStr;
    }

    public void setRepeatType(int repeatType) {
        this.repeatType = repeatType;
    }
}

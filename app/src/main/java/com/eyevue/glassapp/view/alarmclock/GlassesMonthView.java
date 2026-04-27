package com.eyevue.glassapp.view.alarmclock;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.eyevue.common.C2531R;
import com.haibin.calendarview.MonthView;
import java.util.Calendar;
import p000.gn1;
import p000.kqf;

/* JADX INFO: loaded from: classes4.dex */
public class GlassesMonthView extends MonthView {
    public GlassesMonthView(Context context) {
        super(context);
    }

    @Override // com.haibin.calendarview.BaseView
    /* JADX INFO: renamed from: b */
    public void mo4652b() {
        super.mo4652b();
        Paint paint = this.f23711b;
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        this.f23713c.setTextAlign(align);
        this.f23701H.setTextAlign(align);
        this.f23703M.setTextAlign(align);
        this.f23699C.setTextAlign(align);
        this.f23702L.setTextAlign(align);
        this.f23711b.setTextSize(kqf.dp2px(14.0f));
        this.f23713c.setTextSize(kqf.dp2px(14.0f));
        this.f23701H.setTextSize(kqf.dp2px(14.0f));
        this.f23703M.setTextSize(kqf.dp2px(14.0f));
        this.f23702L.setTextSize(kqf.dp2px(14.0f));
        this.f23711b.setFakeBoldText(false);
        this.f23713c.setFakeBoldText(false);
        this.f23701H.setFakeBoldText(false);
        this.f23703M.setFakeBoldText(false);
        this.f23702L.setFakeBoldText(false);
        this.f23700F.setColor(getContext().getResources().getColor(C2531R.color.color_5c5113));
        this.f23702L.setColor(getContext().getResources().getColor(C2531R.color.white));
        this.f23711b.setColor(getContext().getResources().getColor(C2531R.color.white));
        this.f23713c.setColor(getContext().getResources().getColor(C2531R.color.color_8e));
    }

    @Override // com.haibin.calendarview.MonthView
    /* JADX INFO: renamed from: r */
    public void mo4653r(Canvas canvas, gn1 calendar, int x, int y) {
    }

    @Override // com.haibin.calendarview.MonthView
    /* JADX INFO: renamed from: s */
    public boolean mo4654s(Canvas canvas, gn1 calendar, int x, int y, boolean hasScheme) {
        return hasScheme;
    }

    @Override // com.haibin.calendarview.MonthView
    /* JADX INFO: renamed from: t */
    public void mo4655t(Canvas canvas, gn1 calendar, int x, int y, boolean hasScheme, boolean isSelected) {
        float f = this.f23710a2 + y;
        int i = this.f23708Z1;
        int i2 = x + (i / 2);
        int i3 = this.f23707V1;
        int i4 = y + (i3 / 2);
        int iMin = Math.min(i, i3) / 2;
        Calendar calendar2 = Calendar.getInstance();
        boolean z = true;
        int i5 = calendar2.get(1);
        int i6 = calendar2.get(2) + 1;
        int i7 = calendar2.get(5);
        if (calendar.getYear() >= i5 && ((calendar.getYear() != i5 || calendar.getMonth() >= i6) && (calendar.getYear() != i5 || calendar.getMonth() != i6 || calendar.getDay() >= i7))) {
            z = false;
        }
        if (calendar.getYear() <= i5 && ((calendar.getYear() != i5 || calendar.getMonth() <= i6) && calendar.getYear() == i5 && calendar.getMonth() == i6)) {
            calendar.getDay();
        }
        if (isSelected) {
            float f2 = i2;
            canvas.drawCircle(f2, i4, iMin, this.f23700F);
            canvas.drawText(String.valueOf(calendar.getDay()), f2, f, this.f23702L);
        } else if (!calendar.isCurrentMonth()) {
            canvas.drawText(String.valueOf(calendar.getDay()), i2, f, this.f23713c);
        } else if (z) {
            canvas.drawText(String.valueOf(calendar.getDay()), i2, f, this.f23713c);
        } else {
            canvas.drawText(String.valueOf(calendar.getDay()), i2, f, this.f23711b);
        }
    }
}

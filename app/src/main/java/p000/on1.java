package p000;

import android.widget.CalendarView;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@oe8({@ne8(attribute = "android:date", type = CalendarView.class)})
@p7e({p7e.EnumC10826a.f69934a})
public class on1 {

    /* JADX INFO: renamed from: on1$a */
    public class C10474a implements CalendarView.OnDateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CalendarView.OnDateChangeListener f68165a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ me8 f68166b;

        public C10474a(CalendarView.OnDateChangeListener onDateChangeListener, me8 me8Var) {
            this.f68165a = onDateChangeListener;
            this.f68166b = me8Var;
        }

        @Override // android.widget.CalendarView.OnDateChangeListener
        public void onSelectedDayChange(CalendarView calendarView, int i, int i2, int i3) {
            CalendarView.OnDateChangeListener onDateChangeListener = this.f68165a;
            if (onDateChangeListener != null) {
                onDateChangeListener.onSelectedDayChange(calendarView, i, i2, i3);
            }
            this.f68166b.onChange();
        }
    }

    @q21({"android:date"})
    public static void setDate(CalendarView calendarView, long j) {
        if (calendarView.getDate() != j) {
            calendarView.setDate(j);
        }
    }

    @q21(requireAll = false, value = {"android:onSelectedDayChange", "android:dateAttrChanged"})
    public static void setListeners(CalendarView calendarView, CalendarView.OnDateChangeListener onDateChangeListener, me8 me8Var) {
        if (me8Var == null) {
            calendarView.setOnDateChangeListener(onDateChangeListener);
        } else {
            calendarView.setOnDateChangeListener(new C10474a(onDateChangeListener, me8Var));
        }
    }
}

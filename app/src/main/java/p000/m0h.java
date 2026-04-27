package p000;

import android.widget.TimePicker;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public class m0h {

    /* JADX INFO: renamed from: m0h$a */
    public class C9073a implements TimePicker.OnTimeChangedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TimePicker.OnTimeChangedListener f59561a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ me8 f59562b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ me8 f59563c;

        public C9073a(TimePicker.OnTimeChangedListener onTimeChangedListener, me8 me8Var, me8 me8Var2) {
            this.f59561a = onTimeChangedListener;
            this.f59562b = me8Var;
            this.f59563c = me8Var2;
        }

        @Override // android.widget.TimePicker.OnTimeChangedListener
        public void onTimeChanged(TimePicker timePicker, int i, int i2) {
            TimePicker.OnTimeChangedListener onTimeChangedListener = this.f59561a;
            if (onTimeChangedListener != null) {
                onTimeChangedListener.onTimeChanged(timePicker, i, i2);
            }
            me8 me8Var = this.f59562b;
            if (me8Var != null) {
                me8Var.onChange();
            }
            me8 me8Var2 = this.f59563c;
            if (me8Var2 != null) {
                me8Var2.onChange();
            }
        }
    }

    @le8(attribute = "android:hour")
    public static int getHour(TimePicker timePicker) {
        return timePicker.getHour();
    }

    @le8(attribute = "android:minute")
    public static int getMinute(TimePicker timePicker) {
        return timePicker.getMinute();
    }

    @q21({"android:hour"})
    public static void setHour(TimePicker timePicker, int i) {
        if (timePicker.getHour() != i) {
            timePicker.setHour(i);
        }
    }

    @q21(requireAll = false, value = {"android:onTimeChanged", "android:hourAttrChanged", "android:minuteAttrChanged"})
    public static void setListeners(TimePicker timePicker, TimePicker.OnTimeChangedListener onTimeChangedListener, me8 me8Var, me8 me8Var2) {
        if (me8Var == null && me8Var2 == null) {
            timePicker.setOnTimeChangedListener(onTimeChangedListener);
        } else {
            timePicker.setOnTimeChangedListener(new C9073a(onTimeChangedListener, me8Var, me8Var2));
        }
    }

    @q21({"android:minute"})
    public static void setMinute(TimePicker timePicker, int i) {
        if (timePicker.getMinute() != i) {
            timePicker.setMinute(i);
        }
    }
}

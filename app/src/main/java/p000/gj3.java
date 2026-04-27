package p000;

import android.widget.DatePicker;
import androidx.databinding.library.baseAdapters.C1011R;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@oe8({@ne8(attribute = "android:year", type = DatePicker.class), @ne8(attribute = "android:month", type = DatePicker.class), @ne8(attribute = "android:day", method = "getDayOfMonth", type = DatePicker.class)})
@p7e({p7e.EnumC10826a.f69934a})
public class gj3 {

    /* JADX INFO: renamed from: gj3$b */
    public static class C6335b implements DatePicker.OnDateChangedListener {

        /* JADX INFO: renamed from: a */
        public DatePicker.OnDateChangedListener f39922a;

        /* JADX INFO: renamed from: b */
        public me8 f39923b;

        /* JADX INFO: renamed from: c */
        public me8 f39924c;

        /* JADX INFO: renamed from: d */
        public me8 f39925d;

        private C6335b() {
        }

        @Override // android.widget.DatePicker.OnDateChangedListener
        public void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
            DatePicker.OnDateChangedListener onDateChangedListener = this.f39922a;
            if (onDateChangedListener != null) {
                onDateChangedListener.onDateChanged(datePicker, i, i2, i3);
            }
            me8 me8Var = this.f39923b;
            if (me8Var != null) {
                me8Var.onChange();
            }
            me8 me8Var2 = this.f39924c;
            if (me8Var2 != null) {
                me8Var2.onChange();
            }
            me8 me8Var3 = this.f39925d;
            if (me8Var3 != null) {
                me8Var3.onChange();
            }
        }

        public void setListeners(DatePicker.OnDateChangedListener onDateChangedListener, me8 me8Var, me8 me8Var2, me8 me8Var3) {
            this.f39922a = onDateChangedListener;
            this.f39923b = me8Var;
            this.f39924c = me8Var2;
            this.f39925d = me8Var3;
        }
    }

    @q21(requireAll = false, value = {"android:year", "android:month", "android:day", "android:onDateChanged", "android:yearAttrChanged", "android:monthAttrChanged", "android:dayAttrChanged"})
    public static void setListeners(DatePicker datePicker, int i, int i2, int i3, DatePicker.OnDateChangedListener onDateChangedListener, me8 me8Var, me8 me8Var2, me8 me8Var3) {
        if (i == 0) {
            i = datePicker.getYear();
        }
        if (i3 == 0) {
            i3 = datePicker.getDayOfMonth();
        }
        if (me8Var == null && me8Var2 == null && me8Var3 == null) {
            datePicker.init(i, i2, i3, onDateChangedListener);
            return;
        }
        C6335b c6335b = (C6335b) ab9.getListener(datePicker, C1011R.id.onDateChanged);
        if (c6335b == null) {
            c6335b = new C6335b();
            ab9.trackListener(datePicker, c6335b, C1011R.id.onDateChanged);
        }
        c6335b.setListeners(onDateChangedListener, me8Var, me8Var2, me8Var3);
        datePicker.init(i, i2, i3, c6335b);
    }
}

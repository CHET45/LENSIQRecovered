package p000;

import android.widget.NumberPicker;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@x21({@w21(attribute = "android:format", method = "setFormatter", type = NumberPicker.class), @w21(attribute = "android:onScrollStateChange", method = "setOnScrollListener", type = NumberPicker.class)})
@oe8({@ne8(attribute = "android:value", type = NumberPicker.class)})
@p7e({p7e.EnumC10826a.f69934a})
public class zib {

    /* JADX INFO: renamed from: zib$a */
    public class C16154a implements NumberPicker.OnValueChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ NumberPicker.OnValueChangeListener f105186a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ me8 f105187b;

        public C16154a(NumberPicker.OnValueChangeListener onValueChangeListener, me8 me8Var) {
            this.f105186a = onValueChangeListener;
            this.f105187b = me8Var;
        }

        @Override // android.widget.NumberPicker.OnValueChangeListener
        public void onValueChange(NumberPicker numberPicker, int i, int i2) {
            NumberPicker.OnValueChangeListener onValueChangeListener = this.f105186a;
            if (onValueChangeListener != null) {
                onValueChangeListener.onValueChange(numberPicker, i, i2);
            }
            this.f105187b.onChange();
        }
    }

    @q21(requireAll = false, value = {"android:onValueChange", "android:valueAttrChanged"})
    public static void setListeners(NumberPicker numberPicker, NumberPicker.OnValueChangeListener onValueChangeListener, me8 me8Var) {
        if (me8Var == null) {
            numberPicker.setOnValueChangedListener(onValueChangeListener);
        } else {
            numberPicker.setOnValueChangedListener(new C16154a(onValueChangeListener, me8Var));
        }
    }

    @q21({"android:value"})
    public static void setValue(NumberPicker numberPicker, int i) {
        if (numberPicker.getValue() != i) {
            numberPicker.setValue(i);
        }
    }
}

package p000;

import android.widget.RadioGroup;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@oe8({@ne8(attribute = "android:checkedButton", method = "getCheckedRadioButtonId", type = RadioGroup.class)})
@p7e({p7e.EnumC10826a.f69934a})
public class sod {

    /* JADX INFO: renamed from: sod$a */
    public class C12720a implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RadioGroup.OnCheckedChangeListener f82463a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ me8 f82464b;

        public C12720a(RadioGroup.OnCheckedChangeListener onCheckedChangeListener, me8 me8Var) {
            this.f82463a = onCheckedChangeListener;
            this.f82464b = me8Var;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            RadioGroup.OnCheckedChangeListener onCheckedChangeListener = this.f82463a;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(radioGroup, i);
            }
            this.f82464b.onChange();
        }
    }

    @q21({"android:checkedButton"})
    public static void setCheckedButton(RadioGroup radioGroup, int i) {
        if (i != radioGroup.getCheckedRadioButtonId()) {
            radioGroup.check(i);
        }
    }

    @q21(requireAll = false, value = {"android:onCheckedChanged", "android:checkedButtonAttrChanged"})
    public static void setListeners(RadioGroup radioGroup, RadioGroup.OnCheckedChangeListener onCheckedChangeListener, me8 me8Var) {
        if (me8Var == null) {
            radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            radioGroup.setOnCheckedChangeListener(new C12720a(onCheckedChangeListener, me8Var));
        }
    }
}

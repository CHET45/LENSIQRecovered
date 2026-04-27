package p000;

import android.widget.CompoundButton;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@x21({@w21(attribute = "android:buttonTint", method = "setButtonTintList", type = CompoundButton.class), @w21(attribute = "android:onCheckedChanged", method = "setOnCheckedChangeListener", type = CompoundButton.class)})
@oe8({@ne8(attribute = "android:checked", type = CompoundButton.class)})
@p7e({p7e.EnumC10826a.f69934a})
public class bo2 {

    /* JADX INFO: renamed from: bo2$a */
    public class C1962a implements CompoundButton.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CompoundButton.OnCheckedChangeListener f14239a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ me8 f14240b;

        public C1962a(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, me8 me8Var) {
            this.f14239a = onCheckedChangeListener;
            this.f14240b = me8Var;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f14239a;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z);
            }
            this.f14240b.onChange();
        }
    }

    @q21({"android:checked"})
    public static void setChecked(CompoundButton compoundButton, boolean z) {
        if (compoundButton.isChecked() != z) {
            compoundButton.setChecked(z);
        }
    }

    @q21(requireAll = false, value = {"android:onCheckedChanged", "android:checkedAttrChanged"})
    public static void setListeners(CompoundButton compoundButton, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, me8 me8Var) {
        if (me8Var == null) {
            compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            compoundButton.setOnCheckedChangeListener(new C1962a(onCheckedChangeListener, me8Var));
        }
    }
}

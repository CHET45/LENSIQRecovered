package p000;

import android.widget.AutoCompleteTextView;
import p000.C9871nh;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@x21({@w21(attribute = "android:completionThreshold", method = "setThreshold", type = AutoCompleteTextView.class), @w21(attribute = "android:popupBackground", method = "setDropDownBackgroundDrawable", type = AutoCompleteTextView.class), @w21(attribute = "android:onDismiss", method = "setOnDismissListener", type = AutoCompleteTextView.class), @w21(attribute = "android:onItemClick", method = "setOnItemClickListener", type = AutoCompleteTextView.class)})
@p7e({p7e.EnumC10826a.f69934a})
public class vi0 {

    /* JADX INFO: renamed from: vi0$a */
    public class C14084a implements AutoCompleteTextView.Validator {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC14086c f91231a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC14085b f91232b;

        public C14084a(InterfaceC14086c interfaceC14086c, InterfaceC14085b interfaceC14085b) {
            this.f91231a = interfaceC14086c;
            this.f91232b = interfaceC14085b;
        }

        @Override // android.widget.AutoCompleteTextView.Validator
        public CharSequence fixText(CharSequence charSequence) {
            InterfaceC14085b interfaceC14085b = this.f91232b;
            return interfaceC14085b != null ? interfaceC14085b.fixText(charSequence) : charSequence;
        }

        @Override // android.widget.AutoCompleteTextView.Validator
        public boolean isValid(CharSequence charSequence) {
            InterfaceC14086c interfaceC14086c = this.f91231a;
            if (interfaceC14086c != null) {
                return interfaceC14086c.isValid(charSequence);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: vi0$b */
    public interface InterfaceC14085b {
        CharSequence fixText(CharSequence charSequence);
    }

    /* JADX INFO: renamed from: vi0$c */
    public interface InterfaceC14086c {
        boolean isValid(CharSequence charSequence);
    }

    @q21(requireAll = false, value = {"android:onItemSelected", "android:onNothingSelected"})
    public static void setOnItemSelectedListener(AutoCompleteTextView autoCompleteTextView, C9871nh.a aVar, C9871nh.c cVar) {
        if (aVar == null && cVar == null) {
            autoCompleteTextView.setOnItemSelectedListener(null);
        } else {
            autoCompleteTextView.setOnItemSelectedListener(new C9871nh.b(aVar, cVar, null));
        }
    }

    @q21(requireAll = false, value = {"android:fixText", "android:isValid"})
    public static void setValidator(AutoCompleteTextView autoCompleteTextView, InterfaceC14085b interfaceC14085b, InterfaceC14086c interfaceC14086c) {
        if (interfaceC14085b == null && interfaceC14086c == null) {
            autoCompleteTextView.setValidator(null);
        } else {
            autoCompleteTextView.setValidator(new C14084a(interfaceC14086c, interfaceC14085b));
        }
    }
}

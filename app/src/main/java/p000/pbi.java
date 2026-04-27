package p000;

import android.os.Bundle;
import android.view.ViewStructure;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69934a})
public class pbi {

    /* JADX INFO: renamed from: a */
    public final Object f70250a;

    /* JADX INFO: renamed from: pbi$a */
    @c5e(23)
    public static class C10881a {
        private C10881a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static Bundle m19357a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static void m19358b(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static void m19359c(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static void m19360d(ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
            viewStructure.setDimens(i, i2, i3, i4, i5, i6);
        }

        /* JADX INFO: renamed from: e */
        public static void m19361e(ViewStructure viewStructure, int i, String str, String str2, String str3) {
            viewStructure.setId(i, str, str2, str3);
        }

        @ih4
        /* JADX INFO: renamed from: f */
        public static void m19362f(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        @ih4
        /* JADX INFO: renamed from: g */
        public static void m19363g(ViewStructure viewStructure, float f, int i, int i2, int i3) {
            viewStructure.setTextStyle(f, i, i2, i3);
        }
    }

    private pbi(@efb ViewStructure viewStructure) {
        this.f70250a = viewStructure;
    }

    @c5e(23)
    @efb
    public static pbi toViewStructureCompat(@efb ViewStructure viewStructure) {
        return new pbi(viewStructure);
    }

    @hib
    public Bundle getExtras() {
        return C10881a.m19357a((ViewStructure) this.f70250a);
    }

    public void setClassName(@efb String str) {
        C10881a.m19358b((ViewStructure) this.f70250a, str);
    }

    public void setContentDescription(@efb CharSequence charSequence) {
        C10881a.m19359c((ViewStructure) this.f70250a, charSequence);
    }

    public void setDimens(int i, int i2, int i3, int i4, int i5, int i6) {
        C10881a.m19360d((ViewStructure) this.f70250a, i, i2, i3, i4, i5, i6);
    }

    public void setId(int i, @hib String str, @hib String str2, @hib String str3) {
        C10881a.m19361e((ViewStructure) this.f70250a, i, str, str2, str3);
    }

    public void setText(@efb CharSequence charSequence) {
        C10881a.m19362f((ViewStructure) this.f70250a, charSequence);
    }

    public void setTextStyle(float f, int i, int i2, int i3) {
        C10881a.m19363g((ViewStructure) this.f70250a, f, i, i2, i3);
    }

    @c5e(23)
    @efb
    public ViewStructure toViewStructure() {
        return (ViewStructure) this.f70250a;
    }
}

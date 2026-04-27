package p000;

import android.view.ViewStructure;

/* JADX INFO: loaded from: classes3.dex */
public class qbi {

    /* JADX INFO: renamed from: a */
    public final Object f73883a;

    /* JADX INFO: renamed from: qbi$a */
    @c5e(23)
    public static class C11415a {
        private C11415a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m20214a(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static void m20215b(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static void m20216c(ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
            viewStructure.setDimens(i, i2, i3, i4, i5, i6);
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static void m20217d(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }
    }

    private qbi(@efb ViewStructure viewStructure) {
        this.f73883a = viewStructure;
    }

    @c5e(23)
    @efb
    public static qbi toViewStructureCompat(@efb ViewStructure viewStructure) {
        return new qbi(viewStructure);
    }

    public void setClassName(@efb String str) {
        C11415a.m20214a((ViewStructure) this.f73883a, str);
    }

    public void setContentDescription(@efb CharSequence charSequence) {
        C11415a.m20215b((ViewStructure) this.f73883a, charSequence);
    }

    public void setDimens(int i, int i2, int i3, int i4, int i5, int i6) {
        C11415a.m20216c((ViewStructure) this.f73883a, i, i2, i3, i4, i5, i6);
    }

    public void setText(@efb CharSequence charSequence) {
        C11415a.m20217d((ViewStructure) this.f73883a, charSequence);
    }

    @c5e(23)
    @efb
    public ViewStructure toViewStructure() {
        return (ViewStructure) this.f73883a;
    }
}

package p000;

import com.google.android.material.C3146R;

/* JADX INFO: loaded from: classes5.dex */
public class sg7 {

    /* JADX INFO: renamed from: a */
    @efb
    @w92
    public final int[] f81729a;

    /* JADX INFO: renamed from: b */
    @hib
    public final qg7 f81730b;

    /* JADX INFO: renamed from: c */
    @gc0
    public final int f81731c;

    /* JADX INFO: renamed from: sg7$b */
    public static class C12570b {

        /* JADX INFO: renamed from: b */
        @hib
        public qg7 f81733b;

        /* JADX INFO: renamed from: a */
        @efb
        @w92
        public int[] f81732a = new int[0];

        /* JADX INFO: renamed from: c */
        @gc0
        public int f81734c = C3146R.attr.colorPrimary;

        @efb
        public sg7 build() {
            return new sg7(this);
        }

        @efb
        @op1
        public C12570b setColorAttributeToHarmonizeWith(@gc0 int i) {
            this.f81734c = i;
            return this;
        }

        @efb
        @op1
        public C12570b setColorAttributes(@hib qg7 qg7Var) {
            this.f81733b = qg7Var;
            return this;
        }

        @efb
        @op1
        public C12570b setColorResourceIds(@efb @w92 int[] iArr) {
            this.f81732a = iArr;
            return this;
        }
    }

    @efb
    public static sg7 createMaterialDefaults() {
        return new C12570b().setColorAttributes(qg7.createMaterialDefaults()).build();
    }

    @dbg
    /* JADX INFO: renamed from: a */
    public int m21953a(@dbg int i) {
        qg7 qg7Var = this.f81730b;
        return (qg7Var == null || qg7Var.getThemeOverlay() == 0) ? i : this.f81730b.getThemeOverlay();
    }

    @gc0
    public int getColorAttributeToHarmonizeWith() {
        return this.f81731c;
    }

    @hib
    public qg7 getColorAttributes() {
        return this.f81730b;
    }

    @efb
    @w92
    public int[] getColorResourceIds() {
        return this.f81729a;
    }

    private sg7(C12570b c12570b) {
        this.f81729a = c12570b.f81732a;
        this.f81730b = c12570b.f81733b;
        this.f81731c = c12570b.f81734c;
    }
}

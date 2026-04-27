package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public interface mjh {

    /* JADX INFO: renamed from: a */
    public static final String f61186a = "androidx.browser.trusted.displaymode.KEY_ID";

    /* JADX INFO: renamed from: mjh$a */
    public static class C9373a implements mjh {

        /* JADX INFO: renamed from: b */
        public static final int f61187b = 0;

        @Override // p000.mjh
        @efb
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(mjh.f61186a, 0);
            return bundle;
        }
    }

    /* JADX INFO: renamed from: mjh$b */
    public static class C9374b implements mjh {

        /* JADX INFO: renamed from: d */
        public static final int f61188d = 1;

        /* JADX INFO: renamed from: e */
        public static final String f61189e = "androidx.browser.trusted.displaymode.KEY_STICKY";

        /* JADX INFO: renamed from: f */
        public static final String f61190f = "androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE";

        /* JADX INFO: renamed from: b */
        public final boolean f61191b;

        /* JADX INFO: renamed from: c */
        public final int f61192c;

        public C9374b(boolean z, int i) {
            this.f61191b = z;
            this.f61192c = i;
        }

        @efb
        public static mjh fromBundle(@efb Bundle bundle) {
            return new C9374b(bundle.getBoolean(f61189e), bundle.getInt(f61190f));
        }

        public boolean isSticky() {
            return this.f61191b;
        }

        public int layoutInDisplayCutoutMode() {
            return this.f61192c;
        }

        @Override // p000.mjh
        @efb
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(mjh.f61186a, 1);
            bundle.putBoolean(f61189e, this.f61191b);
            bundle.putInt(f61190f, this.f61192c);
            return bundle;
        }
    }

    @efb
    static mjh fromBundle(@efb Bundle bundle) {
        return bundle.getInt(f61186a) != 1 ? new C9373a() : C9374b.fromBundle(bundle);
    }

    @efb
    Bundle toBundle();
}

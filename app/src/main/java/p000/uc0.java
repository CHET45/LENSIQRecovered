package p000;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class uc0 {

    /* JADX INFO: renamed from: h */
    public static final uc0 f87467h = new C13483e().build();

    /* JADX INFO: renamed from: i */
    public static final String f87468i = t0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: j */
    public static final String f87469j = t0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: k */
    public static final String f87470k = t0i.intToStringMaxRadix(2);

    /* JADX INFO: renamed from: l */
    public static final String f87471l = t0i.intToStringMaxRadix(3);

    /* JADX INFO: renamed from: m */
    public static final String f87472m = t0i.intToStringMaxRadix(4);

    /* JADX INFO: renamed from: n */
    public static final String f87473n = t0i.intToStringMaxRadix(5);

    /* JADX INFO: renamed from: a */
    public final int f87474a;

    /* JADX INFO: renamed from: b */
    public final int f87475b;

    /* JADX INFO: renamed from: c */
    public final int f87476c;

    /* JADX INFO: renamed from: d */
    public final int f87477d;

    /* JADX INFO: renamed from: e */
    public final int f87478e;

    /* JADX INFO: renamed from: f */
    @ovh
    public final boolean f87479f;

    /* JADX INFO: renamed from: g */
    @hib
    public C13482d f87480g;

    /* JADX INFO: renamed from: uc0$b */
    @c5e(29)
    public static final class C13480b {
        private C13480b() {
        }

        @igg({"WrongConstant"})
        public static void setAllowedCapturePolicy(AudioAttributes.Builder builder, int i) {
            builder.setAllowedCapturePolicy(i);
        }
    }

    /* JADX INFO: renamed from: uc0$c */
    @c5e(32)
    public static final class C13481c {
        private C13481c() {
        }

        public static void setIsContentSpatialized(AudioAttributes.Builder builder, boolean z) {
            builder.setIsContentSpatialized(z);
        }

        @igg({"WrongConstant"})
        public static void setSpatializationBehavior(AudioAttributes.Builder builder, int i) {
            builder.setSpatializationBehavior(i);
        }
    }

    /* JADX INFO: renamed from: uc0$d */
    public static final class C13482d {

        /* JADX INFO: renamed from: a */
        public final AudioAttributes f87481a;

        private C13482d(uc0 uc0Var) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(uc0Var.f87474a).setFlags(uc0Var.f87475b).setUsage(uc0Var.f87476c);
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                C13480b.setAllowedCapturePolicy(usage, uc0Var.f87477d);
            }
            if (i >= 32) {
                C13481c.setSpatializationBehavior(usage, uc0Var.f87478e);
                C13481c.setIsContentSpatialized(usage, uc0Var.f87479f);
            }
            this.f87481a = usage.build();
        }
    }

    /* JADX INFO: renamed from: uc0$e */
    public static final class C13483e {

        /* JADX INFO: renamed from: a */
        public int f87482a = 0;

        /* JADX INFO: renamed from: b */
        public int f87483b = 0;

        /* JADX INFO: renamed from: c */
        public int f87484c = 1;

        /* JADX INFO: renamed from: d */
        public int f87485d = 1;

        /* JADX INFO: renamed from: e */
        public int f87486e = 0;

        /* JADX INFO: renamed from: f */
        public boolean f87487f = false;

        public uc0 build() {
            return new uc0(this.f87482a, this.f87483b, this.f87484c, this.f87485d, this.f87486e, this.f87487f);
        }

        @op1
        public C13483e setAllowedCapturePolicy(int i) {
            this.f87485d = i;
            return this;
        }

        @op1
        public C13483e setContentType(int i) {
            this.f87482a = i;
            return this;
        }

        @op1
        public C13483e setFlags(int i) {
            this.f87483b = i;
            return this;
        }

        @op1
        @ovh
        public C13483e setIsContentSpatialized(boolean z) {
            this.f87487f = z;
            return this;
        }

        @op1
        public C13483e setSpatializationBehavior(int i) {
            this.f87486e = i;
            return this;
        }

        @op1
        public C13483e setUsage(int i) {
            this.f87484c = i;
            return this;
        }
    }

    @ovh
    public static uc0 fromBundle(Bundle bundle) {
        C13483e c13483e = new C13483e();
        String str = f87468i;
        if (bundle.containsKey(str)) {
            c13483e.setContentType(bundle.getInt(str));
        }
        String str2 = f87469j;
        if (bundle.containsKey(str2)) {
            c13483e.setFlags(bundle.getInt(str2));
        }
        String str3 = f87470k;
        if (bundle.containsKey(str3)) {
            c13483e.setUsage(bundle.getInt(str3));
        }
        String str4 = f87471l;
        if (bundle.containsKey(str4)) {
            c13483e.setAllowedCapturePolicy(bundle.getInt(str4));
        }
        String str5 = f87472m;
        if (bundle.containsKey(str5)) {
            c13483e.setSpatializationBehavior(bundle.getInt(str5));
        }
        String str6 = f87473n;
        if (bundle.containsKey(str6)) {
            c13483e.setIsContentSpatialized(bundle.getBoolean(str6));
        }
        return c13483e.build();
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uc0.class != obj.getClass()) {
            return false;
        }
        uc0 uc0Var = (uc0) obj;
        return this.f87474a == uc0Var.f87474a && this.f87475b == uc0Var.f87475b && this.f87476c == uc0Var.f87476c && this.f87477d == uc0Var.f87477d && this.f87478e == uc0Var.f87478e && this.f87479f == uc0Var.f87479f;
    }

    public C13482d getAudioAttributesV21() {
        if (this.f87480g == null) {
            this.f87480g = new C13482d();
        }
        return this.f87480g;
    }

    @ovh
    public int getStreamType() {
        if ((this.f87475b & 1) == 1) {
            return 1;
        }
        switch (this.f87476c) {
        }
        return 1;
    }

    public int hashCode() {
        return ((((((((((527 + this.f87474a) * 31) + this.f87475b) * 31) + this.f87476c) * 31) + this.f87477d) * 31) + this.f87478e) * 31) + (this.f87479f ? 1 : 0);
    }

    @ovh
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f87468i, this.f87474a);
        bundle.putInt(f87469j, this.f87475b);
        bundle.putInt(f87470k, this.f87476c);
        bundle.putInt(f87471l, this.f87477d);
        bundle.putInt(f87472m, this.f87478e);
        bundle.putBoolean(f87473n, this.f87479f);
        return bundle;
    }

    private uc0(int i, int i2, int i3, int i4, int i5, boolean z) {
        this.f87474a = i;
        this.f87475b = i2;
        this.f87476c = i3;
        this.f87477d = i4;
        this.f87478e = i5;
        this.f87479f = z;
    }
}

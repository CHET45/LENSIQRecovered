package p000;

import android.media.AudioAttributes;
import android.os.Bundle;
import p000.gh1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class yc0 implements gh1 {

    /* JADX INFO: renamed from: a */
    public final int f101070a;

    /* JADX INFO: renamed from: b */
    public final int f101071b;

    /* JADX INFO: renamed from: c */
    public final int f101072c;

    /* JADX INFO: renamed from: d */
    public final int f101073d;

    /* JADX INFO: renamed from: e */
    public final int f101074e;

    /* JADX INFO: renamed from: f */
    @hib
    public C15611d f101075f;

    /* JADX INFO: renamed from: m */
    public static final yc0 f101069m = new C15612e().build();

    /* JADX INFO: renamed from: C */
    public static final String f101063C = x0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: F */
    public static final String f101064F = x0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: H */
    public static final String f101065H = x0i.intToStringMaxRadix(2);

    /* JADX INFO: renamed from: L */
    public static final String f101066L = x0i.intToStringMaxRadix(3);

    /* JADX INFO: renamed from: M */
    public static final String f101067M = x0i.intToStringMaxRadix(4);

    /* JADX INFO: renamed from: N */
    public static final gh1.InterfaceC6311a<yc0> f101068N = new gh1.InterfaceC6311a() { // from class: tc0
        @Override // p000.gh1.InterfaceC6311a
        public final gh1 fromBundle(Bundle bundle) {
            return yc0.lambda$static$0(bundle);
        }
    };

    /* JADX INFO: renamed from: yc0$b */
    @c5e(29)
    public static final class C15609b {
        private C15609b() {
        }

        @ih4
        public static void setAllowedCapturePolicy(AudioAttributes.Builder builder, int i) {
            builder.setAllowedCapturePolicy(i);
        }
    }

    /* JADX INFO: renamed from: yc0$c */
    @c5e(32)
    public static final class C15610c {
        private C15610c() {
        }

        @ih4
        public static void setSpatializationBehavior(AudioAttributes.Builder builder, int i) {
            builder.setSpatializationBehavior(i);
        }
    }

    /* JADX INFO: renamed from: yc0$d */
    @c5e(21)
    public static final class C15611d {

        /* JADX INFO: renamed from: a */
        public final AudioAttributes f101076a;

        private C15611d(yc0 yc0Var) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(yc0Var.f101070a).setFlags(yc0Var.f101071b).setUsage(yc0Var.f101072c);
            int i = x0i.f95978a;
            if (i >= 29) {
                C15609b.setAllowedCapturePolicy(usage, yc0Var.f101073d);
            }
            if (i >= 32) {
                C15610c.setSpatializationBehavior(usage, yc0Var.f101074e);
            }
            this.f101076a = usage.build();
        }
    }

    /* JADX INFO: renamed from: yc0$e */
    public static final class C15612e {

        /* JADX INFO: renamed from: a */
        public int f101077a = 0;

        /* JADX INFO: renamed from: b */
        public int f101078b = 0;

        /* JADX INFO: renamed from: c */
        public int f101079c = 1;

        /* JADX INFO: renamed from: d */
        public int f101080d = 1;

        /* JADX INFO: renamed from: e */
        public int f101081e = 0;

        public yc0 build() {
            return new yc0(this.f101077a, this.f101078b, this.f101079c, this.f101080d, this.f101081e);
        }

        @op1
        public C15612e setAllowedCapturePolicy(int i) {
            this.f101080d = i;
            return this;
        }

        @op1
        public C15612e setContentType(int i) {
            this.f101077a = i;
            return this;
        }

        @op1
        public C15612e setFlags(int i) {
            this.f101078b = i;
            return this;
        }

        @op1
        public C15612e setSpatializationBehavior(int i) {
            this.f101081e = i;
            return this;
        }

        @op1
        public C15612e setUsage(int i) {
            this.f101079c = i;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ yc0 lambda$static$0(Bundle bundle) {
        C15612e c15612e = new C15612e();
        String str = f101063C;
        if (bundle.containsKey(str)) {
            c15612e.setContentType(bundle.getInt(str));
        }
        String str2 = f101064F;
        if (bundle.containsKey(str2)) {
            c15612e.setFlags(bundle.getInt(str2));
        }
        String str3 = f101065H;
        if (bundle.containsKey(str3)) {
            c15612e.setUsage(bundle.getInt(str3));
        }
        String str4 = f101066L;
        if (bundle.containsKey(str4)) {
            c15612e.setAllowedCapturePolicy(bundle.getInt(str4));
        }
        String str5 = f101067M;
        if (bundle.containsKey(str5)) {
            c15612e.setSpatializationBehavior(bundle.getInt(str5));
        }
        return c15612e.build();
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yc0.class != obj.getClass()) {
            return false;
        }
        yc0 yc0Var = (yc0) obj;
        return this.f101070a == yc0Var.f101070a && this.f101071b == yc0Var.f101071b && this.f101072c == yc0Var.f101072c && this.f101073d == yc0Var.f101073d && this.f101074e == yc0Var.f101074e;
    }

    @c5e(21)
    public C15611d getAudioAttributesV21() {
        if (this.f101075f == null) {
            this.f101075f = new C15611d();
        }
        return this.f101075f;
    }

    public int hashCode() {
        return ((((((((527 + this.f101070a) * 31) + this.f101071b) * 31) + this.f101072c) * 31) + this.f101073d) * 31) + this.f101074e;
    }

    @Override // p000.gh1
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f101063C, this.f101070a);
        bundle.putInt(f101064F, this.f101071b);
        bundle.putInt(f101065H, this.f101072c);
        bundle.putInt(f101066L, this.f101073d);
        bundle.putInt(f101067M, this.f101074e);
        return bundle;
    }

    private yc0(int i, int i2, int i3, int i4, int i5) {
        this.f101070a = i;
        this.f101071b = i2;
        this.f101072c = i3;
        this.f101073d = i4;
        this.f101074e = i5;
    }
}

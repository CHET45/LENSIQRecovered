package p000;

import android.os.Bundle;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p000.gh1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class p84 implements gh1 {

    /* JADX INFO: renamed from: e */
    public static final int f69962e = 0;

    /* JADX INFO: renamed from: f */
    public static final int f69963f = 1;

    /* JADX INFO: renamed from: a */
    public final int f69965a;

    /* JADX INFO: renamed from: b */
    @h78(from = 0)
    public final int f69966b;

    /* JADX INFO: renamed from: c */
    @h78(from = 0)
    public final int f69967c;

    /* JADX INFO: renamed from: d */
    @hib
    public final String f69968d;

    /* JADX INFO: renamed from: m */
    public static final p84 f69964m = new C10834b(0).build();

    /* JADX INFO: renamed from: C */
    public static final String f69957C = x0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: F */
    public static final String f69958F = x0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: H */
    public static final String f69959H = x0i.intToStringMaxRadix(2);

    /* JADX INFO: renamed from: L */
    public static final String f69960L = x0i.intToStringMaxRadix(3);

    /* JADX INFO: renamed from: M */
    public static final gh1.InterfaceC6311a<p84> f69961M = new gh1.InterfaceC6311a() { // from class: n84
        @Override // p000.gh1.InterfaceC6311a
        public final gh1 fromBundle(Bundle bundle) {
            return p84.lambda$static$0(bundle);
        }
    };

    /* JADX INFO: renamed from: p84$b */
    public static final class C10834b {

        /* JADX INFO: renamed from: a */
        public final int f69969a;

        /* JADX INFO: renamed from: b */
        public int f69970b;

        /* JADX INFO: renamed from: c */
        public int f69971c;

        /* JADX INFO: renamed from: d */
        @hib
        public String f69972d;

        public C10834b(int i) {
            this.f69969a = i;
        }

        public p84 build() {
            u80.checkArgument(this.f69970b <= this.f69971c);
            return new p84(this);
        }

        @op1
        public C10834b setMaxVolume(@h78(from = 0) int i) {
            this.f69971c = i;
            return this;
        }

        @op1
        public C10834b setMinVolume(@h78(from = 0) int i) {
            this.f69970b = i;
            return this;
        }

        @op1
        public C10834b setRoutingControllerId(@hib String str) {
            u80.checkArgument(this.f69969a != 0 || str == null);
            this.f69972d = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: p84$c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC10835c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p84 lambda$static$0(Bundle bundle) {
        int i = bundle.getInt(f69957C, 0);
        int i2 = bundle.getInt(f69958F, 0);
        int i3 = bundle.getInt(f69959H, 0);
        return new C10834b(i).setMinVolume(i2).setMaxVolume(i3).setRoutingControllerId(bundle.getString(f69960L)).build();
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p84)) {
            return false;
        }
        p84 p84Var = (p84) obj;
        return this.f69965a == p84Var.f69965a && this.f69966b == p84Var.f69966b && this.f69967c == p84Var.f69967c && x0i.areEqual(this.f69968d, p84Var.f69968d);
    }

    public int hashCode() {
        int i = (((((527 + this.f69965a) * 31) + this.f69966b) * 31) + this.f69967c) * 31;
        String str = this.f69968d;
        return i + (str == null ? 0 : str.hashCode());
    }

    @Override // p000.gh1
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i = this.f69965a;
        if (i != 0) {
            bundle.putInt(f69957C, i);
        }
        int i2 = this.f69966b;
        if (i2 != 0) {
            bundle.putInt(f69958F, i2);
        }
        int i3 = this.f69967c;
        if (i3 != 0) {
            bundle.putInt(f69959H, i3);
        }
        String str = this.f69968d;
        if (str != null) {
            bundle.putString(f69960L, str);
        }
        return bundle;
    }

    @Deprecated
    public p84(int i, @h78(from = 0) int i2, @h78(from = 0) int i3) {
        this(new C10834b(i).setMinVolume(i2).setMaxVolume(i3));
    }

    private p84(C10834b c10834b) {
        this.f69965a = c10834b.f69969a;
        this.f69966b = c10834b.f69970b;
        this.f69967c = c10834b.f69971c;
        this.f69968d = c10834b.f69972d;
    }
}

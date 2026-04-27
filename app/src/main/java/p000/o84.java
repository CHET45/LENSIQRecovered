package p000;

import android.os.Bundle;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class o84 {

    /* JADX INFO: renamed from: e */
    public static final int f66634e = 0;

    /* JADX INFO: renamed from: f */
    public static final int f66635f = 1;

    /* JADX INFO: renamed from: g */
    public static final o84 f66636g = new C10218b(0).build();

    /* JADX INFO: renamed from: h */
    public static final String f66637h = t0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: i */
    public static final String f66638i = t0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: j */
    public static final String f66639j = t0i.intToStringMaxRadix(2);

    /* JADX INFO: renamed from: k */
    public static final String f66640k = t0i.intToStringMaxRadix(3);

    /* JADX INFO: renamed from: a */
    public final int f66641a;

    /* JADX INFO: renamed from: b */
    @h78(from = 0)
    public final int f66642b;

    /* JADX INFO: renamed from: c */
    @h78(from = 0)
    public final int f66643c;

    /* JADX INFO: renamed from: d */
    @hib
    public final String f66644d;

    /* JADX INFO: renamed from: o84$b */
    public static final class C10218b {

        /* JADX INFO: renamed from: a */
        public final int f66645a;

        /* JADX INFO: renamed from: b */
        public int f66646b;

        /* JADX INFO: renamed from: c */
        public int f66647c;

        /* JADX INFO: renamed from: d */
        @hib
        public String f66648d;

        public C10218b(int i) {
            this.f66645a = i;
        }

        public o84 build() {
            v80.checkArgument(this.f66646b <= this.f66647c);
            return new o84(this);
        }

        @op1
        public C10218b setMaxVolume(@h78(from = 0) int i) {
            this.f66647c = i;
            return this;
        }

        @op1
        public C10218b setMinVolume(@h78(from = 0) int i) {
            this.f66646b = i;
            return this;
        }

        @op1
        public C10218b setRoutingControllerId(@hib String str) {
            v80.checkArgument(this.f66645a != 0 || str == null);
            this.f66648d = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: o84$c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC10219c {
    }

    @ovh
    public static o84 fromBundle(Bundle bundle) {
        int i = bundle.getInt(f66637h, 0);
        int i2 = bundle.getInt(f66638i, 0);
        int i3 = bundle.getInt(f66639j, 0);
        return new C10218b(i).setMinVolume(i2).setMaxVolume(i3).setRoutingControllerId(bundle.getString(f66640k)).build();
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o84)) {
            return false;
        }
        o84 o84Var = (o84) obj;
        return this.f66641a == o84Var.f66641a && this.f66642b == o84Var.f66642b && this.f66643c == o84Var.f66643c && Objects.equals(this.f66644d, o84Var.f66644d);
    }

    public int hashCode() {
        int i = (((((527 + this.f66641a) * 31) + this.f66642b) * 31) + this.f66643c) * 31;
        String str = this.f66644d;
        return i + (str == null ? 0 : str.hashCode());
    }

    @ovh
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i = this.f66641a;
        if (i != 0) {
            bundle.putInt(f66637h, i);
        }
        int i2 = this.f66642b;
        if (i2 != 0) {
            bundle.putInt(f66638i, i2);
        }
        int i3 = this.f66643c;
        if (i3 != 0) {
            bundle.putInt(f66639j, i3);
        }
        String str = this.f66644d;
        if (str != null) {
            bundle.putString(f66640k, str);
        }
        return bundle;
    }

    @ovh
    @Deprecated
    public o84(int i, @h78(from = 0) int i2, @h78(from = 0) int i3) {
        this(new C10218b(i).setMinVolume(i2).setMaxVolume(i3));
    }

    private o84(C10218b c10218b) {
        this.f66641a = c10218b.f66645a;
        this.f66642b = c10218b.f66646b;
        this.f66643c = c10218b.f66647c;
        this.f66644d = c10218b.f66648d;
    }
}

package p000;

import android.view.View;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: jf */
/* JADX INFO: loaded from: classes3.dex */
public final class C7890jf {

    /* JADX INFO: renamed from: d */
    public static final int f50431d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f50432e = 2;

    /* JADX INFO: renamed from: f */
    public static final int f50433f = 3;

    /* JADX INFO: renamed from: g */
    public static final int f50434g = 4;

    /* JADX INFO: renamed from: a */
    public final View f50435a;

    /* JADX INFO: renamed from: b */
    public final int f50436b;

    /* JADX INFO: renamed from: c */
    @hib
    public final String f50437c;

    /* JADX INFO: renamed from: jf$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final View f50438a;

        /* JADX INFO: renamed from: b */
        public final int f50439b;

        /* JADX INFO: renamed from: c */
        @hib
        public String f50440c;

        public a(View view, int i) {
            this.f50438a = view;
            this.f50439b = i;
        }

        public C7890jf build() {
            return new C7890jf(this.f50438a, this.f50439b, this.f50440c);
        }

        @op1
        public a setDetailedReason(@hib String str) {
            this.f50440c = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: jf$b */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    @ovh
    @Deprecated
    public C7890jf(View view, int i) {
        this(view, i, null);
    }

    @ovh
    @Deprecated
    public C7890jf(View view, int i, @hib String str) {
        this.f50435a = view;
        this.f50436b = i;
        this.f50437c = str;
    }
}

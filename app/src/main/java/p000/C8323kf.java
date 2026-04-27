package p000;

import android.view.View;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: kf */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class C8323kf {

    /* JADX INFO: renamed from: d */
    public static final int f53814d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f53815e = 2;

    /* JADX INFO: renamed from: f */
    public static final int f53816f = 3;

    /* JADX INFO: renamed from: g */
    public static final int f53817g = 4;

    /* JADX INFO: renamed from: a */
    public final View f53818a;

    /* JADX INFO: renamed from: b */
    public final int f53819b;

    /* JADX INFO: renamed from: c */
    @hib
    public final String f53820c;

    /* JADX INFO: renamed from: kf$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final View f53821a;

        /* JADX INFO: renamed from: b */
        public final int f53822b;

        /* JADX INFO: renamed from: c */
        @hib
        public String f53823c;

        public a(View view, int i) {
            this.f53821a = view;
            this.f53822b = i;
        }

        public C8323kf build() {
            return new C8323kf(this.f53821a, this.f53822b, this.f53823c);
        }

        @op1
        public a setDetailedReason(@hib String str) {
            this.f53823c = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: kf$b */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    @Deprecated
    public C8323kf(View view, int i) {
        this(view, i, null);
    }

    @Deprecated
    public C8323kf(View view, int i, @hib String str) {
        this.f53818a = view;
        this.f53819b = i;
        this.f53820c = str;
    }
}

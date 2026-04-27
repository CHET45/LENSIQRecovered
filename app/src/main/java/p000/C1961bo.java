package p000;

import com.google.firebase.analytics.C3554a;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: renamed from: bo */
/* JADX INFO: loaded from: classes5.dex */
public final class C1961bo {

    /* JADX INFO: renamed from: a */
    @gib
    public static volatile FirebaseAnalytics f14234a;

    /* JADX INFO: renamed from: b */
    @yfb
    public static final Object f14235b = new Object();

    @hib
    public static final FirebaseAnalytics getANALYTICS() {
        return f14234a;
    }

    @yfb
    public static final FirebaseAnalytics getAnalytics(@efb hw5 hw5Var) {
        md8.checkNotNullParameter(hw5Var, "<this>");
        if (f14234a == null) {
            synchronized (f14235b) {
                try {
                    if (f14234a == null) {
                        f14234a = FirebaseAnalytics.getInstance(xy5.getApp(hw5.f45141a).getApplicationContext());
                    }
                    bth bthVar = bth.f14751a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = f14234a;
        md8.checkNotNull(firebaseAnalytics);
        return firebaseAnalytics;
    }

    @yfb
    public static final Object getLOCK() {
        return f14235b;
    }

    public static final void logEvent(@efb FirebaseAnalytics firebaseAnalytics, @efb String str, @efb qy6<? super ufc, bth> qy6Var) {
        md8.checkNotNullParameter(firebaseAnalytics, "<this>");
        md8.checkNotNullParameter(str, "name");
        md8.checkNotNullParameter(qy6Var, "block");
        ufc ufcVar = new ufc();
        qy6Var.invoke(ufcVar);
        firebaseAnalytics.logEvent(str, ufcVar.getBundle());
    }

    public static final void setANALYTICS(@gib FirebaseAnalytics firebaseAnalytics) {
        f14234a = firebaseAnalytics;
    }

    public static final void setConsent(@efb FirebaseAnalytics firebaseAnalytics, @efb qy6<? super C3554a, bth> qy6Var) {
        md8.checkNotNullParameter(firebaseAnalytics, "<this>");
        md8.checkNotNullParameter(qy6Var, "block");
        C3554a c3554a = new C3554a();
        qy6Var.invoke(c3554a);
        firebaseAnalytics.setConsent(c3554a.asMap());
    }
}

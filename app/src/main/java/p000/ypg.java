package p000;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes5.dex */
public final class ypg {
    public static final void withAnalyticsForTest(@efb FirebaseAnalytics firebaseAnalytics, @efb ny6<bth> ny6Var) {
        md8.checkNotNullParameter(firebaseAnalytics, "analytics");
        md8.checkNotNullParameter(ny6Var, "block");
        synchronized (C1961bo.getLOCK()) {
            FirebaseAnalytics analytics = C1961bo.getANALYTICS();
            C1961bo.setANALYTICS(firebaseAnalytics);
            try {
                ny6Var.invoke();
                C1961bo.setANALYTICS(analytics);
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                C1961bo.setANALYTICS(analytics);
                throw th;
            }
        }
    }
}

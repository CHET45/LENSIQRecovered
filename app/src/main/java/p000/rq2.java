package p000;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public final class rq2 {

    /* JADX INFO: renamed from: rq2$a */
    @c5e(24)
    public static class C12203a {
        private C12203a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static LocaleList m21482a(Configuration configuration) {
            return configuration.getLocales();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static void m21483b(@efb Configuration configuration, @efb af9 af9Var) {
            configuration.setLocales((LocaleList) af9Var.unwrap());
        }
    }

    private rq2() {
    }

    @efb
    public static af9 getLocales(@efb Configuration configuration) {
        return af9.wrap(C12203a.m21482a(configuration));
    }

    public static void setLocales(@efb Configuration configuration, @efb af9 af9Var) {
        C12203a.m21483b(configuration, af9Var);
    }
}

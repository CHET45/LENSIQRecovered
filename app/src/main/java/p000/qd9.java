package p000;

import android.content.Context;
import android.os.Bundle;
import p000.p7f;

/* JADX INFO: loaded from: classes5.dex */
@qpf
public final class qd9 implements p7f {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C11443a f74076b = new C11443a(null);

    /* JADX INFO: renamed from: c */
    @yfb
    @Deprecated
    public static final String f74077c = "firebase_sessions_enabled";

    /* JADX INFO: renamed from: d */
    @yfb
    @Deprecated
    public static final String f74078d = "firebase_sessions_sessions_restart_timeout";

    /* JADX INFO: renamed from: e */
    @yfb
    @Deprecated
    public static final String f74079e = "firebase_sessions_sampling_rate";

    /* JADX INFO: renamed from: a */
    public final Bundle f74080a;

    /* JADX INFO: renamed from: qd9$a */
    public static final class C11443a {
        public /* synthetic */ C11443a(jt3 jt3Var) {
            this();
        }

        private C11443a() {
        }
    }

    @a28
    public qd9(@yfb Context context) {
        md8.checkNotNullParameter(context, "appContext");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f74080a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // p000.p7f
    @gib
    public Double getSamplingRate() {
        if (this.f74080a.containsKey(f74079e)) {
            return Double.valueOf(this.f74080a.getDouble(f74079e));
        }
        return null;
    }

    @Override // p000.p7f
    @gib
    public Boolean getSessionEnabled() {
        if (this.f74080a.containsKey(f74077c)) {
            return Boolean.valueOf(this.f74080a.getBoolean(f74077c));
        }
        return null;
    }

    @Override // p000.p7f
    @gib
    /* JADX INFO: renamed from: getSessionRestartTimeout-FghU774 */
    public bt4 mo31700getSessionRestartTimeoutFghU774() {
        if (this.f74080a.containsKey(f74078d)) {
            return bt4.m28057boximpl(ft4.toDuration(this.f74080a.getInt(f74078d), lt4.f58684e));
        }
        return null;
    }

    @Override // p000.p7f
    public boolean isSettingsStale() {
        return p7f.C10827a.isSettingsStale(this);
    }

    @Override // p000.p7f
    @gib
    public Object updateSettings(@yfb zy2<? super bth> zy2Var) {
        return p7f.C10827a.updateSettings(this, zy2Var);
    }
}

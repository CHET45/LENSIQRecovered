package p000;

import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes7.dex */
@x98
public final class gb8 {

    /* JADX INFO: renamed from: a */
    public final bb8 f39252a;

    public gb8(bb8 bb8Var) {
        this.f39252a = (bb8) v7d.checkNotNull(bb8Var, NotificationCompat.CATEGORY_TRANSPORT);
    }

    public Object geRawMethodName(rua<?, ?> ruaVar) {
        return ruaVar.m21570a(this.f39252a.ordinal());
    }

    public void setRawMethodName(rua<?, ?> ruaVar, Object obj) {
        ruaVar.m21571b(this.f39252a.ordinal(), obj);
    }
}

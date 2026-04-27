package p000;

import org.json.JSONObject;
import p000.a7f;

/* JADX INFO: loaded from: classes5.dex */
public class kz3 implements k7f {
    /* JADX INFO: renamed from: a */
    public static a7f m15177a(fa3 fa3Var) {
        return new a7f(fa3Var.getCurrentTimeMillis() + ((long) 3600000), new a7f.C0084b(8, 4), new a7f.C0083a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // p000.k7f
    public a7f buildFromJson(fa3 fa3Var, JSONObject jSONObject) {
        return m15177a(fa3Var);
    }
}

package p000;

import android.database.Cursor;

/* JADX INFO: loaded from: classes5.dex */
public class rhe implements v77 {

    /* JADX INFO: renamed from: b */
    public static final String f78325b = "sessionToken";

    /* JADX INFO: renamed from: a */
    public final yie f78326a;

    public rhe(yie yieVar) {
        this.f78326a = yieVar;
    }

    private byte[] get(@efb String str) {
        return (byte[]) this.f78326a.m26113t("SELECT value FROM globals WHERE name = ?").m26119b(str).m26121d(new pz6() { // from class: qhe
            @Override // p000.pz6
            public final Object apply(Object obj) {
                return rhe.lambda$get$0((Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$get$0(Cursor cursor) {
        return cursor.getBlob(0);
    }

    private void set(@efb String str, @efb byte[] bArr) {
        this.f78326a.m26109p("INSERT OR REPLACE INTO globals (name, value) VALUES (?, ?)", str, bArr);
    }

    @Override // p000.v77
    @efb
    public vj1 getSessionsToken() {
        byte[] bArr = get(f78325b);
        return bArr == null ? vj1.f91344e : vj1.copyFrom(bArr);
    }

    @Override // p000.v77
    public void setSessionToken(@efb vj1 vj1Var) {
        set(f78325b, vj1Var.toByteArray());
    }
}

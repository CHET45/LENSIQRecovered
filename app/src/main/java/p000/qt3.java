package p000;

import android.content.Context;
import p000.gh3;
import p000.vv3;

/* JADX INFO: loaded from: classes3.dex */
@ovh
@Deprecated
public final class qt3 implements gh3.InterfaceC6313a {

    /* JADX INFO: renamed from: a */
    public final Context f75582a;

    /* JADX INFO: renamed from: b */
    @hib
    public final qdh f75583b;

    /* JADX INFO: renamed from: c */
    public final gh3.InterfaceC6313a f75584c;

    public qt3(Context context) {
        this(context, (String) null, (qdh) null);
    }

    public qt3(Context context, @hib String str) {
        this(context, str, (qdh) null);
    }

    @Override // p000.gh3.InterfaceC6313a
    public nt3 createDataSource() {
        nt3 nt3Var = new nt3(this.f75582a, this.f75584c.createDataSource());
        qdh qdhVar = this.f75583b;
        if (qdhVar != null) {
            nt3Var.addTransferListener(qdhVar);
        }
        return nt3Var;
    }

    public qt3(Context context, @hib String str, @hib qdh qdhVar) {
        this(context, qdhVar, new vv3.C14271b().setUserAgent(str));
    }

    public qt3(Context context, gh3.InterfaceC6313a interfaceC6313a) {
        this(context, (qdh) null, interfaceC6313a);
    }

    public qt3(Context context, @hib qdh qdhVar, gh3.InterfaceC6313a interfaceC6313a) {
        this.f75582a = context.getApplicationContext();
        this.f75583b = qdhVar;
        this.f75584c = interfaceC6313a;
    }
}

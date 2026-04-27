package p000;

import android.content.Context;
import p000.aw3;
import p000.ih3;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class pt3 implements ih3.InterfaceC7283a {

    /* JADX INFO: renamed from: a */
    public final Context f71982a;

    /* JADX INFO: renamed from: b */
    @hib
    public final pdh f71983b;

    /* JADX INFO: renamed from: c */
    public final ih3.InterfaceC7283a f71984c;

    public pt3(Context context) {
        this(context, (String) null, (pdh) null);
    }

    public pt3(Context context, @hib String str) {
        this(context, str, (pdh) null);
    }

    @Override // p000.ih3.InterfaceC7283a
    public ot3 createDataSource() {
        ot3 ot3Var = new ot3(this.f71982a, this.f71984c.createDataSource());
        pdh pdhVar = this.f71983b;
        if (pdhVar != null) {
            ot3Var.addTransferListener(pdhVar);
        }
        return ot3Var;
    }

    public pt3(Context context, @hib String str, @hib pdh pdhVar) {
        this(context, pdhVar, new aw3.C1623b().setUserAgent(str));
    }

    public pt3(Context context, ih3.InterfaceC7283a interfaceC7283a) {
        this(context, (pdh) null, interfaceC7283a);
    }

    public pt3(Context context, @hib pdh pdhVar, ih3.InterfaceC7283a interfaceC7283a) {
        this.f71982a = context.getApplicationContext();
        this.f71983b = pdhVar;
        this.f71984c = interfaceC7283a;
    }
}

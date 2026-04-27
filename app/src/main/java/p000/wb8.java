package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes6.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class wb8 implements sy6<ife, pne> {

    /* JADX INFO: renamed from: a */
    public final dfe f93889a;

    @b28
    public wb8(dfe dfeVar) {
        this.f93889a = dfeVar;
    }

    @Override // p000.sy6
    public pne apply(ife ifeVar) {
        return new pne(this.f93889a.getBleDevice(ifeVar.getBluetoothDevice().getAddress()), ifeVar.getRssi(), ifeVar.getTimestampNanos(), ifeVar.getScanCallbackType(), ifeVar.getScanRecord(), ifeVar.isConnectable());
    }
}

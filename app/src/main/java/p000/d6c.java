package p000;

import androidx.lifecycle.AbstractC1158q;
import p000.p7e;
import p000.x5c;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class d6c implements x5c {

    /* JADX INFO: renamed from: c */
    public final o5b<x5c.AbstractC14928b> f28555c = new o5b<>();

    /* JADX INFO: renamed from: d */
    public final z6f<x5c.AbstractC14928b.c> f28556d = z6f.create();

    public d6c() {
        setState(x5c.f96834b);
    }

    @Override // p000.x5c
    @efb
    public ja9<x5c.AbstractC14928b.c> getResult() {
        return this.f28556d;
    }

    @Override // p000.x5c
    @efb
    public AbstractC1158q<x5c.AbstractC14928b> getState() {
        return this.f28555c;
    }

    public void setState(@efb x5c.AbstractC14928b state) {
        this.f28555c.postValue(state);
        if (state instanceof x5c.AbstractC14928b.c) {
            this.f28556d.set((x5c.AbstractC14928b.c) state);
        } else if (state instanceof x5c.AbstractC14928b.a) {
            this.f28556d.setException(((x5c.AbstractC14928b.a) state).getThrowable());
        }
    }
}

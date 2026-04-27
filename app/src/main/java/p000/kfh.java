package p000;

import p000.jbi;
import p000.kfh;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kfh<CHILD extends kfh<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* JADX INFO: renamed from: a */
    public efh<? super TranscodeType> f53994a = beb.getFactory();

    private CHILD self() {
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final efh<? super TranscodeType> m14732a() {
        return this.f53994a;
    }

    @efb
    public final CHILD dontTransition() {
        return (CHILD) transition(beb.getFactory());
    }

    @efb
    public final CHILD transition(int i) {
        return (CHILD) transition(new i8i(i));
    }

    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @efb
    public final CHILD transition(@efb jbi.InterfaceC7853a interfaceC7853a) {
        return (CHILD) transition(new cbi(interfaceC7853a));
    }

    @efb
    public final CHILD transition(@efb efh<? super TranscodeType> efhVar) {
        this.f53994a = (efh) t7d.checkNotNull(efhVar);
        return (CHILD) self();
    }
}

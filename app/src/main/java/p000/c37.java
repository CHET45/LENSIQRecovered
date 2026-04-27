package p000;

import p000.jbi;

/* JADX INFO: loaded from: classes3.dex */
public final class c37<TranscodeType> extends kfh<c37<TranscodeType>, TranscodeType> {
    @efb
    public static <TranscodeType> c37<TranscodeType> with(int i) {
        return new c37().transition(i);
    }

    @efb
    public static <TranscodeType> c37<TranscodeType> withNoTransition() {
        return new c37().dontTransition();
    }

    @efb
    public static <TranscodeType> c37<TranscodeType> with(@efb jbi.InterfaceC7853a interfaceC7853a) {
        return new c37().transition(interfaceC7853a);
    }

    @efb
    public static <TranscodeType> c37<TranscodeType> with(@efb efh<? super TranscodeType> efhVar) {
        return new c37().transition(efhVar);
    }
}

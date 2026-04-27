package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class tg4 extends rj8 {

    /* JADX INFO: renamed from: e */
    @yfb
    public final yf4 f84617e;

    public tg4(@yfb yf4 yf4Var) {
        this.f84617e = yf4Var;
    }

    @Override // p000.rj8
    public boolean getOnCancelling() {
        return false;
    }

    @Override // p000.rj8
    public void invoke(@gib Throwable th) {
        this.f84617e.dispose();
    }
}

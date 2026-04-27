package p000;

/* JADX INFO: loaded from: classes.dex */
@ug5
@e0g(parameters = 0)
public final class y3e implements qy6<Boolean, bth> {

    /* JADX INFO: renamed from: b */
    public static final int f100228b = 8;

    /* JADX INFO: renamed from: a */
    @gib
    public u2d f100229a;

    @gib
    public final u2d getPointerInteropFilter$ui_release() {
        return this.f100229a;
    }

    @Override // p000.qy6
    public /* bridge */ /* synthetic */ bth invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return bth.f14751a;
    }

    public final void setPointerInteropFilter$ui_release(@gib u2d u2dVar) {
        this.f100229a = u2dVar;
    }

    public void invoke(boolean z) {
        u2d u2dVar = this.f100229a;
        if (u2dVar == null) {
            return;
        }
        u2dVar.setDisallowIntercept$ui_release(z);
    }
}

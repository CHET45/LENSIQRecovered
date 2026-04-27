package p000;

import p000.rr2;

/* JADX INFO: loaded from: classes6.dex */
@is2
public class a2b implements qs2, x1b, uu2<Integer> {

    /* JADX INFO: renamed from: a */
    public Integer f181a;

    /* JADX INFO: renamed from: b */
    public final vkb<Integer> f182b;

    /* JADX INFO: renamed from: c */
    public final o0f f183c = new o0f();

    /* JADX INFO: renamed from: a2b$a */
    public class C0020a implements n8d<Throwable> {
        public C0020a() {
        }

        @Override // p000.n8d
        public boolean test(Throwable th) {
            return (th instanceof h51) && ((h51) th).getBleGattOperationType() == i51.f45769l;
        }
    }

    @b28
    public a2b(gfe gfeVar, @w8b(rr2.C12213c.f79065b) int i) {
        this.f182b = gfeVar.getOnMtuChanged().retry(new C0020a());
        this.f181a = Integer.valueOf(i);
    }

    @Override // p000.x1b
    public int getMtu() {
        return this.f181a.intValue();
    }

    @Override // p000.qs2
    public void onConnectionSubscribed() {
        this.f183c.set(this.f182b.subscribe(this, r07.emptyConsumer()));
    }

    @Override // p000.qs2
    public void onConnectionUnsubscribed() {
        this.f183c.dispose();
    }

    @Override // p000.uu2
    public void accept(Integer num) {
        this.f181a = num;
    }
}

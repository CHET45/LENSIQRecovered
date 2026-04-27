package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/flow/ChannelAsFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
public final class cu1<T> extends fu1<T> {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f27590f = AtomicIntegerFieldUpdater.newUpdater(cu1.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: d */
    @yfb
    public final hsd<T> f27591d;

    /* JADX INFO: renamed from: e */
    public final boolean f27592e;

    public /* synthetic */ cu1(hsd hsdVar, boolean z, e13 e13Var, int i, gf1 gf1Var, int i2, jt3 jt3Var) {
        this(hsdVar, z, (i2 & 4) != 0 ? a05.f2a : e13Var, (i2 & 8) != 0 ? -3 : i, (i2 & 16) != 0 ? gf1.f39657a : gf1Var);
    }

    private final /* synthetic */ int getConsumed$volatile() {
        return this.consumed$volatile;
    }

    private final void markConsumed() {
        if (this.f27592e && f27590f.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    private final /* synthetic */ void setConsumed$volatile(int i) {
        this.consumed$volatile = i;
    }

    @Override // p000.fu1
    @yfb
    /* JADX INFO: renamed from: a */
    public String mo8699a() {
        return "channel=" + this.f27591d;
    }

    @Override // p000.fu1
    @gib
    /* JADX INFO: renamed from: c */
    public Object mo8700c(@yfb vdd<? super T> vddVar, @yfb zy2<? super bth> zy2Var) {
        Object objEmitAllImpl$FlowKt__ChannelsKt = e76.emitAllImpl$FlowKt__ChannelsKt(new tye(vddVar), this.f27591d, this.f27592e, zy2Var);
        return objEmitAllImpl$FlowKt__ChannelsKt == pd8.getCOROUTINE_SUSPENDED() ? objEmitAllImpl$FlowKt__ChannelsKt : bth.f14751a;
    }

    @Override // p000.fu1, p000.y56
    @gib
    public Object collect(@yfb t66<? super T> t66Var, @yfb zy2<? super bth> zy2Var) {
        if (this.f37755b != -3) {
            Object objCollect = super.collect(t66Var, zy2Var);
            return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
        }
        markConsumed();
        Object objEmitAllImpl$FlowKt__ChannelsKt = e76.emitAllImpl$FlowKt__ChannelsKt(t66Var, this.f27591d, this.f27592e, zy2Var);
        return objEmitAllImpl$FlowKt__ChannelsKt == pd8.getCOROUTINE_SUSPENDED() ? objEmitAllImpl$FlowKt__ChannelsKt : bth.f14751a;
    }

    @Override // p000.fu1
    @yfb
    /* JADX INFO: renamed from: d */
    public fu1<T> mo8701d(@yfb e13 e13Var, int i, @yfb gf1 gf1Var) {
        return new cu1(this.f27591d, this.f27592e, e13Var, i, gf1Var);
    }

    @Override // p000.fu1
    @yfb
    public y56<T> dropChannelOperators() {
        return new cu1(this.f27591d, this.f27592e, null, 0, null, 28, null);
    }

    @Override // p000.fu1
    @yfb
    public hsd<T> produceImpl(@yfb x13 x13Var) {
        markConsumed();
        return this.f37755b == -3 ? this.f27591d : super.produceImpl(x13Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cu1(@yfb hsd<? extends T> hsdVar, boolean z, @yfb e13 e13Var, int i, @yfb gf1 gf1Var) {
        super(e13Var, i, gf1Var);
        this.f27591d = hsdVar;
        this.f27592e = z;
        this.consumed$volatile = 0;
    }
}

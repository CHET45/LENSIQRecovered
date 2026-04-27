package p000;

import okio.BufferedSink;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes3.dex */
public final class m1c<T> implements l1c<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final w1f<T> f59642a;

    public m1c(@yfb w1f<T> w1fVar) {
        md8.checkNotNullParameter(w1fVar, "delegate");
        this.f59642a = w1fVar;
    }

    @Override // p000.l1c
    public T getDefaultValue() {
        return this.f59642a.getDefaultValue();
    }

    @Override // p000.l1c
    @gib
    public Object readFrom(@yfb BufferedSource bufferedSource, @yfb zy2<? super T> zy2Var) {
        return this.f59642a.readFrom(bufferedSource.inputStream(), zy2Var);
    }

    @Override // p000.l1c
    @gib
    public Object writeTo(T t, @yfb BufferedSink bufferedSink, @yfb zy2<? super bth> zy2Var) {
        Object objWriteTo = this.f59642a.writeTo(t, bufferedSink.outputStream(), zy2Var);
        return objWriteTo == pd8.getCOROUTINE_SUSPENDED() ? objWriteTo : bth.f14751a;
    }
}

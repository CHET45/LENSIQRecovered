package p000;

import okio.BufferedSink;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes3.dex */
public interface l1c<T> {
    T getDefaultValue();

    @gib
    Object readFrom(@yfb BufferedSource bufferedSource, @yfb zy2<? super T> zy2Var);

    @gib
    Object writeTo(T t, @yfb BufferedSink bufferedSink, @yfb zy2<? super bth> zy2Var);
}

package p000;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public interface w1f<T> {
    T getDefaultValue();

    @gib
    Object readFrom(@yfb InputStream inputStream, @yfb zy2<? super T> zy2Var);

    @gib
    Object writeTo(T t, @yfb OutputStream outputStream, @yfb zy2<? super bth> zy2Var);
}

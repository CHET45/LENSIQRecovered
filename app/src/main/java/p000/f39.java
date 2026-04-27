package p000;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface f39 extends whd {
    void add(wj1 element);

    void add(byte[] element);

    boolean addAllByteArray(Collection<byte[]> c);

    boolean addAllByteString(Collection<? extends wj1> c);

    List<byte[]> asByteArrayList();

    byte[] getByteArray(int index);

    wj1 getByteString(int index);

    Object getRaw(int index);

    List<?> getUnderlyingElements();

    f39 getUnmodifiableView();

    void mergeFrom(f39 other);

    void set(int index, wj1 element);

    void set(int index, byte[] element);
}

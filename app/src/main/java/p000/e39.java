package p000;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface e39 extends vhd {
    void add(vj1 element);

    void add(byte[] element);

    boolean addAllByteArray(Collection<byte[]> c);

    boolean addAllByteString(Collection<? extends vj1> c);

    List<byte[]> asByteArrayList();

    byte[] getByteArray(int index);

    vj1 getByteString(int index);

    Object getRaw(int index);

    List<?> getUnderlyingElements();

    e39 getUnmodifiableView();

    void mergeFrom(e39 other);

    void set(int index, vj1 element);

    void set(int index, byte[] element);
}

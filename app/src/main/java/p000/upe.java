package p000;

import java.io.IOException;
import p000.c60;

/* JADX INFO: loaded from: classes3.dex */
@ey1
public interface upe<T> {
    boolean equals(T message, T other);

    int getSerializedSize(T message);

    int hashCode(T message);

    boolean isInitialized(T message);

    void makeImmutable(T message);

    void mergeFrom(T message, ird reader, yi5 extensionRegistry) throws IOException;

    void mergeFrom(T message, T other);

    void mergeFrom(T message, byte[] data, int position, int limit, c60.C2209b registers) throws IOException;

    T newInstance();

    void writeTo(T message, qsi writer) throws IOException;
}

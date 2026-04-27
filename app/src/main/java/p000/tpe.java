package p000;

import java.io.IOException;
import p000.d60;

/* JADX INFO: loaded from: classes4.dex */
@ay1
public interface tpe<T> {
    boolean equals(T message, T other);

    int getSerializedSize(T message);

    int hashCode(T message);

    boolean isInitialized(T message);

    void makeImmutable(T message);

    void mergeFrom(T message, hrd reader, zi5 extensionRegistry) throws IOException;

    void mergeFrom(T message, T other);

    void mergeFrom(T message, byte[] data, int position, int limit, d60.C4625b registers) throws IOException;

    T newInstance();

    void writeTo(T message, rsi writer) throws IOException;
}

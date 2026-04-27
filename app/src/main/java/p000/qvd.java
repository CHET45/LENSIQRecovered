package p000;

import p000.gd9;

/* JADX INFO: loaded from: classes5.dex */
@sx4
@jd7
public interface qvd<K, V> {
    long getAccessTime();

    int getHash();

    @wx1
    K getKey();

    @wx1
    qvd<K, V> getNext();

    qvd<K, V> getNextInAccessQueue();

    qvd<K, V> getNextInWriteQueue();

    qvd<K, V> getPreviousInAccessQueue();

    qvd<K, V> getPreviousInWriteQueue();

    @wx1
    gd9.InterfaceC6220a0<K, V> getValueReference();

    long getWriteTime();

    void setAccessTime(long time);

    void setNextInAccessQueue(qvd<K, V> next);

    void setNextInWriteQueue(qvd<K, V> next);

    void setPreviousInAccessQueue(qvd<K, V> previous);

    void setPreviousInWriteQueue(qvd<K, V> previous);

    void setValueReference(gd9.InterfaceC6220a0<K, V> valueReference);

    void setWriteTime(long time);
}

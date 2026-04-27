package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@px4
@jh4("Use ImmutableTypeToInstanceMap or MutableTypeToInstanceMap")
public interface mmh<B> extends Map<nmh<? extends B>, B> {
    @wx1
    <T extends B> T getInstance(Class<T> type);

    @wx1
    <T extends B> T getInstance(nmh<T> type);

    @op1
    @wx1
    <T extends B> T putInstance(Class<T> type, @zfc T value);

    @op1
    @wx1
    <T extends B> T putInstance(nmh<T> type, @zfc T value);
}

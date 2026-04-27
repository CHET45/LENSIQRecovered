package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@jh4("Use ImmutableClassToInstanceMap or MutableClassToInstanceMap")
@gd7
@tx4
public interface m12<B> extends Map<Class<? extends B>, B> {
    @wx1
    <T extends B> T getInstance(Class<T> type);

    @op1
    @wx1
    <T extends B> T putInstance(Class<T> type, @dgc T value);
}

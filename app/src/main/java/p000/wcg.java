package p000;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public interface wcg {
    <T> void subscribe(Class<T> cls, Executor executor, z55<? super T> z55Var);

    <T> void subscribe(Class<T> cls, z55<? super T> z55Var);

    <T> void unsubscribe(Class<T> cls, z55<? super T> z55Var);
}

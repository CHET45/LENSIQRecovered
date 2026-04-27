package p000;

import java.lang.ref.PhantomReference;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@yg8
@by4
public abstract class sv5<T> extends PhantomReference<T> implements tv5 {
    public sv5(@wx1 T referent, uv5 queue) {
        super(referent, queue.f89223a);
        queue.m23601b();
    }
}

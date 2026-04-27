package p000;

import java.util.Queue;
import p000.k4d;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mr0<T extends k4d> {

    /* JADX INFO: renamed from: b */
    public static final int f61777b = 20;

    /* JADX INFO: renamed from: a */
    public final Queue<T> f61778a = v0i.createQueue(20);

    /* JADX INFO: renamed from: a */
    public abstract T mo3348a();

    /* JADX INFO: renamed from: b */
    public T m17523b() {
        T tPoll = this.f61778a.poll();
        return tPoll == null ? (T) mo3348a() : tPoll;
    }

    public void offer(T t) {
        if (this.f61778a.size() < 20) {
            this.f61778a.offer(t);
        }
    }
}

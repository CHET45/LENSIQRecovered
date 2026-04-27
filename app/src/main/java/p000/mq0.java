package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.hf0;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class mq0 implements hf0 {

    /* JADX INFO: renamed from: b */
    public hf0.C6832a f61732b;

    /* JADX INFO: renamed from: c */
    public hf0.C6832a f61733c;

    /* JADX INFO: renamed from: d */
    public hf0.C6832a f61734d;

    /* JADX INFO: renamed from: e */
    public hf0.C6832a f61735e;

    /* JADX INFO: renamed from: f */
    public ByteBuffer f61736f;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f61737g;

    /* JADX INFO: renamed from: h */
    public boolean f61738h;

    public mq0() {
        ByteBuffer byteBuffer = hf0.f43348a;
        this.f61736f = byteBuffer;
        this.f61737g = byteBuffer;
        hf0.C6832a c6832a = hf0.C6832a.f43349e;
        this.f61734d = c6832a;
        this.f61735e = c6832a;
        this.f61732b = c6832a;
        this.f61733c = c6832a;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m17514a() {
        return this.f61737g.hasRemaining();
    }

    /* JADX INFO: renamed from: b */
    public final ByteBuffer m17515b(int i) {
        if (this.f61736f.capacity() < i) {
            this.f61736f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f61736f.clear();
        }
        ByteBuffer byteBuffer = this.f61736f;
        this.f61737g = byteBuffer;
        return byteBuffer;
    }

    @Override // p000.hf0
    public final hf0.C6832a configure(hf0.C6832a c6832a) throws hf0.C6833b {
        this.f61734d = c6832a;
        this.f61735e = onConfigure(c6832a);
        return isActive() ? this.f61735e : hf0.C6832a.f43349e;
    }

    @Override // p000.hf0
    public final void flush() {
        this.f61737g = hf0.f43348a;
        this.f61738h = false;
        this.f61732b = this.f61734d;
        this.f61733c = this.f61735e;
        onFlush();
    }

    @Override // p000.hf0
    @un1
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f61737g;
        this.f61737g = hf0.f43348a;
        return byteBuffer;
    }

    @Override // p000.hf0
    @un1
    public boolean isActive() {
        return this.f61735e != hf0.C6832a.f43349e;
    }

    @Override // p000.hf0
    @un1
    public boolean isEnded() {
        return this.f61738h && this.f61737g == hf0.f43348a;
    }

    public hf0.C6832a onConfigure(hf0.C6832a c6832a) throws hf0.C6833b {
        return hf0.C6832a.f43349e;
    }

    public void onFlush() {
    }

    public void onQueueEndOfStream() {
    }

    public void onReset() {
    }

    @Override // p000.hf0
    public final void queueEndOfStream() {
        this.f61738h = true;
        onQueueEndOfStream();
    }

    @Override // p000.hf0
    public final void reset() {
        ByteBuffer byteBuffer = hf0.f43348a;
        this.f61737g = byteBuffer;
        this.f61738h = false;
        this.f61736f = byteBuffer;
        hf0.C6832a c6832a = hf0.C6832a.f43349e;
        this.f61734d = c6832a;
        this.f61735e = c6832a;
        this.f61732b = c6832a;
        this.f61733c = c6832a;
        onReset();
    }
}

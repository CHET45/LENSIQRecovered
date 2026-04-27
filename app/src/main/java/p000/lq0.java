package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.if0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class lq0 implements if0 {

    /* JADX INFO: renamed from: b */
    public if0.C7262a f58444b;

    /* JADX INFO: renamed from: c */
    public if0.C7262a f58445c;

    /* JADX INFO: renamed from: d */
    public if0.C7262a f58446d;

    /* JADX INFO: renamed from: e */
    public if0.C7262a f58447e;

    /* JADX INFO: renamed from: f */
    public ByteBuffer f58448f;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f58449g;

    /* JADX INFO: renamed from: h */
    public boolean f58450h;

    public lq0() {
        ByteBuffer byteBuffer = if0.f46718a;
        this.f58448f = byteBuffer;
        this.f58449g = byteBuffer;
        if0.C7262a c7262a = if0.C7262a.f46719e;
        this.f58446d = c7262a;
        this.f58447e = c7262a;
        this.f58444b = c7262a;
        this.f58445c = c7262a;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m16314a() {
        return this.f58449g.hasRemaining();
    }

    /* JADX INFO: renamed from: b */
    public void mo3214b() {
    }

    /* JADX INFO: renamed from: c */
    public void mo3215c() {
    }

    @Override // p000.if0
    @op1
    public final if0.C7262a configure(if0.C7262a c7262a) throws if0.C7263b {
        this.f58446d = c7262a;
        this.f58447e = onConfigure(c7262a);
        return isActive() ? this.f58447e : if0.C7262a.f46719e;
    }

    /* JADX INFO: renamed from: d */
    public void mo3216d() {
    }

    /* JADX INFO: renamed from: e */
    public final ByteBuffer m16315e(int i) {
        if (this.f58448f.capacity() < i) {
            this.f58448f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f58448f.clear();
        }
        ByteBuffer byteBuffer = this.f58448f;
        this.f58449g = byteBuffer;
        return byteBuffer;
    }

    @Override // p000.if0
    public final void flush() {
        this.f58449g = if0.f46718a;
        this.f58450h = false;
        this.f58444b = this.f58446d;
        this.f58445c = this.f58447e;
        mo3214b();
    }

    @Override // p000.if0
    @un1
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f58449g;
        this.f58449g = if0.f46718a;
        return byteBuffer;
    }

    @Override // p000.if0
    public boolean isActive() {
        return this.f58447e != if0.C7262a.f46719e;
    }

    @Override // p000.if0
    @un1
    public boolean isEnded() {
        return this.f58450h && this.f58449g == if0.f46718a;
    }

    @op1
    public if0.C7262a onConfigure(if0.C7262a c7262a) throws if0.C7263b {
        return if0.C7262a.f46719e;
    }

    @Override // p000.if0
    public final void queueEndOfStream() {
        this.f58450h = true;
        mo3215c();
    }

    @Override // p000.if0
    public final void reset() {
        flush();
        this.f58448f = if0.f46718a;
        if0.C7262a c7262a = if0.C7262a.f46719e;
        this.f58446d = c7262a;
        this.f58447e = c7262a;
        this.f58444b = c7262a;
        this.f58445c = c7262a;
        mo3216d();
    }
}

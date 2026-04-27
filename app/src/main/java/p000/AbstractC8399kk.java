package p000;

import com.iflytek.aikit.core.AiHelper;
import java.nio.ByteBuffer;
import java.security.InvalidParameterException;
import p000.rui;

/* JADX INFO: renamed from: kk */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC8399kk<T, O extends rui> {

    /* JADX INFO: renamed from: a */
    public int f54312a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f54313b;

    /* JADX INFO: renamed from: e */
    public final String f54316e;

    /* JADX INFO: renamed from: h */
    public O f54319h;

    /* JADX INFO: renamed from: c */
    public qvi f54314c = qvi.MEM;

    /* JADX INFO: renamed from: d */
    public EnumC0304al f54315d = EnumC0304al.BEGIN;

    /* JADX INFO: renamed from: f */
    public boolean f54317f = false;

    /* JADX INFO: renamed from: g */
    public boolean f54318g = false;

    public AbstractC8399kk(O o, String str) {
        this.f54316e = str;
        this.f54319h = o;
        o.ref(this);
        this.f54312a = AbstractC0294ak.getAtomicHandle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private T response() {
        return this;
    }

    private void sync(int i) {
        if (this.f54318g) {
            m14805d(this.f54312a, "status", Integer.valueOf(this.f54315d.getValue()));
        }
        mo9219a(this.f54312a);
        if (this.f54313b != null) {
            AiHelper.getInst().newDirectBuffer(i, this.f54316e, this.f54313b, this.f54314c.getValue(), mo9220h().getValue(), this.f54315d.getValue(), this.f54313b.capacity());
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo9219a(int i);

    /* JADX INFO: renamed from: b */
    public void m14803b(int i, String str, Boolean bool) {
        AiHelper.getInst().newBoolean(i, str, bool.booleanValue());
    }

    public T begin() {
        this.f54315d = (EnumC0304al) m14809i(this.f54315d, EnumC0304al.BEGIN);
        return response();
    }

    /* JADX INFO: renamed from: c */
    public void m14804c(int i, String str, Double d) {
        AiHelper.getInst().newDouble(i, str, d.doubleValue());
    }

    public T cont() {
        this.f54315d = (EnumC0304al) m14809i(this.f54315d, EnumC0304al.CONTINUE);
        return response();
    }

    /* JADX INFO: renamed from: d */
    public void m14805d(int i, String str, Integer num) {
        AiHelper.getInst().newInteger(i, str, num.intValue());
    }

    public T data(String str) {
        return data(str.getBytes());
    }

    /* JADX INFO: renamed from: e */
    public void m14806e(int i, String str, byte[] bArr) {
        AiHelper.getInst().newBuffer(i, str, bArr, qvi.MEM.getValue(), wvi.OTHER.getValue(), EnumC0304al.ONCE.getValue());
    }

    public T end() {
        this.f54315d = (EnumC0304al) m14809i(this.f54315d, EnumC0304al.END);
        return response();
    }

    /* JADX INFO: renamed from: f */
    public void m14807f(int i) {
        sync(i);
        AiHelper.getInst().newBuilder(i, this.f54316e, this.f54312a);
    }

    public T file(String str) {
        this.f54314c = qvi.FILE;
        return data(str);
    }

    public void finalize() throws Throwable {
        try {
            super.finalize();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        AiHelper.getInst().m7090f(this.f54312a);
    }

    /* JADX INFO: renamed from: g */
    public void m14808g(int i) {
        sync(i);
        AiHelper.getInst().newDesc(i, this.f54316e, this.f54312a);
    }

    /* JADX INFO: renamed from: h */
    public abstract wvi mo9220h();

    /* JADX INFO: renamed from: i */
    public <P> P m14809i(P p, P p2) {
        if (p != p2) {
            this.f54317f = true;
        }
        return p2;
    }

    public T once() {
        this.f54315d = (EnumC0304al) m14809i(this.f54315d, EnumC0304al.ONCE);
        return response();
    }

    public T status(EnumC0304al enumC0304al) {
        this.f54315d = (EnumC0304al) m14809i(this.f54315d, enumC0304al);
        return response();
    }

    public O valid() {
        if (this.f54318g && this.f54313b == null) {
            throw new InvalidParameterException();
        }
        return this.f54319h;
    }

    public T data(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.f54313b;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f54313b = byteBuffer;
        this.f54318g = true;
        return response();
    }

    public T file(ByteBuffer byteBuffer) {
        this.f54314c = qvi.FILE;
        return data(byteBuffer);
    }

    public T data(byte[] bArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
        byteBufferAllocateDirect.put(bArr);
        return data(byteBufferAllocateDirect);
    }

    public T file(byte[] bArr) {
        this.f54314c = qvi.FILE;
        return data(bArr);
    }
}

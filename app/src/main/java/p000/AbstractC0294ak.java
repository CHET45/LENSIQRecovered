package p000;

import com.iflytek.aikit.core.AiHelper;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: ak */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC0294ak {

    /* JADX INFO: renamed from: e */
    public static final AtomicInteger f1773e = new AtomicInteger(0);

    /* JADX INFO: renamed from: d */
    public b f1777d;

    /* JADX INFO: renamed from: b */
    public int f1775b = 0;

    /* JADX INFO: renamed from: c */
    public EnumC0304al f1776c = EnumC0304al.BEGIN;

    /* JADX INFO: renamed from: a */
    public int f1774a = getAtomicHandle();

    /* JADX INFO: renamed from: ak$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public ByteBuffer f1778a;

        /* JADX INFO: renamed from: b */
        public b f1779b;

        private b() {
        }

        public ByteBuffer getBuffer() {
            return this.f1778a;
        }

        public b getLastData() {
            return this.f1779b;
        }

        public void setBuffer(ByteBuffer byteBuffer) {
            this.f1778a = byteBuffer;
        }

        public void setLastData(b bVar) {
            this.f1779b = bVar;
        }
    }

    private void clearInputData() {
        while (true) {
            b bVar = this.f1777d;
            if (bVar == null) {
                return;
            }
            bVar.getBuffer().clear();
            this.f1777d.setBuffer(null);
            this.f1777d = this.f1777d.getLastData();
        }
    }

    public static int getAtomicHandle() {
        return f1773e.incrementAndGet();
    }

    /* JADX INFO: renamed from: a */
    public void m843a(String str, ByteBuffer byteBuffer, qvi qviVar, wvi wviVar) {
        if (byteBuffer == null) {
            return;
        }
        if (wviVar.equals(wvi.OTHER)) {
            AiHelper.getInst().newBuffer(this.f1774a, str, byteBuffer.array(), qviVar.getValue(), wviVar.getValue(), this.f1776c.getValue());
        } else {
            m848f(str, byteBuffer, qviVar, wviVar.getValue());
        }
    }

    /* JADX INFO: renamed from: b */
    public void m844b(String str, ByteBuffer byteBuffer, wvi wviVar) {
        if (byteBuffer == null) {
            return;
        }
        m843a(str, byteBuffer, qvi.MEM, wviVar);
    }

    /* JADX INFO: renamed from: c */
    public void m845c(String str, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        m847e(str, bArr, wvi.OTHER);
    }

    public void clean() {
        AiHelper.getInst().paramClear(this.f1774a);
        AiHelper.getInst().inputClear(this.f1774a);
        clearInputData();
        this.f1775b = 0;
    }

    /* JADX INFO: renamed from: d */
    public void m846d(String str, byte[] bArr, qvi qviVar, wvi wviVar) {
        if (bArr == null) {
            return;
        }
        if (wviVar.equals(wvi.OTHER)) {
            AiHelper.getInst().newBuffer(this.f1774a, str, bArr, qviVar.getValue(), wviVar.getValue(), this.f1776c.getValue());
            return;
        }
        int length = bArr.length;
        wvi wviVar2 = wvi.TEXT;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(length + (wviVar == wviVar2 ? 2 : 0));
        byteBufferAllocateDirect.put(bArr);
        if (wviVar == wviVar2) {
            byteBufferAllocateDirect.put((byte) 0);
        }
        if (this.f1777d == null) {
            b bVar = new b();
            this.f1777d = bVar;
            bVar.f1778a = byteBufferAllocateDirect;
        } else {
            b bVar2 = new b();
            bVar2.setBuffer(byteBufferAllocateDirect);
            bVar2.setLastData(this.f1777d);
            this.f1777d = bVar2;
        }
        m848f(str, byteBufferAllocateDirect, qviVar, wviVar.getValue());
    }

    /* JADX INFO: renamed from: e */
    public void m847e(String str, byte[] bArr, wvi wviVar) {
        if (bArr == null) {
            return;
        }
        m846d(str, bArr, qvi.MEM, wviVar);
    }

    /* JADX INFO: renamed from: f */
    public void m848f(String str, ByteBuffer byteBuffer, qvi qviVar, int i) {
        AiHelper.getInst().newDirectBuffer(this.f1774a, str, byteBuffer, qviVar.getValue(), i, this.f1776c.getValue(), byteBuffer.capacity());
    }

    public void finalize() throws Throwable {
        super.finalize();
        clearInputData();
    }

    /* JADX INFO: renamed from: g */
    public void m849g(String str, byte[] bArr, qvi qviVar, int i, int i2) {
        if (bArr != null) {
            AiHelper.getInst().newCustom(this.f1774a, str, bArr, qviVar.getValue(), i, i2);
        }
    }

    public String toString() {
        return AiHelper.getInst().paramToString(this.f1774a);
    }
}

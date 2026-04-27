package p000;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p000.if0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ff0 {

    /* JADX INFO: renamed from: a */
    public final kx7<if0> f36338a;

    /* JADX INFO: renamed from: b */
    public final List<if0> f36339b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public ByteBuffer[] f36340c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d */
    public if0.C7262a f36341d;

    /* JADX INFO: renamed from: e */
    public if0.C7262a f36342e;

    /* JADX INFO: renamed from: f */
    public boolean f36343f;

    public ff0(kx7<if0> kx7Var) {
        this.f36338a = kx7Var;
        if0.C7262a c7262a = if0.C7262a.f46719e;
        this.f36341d = c7262a;
        this.f36342e = c7262a;
        this.f36343f = false;
    }

    private int getFinalOutputBufferIndex() {
        return this.f36340c.length - 1;
    }

    private void processData(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            int i = 0;
            while (i <= getFinalOutputBufferIndex()) {
                if (!this.f36340c[i].hasRemaining()) {
                    if0 if0Var = this.f36339b.get(i);
                    if (!if0Var.isEnded()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.f36340c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : if0.f46718a;
                        long jRemaining = byteBuffer2.remaining();
                        if0Var.queueInput(byteBuffer2);
                        this.f36340c[i] = if0Var.getOutput();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f36340c[i].hasRemaining();
                    } else if (!this.f36340c[i].hasRemaining() && i < getFinalOutputBufferIndex()) {
                        this.f36339b.get(i + 1).queueEndOfStream();
                    }
                }
                i++;
            }
        }
    }

    @op1
    public if0.C7262a configure(if0.C7262a c7262a) throws if0.C7263b {
        if (c7262a.equals(if0.C7262a.f46719e)) {
            throw new if0.C7263b(c7262a);
        }
        for (int i = 0; i < this.f36338a.size(); i++) {
            if0 if0Var = this.f36338a.get(i);
            if0.C7262a c7262aConfigure = if0Var.configure(c7262a);
            if (if0Var.isActive()) {
                u80.checkState(!c7262aConfigure.equals(if0.C7262a.f46719e));
                c7262a = c7262aConfigure;
            }
        }
        this.f36342e = c7262a;
        return c7262a;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff0)) {
            return false;
        }
        ff0 ff0Var = (ff0) obj;
        if (this.f36338a.size() != ff0Var.f36338a.size()) {
            return false;
        }
        for (int i = 0; i < this.f36338a.size(); i++) {
            if (this.f36338a.get(i) != ff0Var.f36338a.get(i)) {
                return false;
            }
        }
        return true;
    }

    public void flush() {
        this.f36339b.clear();
        this.f36341d = this.f36342e;
        this.f36343f = false;
        for (int i = 0; i < this.f36338a.size(); i++) {
            if0 if0Var = this.f36338a.get(i);
            if0Var.flush();
            if (if0Var.isActive()) {
                this.f36339b.add(if0Var);
            }
        }
        this.f36340c = new ByteBuffer[this.f36339b.size()];
        for (int i2 = 0; i2 <= getFinalOutputBufferIndex(); i2++) {
            this.f36340c[i2] = this.f36339b.get(i2).getOutput();
        }
    }

    public ByteBuffer getOutput() {
        if (!isOperational()) {
            return if0.f46718a;
        }
        ByteBuffer byteBuffer = this.f36340c[getFinalOutputBufferIndex()];
        if (!byteBuffer.hasRemaining()) {
            processData(if0.f46718a);
        }
        return byteBuffer;
    }

    public if0.C7262a getOutputAudioFormat() {
        return this.f36341d;
    }

    public int hashCode() {
        return this.f36338a.hashCode();
    }

    public boolean isEnded() {
        return this.f36343f && this.f36339b.get(getFinalOutputBufferIndex()).isEnded() && !this.f36340c[getFinalOutputBufferIndex()].hasRemaining();
    }

    public boolean isOperational() {
        return !this.f36339b.isEmpty();
    }

    public void queueEndOfStream() {
        if (!isOperational() || this.f36343f) {
            return;
        }
        this.f36343f = true;
        this.f36339b.get(0).queueEndOfStream();
    }

    public void queueInput(ByteBuffer byteBuffer) {
        if (!isOperational() || this.f36343f) {
            return;
        }
        processData(byteBuffer);
    }

    public void reset() {
        for (int i = 0; i < this.f36338a.size(); i++) {
            if0 if0Var = this.f36338a.get(i);
            if0Var.flush();
            if0Var.reset();
        }
        this.f36340c = new ByteBuffer[0];
        if0.C7262a c7262a = if0.C7262a.f46719e;
        this.f36341d = c7262a;
        this.f36342e = c7262a;
        this.f36343f = false;
    }
}

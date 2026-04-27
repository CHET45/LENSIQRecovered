package p000;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p000.hf0;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class gf0 {

    /* JADX INFO: renamed from: a */
    public final kx7<hf0> f39651a;

    /* JADX INFO: renamed from: b */
    public final List<hf0> f39652b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public ByteBuffer[] f39653c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d */
    public hf0.C6832a f39654d;

    /* JADX INFO: renamed from: e */
    public hf0.C6832a f39655e;

    /* JADX INFO: renamed from: f */
    public boolean f39656f;

    public gf0(kx7<hf0> kx7Var) {
        this.f39651a = kx7Var;
        hf0.C6832a c6832a = hf0.C6832a.f43349e;
        this.f39654d = c6832a;
        this.f39655e = c6832a;
        this.f39656f = false;
    }

    private int getFinalOutputBufferIndex() {
        return this.f39653c.length - 1;
    }

    private void processData(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            int i = 0;
            while (i <= getFinalOutputBufferIndex()) {
                if (!this.f39653c[i].hasRemaining()) {
                    hf0 hf0Var = this.f39652b.get(i);
                    if (!hf0Var.isEnded()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.f39653c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : hf0.f43348a;
                        long jRemaining = byteBuffer2.remaining();
                        hf0Var.queueInput(byteBuffer2);
                        this.f39653c[i] = hf0Var.getOutput();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f39653c[i].hasRemaining();
                    } else if (!this.f39653c[i].hasRemaining() && i < getFinalOutputBufferIndex()) {
                        this.f39652b.get(i + 1).queueEndOfStream();
                    }
                }
                i++;
            }
        }
    }

    @op1
    public hf0.C6832a configure(hf0.C6832a c6832a) throws hf0.C6833b {
        if (c6832a.equals(hf0.C6832a.f43349e)) {
            throw new hf0.C6833b(c6832a);
        }
        for (int i = 0; i < this.f39651a.size(); i++) {
            hf0 hf0Var = this.f39651a.get(i);
            hf0.C6832a c6832aConfigure = hf0Var.configure(c6832a);
            if (hf0Var.isActive()) {
                v80.checkState(!c6832aConfigure.equals(hf0.C6832a.f43349e));
                c6832a = c6832aConfigure;
            }
        }
        this.f39655e = c6832a;
        return c6832a;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf0)) {
            return false;
        }
        gf0 gf0Var = (gf0) obj;
        if (this.f39651a.size() != gf0Var.f39651a.size()) {
            return false;
        }
        for (int i = 0; i < this.f39651a.size(); i++) {
            if (this.f39651a.get(i) != gf0Var.f39651a.get(i)) {
                return false;
            }
        }
        return true;
    }

    public void flush() {
        this.f39652b.clear();
        this.f39654d = this.f39655e;
        this.f39656f = false;
        for (int i = 0; i < this.f39651a.size(); i++) {
            hf0 hf0Var = this.f39651a.get(i);
            hf0Var.flush();
            if (hf0Var.isActive()) {
                this.f39652b.add(hf0Var);
            }
        }
        this.f39653c = new ByteBuffer[this.f39652b.size()];
        for (int i2 = 0; i2 <= getFinalOutputBufferIndex(); i2++) {
            this.f39653c[i2] = this.f39652b.get(i2).getOutput();
        }
    }

    public ByteBuffer getOutput() {
        if (!isOperational()) {
            return hf0.f43348a;
        }
        ByteBuffer byteBuffer = this.f39653c[getFinalOutputBufferIndex()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        processData(hf0.f43348a);
        return this.f39653c[getFinalOutputBufferIndex()];
    }

    public hf0.C6832a getOutputAudioFormat() {
        return this.f39654d;
    }

    public int hashCode() {
        return this.f39651a.hashCode();
    }

    public boolean isEnded() {
        return this.f39656f && this.f39652b.get(getFinalOutputBufferIndex()).isEnded() && !this.f39653c[getFinalOutputBufferIndex()].hasRemaining();
    }

    public boolean isOperational() {
        return !this.f39652b.isEmpty();
    }

    public void queueEndOfStream() {
        if (!isOperational() || this.f39656f) {
            return;
        }
        this.f39656f = true;
        this.f39652b.get(0).queueEndOfStream();
    }

    public void queueInput(ByteBuffer byteBuffer) {
        if (!isOperational() || this.f39656f) {
            return;
        }
        processData(byteBuffer);
    }

    public void reset() {
        for (int i = 0; i < this.f39651a.size(); i++) {
            hf0 hf0Var = this.f39651a.get(i);
            hf0Var.flush();
            hf0Var.reset();
        }
        this.f39653c = new ByteBuffer[0];
        hf0.C6832a c6832a = hf0.C6832a.f43349e;
        this.f39654d = c6832a;
        this.f39655e = c6832a;
        this.f39656f = false;
    }
}

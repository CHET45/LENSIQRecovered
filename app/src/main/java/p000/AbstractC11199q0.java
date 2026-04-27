package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: q0 */
/* JADX INFO: loaded from: classes5.dex */
@xx4
@tw7
public abstract class AbstractC11199q0 extends AbstractC11839r1 {

    /* JADX INFO: renamed from: b */
    public static final long f72615b = 0;

    /* JADX INFO: renamed from: a */
    public final lh7[] f72616a;

    /* JADX INFO: renamed from: q0$a */
    public class a implements wh7 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ wh7[] f72617a;

        public a(final wh7[] val$hashers) {
            this.f72617a = val$hashers;
        }

        @Override // p000.wh7
        public jh7 hash() {
            return AbstractC11199q0.this.mo19900a(this.f72617a);
        }

        @Override // p000.wh7
        public <T> wh7 putObject(@hgc T instance, s07<? super T> funnel) {
            for (wh7 wh7Var : this.f72617a) {
                wh7Var.putObject(instance, funnel);
            }
            return this;
        }

        @Override // p000.wh7, p000.obd
        public wh7 putBoolean(boolean b) {
            for (wh7 wh7Var : this.f72617a) {
                wh7Var.putBoolean(b);
            }
            return this;
        }

        @Override // p000.wh7, p000.obd
        public wh7 putByte(byte b) {
            for (wh7 wh7Var : this.f72617a) {
                wh7Var.putByte(b);
            }
            return this;
        }

        @Override // p000.wh7, p000.obd
        public wh7 putChar(char c) {
            for (wh7 wh7Var : this.f72617a) {
                wh7Var.putChar(c);
            }
            return this;
        }

        @Override // p000.wh7, p000.obd
        public wh7 putDouble(double d) {
            for (wh7 wh7Var : this.f72617a) {
                wh7Var.putDouble(d);
            }
            return this;
        }

        @Override // p000.wh7, p000.obd
        public wh7 putFloat(float f) {
            for (wh7 wh7Var : this.f72617a) {
                wh7Var.putFloat(f);
            }
            return this;
        }

        @Override // p000.wh7, p000.obd
        public wh7 putInt(int i) {
            for (wh7 wh7Var : this.f72617a) {
                wh7Var.putInt(i);
            }
            return this;
        }

        @Override // p000.wh7, p000.obd
        public wh7 putLong(long l) {
            for (wh7 wh7Var : this.f72617a) {
                wh7Var.putLong(l);
            }
            return this;
        }

        @Override // p000.wh7, p000.obd
        public wh7 putShort(short s) {
            for (wh7 wh7Var : this.f72617a) {
                wh7Var.putShort(s);
            }
            return this;
        }

        @Override // p000.wh7, p000.obd
        public wh7 putString(CharSequence chars, Charset charset) {
            for (wh7 wh7Var : this.f72617a) {
                wh7Var.putString(chars, charset);
            }
            return this;
        }

        @Override // p000.wh7, p000.obd
        public wh7 putUnencodedChars(CharSequence chars) {
            for (wh7 wh7Var : this.f72617a) {
                wh7Var.putUnencodedChars(chars);
            }
            return this;
        }

        @Override // p000.wh7, p000.obd
        public wh7 putBytes(byte[] bytes) {
            for (wh7 wh7Var : this.f72617a) {
                wh7Var.putBytes(bytes);
            }
            return this;
        }

        @Override // p000.wh7, p000.obd
        public wh7 putBytes(byte[] bytes, int off, int len) {
            for (wh7 wh7Var : this.f72617a) {
                wh7Var.putBytes(bytes, off, len);
            }
            return this;
        }

        @Override // p000.wh7, p000.obd
        public wh7 putBytes(ByteBuffer bytes) {
            int iPosition = bytes.position();
            for (wh7 wh7Var : this.f72617a) {
                ji8.m14107d(bytes, iPosition);
                wh7Var.putBytes(bytes);
            }
            return this;
        }
    }

    public AbstractC11199q0(lh7... functions) {
        for (lh7 lh7Var : functions) {
            v7d.checkNotNull(lh7Var);
        }
        this.f72616a = functions;
    }

    private wh7 fromHashers(wh7[] hashers) {
        return new a(hashers);
    }

    /* JADX INFO: renamed from: a */
    public abstract jh7 mo19900a(wh7[] hashers);

    @Override // p000.lh7
    public wh7 newHasher() {
        int length = this.f72616a.length;
        wh7[] wh7VarArr = new wh7[length];
        for (int i = 0; i < length; i++) {
            wh7VarArr[i] = this.f72616a[i].newHasher();
        }
        return fromHashers(wh7VarArr);
    }

    @Override // p000.AbstractC11839r1, p000.lh7
    public wh7 newHasher(int expectedInputSize) {
        v7d.checkArgument(expectedInputSize >= 0);
        int length = this.f72616a.length;
        wh7[] wh7VarArr = new wh7[length];
        for (int i = 0; i < length; i++) {
            wh7VarArr[i] = this.f72616a[i].newHasher(expectedInputSize);
        }
        return fromHashers(wh7VarArr);
    }
}

package p000;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import p000.in4;

/* JADX INFO: loaded from: classes3.dex */
public class p5g implements b6e<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final in4 f69751a;

    /* JADX INFO: renamed from: b */
    public final z60 f69752b;

    /* JADX INFO: renamed from: p5g$a */
    public static class C10802a implements in4.InterfaceC7518b {

        /* JADX INFO: renamed from: a */
        public final evd f69753a;

        /* JADX INFO: renamed from: b */
        public final l75 f69754b;

        public C10802a(evd evdVar, l75 l75Var) {
            this.f69753a = evdVar;
            this.f69754b = l75Var;
        }

        @Override // p000.in4.InterfaceC7518b
        public void onDecodeComplete(e41 e41Var, Bitmap bitmap) throws IOException {
            IOException exception = this.f69754b.getException();
            if (exception != null) {
                if (bitmap == null) {
                    throw exception;
                }
                e41Var.put(bitmap);
                throw exception;
            }
        }

        @Override // p000.in4.InterfaceC7518b
        public void onObtainBounds() {
            this.f69753a.fixMarkLimit();
        }
    }

    public p5g(in4 in4Var, z60 z60Var) {
        this.f69751a = in4Var;
        this.f69752b = z60Var;
    }

    @Override // p000.b6e
    public t5e<Bitmap> decode(@efb InputStream inputStream, int i, int i2, @efb i7c i7cVar) throws IOException {
        boolean z;
        evd evdVar;
        if (inputStream instanceof evd) {
            evdVar = (evd) inputStream;
            z = false;
        } else {
            z = true;
            evdVar = new evd(inputStream, this.f69752b);
        }
        l75 l75VarObtain = l75.obtain(evdVar);
        try {
            return this.f69751a.decode(new bu9(l75VarObtain), i, i2, i7cVar, new C10802a(evdVar, l75VarObtain));
        } finally {
            l75VarObtain.release();
            if (z) {
                evdVar.release();
            }
        }
    }

    @Override // p000.b6e
    public boolean handles(@efb InputStream inputStream, @efb i7c i7cVar) {
        return this.f69751a.handles(inputStream);
    }
}

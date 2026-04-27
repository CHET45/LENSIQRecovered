package p000;

import com.bumptech.glide.load.resource.gif.GifDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class g67 implements c7e<GifDrawable, byte[]> {
    @Override // p000.c7e
    @hib
    public t5e<byte[]> transcode(@efb t5e<GifDrawable> t5eVar, @efb i7c i7cVar) {
        return new ek1(ej1.toBytes(t5eVar.get().getBuffer()));
    }
}

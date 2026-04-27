package p000;

import android.util.Log;
import com.bumptech.glide.load.data.InterfaceC2493a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p000.p4d;

/* JADX INFO: loaded from: classes3.dex */
public class gl3<DataType, ResourceType, Transcode> {

    /* JADX INFO: renamed from: f */
    public static final String f40128f = "DecodePath";

    /* JADX INFO: renamed from: a */
    public final Class<DataType> f40129a;

    /* JADX INFO: renamed from: b */
    public final List<? extends b6e<DataType, ResourceType>> f40130b;

    /* JADX INFO: renamed from: c */
    public final c7e<ResourceType, Transcode> f40131c;

    /* JADX INFO: renamed from: d */
    public final p4d.InterfaceC10791a<List<Throwable>> f40132d;

    /* JADX INFO: renamed from: e */
    public final String f40133e;

    /* JADX INFO: renamed from: gl3$a */
    public interface InterfaceC6374a<ResourceType> {
        @efb
        t5e<ResourceType> onResourceDecoded(@efb t5e<ResourceType> t5eVar);
    }

    public gl3(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends b6e<DataType, ResourceType>> list, c7e<ResourceType, Transcode> c7eVar, p4d.InterfaceC10791a<List<Throwable>> interfaceC10791a) {
        this.f40129a = cls;
        this.f40130b = list;
        this.f40131c = c7eVar;
        this.f40132d = interfaceC10791a;
        this.f40133e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    @efb
    private t5e<ResourceType> decodeResource(InterfaceC2493a<DataType> interfaceC2493a, int i, int i2, @efb i7c i7cVar) throws a77 {
        List<Throwable> list = (List) t7d.checkNotNull(this.f40132d.acquire());
        try {
            return decodeResourceWithList(interfaceC2493a, i, i2, i7cVar, list);
        } finally {
            this.f40132d.release(list);
        }
    }

    @efb
    private t5e<ResourceType> decodeResourceWithList(InterfaceC2493a<DataType> interfaceC2493a, int i, int i2, @efb i7c i7cVar, List<Throwable> list) throws a77 {
        int size = this.f40130b.size();
        t5e<ResourceType> t5eVarDecode = null;
        for (int i3 = 0; i3 < size; i3++) {
            b6e<DataType, ResourceType> b6eVar = this.f40130b.get(i3);
            try {
                if (b6eVar.handles(interfaceC2493a.rewindAndGet(), i7cVar)) {
                    t5eVarDecode = b6eVar.decode(interfaceC2493a.rewindAndGet(), i, i2, i7cVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable(f40128f, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to decode data for ");
                    sb.append(b6eVar);
                }
                list.add(e);
            }
            if (t5eVarDecode != null) {
                break;
            }
        }
        if (t5eVarDecode != null) {
            return t5eVarDecode;
        }
        throw new a77(this.f40133e, new ArrayList(list));
    }

    public t5e<Transcode> decode(InterfaceC2493a<DataType> interfaceC2493a, int i, int i2, @efb i7c i7cVar, InterfaceC6374a<ResourceType> interfaceC6374a) throws a77 {
        return this.f40131c.transcode(interfaceC6374a.onResourceDecoded(decodeResource(interfaceC2493a, i, i2, i7cVar)), i7cVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f40129a + ", decoders=" + this.f40130b + ", transcoder=" + this.f40131c + '}';
    }
}

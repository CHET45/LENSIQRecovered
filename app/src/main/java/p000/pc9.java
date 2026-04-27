package p000;

import com.bumptech.glide.load.data.InterfaceC2493a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.gl3;
import p000.p4d;

/* JADX INFO: loaded from: classes3.dex */
public class pc9<Data, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a */
    public final Class<Data> f70321a;

    /* JADX INFO: renamed from: b */
    public final p4d.InterfaceC10791a<List<Throwable>> f70322b;

    /* JADX INFO: renamed from: c */
    public final List<? extends gl3<Data, ResourceType, Transcode>> f70323c;

    /* JADX INFO: renamed from: d */
    public final String f70324d;

    public pc9(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<gl3<Data, ResourceType, Transcode>> list, p4d.InterfaceC10791a<List<Throwable>> interfaceC10791a) {
        this.f70321a = cls;
        this.f70322b = interfaceC10791a;
        this.f70323c = (List) t7d.checkNotEmpty(list);
        this.f70324d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private t5e<Transcode> loadWithExceptionList(InterfaceC2493a<Data> interfaceC2493a, @efb i7c i7cVar, int i, int i2, gl3.InterfaceC6374a<ResourceType> interfaceC6374a, List<Throwable> list) throws a77 {
        int size = this.f70323c.size();
        t5e<Transcode> t5eVarDecode = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                t5eVarDecode = this.f70323c.get(i3).decode(interfaceC2493a, i, i2, i7cVar, interfaceC6374a);
            } catch (a77 e) {
                list.add(e);
            }
            if (t5eVarDecode != null) {
                break;
            }
        }
        if (t5eVarDecode != null) {
            return t5eVarDecode;
        }
        throw new a77(this.f70324d, new ArrayList(list));
    }

    public Class<Data> getDataClass() {
        return this.f70321a;
    }

    public t5e<Transcode> load(InterfaceC2493a<Data> interfaceC2493a, @efb i7c i7cVar, int i, int i2, gl3.InterfaceC6374a<ResourceType> interfaceC6374a) throws a77 {
        List<Throwable> list = (List) t7d.checkNotNull(this.f70322b.acquire());
        try {
            return loadWithExceptionList(interfaceC2493a, i7cVar, i, i2, interfaceC6374a, list);
        } finally {
            this.f70322b.release(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f70323c.toArray()) + '}';
    }
}

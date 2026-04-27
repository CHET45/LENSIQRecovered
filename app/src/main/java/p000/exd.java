package p000;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C2494b;
import com.bumptech.glide.load.data.InterfaceC2493a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.p4d;

/* JADX INFO: loaded from: classes3.dex */
public class exd {

    /* JADX INFO: renamed from: k */
    public static final String f34402k = "Animation";

    /* JADX INFO: renamed from: l */
    @Deprecated
    public static final String f34403l = "Animation";

    /* JADX INFO: renamed from: m */
    public static final String f34404m = "Bitmap";

    /* JADX INFO: renamed from: n */
    public static final String f34405n = "BitmapDrawable";

    /* JADX INFO: renamed from: o */
    public static final String f34406o = "legacy_prepend_all";

    /* JADX INFO: renamed from: p */
    public static final String f34407p = "legacy_append";

    /* JADX INFO: renamed from: a */
    public final xwa f34408a;

    /* JADX INFO: renamed from: b */
    public final p15 f34409b;

    /* JADX INFO: renamed from: c */
    public final c6e f34410c;

    /* JADX INFO: renamed from: d */
    public final h6e f34411d;

    /* JADX INFO: renamed from: e */
    public final C2494b f34412e;

    /* JADX INFO: renamed from: f */
    public final odh f34413f;

    /* JADX INFO: renamed from: g */
    public final kv7 f34414g;

    /* JADX INFO: renamed from: h */
    public final ywa f34415h = new ywa();

    /* JADX INFO: renamed from: i */
    public final qc9 f34416i = new qc9();

    /* JADX INFO: renamed from: j */
    public final p4d.InterfaceC10791a<List<Throwable>> f34417j;

    /* JADX INFO: renamed from: exd$a */
    public static class C5509a extends RuntimeException {
        public C5509a(@efb String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: exd$b */
    public static final class C5510b extends C5509a {
        public C5510b() {
            super("Failed to find image header parser.");
        }
    }

    /* JADX INFO: renamed from: exd$c */
    public static class C5511c extends C5509a {
        public C5511c(@efb Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> C5511c(@efb M m, @efb List<vwa<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }

        public C5511c(@efb Class<?> cls, @efb Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* JADX INFO: renamed from: exd$d */
    public static class C5512d extends C5509a {
        public C5512d(@efb Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* JADX INFO: renamed from: exd$e */
    public static class C5513e extends C5509a {
        public C5513e(@efb Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public exd() {
        p4d.InterfaceC10791a<List<Throwable>> interfaceC10791aThreadSafeList = ko5.threadSafeList();
        this.f34417j = interfaceC10791aThreadSafeList;
        this.f34408a = new xwa(interfaceC10791aThreadSafeList);
        this.f34409b = new p15();
        this.f34410c = new c6e();
        this.f34411d = new h6e();
        this.f34412e = new C2494b();
        this.f34413f = new odh();
        this.f34414g = new kv7();
        setResourceDecoderBucketPriorityList(Arrays.asList("Animation", f34404m, f34405n));
    }

    @efb
    private <Data, TResource, Transcode> List<gl3<Data, TResource, Transcode>> getDecodePaths(@efb Class<Data> cls, @efb Class<TResource> cls2, @efb Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f34410c.getResourceClasses(cls, cls2)) {
            for (Class cls5 : this.f34413f.getTranscodeClasses(cls4, cls3)) {
                arrayList.add(new gl3(cls, cls4, cls5, this.f34410c.getDecoders(cls, cls4), this.f34413f.get(cls4, cls5), this.f34417j));
            }
        }
        return arrayList;
    }

    @efb
    public <Data> exd append(@efb Class<Data> cls, @efb n15<Data> n15Var) {
        this.f34409b.append(cls, n15Var);
        return this;
    }

    @efb
    public List<ImageHeaderParser> getImageHeaderParsers() {
        List<ImageHeaderParser> parsers = this.f34414g.getParsers();
        if (parsers.isEmpty()) {
            throw new C5510b();
        }
        return parsers;
    }

    @hib
    public <Data, TResource, Transcode> pc9<Data, TResource, Transcode> getLoadPath(@efb Class<Data> cls, @efb Class<TResource> cls2, @efb Class<Transcode> cls3) {
        pc9<Data, TResource, Transcode> pc9Var = this.f34416i.get(cls, cls2, cls3);
        if (this.f34416i.isEmptyLoadPath(pc9Var)) {
            return null;
        }
        if (pc9Var == null) {
            List<gl3<Data, TResource, Transcode>> decodePaths = getDecodePaths(cls, cls2, cls3);
            pc9Var = decodePaths.isEmpty() ? null : new pc9<>(cls, cls2, cls3, decodePaths, this.f34417j);
            this.f34416i.put(cls, cls2, cls3, pc9Var);
        }
        return pc9Var;
    }

    @efb
    public <Model> List<vwa<Model, ?>> getModelLoaders(@efb Model model) {
        return this.f34408a.getModelLoaders(model);
    }

    @efb
    public <Model, TResource, Transcode> List<Class<?>> getRegisteredResourceClasses(@efb Class<Model> cls, @efb Class<TResource> cls2, @efb Class<Transcode> cls3) {
        List<Class<?>> arrayList = this.f34415h.get(cls, cls2, cls3);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            Iterator<Class<?>> it = this.f34408a.getDataClasses(cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.f34410c.getResourceClasses(it.next(), cls2)) {
                    if (!this.f34413f.getTranscodeClasses(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            this.f34415h.put(cls, cls2, cls3, Collections.unmodifiableList(arrayList));
        }
        return arrayList;
    }

    @efb
    public <X> g6e<X> getResultEncoder(@efb t5e<X> t5eVar) throws C5512d {
        g6e<X> g6eVar = this.f34411d.get(t5eVar.getResourceClass());
        if (g6eVar != null) {
            return g6eVar;
        }
        throw new C5512d(t5eVar.getResourceClass());
    }

    @efb
    public <X> InterfaceC2493a<X> getRewinder(@efb X x) {
        return this.f34412e.build(x);
    }

    @efb
    public <X> n15<X> getSourceEncoder(@efb X x) throws C5513e {
        n15<X> encoder = this.f34409b.getEncoder(x.getClass());
        if (encoder != null) {
            return encoder;
        }
        throw new C5513e(x.getClass());
    }

    public boolean isResourceEncoderAvailable(@efb t5e<?> t5eVar) {
        return this.f34411d.get(t5eVar.getResourceClass()) != null;
    }

    @efb
    public <Data> exd prepend(@efb Class<Data> cls, @efb n15<Data> n15Var) {
        this.f34409b.prepend(cls, n15Var);
        return this;
    }

    @efb
    @Deprecated
    public <Data> exd register(@efb Class<Data> cls, @efb n15<Data> n15Var) {
        return append(cls, n15Var);
    }

    @efb
    public <Model, Data> exd replace(@efb Class<Model> cls, @efb Class<Data> cls2, @efb wwa<? extends Model, ? extends Data> wwaVar) {
        this.f34408a.replace(cls, cls2, wwaVar);
        return this;
    }

    @efb
    public final exd setResourceDecoderBucketPriorityList(@efb List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add(f34406o);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add(f34407p);
        this.f34410c.setBucketPriorityList(arrayList);
        return this;
    }

    @efb
    public <Data, TResource> exd append(@efb Class<Data> cls, @efb Class<TResource> cls2, @efb b6e<Data, TResource> b6eVar) {
        append(f34407p, cls, cls2, b6eVar);
        return this;
    }

    @efb
    public <Data, TResource> exd prepend(@efb Class<Data> cls, @efb Class<TResource> cls2, @efb b6e<Data, TResource> b6eVar) {
        prepend(f34406o, cls, cls2, b6eVar);
        return this;
    }

    @efb
    @Deprecated
    public <TResource> exd register(@efb Class<TResource> cls, @efb g6e<TResource> g6eVar) {
        return append((Class) cls, (g6e) g6eVar);
    }

    @efb
    public <Data, TResource> exd append(@efb String str, @efb Class<Data> cls, @efb Class<TResource> cls2, @efb b6e<Data, TResource> b6eVar) {
        this.f34410c.append(str, b6eVar, cls, cls2);
        return this;
    }

    @efb
    public <Data, TResource> exd prepend(@efb String str, @efb Class<Data> cls, @efb Class<TResource> cls2, @efb b6e<Data, TResource> b6eVar) {
        this.f34410c.prepend(str, b6eVar, cls, cls2);
        return this;
    }

    @efb
    public exd register(@efb InterfaceC2493a.a<?> aVar) {
        this.f34412e.register(aVar);
        return this;
    }

    @efb
    public <TResource> exd append(@efb Class<TResource> cls, @efb g6e<TResource> g6eVar) {
        this.f34411d.append(cls, g6eVar);
        return this;
    }

    @efb
    public <TResource> exd prepend(@efb Class<TResource> cls, @efb g6e<TResource> g6eVar) {
        this.f34411d.prepend(cls, g6eVar);
        return this;
    }

    @efb
    public <TResource, Transcode> exd register(@efb Class<TResource> cls, @efb Class<Transcode> cls2, @efb c7e<TResource, Transcode> c7eVar) {
        this.f34413f.register(cls, cls2, c7eVar);
        return this;
    }

    @efb
    public <Model, Data> exd append(@efb Class<Model> cls, @efb Class<Data> cls2, @efb wwa<Model, Data> wwaVar) {
        this.f34408a.append(cls, cls2, wwaVar);
        return this;
    }

    @efb
    public <Model, Data> exd prepend(@efb Class<Model> cls, @efb Class<Data> cls2, @efb wwa<Model, Data> wwaVar) {
        this.f34408a.prepend(cls, cls2, wwaVar);
        return this;
    }

    @efb
    public exd register(@efb ImageHeaderParser imageHeaderParser) {
        this.f34414g.add(imageHeaderParser);
        return this;
    }
}

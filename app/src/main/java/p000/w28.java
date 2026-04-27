package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class w28 implements v28 {

    /* JADX INFO: renamed from: a */
    public final List<x54> f93126a;

    /* JADX INFO: renamed from: b */
    public final Map<String, g79> f93127b;

    public w28(List<x54> list, Map<String, g79> map) {
        this.f93126a = list;
        this.f93127b = map;
    }

    @Override // p000.v28
    public List<x54> getCustomDelimiterProcessors() {
        return this.f93126a;
    }

    @Override // p000.v28
    public g79 getLinkReferenceDefinition(String str) {
        return this.f93127b.get(str);
    }
}

package p000;

import java.util.ArrayList;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public abstract class ibf<T> {

    /* JADX INFO: renamed from: ibf$a */
    @p7e({p7e.EnumC10826a.f69934a})
    public static class C7227a extends ibf<Void> {
        @Override // p000.ibf
        public /* bridge */ /* synthetic */ Void addShortcuts(List list) {
            return addShortcuts2((List<fbf>) list);
        }

        @Override // p000.ibf
        public /* bridge */ /* synthetic */ Void removeShortcuts(List list) {
            return removeShortcuts2((List<String>) list);
        }

        @Override // p000.ibf
        /* JADX INFO: renamed from: addShortcuts, reason: avoid collision after fix types in other method */
        public Void addShortcuts2(List<fbf> list) {
            return null;
        }

        @Override // p000.ibf
        public Void removeAllShortcuts() {
            return null;
        }

        @Override // p000.ibf
        /* JADX INFO: renamed from: removeShortcuts, reason: avoid collision after fix types in other method */
        public Void removeShortcuts2(List<String> list) {
            return null;
        }
    }

    @f00
    public abstract T addShortcuts(List<fbf> list);

    @xqi
    public List<fbf> getShortcuts() throws Exception {
        return new ArrayList();
    }

    @f00
    public abstract T removeAllShortcuts();

    @f00
    public abstract T removeShortcuts(List<String> list);
}

package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p000.tpi;

/* JADX INFO: loaded from: classes3.dex */
public final class iqi {

    /* JADX INFO: renamed from: a */
    public final List<UUID> f48011a;

    /* JADX INFO: renamed from: b */
    public final List<String> f48012b;

    /* JADX INFO: renamed from: c */
    public final List<String> f48013c;

    /* JADX INFO: renamed from: d */
    public final List<tpi.EnumC13161a> f48014d;

    /* JADX INFO: renamed from: iqi$a */
    public static final class C7569a {

        /* JADX INFO: renamed from: a */
        public List<UUID> f48015a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public List<String> f48016b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public List<String> f48017c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public List<tpi.EnumC13161a> f48018d = new ArrayList();

        private C7569a() {
        }

        @efb
        @igg({"BuilderSetStyle"})
        public static C7569a fromIds(@efb List<UUID> ids) {
            C7569a c7569a = new C7569a();
            c7569a.addIds(ids);
            return c7569a;
        }

        @efb
        @igg({"BuilderSetStyle"})
        public static C7569a fromStates(@efb List<tpi.EnumC13161a> states) {
            C7569a c7569a = new C7569a();
            c7569a.addStates(states);
            return c7569a;
        }

        @efb
        @igg({"BuilderSetStyle"})
        public static C7569a fromTags(@efb List<String> tags) {
            C7569a c7569a = new C7569a();
            c7569a.addTags(tags);
            return c7569a;
        }

        @efb
        @igg({"BuilderSetStyle"})
        public static C7569a fromUniqueWorkNames(@efb List<String> uniqueWorkNames) {
            C7569a c7569a = new C7569a();
            c7569a.addUniqueWorkNames(uniqueWorkNames);
            return c7569a;
        }

        @efb
        public C7569a addIds(@efb List<UUID> ids) {
            this.f48015a.addAll(ids);
            return this;
        }

        @efb
        public C7569a addStates(@efb List<tpi.EnumC13161a> states) {
            this.f48018d.addAll(states);
            return this;
        }

        @efb
        public C7569a addTags(@efb List<String> tags) {
            this.f48017c.addAll(tags);
            return this;
        }

        @efb
        public C7569a addUniqueWorkNames(@efb List<String> uniqueWorkNames) {
            this.f48016b.addAll(uniqueWorkNames);
            return this;
        }

        @efb
        public iqi build() {
            if (this.f48015a.isEmpty() && this.f48016b.isEmpty() && this.f48017c.isEmpty() && this.f48018d.isEmpty()) {
                throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
            }
            return new iqi(this);
        }
    }

    public iqi(@efb C7569a builder) {
        this.f48011a = builder.f48015a;
        this.f48012b = builder.f48016b;
        this.f48013c = builder.f48017c;
        this.f48014d = builder.f48018d;
    }

    @efb
    public List<UUID> getIds() {
        return this.f48011a;
    }

    @efb
    public List<tpi.EnumC13161a> getStates() {
        return this.f48014d;
    }

    @efb
    public List<String> getTags() {
        return this.f48013c;
    }

    @efb
    public List<String> getUniqueWorkNames() {
        return this.f48012b;
    }
}

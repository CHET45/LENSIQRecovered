package p000;

import java.util.List;
import java.util.UUID;
import p000.oqi;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public abstract class u4g<T> implements Runnable {

    /* JADX INFO: renamed from: a */
    public final z6f<T> f86817a = z6f.create();

    /* JADX INFO: renamed from: u4g$a */
    public class C13360a extends u4g<List<tpi>> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ zpi f86818b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ List f86819c;

        public C13360a(final zpi val$workManager, final List val$ids) {
            this.f86818b = val$workManager;
            this.f86819c = val$ids;
        }

        @Override // p000.u4g
        public List<tpi> runInternal() {
            return oqi.f68336u.apply(this.f86818b.getWorkDatabase().workSpecDao().getWorkStatusPojoForIds(this.f86819c));
        }
    }

    /* JADX INFO: renamed from: u4g$b */
    public class C13361b extends u4g<tpi> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ zpi f86820b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ UUID f86821c;

        public C13361b(final zpi val$workManager, final UUID val$id) {
            this.f86820b = val$workManager;
            this.f86821c = val$id;
        }

        @Override // p000.u4g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public tpi runInternal() {
            oqi.C10507c workStatusPojoForId = this.f86820b.getWorkDatabase().workSpecDao().getWorkStatusPojoForId(this.f86821c.toString());
            if (workStatusPojoForId != null) {
                return workStatusPojoForId.toWorkInfo();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: u4g$c */
    public class C13362c extends u4g<List<tpi>> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ zpi f86822b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f86823c;

        public C13362c(final zpi val$workManager, final String val$tag) {
            this.f86822b = val$workManager;
            this.f86823c = val$tag;
        }

        @Override // p000.u4g
        public List<tpi> runInternal() {
            return oqi.f68336u.apply(this.f86822b.getWorkDatabase().workSpecDao().getWorkStatusPojoForTag(this.f86823c));
        }
    }

    /* JADX INFO: renamed from: u4g$d */
    public class C13363d extends u4g<List<tpi>> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ zpi f86824b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f86825c;

        public C13363d(final zpi val$workManager, final String val$name) {
            this.f86824b = val$workManager;
            this.f86825c = val$name;
        }

        @Override // p000.u4g
        public List<tpi> runInternal() {
            return oqi.f68336u.apply(this.f86824b.getWorkDatabase().workSpecDao().getWorkStatusPojoForName(this.f86825c));
        }
    }

    /* JADX INFO: renamed from: u4g$e */
    public class C13364e extends u4g<List<tpi>> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ zpi f86826b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ iqi f86827c;

        public C13364e(final zpi val$workManager, final iqi val$querySpec) {
            this.f86826b = val$workManager;
            this.f86827c = val$querySpec;
        }

        @Override // p000.u4g
        public List<tpi> runInternal() {
            return oqi.f68336u.apply(this.f86826b.getWorkDatabase().rawWorkInfoDao().getWorkInfoPojos(upd.workQueryToRawQuery(this.f86827c)));
        }
    }

    @efb
    public static u4g<List<tpi>> forStringIds(@efb final zpi workManager, @efb final List<String> ids) {
        return new C13360a(workManager, ids);
    }

    @efb
    public static u4g<List<tpi>> forTag(@efb final zpi workManager, @efb final String tag) {
        return new C13362c(workManager, tag);
    }

    @efb
    public static u4g<tpi> forUUID(@efb final zpi workManager, @efb final UUID id) {
        return new C13361b(workManager, id);
    }

    @efb
    public static u4g<List<tpi>> forUniqueWork(@efb final zpi workManager, @efb final String name) {
        return new C13363d(workManager, name);
    }

    @efb
    public static u4g<List<tpi>> forWorkQuerySpec(@efb final zpi workManager, @efb final iqi querySpec) {
        return new C13364e(workManager, querySpec);
    }

    @efb
    public ja9<T> getFuture() {
        return this.f86817a;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f86817a.set(runInternal());
        } catch (Throwable th) {
            this.f86817a.setException(th);
        }
    }

    @xqi
    public abstract T runInternal();
}

package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p000.ade;

/* JADX INFO: loaded from: classes8.dex */
public class w7e implements Serializable {
    private static final ObjectStreamField[] serialPersistentFields = ObjectStreamClass.lookup(C14465c.class).getFields();
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f93527a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f93528b;

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList<fp5> f93529c;

    /* JADX INFO: renamed from: d */
    public final AtomicLong f93530d;

    /* JADX INFO: renamed from: e */
    public final AtomicLong f93531e;

    /* JADX INFO: renamed from: f */
    public C14465c f93532f;

    /* JADX INFO: renamed from: w7e$b */
    @ade.InterfaceC0186a
    public class C14464b extends ade {
        private C14464b() {
        }

        @Override // p000.ade
        public void testAssumptionFailure(fp5 fp5Var) {
        }

        @Override // p000.ade
        public void testFailure(fp5 fp5Var) throws Exception {
            w7e.this.f93529c.add(fp5Var);
        }

        @Override // p000.ade
        public void testFinished(j74 j74Var) throws Exception {
            w7e.this.f93527a.getAndIncrement();
        }

        @Override // p000.ade
        public void testIgnored(j74 j74Var) throws Exception {
            w7e.this.f93528b.getAndIncrement();
        }

        @Override // p000.ade
        public void testRunFinished(w7e w7eVar) throws Exception {
            w7e.this.f93530d.addAndGet(System.currentTimeMillis() - w7e.this.f93531e.get());
        }

        @Override // p000.ade
        public void testRunStarted(j74 j74Var) throws Exception {
            w7e.this.f93531e.set(System.currentTimeMillis());
        }
    }

    public w7e() {
        this.f93527a = new AtomicInteger();
        this.f93528b = new AtomicInteger();
        this.f93529c = new CopyOnWriteArrayList<>();
        this.f93530d = new AtomicLong();
        this.f93531e = new AtomicLong();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        this.f93532f = C14465c.deserialize(objectInputStream);
    }

    private Object readResolve() {
        return new w7e(this.f93532f);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        new C14465c(this).serialize(objectOutputStream);
    }

    public ade createListener() {
        return new C14464b();
    }

    public int getFailureCount() {
        return this.f93529c.size();
    }

    public List<fp5> getFailures() {
        return this.f93529c;
    }

    public int getIgnoreCount() {
        return this.f93528b.get();
    }

    public int getRunCount() {
        return this.f93527a.get();
    }

    public long getRunTime() {
        return this.f93530d.get();
    }

    public boolean wasSuccessful() {
        return getFailureCount() == 0;
    }

    /* JADX INFO: renamed from: w7e$c */
    public static class C14465c implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f93534a;

        /* JADX INFO: renamed from: b */
        public final AtomicInteger f93535b;

        /* JADX INFO: renamed from: c */
        public final List<fp5> f93536c;

        /* JADX INFO: renamed from: d */
        public final long f93537d;

        /* JADX INFO: renamed from: e */
        public final long f93538e;

        public C14465c(w7e w7eVar) {
            this.f93534a = w7eVar.f93527a;
            this.f93535b = w7eVar.f93528b;
            this.f93536c = Collections.synchronizedList(new ArrayList(w7eVar.f93529c));
            this.f93537d = w7eVar.f93530d.longValue();
            this.f93538e = w7eVar.f93531e.longValue();
        }

        public static C14465c deserialize(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            return new C14465c(objectInputStream.readFields());
        }

        public void serialize(ObjectOutputStream objectOutputStream) throws IOException {
            ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
            putFieldPutFields.put("fCount", this.f93534a);
            putFieldPutFields.put("fIgnoreCount", this.f93535b);
            putFieldPutFields.put("fFailures", this.f93536c);
            putFieldPutFields.put("fRunTime", this.f93537d);
            putFieldPutFields.put("fStartTime", this.f93538e);
            objectOutputStream.writeFields();
        }

        private C14465c(ObjectInputStream.GetField getField) throws IOException {
            this.f93534a = (AtomicInteger) getField.get("fCount", (Object) null);
            this.f93535b = (AtomicInteger) getField.get("fIgnoreCount", (Object) null);
            this.f93536c = (List) getField.get("fFailures", (Object) null);
            this.f93537d = getField.get("fRunTime", 0L);
            this.f93538e = getField.get("fStartTime", 0L);
        }
    }

    private w7e(C14465c c14465c) {
        this.f93527a = c14465c.f93534a;
        this.f93528b = c14465c.f93535b;
        this.f93529c = new CopyOnWriteArrayList<>(c14465c.f93536c);
        this.f93530d = new AtomicLong(c14465c.f93537d);
        this.f93531e = new AtomicLong(c14465c.f93538e);
    }
}

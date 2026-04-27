package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000.qrc;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,372:1\n166#1:374\n133#1:375\n167#1,2:377\n137#1:379\n169#1,3:386\n174#1:392\n140#1,5:393\n145#1:399\n133#1:400\n146#1,7:402\n137#1:409\n153#1,6:415\n161#1,3:424\n140#1,5:427\n145#1:433\n133#1:434\n146#1,7:436\n137#1:443\n153#1,6:449\n161#1,3:458\n140#1,5:461\n145#1:467\n133#1:468\n146#1,7:470\n137#1:477\n153#1,6:483\n161#1,3:492\n140#1,5:498\n145#1:504\n133#1:505\n146#1,7:507\n137#1:514\n153#1,6:520\n161#1,3:529\n133#1:532\n133#1:545\n137#1:547\n133#1:558\n137#1:560\n2420#2:373\n2420#2:376\n2313#2,2:380\n1843#2:382\n2315#2,2:384\n2317#2,3:389\n2420#2:401\n2313#2,2:410\n1843#2:412\n2315#2,2:413\n2317#2,3:421\n2420#2:435\n2313#2,2:444\n1843#2:446\n2315#2,2:447\n2317#2,3:455\n2420#2:469\n2313#2,2:478\n1843#2:480\n2315#2,2:481\n2317#2,3:489\n2420#2:506\n2313#2,2:515\n1843#2:517\n2315#2,2:518\n2317#2,3:526\n2420#2:533\n2420#2:534\n2313#2,2:535\n1843#2:537\n2315#2,5:539\n2420#2:546\n2313#2,2:548\n1843#2:550\n2315#2,2:552\n2317#2,3:555\n2420#2:559\n2313#2,2:561\n1843#2:563\n2315#2,2:565\n2317#2,3:568\n89#3:383\n89#3:398\n89#3:432\n89#3:466\n89#3:503\n89#3:538\n89#3:544\n89#3:551\n89#3:554\n89#3:564\n89#3:567\n288#4,2:495\n1#5:497\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n*L\n81#1:374\n81#1:375\n81#1:377,2\n81#1:379\n81#1:386,3\n81#1:392\n82#1:393,5\n82#1:399\n82#1:400\n82#1:402,7\n82#1:409\n82#1:415,6\n82#1:424,3\n83#1:427,5\n83#1:433\n83#1:434\n83#1:436,7\n83#1:443\n83#1:449,6\n83#1:458,3\n84#1:461,5\n84#1:467\n84#1:468\n84#1:470,7\n84#1:477\n84#1:483,6\n84#1:492,3\n97#1:498,5\n97#1:504\n97#1:505\n97#1:507,7\n97#1:514\n97#1:520,6\n97#1:529,3\n129#1:532\n145#1:545\n152#1:547\n166#1:558\n168#1:560\n77#1:373\n81#1:376\n81#1:380,2\n81#1:382\n81#1:384,2\n81#1:389,3\n82#1:401\n82#1:410,2\n82#1:412\n82#1:413,2\n82#1:421,3\n83#1:435\n83#1:444,2\n83#1:446\n83#1:447,2\n83#1:455,3\n84#1:469\n84#1:478,2\n84#1:480\n84#1:481,2\n84#1:489,3\n97#1:506\n97#1:515,2\n97#1:517\n97#1:518,2\n97#1:526,3\n129#1:533\n133#1:534\n137#1:535,2\n137#1:537\n137#1:539,5\n145#1:546\n152#1:548,2\n152#1:550\n152#1:552,2\n152#1:555,3\n166#1:559\n168#1:561,2\n168#1:563\n168#1:565,2\n168#1:568,3\n81#1:383\n82#1:398\n83#1:432\n84#1:466\n97#1:503\n137#1:538\n144#1:544\n152#1:551\n153#1:554\n168#1:564\n169#1:567\n89#1:495,2\n*E\n"})
@f0g
public final class auf<K, V> implements x2g, Map<K, V>, ap8 {

    /* JADX INFO: renamed from: e */
    public static final int f11894e = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public z2g f11895a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Set<Map.Entry<K, V>> f11896b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Set<K> f11897c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final Collection<V> f11898d;

    /* JADX INFO: renamed from: auf$a */
    @dwf({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,372:1\n89#2:373\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n*L\n186#1:373\n*E\n"})
    @e0g(parameters = 0)
    public static final class C1612a<K, V> extends z2g {

        /* JADX INFO: renamed from: f */
        public static final int f11899f = 8;

        /* JADX INFO: renamed from: d */
        @yfb
        public qrc<K, ? extends V> f11900d;

        /* JADX INFO: renamed from: e */
        public int f11901e;

        public C1612a(@yfb qrc<K, ? extends V> qrcVar) {
            this.f11900d = qrcVar;
        }

        @Override // p000.z2g
        public void assign(@yfb z2g z2gVar) {
            md8.checkNotNull(z2gVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            C1612a c1612a = (C1612a) z2gVar;
            synchronized (buf.f14818a) {
                this.f11900d = c1612a.f11900d;
                this.f11901e = c1612a.f11901e;
                bth bthVar = bth.f14751a;
            }
        }

        @Override // p000.z2g
        @yfb
        public z2g create() {
            return new C1612a(this.f11900d);
        }

        @yfb
        public final qrc<K, V> getMap$runtime_release() {
            return this.f11900d;
        }

        public final int getModification$runtime_release() {
            return this.f11901e;
        }

        public final void setMap$runtime_release(@yfb qrc<K, ? extends V> qrcVar) {
            this.f11900d = qrcVar;
        }

        public final void setModification$runtime_release(int i) {
            this.f11901e = i;
        }
    }

    public auf() {
        qrc qrcVarPersistentHashMapOf = hj5.persistentHashMapOf();
        C1612a c1612a = new C1612a(qrcVarPersistentHashMapOf);
        if (ssf.f82790e.isInSnapshot()) {
            C1612a c1612a2 = new C1612a(qrcVarPersistentHashMapOf);
            c1612a2.setSnapshotId$runtime_release(1);
            c1612a.setNext$runtime_release(c1612a2);
        }
        this.f11895a = c1612a;
        this.f11896b = new ktf(this);
        this.f11897c = new ltf(this);
        this.f11898d = new ntf(this);
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }

    private final <R> R mutate(qy6<? super Map<K, V>, ? extends R> qy6Var) {
        qrc<K, V> map$runtime_release;
        int modification$runtime_release;
        R rInvoke;
        ssf current;
        boolean z;
        do {
            synchronized (buf.f14818a) {
                try {
                    z2g firstStateRecord = getFirstStateRecord();
                    md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    C1612a c1612a = (C1612a) gtf.current((C1612a) firstStateRecord);
                    map$runtime_release = c1612a.getMap$runtime_release();
                    modification$runtime_release = c1612a.getModification$runtime_release();
                    bth bthVar = bth.f14751a;
                    o28.finallyStart(1);
                } catch (Throwable th) {
                    o28.finallyStart(1);
                    o28.finallyEnd(1);
                    throw th;
                }
            }
            o28.finallyEnd(1);
            md8.checkNotNull(map$runtime_release);
            qrc.InterfaceC11636a<K, V> interfaceC11636aBuilder = map$runtime_release.builder();
            rInvoke = qy6Var.invoke(interfaceC11636aBuilder);
            qrc<K, V> qrcVarBuild = interfaceC11636aBuilder.build();
            if (md8.areEqual(qrcVarBuild, map$runtime_release)) {
                break;
            }
            z2g firstStateRecord2 = getFirstStateRecord();
            md8.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            C1612a c1612a2 = (C1612a) firstStateRecord2;
            gtf.getSnapshotInitializer();
            synchronized (gtf.getLock()) {
                try {
                    current = ssf.f82790e.getCurrent();
                    C1612a c1612a3 = (C1612a) gtf.writableRecord(c1612a2, this, current);
                    synchronized (buf.f14818a) {
                        try {
                            if (c1612a3.getModification$runtime_release() == modification$runtime_release) {
                                c1612a3.setMap$runtime_release(qrcVarBuild);
                                c1612a3.setModification$runtime_release(c1612a3.getModification$runtime_release() + 1);
                                z = true;
                            } else {
                                z = false;
                            }
                            o28.finallyStart(1);
                        } finally {
                        }
                    }
                    o28.finallyEnd(1);
                    o28.finallyStart(1);
                } catch (Throwable th2) {
                    o28.finallyStart(1);
                    o28.finallyEnd(1);
                    throw th2;
                }
            }
            o28.finallyEnd(1);
            gtf.notifyWrite(current, this);
        } while (!z);
        return rInvoke;
    }

    private final void update(qy6<? super qrc<K, ? extends V>, ? extends qrc<K, ? extends V>> qy6Var) {
        ssf current;
        z2g firstStateRecord = getFirstStateRecord();
        md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        C1612a c1612a = (C1612a) gtf.current((C1612a) firstStateRecord);
        qrc<K, ? extends V> qrcVarInvoke = qy6Var.invoke(c1612a.getMap$runtime_release());
        if (qrcVarInvoke != c1612a.getMap$runtime_release()) {
            z2g firstStateRecord2 = getFirstStateRecord();
            md8.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            C1612a c1612a2 = (C1612a) firstStateRecord2;
            gtf.getSnapshotInitializer();
            synchronized (gtf.getLock()) {
                try {
                    current = ssf.f82790e.getCurrent();
                    C1612a c1612a3 = (C1612a) gtf.writableRecord(c1612a2, this, current);
                    synchronized (buf.f14818a) {
                        try {
                            c1612a3.setMap$runtime_release(qrcVarInvoke);
                            c1612a3.setModification$runtime_release(c1612a3.getModification$runtime_release() + 1);
                            o28.finallyStart(1);
                        } catch (Throwable th) {
                            o28.finallyStart(1);
                            o28.finallyEnd(1);
                            throw th;
                        }
                    }
                    o28.finallyEnd(1);
                    o28.finallyStart(1);
                } catch (Throwable th2) {
                    o28.finallyStart(1);
                    o28.finallyEnd(1);
                    throw th2;
                }
            }
            o28.finallyEnd(1);
            gtf.notifyWrite(current, this);
        }
    }

    private final <R> R withCurrent(qy6<? super C1612a<K, V>, ? extends R> qy6Var) {
        z2g firstStateRecord = getFirstStateRecord();
        md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return qy6Var.invoke(gtf.current((C1612a) firstStateRecord));
    }

    private final <R> R writable(qy6<? super C1612a<K, V>, ? extends R> qy6Var) {
        ssf current;
        R rInvoke;
        z2g firstStateRecord = getFirstStateRecord();
        md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        C1612a c1612a = (C1612a) firstStateRecord;
        gtf.getSnapshotInitializer();
        synchronized (gtf.getLock()) {
            try {
                current = ssf.f82790e.getCurrent();
                rInvoke = qy6Var.invoke(gtf.writableRecord(c1612a, this, current));
                o28.finallyStart(1);
            } catch (Throwable th) {
                o28.finallyStart(1);
                o28.finallyEnd(1);
                throw th;
            }
        }
        o28.finallyEnd(1);
        gtf.notifyWrite(current, this);
        return rInvoke;
    }

    public final boolean all$runtime_release(@yfb qy6<? super Map.Entry<? extends K, ? extends V>, Boolean> qy6Var) {
        Iterator<E> it = ((ey7) getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator();
        while (it.hasNext()) {
            if (!qy6Var.invoke((Map.Entry) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean any$runtime_release(@yfb qy6<? super Map.Entry<? extends K, ? extends V>, Boolean> qy6Var) {
        Iterator<E> it = ((ey7) getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator();
        while (it.hasNext()) {
            if (qy6Var.invoke((Map.Entry) it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public void clear() {
        ssf current;
        z2g firstStateRecord = getFirstStateRecord();
        md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        C1612a c1612a = (C1612a) gtf.current((C1612a) firstStateRecord);
        c1612a.getMap$runtime_release();
        qrc<K, V> qrcVarPersistentHashMapOf = hj5.persistentHashMapOf();
        if (qrcVarPersistentHashMapOf != c1612a.getMap$runtime_release()) {
            z2g firstStateRecord2 = getFirstStateRecord();
            md8.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            C1612a c1612a2 = (C1612a) firstStateRecord2;
            gtf.getSnapshotInitializer();
            synchronized (gtf.getLock()) {
                current = ssf.f82790e.getCurrent();
                C1612a c1612a3 = (C1612a) gtf.writableRecord(c1612a2, this, current);
                synchronized (buf.f14818a) {
                    c1612a3.setMap$runtime_release(qrcVarPersistentHashMapOf);
                    c1612a3.setModification$runtime_release(c1612a3.getModification$runtime_release() + 1);
                }
            }
            gtf.notifyWrite(current, this);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return getReadable$runtime_release().getMap$runtime_release().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return getReadable$runtime_release().getMap$runtime_release().containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    @gib
    public V get(Object obj) {
        return getReadable$runtime_release().getMap$runtime_release().get(obj);
    }

    @yfb
    @xn8(name = "getDebuggerDisplayValue")
    public final Map<K, V> getDebuggerDisplayValue() {
        z2g firstStateRecord = getFirstStateRecord();
        md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return ((C1612a) gtf.current((C1612a) firstStateRecord)).getMap$runtime_release();
    }

    @yfb
    public Set<Map.Entry<K, V>> getEntries() {
        return this.f11896b;
    }

    @Override // p000.x2g
    @yfb
    public z2g getFirstStateRecord() {
        return this.f11895a;
    }

    @yfb
    public Set<K> getKeys() {
        return this.f11897c;
    }

    public final int getModification$runtime_release() {
        return getReadable$runtime_release().getModification$runtime_release();
    }

    @yfb
    public final C1612a<K, V> getReadable$runtime_release() {
        z2g firstStateRecord = getFirstStateRecord();
        md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (C1612a) gtf.readable((C1612a) firstStateRecord, this);
    }

    public int getSize() {
        return getReadable$runtime_release().getMap$runtime_release().size();
    }

    @yfb
    public Collection<V> getValues() {
        return this.f11898d;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getReadable$runtime_release().getMap$runtime_release().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // p000.x2g
    public void prependStateRecord(@yfb z2g z2gVar) {
        md8.checkNotNull(z2gVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.f11895a = (C1612a) z2gVar;
    }

    @Override // java.util.Map
    @gib
    public V put(K k, V v) {
        qrc<K, V> map$runtime_release;
        int modification$runtime_release;
        V vPut;
        ssf current;
        boolean z;
        do {
            synchronized (buf.f14818a) {
                z2g firstStateRecord = getFirstStateRecord();
                md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C1612a c1612a = (C1612a) gtf.current((C1612a) firstStateRecord);
                map$runtime_release = c1612a.getMap$runtime_release();
                modification$runtime_release = c1612a.getModification$runtime_release();
                bth bthVar = bth.f14751a;
            }
            md8.checkNotNull(map$runtime_release);
            qrc.InterfaceC11636a<K, V> interfaceC11636aBuilder = map$runtime_release.builder();
            vPut = interfaceC11636aBuilder.put(k, v);
            qrc<K, V> qrcVarBuild = interfaceC11636aBuilder.build();
            if (md8.areEqual(qrcVarBuild, map$runtime_release)) {
                break;
            }
            z2g firstStateRecord2 = getFirstStateRecord();
            md8.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            C1612a c1612a2 = (C1612a) firstStateRecord2;
            gtf.getSnapshotInitializer();
            synchronized (gtf.getLock()) {
                current = ssf.f82790e.getCurrent();
                C1612a c1612a3 = (C1612a) gtf.writableRecord(c1612a2, this, current);
                synchronized (buf.f14818a) {
                    if (c1612a3.getModification$runtime_release() == modification$runtime_release) {
                        c1612a3.setMap$runtime_release(qrcVarBuild);
                        z = true;
                        c1612a3.setModification$runtime_release(c1612a3.getModification$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            gtf.notifyWrite(current, this);
        } while (!z);
        return vPut;
    }

    @Override // java.util.Map
    public void putAll(@yfb Map<? extends K, ? extends V> map) {
        qrc<K, V> map$runtime_release;
        int modification$runtime_release;
        ssf current;
        boolean z;
        do {
            synchronized (buf.f14818a) {
                z2g firstStateRecord = getFirstStateRecord();
                md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C1612a c1612a = (C1612a) gtf.current((C1612a) firstStateRecord);
                map$runtime_release = c1612a.getMap$runtime_release();
                modification$runtime_release = c1612a.getModification$runtime_release();
                bth bthVar = bth.f14751a;
            }
            md8.checkNotNull(map$runtime_release);
            qrc.InterfaceC11636a<K, V> interfaceC11636aBuilder = map$runtime_release.builder();
            interfaceC11636aBuilder.putAll(map);
            qrc<K, V> qrcVarBuild = interfaceC11636aBuilder.build();
            if (md8.areEqual(qrcVarBuild, map$runtime_release)) {
                return;
            }
            z2g firstStateRecord2 = getFirstStateRecord();
            md8.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            C1612a c1612a2 = (C1612a) firstStateRecord2;
            gtf.getSnapshotInitializer();
            synchronized (gtf.getLock()) {
                current = ssf.f82790e.getCurrent();
                C1612a c1612a3 = (C1612a) gtf.writableRecord(c1612a2, this, current);
                synchronized (buf.f14818a) {
                    if (c1612a3.getModification$runtime_release() == modification$runtime_release) {
                        c1612a3.setMap$runtime_release(qrcVarBuild);
                        z = true;
                        c1612a3.setModification$runtime_release(c1612a3.getModification$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            gtf.notifyWrite(current, this);
        } while (!z);
    }

    @Override // java.util.Map
    @gib
    public V remove(Object obj) {
        qrc<K, V> map$runtime_release;
        int modification$runtime_release;
        V vRemove;
        ssf current;
        boolean z;
        do {
            synchronized (buf.f14818a) {
                z2g firstStateRecord = getFirstStateRecord();
                md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C1612a c1612a = (C1612a) gtf.current((C1612a) firstStateRecord);
                map$runtime_release = c1612a.getMap$runtime_release();
                modification$runtime_release = c1612a.getModification$runtime_release();
                bth bthVar = bth.f14751a;
            }
            md8.checkNotNull(map$runtime_release);
            qrc.InterfaceC11636a<K, V> interfaceC11636aBuilder = map$runtime_release.builder();
            vRemove = interfaceC11636aBuilder.remove(obj);
            qrc<K, V> qrcVarBuild = interfaceC11636aBuilder.build();
            if (md8.areEqual(qrcVarBuild, map$runtime_release)) {
                break;
            }
            z2g firstStateRecord2 = getFirstStateRecord();
            md8.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            C1612a c1612a2 = (C1612a) firstStateRecord2;
            gtf.getSnapshotInitializer();
            synchronized (gtf.getLock()) {
                current = ssf.f82790e.getCurrent();
                C1612a c1612a3 = (C1612a) gtf.writableRecord(c1612a2, this, current);
                synchronized (buf.f14818a) {
                    if (c1612a3.getModification$runtime_release() == modification$runtime_release) {
                        c1612a3.setMap$runtime_release(qrcVarBuild);
                        z = true;
                        c1612a3.setModification$runtime_release(c1612a3.getModification$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            gtf.notifyWrite(current, this);
        } while (!z);
        return vRemove;
    }

    public final boolean removeIf$runtime_release(@yfb qy6<? super Map.Entry<K, V>, Boolean> qy6Var) {
        qrc<K, V> map$runtime_release;
        int modification$runtime_release;
        ssf current;
        boolean z;
        boolean z2 = false;
        do {
            synchronized (buf.f14818a) {
                try {
                    z2g firstStateRecord = getFirstStateRecord();
                    md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    C1612a c1612a = (C1612a) gtf.current((C1612a) firstStateRecord);
                    map$runtime_release = c1612a.getMap$runtime_release();
                    modification$runtime_release = c1612a.getModification$runtime_release();
                    bth bthVar = bth.f14751a;
                    o28.finallyStart(1);
                } catch (Throwable th) {
                    o28.finallyStart(1);
                    o28.finallyEnd(1);
                    throw th;
                }
            }
            o28.finallyEnd(1);
            md8.checkNotNull(map$runtime_release);
            qrc.InterfaceC11636a<K, V> interfaceC11636aBuilder = map$runtime_release.builder();
            for (Map.Entry<K, V> entry : entrySet()) {
                if (qy6Var.invoke(entry).booleanValue()) {
                    interfaceC11636aBuilder.remove(entry.getKey());
                    z2 = true;
                }
            }
            bth bthVar2 = bth.f14751a;
            qrc<K, V> qrcVarBuild = interfaceC11636aBuilder.build();
            if (md8.areEqual(qrcVarBuild, map$runtime_release)) {
                break;
            }
            z2g firstStateRecord2 = getFirstStateRecord();
            md8.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            C1612a c1612a2 = (C1612a) firstStateRecord2;
            gtf.getSnapshotInitializer();
            synchronized (gtf.getLock()) {
                try {
                    current = ssf.f82790e.getCurrent();
                    C1612a c1612a3 = (C1612a) gtf.writableRecord(c1612a2, this, current);
                    synchronized (buf.f14818a) {
                        try {
                            if (c1612a3.getModification$runtime_release() == modification$runtime_release) {
                                c1612a3.setMap$runtime_release(qrcVarBuild);
                                c1612a3.setModification$runtime_release(c1612a3.getModification$runtime_release() + 1);
                                z = true;
                            } else {
                                z = false;
                            }
                            o28.finallyStart(1);
                        } finally {
                        }
                    }
                    o28.finallyEnd(1);
                    o28.finallyStart(1);
                } catch (Throwable th2) {
                    o28.finallyStart(1);
                    o28.finallyEnd(1);
                    throw th2;
                }
            }
            o28.finallyEnd(1);
            gtf.notifyWrite(current, this);
        } while (!z);
        return z2;
    }

    public final boolean removeValue$runtime_release(V v) {
        Object next;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (md8.areEqual(((Map.Entry) next).getValue(), v)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @yfb
    public final Map<K, V> toMap() {
        return getReadable$runtime_release().getMap$runtime_release();
    }

    @yfb
    public String toString() {
        z2g firstStateRecord = getFirstStateRecord();
        md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((C1612a) gtf.current((C1612a) firstStateRecord)).getMap$runtime_release() + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }
}

package p000;

import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public final class mvf {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: mvf$b */
    public static abstract class EnumC9553b {

        /* JADX INFO: renamed from: a */
        public static final EnumC9553b f62395a = new a("NEXT_LOWER", 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC9553b f62396b = new b("NEXT_HIGHER", 1);

        /* JADX INFO: renamed from: c */
        public static final EnumC9553b f62397c = new c("INVERTED_INSERTION_INDEX", 2);

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ EnumC9553b[] f62398d = $values();

        /* JADX INFO: renamed from: mvf$b$a */
        public enum a extends EnumC9553b {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // p000.mvf.EnumC9553b
            public int resultIndex(int higherIndex) {
                return higherIndex - 1;
            }
        }

        /* JADX INFO: renamed from: mvf$b$b */
        public enum b extends EnumC9553b {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // p000.mvf.EnumC9553b
            public int resultIndex(int higherIndex) {
                return higherIndex;
            }
        }

        /* JADX INFO: renamed from: mvf$b$c */
        public enum c extends EnumC9553b {
            public c(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // p000.mvf.EnumC9553b
            public int resultIndex(int higherIndex) {
                return ~higherIndex;
            }
        }

        private static /* synthetic */ EnumC9553b[] $values() {
            return new EnumC9553b[]{f62395a, f62396b, f62397c};
        }

        private EnumC9553b(String $enum$name, int $enum$ordinal) {
        }

        public static EnumC9553b valueOf(String name) {
            return (EnumC9553b) Enum.valueOf(EnumC9553b.class, name);
        }

        public static EnumC9553b[] values() {
            return (EnumC9553b[]) f62398d.clone();
        }

        public abstract int resultIndex(int higherIndex);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: mvf$c */
    public static abstract class EnumC9554c {

        /* JADX INFO: renamed from: a */
        public static final EnumC9554c f62399a = new a("ANY_PRESENT", 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC9554c f62400b = new b("LAST_PRESENT", 1);

        /* JADX INFO: renamed from: c */
        public static final EnumC9554c f62401c = new c("FIRST_PRESENT", 2);

        /* JADX INFO: renamed from: d */
        public static final EnumC9554c f62402d = new d("FIRST_AFTER", 3);

        /* JADX INFO: renamed from: e */
        public static final EnumC9554c f62403e = new e("LAST_BEFORE", 4);

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ EnumC9554c[] f62404f = $values();

        /* JADX INFO: renamed from: mvf$c$a */
        public enum a extends EnumC9554c {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // p000.mvf.EnumC9554c
            public <E> int resultIndex(Comparator<? super E> comparator, @dgc E key, List<? extends E> list, int foundIndex) {
                return foundIndex;
            }
        }

        /* JADX INFO: renamed from: mvf$c$b */
        public enum b extends EnumC9554c {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p000.mvf.EnumC9554c
            public <E> int resultIndex(Comparator<? super E> comparator, @dgc E e, List<? extends E> list, int i) {
                int size = list.size() - 1;
                while (i < size) {
                    int i2 = ((i + size) + 1) >>> 1;
                    if (comparator.compare(list.get(i2), e) > 0) {
                        size = i2 - 1;
                    } else {
                        i = i2;
                    }
                }
                return i;
            }
        }

        /* JADX INFO: renamed from: mvf$c$c */
        public enum c extends EnumC9554c {
            public c(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p000.mvf.EnumC9554c
            public <E> int resultIndex(Comparator<? super E> comparator, @dgc E e, List<? extends E> list, int i) {
                int i2 = 0;
                while (i2 < i) {
                    int i3 = (i2 + i) >>> 1;
                    if (comparator.compare(list.get(i3), e) < 0) {
                        i2 = i3 + 1;
                    } else {
                        i = i3;
                    }
                }
                return i2;
            }
        }

        /* JADX INFO: renamed from: mvf$c$d */
        public enum d extends EnumC9554c {
            public d(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // p000.mvf.EnumC9554c
            public <E> int resultIndex(Comparator<? super E> comparator, @dgc E key, List<? extends E> list, int foundIndex) {
                return EnumC9554c.f62400b.resultIndex(comparator, key, list, foundIndex) + 1;
            }
        }

        /* JADX INFO: renamed from: mvf$c$e */
        public enum e extends EnumC9554c {
            public e(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // p000.mvf.EnumC9554c
            public <E> int resultIndex(Comparator<? super E> comparator, @dgc E key, List<? extends E> list, int foundIndex) {
                return EnumC9554c.f62401c.resultIndex(comparator, key, list, foundIndex) - 1;
            }
        }

        private static /* synthetic */ EnumC9554c[] $values() {
            return new EnumC9554c[]{f62399a, f62400b, f62401c, f62402d, f62403e};
        }

        private EnumC9554c(String $enum$name, int $enum$ordinal) {
        }

        public static EnumC9554c valueOf(String name) {
            return (EnumC9554c) Enum.valueOf(EnumC9554c.class, name);
        }

        public static EnumC9554c[] values() {
            return (EnumC9554c[]) f62404f.clone();
        }

        public abstract <E> int resultIndex(Comparator<? super E> comparator, @dgc E key, List<? extends E> list, int foundIndex);
    }

    private mvf() {
    }

    public static <E extends Comparable> int binarySearch(List<? extends E> list, E e, EnumC9554c presentBehavior, EnumC9553b absentBehavior) {
        v7d.checkNotNull(e);
        return binarySearch(list, e, s7c.natural(), presentBehavior, absentBehavior);
    }

    public static <E, K extends Comparable> int binarySearch(List<E> list, lz6<? super E, K> keyFunction, K key, EnumC9554c presentBehavior, EnumC9553b absentBehavior) {
        v7d.checkNotNull(key);
        return binarySearch(list, keyFunction, key, s7c.natural(), presentBehavior, absentBehavior);
    }

    public static <E, K> int binarySearch(List<E> list, lz6<? super E, K> keyFunction, @dgc K key, Comparator<? super K> keyComparator, EnumC9554c presentBehavior, EnumC9553b absentBehavior) {
        return binarySearch((List<? extends K>) eb9.transform(list, keyFunction), key, keyComparator, presentBehavior, absentBehavior);
    }

    public static <E> int binarySearch(List<? extends E> list, @dgc E e, Comparator<? super E> comparator, EnumC9554c enumC9554c, EnumC9553b enumC9553b) {
        v7d.checkNotNull(comparator);
        v7d.checkNotNull(list);
        v7d.checkNotNull(enumC9554c);
        v7d.checkNotNull(enumC9553b);
        if (!(list instanceof RandomAccess)) {
            list = eb9.newArrayList(list);
        }
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int iCompare = comparator.compare(e, list.get(i2));
            if (iCompare < 0) {
                size = i2 - 1;
            } else {
                if (iCompare <= 0) {
                    return i + enumC9554c.resultIndex(comparator, e, list.subList(i, size + 1), i2 - i);
                }
                i = i2 + 1;
            }
        }
        return enumC9553b.resultIndex(i);
    }
}

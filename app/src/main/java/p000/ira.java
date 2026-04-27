package p000;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public final class ira {

    /* JADX INFO: renamed from: ira$a */
    public static final class C7575a implements vye<MenuItem> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Menu f48083a;

        public C7575a(Menu menu) {
            this.f48083a = menu;
        }

        @Override // p000.vye
        @yfb
        public Iterator<MenuItem> iterator() {
            return ira.iterator(this.f48083a);
        }
    }

    /* JADX INFO: renamed from: ira$b */
    @dwf({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt$iterator$1\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n83#2:91\n1#3:92\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt$iterator$1\n*L\n74#1:91\n74#1:92\n*E\n"})
    public static final class C7576b implements Iterator<MenuItem>, xo8 {

        /* JADX INFO: renamed from: a */
        public int f48084a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Menu f48085b;

        public C7576b(Menu menu) {
            this.f48085b = menu;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f48084a < this.f48085b.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            bth bthVar;
            Menu menu = this.f48085b;
            int i = this.f48084a - 1;
            this.f48084a = i;
            MenuItem item = menu.getItem(i);
            if (item != null) {
                menu.removeItem(item.getItemId());
                bthVar = bth.f14751a;
            } else {
                bthVar = null;
            }
            if (bthVar == null) {
                throw new IndexOutOfBoundsException();
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        @yfb
        public MenuItem next() {
            Menu menu = this.f48085b;
            int i = this.f48084a;
            this.f48084a = i + 1;
            MenuItem item = menu.getItem(i);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public static final boolean contains(@yfb Menu menu, @yfb MenuItem menuItem) {
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            if (md8.areEqual(menu.getItem(i), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void forEach(@yfb Menu menu, @yfb qy6<? super MenuItem, bth> qy6Var) {
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            qy6Var.invoke(menu.getItem(i));
        }
    }

    public static final void forEachIndexed(@yfb Menu menu, @yfb gz6<? super Integer, ? super MenuItem, bth> gz6Var) {
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            gz6Var.invoke(Integer.valueOf(i), menu.getItem(i));
        }
    }

    @yfb
    public static final MenuItem get(@yfb Menu menu, int i) {
        return menu.getItem(i);
    }

    @yfb
    public static final vye<MenuItem> getChildren(@yfb Menu menu) {
        return new C7575a(menu);
    }

    public static final int getSize(@yfb Menu menu) {
        return menu.size();
    }

    public static final boolean isEmpty(@yfb Menu menu) {
        return menu.size() == 0;
    }

    public static final boolean isNotEmpty(@yfb Menu menu) {
        return menu.size() != 0;
    }

    @yfb
    public static final Iterator<MenuItem> iterator(@yfb Menu menu) {
        return new C7576b(menu);
    }

    public static final void minusAssign(@yfb Menu menu, @yfb MenuItem menuItem) {
        menu.removeItem(menuItem.getItemId());
    }

    public static final void removeItemAt(@yfb Menu menu, int i) {
        bth bthVar;
        MenuItem item = menu.getItem(i);
        if (item != null) {
            menu.removeItem(item.getItemId());
            bthVar = bth.f14751a;
        } else {
            bthVar = null;
        }
        if (bthVar == null) {
            throw new IndexOutOfBoundsException();
        }
    }
}

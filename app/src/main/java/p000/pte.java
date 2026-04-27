package p000;

import android.widget.SearchView;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@x21({@w21(attribute = "android:onQueryTextFocusChange", method = "setOnQueryTextFocusChangeListener", type = SearchView.class), @w21(attribute = "android:onSearchClick", method = "setOnSearchClickListener", type = SearchView.class), @w21(attribute = "android:onClose", method = "setOnCloseListener", type = SearchView.class)})
@p7e({p7e.EnumC10826a.f69934a})
public class pte {

    /* JADX INFO: renamed from: pte$a */
    public class C11116a implements SearchView.OnQueryTextListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC11119d f72002a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC11118c f72003b;

        public C11116a(InterfaceC11119d interfaceC11119d, InterfaceC11118c interfaceC11118c) {
            this.f72002a = interfaceC11119d;
            this.f72003b = interfaceC11118c;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String str) {
            InterfaceC11118c interfaceC11118c = this.f72003b;
            if (interfaceC11118c != null) {
                return interfaceC11118c.onQueryTextChange(str);
            }
            return false;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String str) {
            InterfaceC11119d interfaceC11119d = this.f72002a;
            if (interfaceC11119d != null) {
                return interfaceC11119d.onQueryTextSubmit(str);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: pte$b */
    public class C11117b implements SearchView.OnSuggestionListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC11121f f72004a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC11120e f72005b;

        public C11117b(InterfaceC11121f interfaceC11121f, InterfaceC11120e interfaceC11120e) {
            this.f72004a = interfaceC11121f;
            this.f72005b = interfaceC11120e;
        }

        @Override // android.widget.SearchView.OnSuggestionListener
        public boolean onSuggestionClick(int i) {
            InterfaceC11120e interfaceC11120e = this.f72005b;
            if (interfaceC11120e != null) {
                return interfaceC11120e.onSuggestionClick(i);
            }
            return false;
        }

        @Override // android.widget.SearchView.OnSuggestionListener
        public boolean onSuggestionSelect(int i) {
            InterfaceC11121f interfaceC11121f = this.f72004a;
            if (interfaceC11121f != null) {
                return interfaceC11121f.onSuggestionSelect(i);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: pte$c */
    @omg(11)
    public interface InterfaceC11118c {
        boolean onQueryTextChange(String str);
    }

    /* JADX INFO: renamed from: pte$d */
    @omg(11)
    public interface InterfaceC11119d {
        boolean onQueryTextSubmit(String str);
    }

    /* JADX INFO: renamed from: pte$e */
    @omg(11)
    public interface InterfaceC11120e {
        boolean onSuggestionClick(int i);
    }

    /* JADX INFO: renamed from: pte$f */
    @omg(11)
    public interface InterfaceC11121f {
        boolean onSuggestionSelect(int i);
    }

    @q21(requireAll = false, value = {"android:onQueryTextSubmit", "android:onQueryTextChange"})
    public static void setOnQueryTextListener(SearchView searchView, InterfaceC11119d interfaceC11119d, InterfaceC11118c interfaceC11118c) {
        if (interfaceC11119d == null && interfaceC11118c == null) {
            searchView.setOnQueryTextListener(null);
        } else {
            searchView.setOnQueryTextListener(new C11116a(interfaceC11119d, interfaceC11118c));
        }
    }

    @q21(requireAll = false, value = {"android:onSuggestionSelect", "android:onSuggestionClick"})
    public static void setOnSuggestListener(SearchView searchView, InterfaceC11121f interfaceC11121f, InterfaceC11120e interfaceC11120e) {
        if (interfaceC11121f == null && interfaceC11120e == null) {
            searchView.setOnSuggestionListener(null);
        } else {
            searchView.setOnSuggestionListener(new C11117b(interfaceC11121f, interfaceC11120e));
        }
    }
}

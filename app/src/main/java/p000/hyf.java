package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.platon.offlinesdk.C3880R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class hyf extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public List<jfc> f45268a;

    /* JADX INFO: renamed from: b */
    public Context f45269b;

    /* JADX INFO: renamed from: c */
    public InterfaceC7082b f45270c;

    /* JADX INFO: renamed from: hyf$a */
    public static class C7081a extends RecyclerView.Adapter {

        /* JADX INFO: renamed from: a */
        public List<C4569d> f45271a;

        /* JADX INFO: renamed from: b */
        public c f45272b;

        /* JADX INFO: renamed from: hyf$a$a */
        public class a implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f45273a;

            public a(int i) {
                this.f45273a = i;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (C7081a.this.f45272b != null) {
                    C7081a.this.f45272b.onItemClicked(((C4569d) C7081a.this.f45271a.get(this.f45273a)).f28124a);
                }
            }
        }

        /* JADX INFO: renamed from: hyf$a$b */
        public class b extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a */
            public TextView f45275a;

            public b(@efb View view) {
                super(view);
                this.f45275a = (TextView) view.findViewById(C3880R.id.textView);
            }
        }

        /* JADX INFO: renamed from: hyf$a$c */
        public interface c {
            void onItemClicked(EnumC6666h enumC6666h);
        }

        public C7081a() {
            ArrayList arrayList = new ArrayList();
            this.f45271a = arrayList;
            arrayList.add(new C4569d(EnumC6666h.SDK_INIT, "SDK初始化"));
            this.f45271a.add(new C4569d(EnumC6666h.XTTS, "XTTS SDK（e09712bcb）"));
            this.f45271a.add(new C4569d(EnumC6666h.RECOGNIZE, "RECOGNIZE SDK（e0e26945b)"));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f45271a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@efb @yfb RecyclerView.ViewHolder viewHolder, @igg({"RecyclerView"}) int i) {
            b bVar = (b) viewHolder;
            bVar.f45275a.setText(this.f45271a.get(i).f28125b);
            bVar.f45275a.setOnClickListener(new a(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @efb
        @yfb
        public RecyclerView.ViewHolder onCreateViewHolder(@efb @yfb ViewGroup viewGroup, int i) {
            return new b(LayoutInflater.from(viewGroup.getContext()).inflate(C3880R.layout.ai_list_item, viewGroup, false));
        }

        public void setListener(c cVar) {
            this.f45272b = cVar;
        }
    }

    /* JADX INFO: renamed from: hyf$b */
    public interface InterfaceC7082b {
        void onItemClicked(jfc jfcVar);
    }

    public hyf(Context context, List<jfc> list) {
        this.f45268a = list;
        this.f45269b = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f45268a.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f45268a.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f45269b).inflate(C3880R.layout.item_drop, (ViewGroup) null);
        }
        ((TextView) view.findViewById(C3880R.id.text)).setText(this.f45268a.get(i).f50452a);
        return view;
    }

    public void setListener(InterfaceC7082b interfaceC7082b) {
        this.f45270c = interfaceC7082b;
    }
}
